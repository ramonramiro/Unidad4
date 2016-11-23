package boots.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class MainController {

	@GetMapping("/")
	public String home(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "index";
	}
	
	@GetMapping("task")
	public String task(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME_TASK");
		return "task";
	}
	
	@GetMapping("supplier")
	public String supplier(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME_SUPPLIER");
		return "supplier";
	}
	
	@GetMapping("matter")
	public String matter(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME_MATTER");
		return "matter";
	}
}
