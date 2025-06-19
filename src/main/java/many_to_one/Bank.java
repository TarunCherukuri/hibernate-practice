package many_to_one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bank {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String ifsc;
	private String micr;
	private String location;
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
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getMicr() {
		return micr;
	}
	public void setMicr(String micr) {
		this.micr = micr;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bank(int id, String name, String ifsc, String micr, String location) {
		super();
		this.id = id;
		this.name = name;
		this.ifsc = ifsc;
		this.micr = micr;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", name=" + name + ", ifsc=" + ifsc + ", micr=" + micr + ", location=" + location
				+ "]";
	}
	
	
	
	
	

}
