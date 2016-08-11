package com.bitwise.cart;

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
public class AddToCartController {
	@RequestMapping (value="/Cart" ,method=RequestMethod.GET)
	public String initialze(Model model){
	model.addAttribute("ShowPropertyBeans",new ShowPropertyBeans());	
	return "Cart";
	}
	@RequestMapping (value="/SelectedItemList", method=RequestMethod.POST)
	public String submit(Model model,@ModelAttribute("SelectedItemListBeans")SelectedItemListBeans obj,BindingResult result,HttpServletRequest request,HttpServletResponse response){
		String name=request.getParameter("name");
		String size=request.getParameter("size");
		String price=request.getParameter("price;");
		int p=Integer.parseInt(price);
		String quantity=request.getParameter("quantity");
		int q=Integer.parseInt(quantity);
		String num=request.getParameter("num");
		int no=Integer.parseInt(num);
		q-=no;
		obj.setName(name);obj.setPrice(p*no);obj.setSize(size); obj.setQuantity(no);
		return "SelectedItemList";
		
	}
}