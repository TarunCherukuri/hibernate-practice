package many_to_one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private long acNo;
	private String name;
	private long phone;
	@ManyToOne
	private Bank b;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAcNo() {
		return acNo;
	}
	public void setAcNo(long acNo) {
		this.acNo = acNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public Bank getB() {
		return b;
	}
	public void setB(Bank b) {
		this.b = b;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, long acNo, String name, long phone, Bank b) {
		super();
		this.id = id;
		this.acNo = acNo;
		this.name = name;
		this.phone = phone;
		this.b = b;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", acNo=" + acNo + ", name=" + name + ", phone=" + phone + ", b=" + b + "]";
	}
	
	
	
	

}
