package one_to_one;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PanCard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String pNo;
	private String fullName;
	private int pin;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getpNo() {
		return pNo;
	}

	public void setpNo(String pNo) {
		this.pNo = pNo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public PanCard(int id, String pNo, String fullName, int pin) {
		super();
		this.id = id;
		this.pNo = pNo;
		this.fullName = fullName;
		this.pin = pin;
	}

	public PanCard() {

	}

	@Override
	public String toString() {
		return "PanCard [id=" + id + ", pNo=" + pNo + ", fullName=" + fullName + ", pin=" + pin + "]";
	}

}
