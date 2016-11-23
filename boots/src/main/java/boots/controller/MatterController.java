package boots.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boots.model.Matter;
import boots.service.MatterService;

@Controller
public class MatterController {
	
	@Autowired
	private MatterService matterService;
	
	@GetMapping("/all-matters")
	public String allMatters(HttpServletRequest request){
		request.setAttribute("matters", matterService.findAll());
		request.setAttribute("mode", "MODE_MATTERS");
		return "matter";
	}
	
	@GetMapping("/new-matter")
	public String newMatter(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "matter";
	}
	
	@GetMapping("/update-matter")
	public String updateMatter(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("matter", matterService.findOne(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "matter";
	}
	
	@GetMapping("/delete-matter")
	public String deletMatter(@RequestParam int id, HttpServletRequest request){
		matterService.delete(id);
		request.setAttribute("matters", matterService.findAll());
		request.setAttribute("mode", "MODE_MATTERS");
		return "matter";
	}
	
	@PostMapping("/save-matter")
	public String saveMatter(@ModelAttribute Matter matter,
			BindingResult bindingResult, HttpServletRequest request){
		matterService.save(matter);
		request.setAttribute("matters", matterService.findAll());
		request.setAttribute("mode", "MODE_MATTERS");
		return "matter";
	}


}
