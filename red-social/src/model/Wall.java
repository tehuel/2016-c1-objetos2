package model;

import java.util.ArrayList;

public class Wall {
	
	ArrayList<String> messagesList;
	
	public Wall() {
		messagesList = new ArrayList<String>();
	}

	/**
	 * Agrega un mensaje al muro
	 * @param message
	 */
	public void addMessage(String message) {
		if (this.messagesList.size() >= 10) {
			this.messagesList.remove(0);
		}
		this.messagesList.add(message);
	}

	/**
	 * Retorna la cantidad de mensajes en el muro
	 * @return
	 */
	public int messagesQuantity() {
		return messagesList.size();
	}

	/**
	 * Elimina un mensaje especifico del muro
	 * @param messageToDelete
	 */
	public void deleteMessage(String messageToDelete) {
		if ( this.messagesList.contains(messageToDelete) ) {
			this.messagesList.remove( this.messagesList.indexOf(messageToDelete) );
		}
	}

	
	/**
	 * Retorna la lista completa de mensajes
	 * @return
	 */
	public ArrayList<String> getMessagesList() {
		return this.messagesList;
	}

}
