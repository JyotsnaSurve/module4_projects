package com.cg.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.bean.Customer;
import com.cg.service.ICustService;


@Controller

public class CustController {

	@RequestMapping("/index")
	public String start(){
		return "display";
	}
	
	@Autowired
	private ICustService custService;

	
	public ICustService getCustService() {
		return custService;
	}

	public void setCustService(ICustService custService) {
		this.custService = custService;
	}

	@RequestMapping(value="/form")
	public String start1(){
		return "display";
	}
	
	@RequestMapping(value="/new")
	public String add(Model model){
		
		model.addAttribute("cust",new Customer());
		return "addCust";
	}
	
	@RequestMapping(value="/submit")
	public String addNew(@ModelAttribute("cust") @Valid Customer cust,BindingResult result, Model m){
		if(result.hasErrors()){
			return "addCust";
		}
		else{
			custService.addCust(cust);
			return "Res";
		}
		
	}
	
}
