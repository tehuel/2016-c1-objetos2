package model;

import static org.junit.Assert.*;

import org.mockito.*;
import org.junit.Before;
import org.junit.Test;

public class UserTestCase {
	
	User testedUser;
	
	@Before
	public void setUp() {
		testedUser = new User("Pepe");
	}

	@Test
	public void testAUserIsInitialized() {
		assertEquals(testedUser.getNombre(), "Pepe");
		assertEquals(testedUser.getFriends().size(), 0 );
	}

	@Test
	public void testAUserCanChangeItsName() {
		testedUser.changeName("Juan");
		assertEquals(testedUser.getNombre(), "Juan");
	}
	
	public void testAUserCanAddAFriend() {
		
		User friend = Mockito.mock(User.class);

		testedUser.addFriend( friend );		
		assertEquals(testedUser.getFriends().size(), 1 );
		
	}

}
