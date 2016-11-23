package boots.controller;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import boots.model.Task;
import boots.service.TaskService;

@RestController
public class Controller {
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping("/hello")
	public String hello(){
		return "Hello World Forever";
		
	}
/*
	@GetMapping("/all-tasks")
	public String allTasks(){
		return taskService.findAll().toString();
	}
	
	@GetMapping("/save")
	public String save(@RequestParam String name, @RequestParam String desc){
		
		Task task = new Task(name, desc, new Date(), false);
			taskService.save(task);	
		return "Task save";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam int id){
			taskService.delete(id);	
		return "Task delete";
	}
	*/	
		
}
