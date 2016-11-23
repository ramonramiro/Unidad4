package boots.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Suppliers")
public class Supplier implements Serializable{
	
	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	@Column (length=45)
	private String name;
	@Column (length=45)
	private String address;
	@Column (length=50)
	private String firstname;
	@Column (length=50)
	private String lastname; 
	@Column (length=50)
	private String email;
	@Column (length=50)
	private String turn;
	
	
	
	public Supplier(String name, String address, String firstname, String lastname, String email, String turn) {
		super();
		this.name = name;
		this.address = address;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.turn = turn;
	}

	public Supplier() {
		this("","","","","","");
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getTurn() {
		return turn;
	}



	public void setTurn(String turn) {
		this.turn = turn;
	}



	@Override
	public String toString() {
		return "Supplier [id=" + id + ", name=" + name + ", address=" + address + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", email=" + email + ", turn=" + turn + "]";
	}


	


}
