
import org.junit.Test;
import static org.junit.Assert.*;




public class TestSomma {
		@Test
		public void testSomma(){
			Somma S=new Somma();
			assertEquals(5, S.somma(2, 3));
			boolean ok =(10==10);
			assertTrue(ok);
		}
}
