
import Calendario.Calendario;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aless
 */
public class CalendarioJunitTest {
    
    public CalendarioJunitTest() {
    }
    
   // @Before
    //public void setUp() {
   // }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void isBisestileTest() {
     Calendario calendario = new Calendario();
     assertEquals(false,calendario.isBisestile(2021));
     }
     @Test
     public void numeroGiorniTest() {
     Calendario calendario = new Calendario();
     assertEquals(28,calendario.numeroGiorni(2, 2021));
     }
     @Test
     public void numeroProgressivoTest(){
      Calendario calendario = new Calendario();
      assertEquals(136,calendario.numeroProgressivo("15/05/2016"));
     }
}
