package boots.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import boots.dao.SupplierRepository;
import boots.model.Supplier;

@Service @Transactional
public class SupplierService {
	
	private final SupplierRepository supplierRepository;
	
	public SupplierService(SupplierRepository supplierRepository){
		super();
		this.supplierRepository= supplierRepository;
	}
	
	public List <Supplier> findAll(){
		List <Supplier> suppliers= new ArrayList<Supplier>();
		for(Supplier supplier: supplierRepository.findAll()){
			suppliers.add(supplier);
		}
		return suppliers;
	}
	
	public void save(Supplier supplier){
	supplierRepository.save(supplier);
	}
	
	public void delete (int id){
		supplierRepository.delete(id);
	}
	
	public Supplier findOne (int id){
		return supplierRepository.findOne(id);
	}

}
