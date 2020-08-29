import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
/**
 * 
 */

/**
 * @author Raman
 *
 */
public class VideoTest {

	private Video video;
	private String videoName;
	//private boolean checkout;
	private int rating;
	
	@Before
	public void before() {
		videoName = "Test Name";
		//checkout = true;
		rating = 5;
		video = new Video(videoName);
	}

	@Test
	public void getNameTest() {
		assertEquals(videoName, video.getName());
	}
	
	@Test
	public void doCheckoutTest() {
		video.doCheckout();
		assertTrue(video.getCheckout());
	} 
	
	@Test
	public void doReturnTest() {
		video.doReturn();
		assertFalse(video.getCheckout());
	}
	
	@Test
	public void receiveRatingTest() {
		video.receiveRating(rating);
		assertEquals(rating, video.getRating());
	}
	
	@Test
	public void getRatingTest() {
		video.receiveRating(rating);
		assertEquals(rating, video.getRating());
	}
	
	@Test
	public void getCheckoutTest() {
		video.doCheckout();
		assertTrue(video.getCheckout());
		video.doReturn();
		assertFalse(video.getCheckout());
	}


}
