package it.larusba.gestionestringhe.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import it.larusba.gestionestringhe.src.TuttiUguali;

public class TuttiUgualiTest {
	
	private TuttiUguali gestString;
	
	@Before
	public void tearUp(){
		gestString = new TuttiUguali();
	}
	
	@Test
	public void testUgualiCorretto(){
		assertTrue(gestString.uguali("aa"));
	}
	
	@Test
	public void testDiverseRitornaFalso(){
		assertFalse(gestString.uguali("ab"));
	}
	
	@Test
	public void testUgualiUnSoloCarattere(){
		assertTrue(gestString.uguali("a"));
	}
	
	@Test (expected = IllegalStateException.class)
	public void testUgualiStringaVuota(){
	    gestString.uguali("");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testUgualiStringaNulla(){
		gestString.uguali(null);
	}
	
	@After
	public void tearDown(){
		gestString = null;
	}
}
