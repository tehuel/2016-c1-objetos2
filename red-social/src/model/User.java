package model;

import java.util.ArrayList;

public class User {
	
	private String nombre;
	private ArrayList<User> friends;
	
	public User(String nombre) {
		this.nombre = nombre;
		this.setFriends(new ArrayList<User>());
	}
	
	public void changeName(String nuevoNombre) {
		this.setNombre(nuevoNombre);
	}

	// getters y setters
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public ArrayList<User> getFriends() {
		return this.friends;
	}

	public void setFriends(ArrayList<User> friends) {
		this.friends = friends;
	}

	public void addFriend(User friend) {
		this.friends.add(friend);
	}

}
