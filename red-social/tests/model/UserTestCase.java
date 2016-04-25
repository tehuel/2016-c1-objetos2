package model;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;
import org.mockito.*;
import org.junit.Before;
import org.junit.Test;

public class UserTestCase {
	
	User testedUser;
	Wall aWall;
	
	@Before
	public void setUp() {
		aWall = mock(Wall.class);
		testedUser = new User("Pepe", aWall);
	}

	@Test
	public void testAUserIsInitialized() {
		assertEquals(testedUser.getName(), "Pepe");
		assertEquals(testedUser.getFriends().size(), 0 );
	}

	@Test
	public void testAUserCanChangeItsName() {
		testedUser.changeName("Juan");
		assertEquals(testedUser.getName(), "Juan");
	}
	
	@Test
	public void testAUserCanAddAFriend() {
		User friend = Mockito.mock(User.class);

		testedUser.addFriend( friend );		
		assertEquals(testedUser.getFriends().size(), 1 );
	}
	
	@Test
	public void testAUserCanPublishAMessageToItsWall() {
		// creo un wall espia para comprobar si se publico el mensaje
		Wall aSpyWall = mock(Wall.class);		
		testedUser.setWall(aSpyWall);
		
		// publico el mensaje
		String message = "This is a Test";
		testedUser.publishMessage(message);
		
		// verifico que el wall recibio el mensaje para ser publicado
		verify(aSpyWall).addMessage(message);
	}
	
	@Test
	public void testAUserCanReceiveANotification() {
		User spyFriend = mock(User.class);
		String message = "Test Message";
		
		testedUser.addFriend(spyFriend);
		
		testedUser.publishMessage(message);
		
		verify(spyFriend).receiveNotification(message);
		
	}

}




