package ro.ase.csie.cts.seminar12.testareUnitara.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.seminar12.testareUnitara.modele.OperatiiMatematice;

public class TestOperatiiMatematice {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
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
		
		assertEquals("Suma cu nr pozitive", rezultatAsteptat, rezultatCalcular);
		
	}

}
