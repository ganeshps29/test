package ecom;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controll
{
String Mess="Welcome to Spring MVC";
@RequestMapping("/hello")
public ModelAndView show(@RequestParam(value="name",required=false,defaultValue="World")String name)
{
	{
		System.out.println("in controller");
		ModelAndView mv=new ModelAndView("hellowelcome");
		mv.addObject("message",Mess);
		mv.addObject("name",name);
return mv;
	}
}
/* product details */
 @RequestMapping("productinfo")
	 public ModelAndView show(
			 @RequestParam("name") String name,@RequestParam("desc") String desc,@RequestParam("price") String price) 
	 {
	 
	 		 
	 		ModelAndView mv=new ModelAndView("productinfo");
	 		mv.addObject("name",name);
	 		mv.addObject("desc",desc);
	 		mv.addObject("prince",price);
	 return mv;
	 }
	 
@RequestMapping("/product")
public ModelAndView show3()
{
	
		System.out.println("in controller Product");
		ModelAndView mv=new ModelAndView("Product");		
return mv;
	
}

 
@RequestMapping("/login")
public ModelAndView show1()
{
	
		System.out.println("in controller login");
		ModelAndView mv=new ModelAndView("Login");		
return mv;
	
}
 
@RequestMapping("/registration")
public ModelAndView show2()
{
	
	   	System.out.println("in controller registration");
		ModelAndView mv=new ModelAndView("Registration");
return mv;
	
}
}
