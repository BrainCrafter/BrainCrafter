package com.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.beans.Item;
import com.dao.ItemReviewDetailDao;

@Controller
public class WelcomeController {
 
 ItemReviewDetailDao itemReviewDetailDao;
	
/*	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}

	*/

	 
	  @RequestMapping("/viewitemlst/")  
	    public String viewemp(Model m){  
		  itemReviewDetailDao=new ItemReviewDetailDao();
		  List<Item> itmlist=itemReviewDetailDao.getItemReviewDetail();  
	        m.addAttribute("itmlist",itmlist);
	       
	        return "viewitemlst";  
	    } 
	 

	  @RequestMapping(value="/item/{itemdesc}")  
	    public String viewitem(@PathVariable String itemdesc, Model m){  
	        Item item=itemReviewDetailDao.getItemReviewDetailById(itemdesc);  
	        m.addAttribute("item",item);
	        return "viewitem";  
	    }  
	
	  @RequestMapping(value="/sentiment/")  
	    public void sentiment(){  
		  try {
			itemReviewDetailDao.createsentimate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    }  
	
}