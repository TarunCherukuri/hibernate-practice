package one_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class State {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String capital;
	private String language;

	@OneToMany
	private List<District> districts;

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

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}

	public State(int id, String name, String capital, String language, List<District> districts) {
		super();
		this.id = id;
		this.name = name;
		this.capital = capital;
		this.language = language;
		this.districts = districts;
	}

	public State() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "State [id=" + id + ", name=" + name + ", capital=" + capital + ", language=" + language + "]";
	}

}
