package boots.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="matters")
public class Matter implements Serializable{
	
	@Id @GeneratedValue (strategy=GenerationType.IDENTITY)
	private int id;
	@Column (length=30)
	private String name;
	@Column (length=30)
	private String teacher;
	@Temporal(TemporalType.DATE)
	@Column (name="start_date")
	private Date startDate;
	private boolean approved;
	
	
	public Matter( String name, String teacher, Date startDate, boolean approved) {
		super();
		this.name = name;
		this.teacher = teacher;
		this.startDate = startDate;
		this.approved = approved;
	}


	public Matter() {
		this("","",new Date(),false);
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


	public String getTeacher() {
		return teacher;
	}


	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public boolean isApproved() {
		return approved;
	}


	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	
	@Override
	public String toString() {
		return "Matter [id=" + id + ", name=" + name + ", teacher=" + teacher + ", startDate=" + startDate
				+ ", approved=" + approved + "]";
	}
}
