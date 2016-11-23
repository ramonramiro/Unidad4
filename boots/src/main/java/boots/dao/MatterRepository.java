package boots.dao;

import org.springframework.data.repository.CrudRepository;

import boots.model.Matter;

public interface MatterRepository extends CrudRepository <Matter, Integer>{

}
