package practice.Hiber2;

import jakarta.persistence.*;
@Entity
public class Person {

	@Id
	int id;
	String nickname;
	@OneToOne
	AadharCard card;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String nickname, AadharCard card) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.card = card;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public AadharCard getCard() {
		return card;
	}
	public void setCard(AadharCard card) {
		this.card = card;
	}
	
	
}
