package many_to_many;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Batch {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String code;
	@ManyToMany	
	private List<Student> students;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public Batch(int id, String name, String code, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.students = students;
	}
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Batch [id=" + id + ", name=" + name + ", code=" + code + "]";
	}
	
	

}
