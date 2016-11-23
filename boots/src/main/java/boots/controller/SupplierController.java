package boots.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boots.model.Supplier;
import boots.service.SupplierService;

@Controller
public class SupplierController {

	@Autowired
	private SupplierService supplierService;

	@GetMapping("/all-suppliers")
	public String allSuppliers(HttpServletRequest request){
		request.setAttribute("suppliers", supplierService.findAll());
		request.setAttribute("mode", "MODE_SUPPLIERS");
		return "supplier";
	}
	
	@GetMapping("/new-supplier")
	public String newSupplier(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "supplier";
	}
	
	@GetMapping("/update-supplier")
	public String updateSupplier(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("supplier", supplierService.findOne(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "supplier";
	}
	
	@GetMapping("/delete-supplier")
	public String deleteSupplier(@RequestParam int id, HttpServletRequest request){
		supplierService.delete(id);
		request.setAttribute("suppliers", supplierService.findAll());
		request.setAttribute("mode", "MODE_SUPPLIERS");
		return "supplier";
	}
	
	@PostMapping("/save-supplier")
	public String saveSupplier(@ModelAttribute Supplier supplier, 
		BindingResult bindingResult, HttpServletRequest request){
		supplierService.save(supplier);
		request.setAttribute("suppliers", supplierService.findAll());
		request.setAttribute("mode", "MODE_SUPPLIERS");
		return "supplier";
	}

}
