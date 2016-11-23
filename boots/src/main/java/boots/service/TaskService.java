package boots.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;


import boots.dao.TaskRepository;
import boots.model.Task;

@Service @Transactional
public class TaskService {

	private final TaskRepository taskRepository;

	public TaskService(TaskRepository tasksRepository) {
		super();
		this.taskRepository = tasksRepository;
	}
	
	public List <Task> findAll(){
		List <Task> tasks= new ArrayList<Task>();
		for(Task task: taskRepository.findAll()){
			tasks.add(task);
		}
		return tasks;
	}
	
	public void save(Task task){
		taskRepository.save(task);
	}
	
	public void delete (int id){
		taskRepository.delete(id);
	}
	
	public Task findOne (int id){
		return taskRepository.findOne(id);
	}
}
