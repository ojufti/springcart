package com.bitwise.cart;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

    @Controller
    public class SuccessController {
    	
	@RequestMapping (value="/Success", method=RequestMethod.GET)
	public ModelAndView initialize(Model model,@ModelAttribute("SuccessBeans") SuccessBeans success , BindingResult result,HttpServletRequest request,HttpServletResponse response){
	
	return new ModelAndView("Success");
	}
	@RequestMapping (value="/Cart", method=RequestMethod.POST)
	public ModelAndView submit(Model model,@ModelAttribute("SuccessBeans") SuccessBeans success , BindingResult result,HttpServletRequest request,HttpServletResponse response){
	ItemDetail obj= new ItemDetail();
	String item=request.getParameter("itemlist");
	ShowPropertyBeans show= new ShowPropertyBeans();
	show=obj.detail(item);
	return new ModelAndView ("Cart","ShowPropertyBeans", show);
	}
	@ModelAttribute("item")
    public List<String> populateWebFrameworkList() {

         //Data referencing for web framework checkboxes
         List<String> productlist = new ArrayList<String>();
         productlist.add("tv");
         productlist.add("pen");
         productlist.add("pencil");
         productlist.add("toygun");
         productlist.add("candle");
         
          return productlist;
    }

}
