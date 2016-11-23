package boots.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boots.dao.MatterRepository;
import boots.model.Matter;

@Service @Transactional
public class MatterService {
	
	private final MatterRepository matterRepository;
	
	public MatterService (MatterRepository mattersRepository){
		super();
		this.matterRepository = mattersRepository;
		
	}
	
	public List <Matter> findAll(){
		List<Matter> matters= new ArrayList <Matter>();
		for(Matter matter: matterRepository.findAll()){
			matters.add(matter);
		}
		
		return matters;
	}
	
	public void save(Matter matter){
		matterRepository.save(matter);
	}
	
	public void delete (int id){
		matterRepository.delete(id);
	}
	
	public Matter findOne (int id){
		return matterRepository.findOne(id);
	}

}
