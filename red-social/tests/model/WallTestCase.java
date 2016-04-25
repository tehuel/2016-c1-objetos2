package model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class WallTestCase {
	
	Wall testedWall;
	
	@Before
	public void setUp(){
		testedWall = new Wall(); 
	}

	@Test
	public void testAWallReturnsQuantityOfMessagesItHas() {
		assertEquals(0, testedWall.messagesQuantity() );
	}

	@Test
	public void testaWallCanAddAMessage() {
		assertEquals(0, testedWall.messagesQuantity() );
		testedWall.addMessage("Test");
		assertEquals(1, testedWall.messagesQuantity() );
	}

	@Test
	public void testaWallCanDeleteAMessage() {

		testedWall.addMessage("Test");
		assertEquals(1, testedWall.messagesQuantity() );
		
		testedWall.deleteMessage("Test");
		assertEquals(0, testedWall.messagesQuantity());
	}
	
	@Test
	public void testAWallCanReturnItsMessages(){
		
		ArrayList<String> emptyMessagesList = new ArrayList<String>();
		
		assertEquals(emptyMessagesList.size(), testedWall.getMessagesList().size() );

		emptyMessagesList.add("AnotherMessage");
		testedWall.addMessage("AnotherMessage");
		
		assertEquals(emptyMessagesList.size(), testedWall.getMessagesList().size() );
		
	}

}
