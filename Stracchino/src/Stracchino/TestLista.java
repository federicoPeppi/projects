package Stracchino;
import java.util.Random;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestLista {

	@Test
	public void testLista(){
		Random R = new Random();
		int random = R.nextInt(11);
		System.out.println("Numeri da generare: " + random);
		for(int i=0; i < random; i++){
			int random2 = R.nextInt(10);
			System.out.println("Numero " + (i+1) + " : " + random2);
			switch (random2) {
			case 0: fail(); break;
			case 1: assertEquals(1, random2); break;
			case 2: assertEquals(2, random2); break;
			case 3: assertEquals(3, random2); break;
			case 4: assertEquals(4, random2); break;
			case 5: assertEquals(5, random2); break;
			case 6: assertEquals(6, random2); break;
			case 7: assertEquals(7, random2); break;
			case 8: assertEquals(8, random2); break;
			case 9: assertEquals(9, random2); break;	
			}
			if(i == random - 1){
				System.out.println("Ok");
			}
		}
	}
}
