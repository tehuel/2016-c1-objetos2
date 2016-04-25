package model;

import java.util.ArrayList;

public class User {
	
	private String name;
	private ArrayList<User> friends;
	private Wall wall;
	
	
	/**
	 * Crea un nuevo usuario
	 * @param name Nombre del usuario
	 * @param aWall 
	 */
	public User(String name, Wall wall) {
		this.name = name;
		this.setWall(wall);
		this.setFriends(new ArrayList<User>());
	}
	
	/**
	 * Cambia el nombre del usuario
	 * @param newName
	 */
	public void changeName(String newName) {
		this.setName(newName);
	}

	/**
	 * Agrega un amigo al usuario
	 * @param friend
	 */
	public void addFriend(User friend) {
		this.friends.add(friend);
	}

	/**
	 * Publica un estado en su propio muro.
	 * Notifica a todos sus amigos sobre el mensaje
	 * @param message
	 */
	public void publishMessage(String message) {
		this.wall.addMessage(message);
		
		// notifico a todos los amigos del usuario
		for (User user : friends) {
			user.receiveNotification(message);
		}
		
	}

	// getters y setters	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<User> getFriends() {
		return this.friends;
	}

	public void setFriends(ArrayList<User> friends) {
		this.friends = friends;
	}

	public Wall getWall() {
		return wall;
	}

	public void setWall(Wall wall) {
		this.wall = wall;
	}

	public void receiveNotification(String message) {
		this.wall.addMessage(message);
	}

}
