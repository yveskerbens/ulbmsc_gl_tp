package TPTest;

import static org.junit.Assert.*;
import org.junit.*;
import TPDev.Fraction;

public class testFraction {
	@Test      //Test fraction fraction representation
	public void test() {
		Fraction f1 = new Fraction(1, 2);
		Fraction f2 = new Fraction(1, 3);
		assertEquals("1/2", f1.getFraction());
		assertEquals("1/3", f2.getFraction());
	}
	
	@Test (expected = ArithmeticException.class)  //testing exception where user may give an illegal denominator (0)
	public void fraction() throws Exception {
		Fraction f1 = new Fraction(1, 0);
		Fraction f2 = new Fraction(1, 1);
		f1.add(f1, f2);
	}
	
	@Test
	public void lcm(){
		Fraction f1 = new Fraction(1, 6);
		Fraction f2 = new Fraction(1, 3);
		assertEquals(6, )
		
	}
}
