package com.cg.emp.controllers;

import java.util.ArrayList;

import javax.validation.Valid;







import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.emp.dtos.CustomerBean;
import com.cg.emp.service.ICustService;

@Controller
@RequestMapping("/empl")
public class EmployeeController {

	@Autowired
	private ICustService custService;
	
	
	public ICustService getCustService() {
		return custService;
	}

	public void setCustService(ICustService custService) {
		this.custService = custService;
	}

	@RequestMapping("/getAll")
	public ModelAndView getAllOptions()
	{
		ArrayList<CustomerBean> list=new ArrayList <CustomerBean>();
		list = custService.getAllCustomer();
		
		for(CustomerBean cb:list){
			System.out.println(cb);
		}
		
		return new ModelAndView("ShowData","emplist",list);
	}
	
	@RequestMapping("/all")
	
	public ModelAndView getAllEmployee()
	{
		ArrayList<CustomerBean> list=new ArrayList <CustomerBean>();
		list = custService.getAllCustomer();
		
		/*for(CustomerBean cb:list){
			System.out.println(cb);
		}*/
		
		return new ModelAndView("AllEmployees","emplist",list);
	}
	
	
	@RequestMapping(value="/new")
	public String add(Model model){
		
		model.addAttribute("cust",new CustomerBean());
		return "addCust";
	}
	
	@RequestMapping(value="/add")
	public String addNew(@ModelAttribute("cust") @Valid CustomerBean cust,BindingResult result, Model m){
		if(result.hasErrors()){
			return "addCust";
		}
		else{
			cust= custService.addCust(cust);
			return "Added";
		}
		
	}
	
	/*@RequestMapping("/getById")
	public String ShowIdPage(Model model)
	{
		
		model.addAttribute("customer",new CustomerBean());
		return "GetById";
	}*/
	
	@RequestMapping("/getById")
	public ModelAndView ShowIdPage()
	{
		ArrayList<Integer> list=new ArrayList <Integer>();
		list = custService.getId();
		for(Integer cb:list){
			System.out.println(cb);
		}
		
		return new ModelAndView("GetByIdDrp","idlist",list);
	}
	
	
	@RequestMapping("/getCustById")
	public ModelAndView getById(@RequestParam("custId") int id)
	{
		System.out.println("cust id is:"+id);
		CustomerBean cust=new CustomerBean();
		cust=custService.getById(id);
		return new ModelAndView("CustDetails","c",cust);
	}
	
	@RequestMapping(value="/delete")
	public String doDelete(@RequestParam("custId") String id){
		int custid=Integer.parseInt(id);
		if(custService.delete(custid))
			System.out.println("Data Deleted Successfully");
		else
			System.out.println("Not Deleted");
		
		return "redirect:all.capg";
	}
	
	@RequestMapping(value="/edit")
	public ModelAndView showEdit(@RequestParam int custId){
		return new ModelAndView("edit","bean",custService.getById(custId));
	}
	
	@RequestMapping(value="/update")
	public ModelAndView doUpdate(@ModelAttribute("bean")@Valid CustomerBean bean,BindingResult result){
		
		ModelAndView mv = new ModelAndView("Updated");
		if(result.getErrorCount()==0){
			CustomerBean c = custService.updateCustomer(bean);
			System.out.println("in Controller"+c);
			
		}else{
			mv.addObject("bean",bean);
			mv.setViewName("edit");
		}
		return mv;
	}
}	