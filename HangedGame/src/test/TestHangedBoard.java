package test;

import org.junit.Assert;
import org.junit.Test;

import main.HangedBoard;

public class TestHangedBoard {
	
	@Test
	public void testAddLetterToWordPlayer(){
		
		HangedBoard board = new HangedBoard();
		board.startGame("solo", 2);
		int[] result = board.addLetterToWordPlayer('o');
		
		int[] expected  = new int[]{1,3};
		 Assert.assertEquals(expected, result);
		
		
	}

}
