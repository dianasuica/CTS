package ro.ase.csie.cts.seminar12.testareUnitara.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.seminar12.testareUnitara.exceptii.ExceptieImpartireLaZero;
import ro.ase.csie.cts.seminar12.testareUnitara.modele.OperatiiMatematice;

public class TestOperatiiMatematice {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	    System.out.println("Salut");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("La revedere");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Pregatire test");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Stergere resurse folosite");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testAdunaValoriPozitie() {
		int a = 5;
		int b = 5;
		int rezultatAsteptat = 10;
		int rezultatCalcular = OperatiiMatematice.aduna(a, b);
		System.out.println("Test");
		assertEquals("Suma cu nr pozitive", rezultatAsteptat, rezultatCalcular);
		
	}
	
	@Test
	public void testImpartireValoriPozitive() {
		int a = 1;
		int b = 2;
		double rezultatAsteptat = 0.5;
		double rezultatCalculat = 0;
		try {
			rezultatCalculat = OperatiiMatematice.impartire(a, b);
		} catch (ExceptieImpartireLaZero e) {
			fail("Am primit exceptie, desi nu trebuia");
		}
		
		assertEquals("Impartire 1/2",rezultatAsteptat,rezultatCalculat,0);
	}

}
