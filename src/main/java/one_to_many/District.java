package one_to_many;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class District {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int pin;
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
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public District(int id, String name, int pin) {
		super();
		this.id = id;
		this.name = name;
		this.pin = pin;
	}
	public District() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "District [id=" + id + ", name=" + name + ", pin=" + pin + "]";
	}
	
	

}
