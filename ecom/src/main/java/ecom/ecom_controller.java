package ecom;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import ecom.chennaiDAOimple;
import chennai.chennaimodel;

public class ecom_controller {
	String setName="";
	@RequestMapping("/productsInfo")
	public ModelAndView showProducts(
			@RequestParam(value = "name", required = false, defaultValue = "img") String name)
	{
		ModelAndView mv = null;
		setName = name;
		
		mv = new ModelAndView("product");			  
		return mv;
	}
	

	List<chennaimodel> list = null;
	
	@RequestMapping("/GsonCon")
	public @ResponseBody String getValues()
	{
		chennaiDAOimple dao = new chennaiDAOimple();
		
		if(setName.equals("img1") || setName.equals("img2") || setName.equals("img3")){
			list = dao.getproduct(setName);	
		}
		if(setName.equals("all")){			
			list = dao.getAllproduct();
		}
		Gson gson = new Gson();
		  
		String result = gson.toJson(list);
		
		return result;
	}



	@RequestMapping("/MoreInfo")
	public ModelAndView show3()
	{
		
			System.out.println("in controller Product");
			ModelAndView mv=new ModelAndView("MoreInfo");		
	return mv;
		
	}



}
