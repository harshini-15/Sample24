package OneToManyRelation;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Bike {

	@Id
	int modelNum;
	String brand;
	int price;
	
	@ManyToOne
	Man man;

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike(int modelNum, String brand, int price, Man man) {
		super();
		this.modelNum = modelNum;
		this.brand = brand;
		this.price = price;
		this.man = man;
	}

	public int getModelNum() {
		return modelNum;
	}

	public void setModelNum(int modelNum) {
		this.modelNum = modelNum;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Man getM() {
		return man;
	}

	public void setM(Man m) {
		this.man = m;
	}

	@Override
	public String toString() {
		return "Bike [modelNum=" + modelNum + ", brand=" + brand + ", price=" + price + ", man=" + man + "]";
	}
	
	
}
