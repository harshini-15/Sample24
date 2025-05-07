package OneToManyRelation;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Man {

	@Id
	int id;
	String name;
	@OneToMany
	List<Bike> bikeList;
	
	
	public Man() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Man(int id, String name, List<Bike> bikeList) {
		super();
		this.id = id;
		this.name = name;
		this.bikeList = bikeList;
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
	public List<Bike> getBikeList() {
		return bikeList;
	}
	public void setBikeList(List<Bike> bikeList) {
		this.bikeList = bikeList;
	}
	@Override
	public String toString() {
		return "Man [id=" + id + ", name=" + name + ", bikeList=" + bikeList + "]";
	}
	
	
	
	
	

}
