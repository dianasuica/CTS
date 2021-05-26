package ro.ase.csie.cts.seminar13.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.seminar13.exceptii.ExceptieNume;
import ro.ase.csie.cts.seminar13.exceptii.ExceptieVarsta;
import ro.ase.csie.cts.seminar13.modele.Student;

public class TestStudent {
	
   static Student student;
   static ArrayList<Integer> note;
   static String numeInitial = "Gigel";
   static int varstaInitiala = 21;

   //inainte de toate testele se creeaza notele
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	    note = new ArrayList<>();
		note.add(9);
		note.add(10);
		note.add(8);
	}

	//clean-up la finalul tuturor testelor
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		note.clear();
		note = null;
	}

	//toate unit testele vor primi exact aceleasi valori pt student
	@Before
	public void setUp() throws Exception {
		student = new Student(numeInitial,varstaInitiala,note);
	}

	//dupa fiecare student stergem referinta folosita
	@After
	public void tearDown() throws Exception {
		student = null;
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	//right varsta
	@Test
	public void testSetVarstaValoriNormaleRight() throws ExceptieVarsta {
		
		//int varstaNoua = 22;
		int varstaNoua = Student.MIN_VARSTA + 1;
		student.setVarsta(varstaNoua);
		assertEquals("Testare cu valori ok", varstaNoua, student.getVarsta());
	}
	
	//right nume
	@Test
	public void testSetNumeRight() {
		String numeNou = "Ionel";
		try {
			student.setNume(numeNou);
			assertEquals("Test cu valori corecte", numeNou, student.getNume());
		} catch (ExceptieNume e) {
			fail("Am primit exceptie pt valori normale");
		}
	}
	
	//error varsta val prea mici- de data aceasta trebuie sa tratam exceptia pentru ca asta vrem
	//sa primim exceptie
	@Test
	public void testSetVarstaErrorConditionsValoriNegative() {
		int varstaNoua = -100;
		try {
			student.setVarsta(varstaNoua);
			//daca nu genereaza exceptie la varsta -100 => test esuat
			fail("Nu am primit exceptie pt varsta cu valori negative");
		} catch (ExceptieVarsta e) {
			//e bine daca primim exceptie la varsta -100;
			assertTrue(true);
		}
	}
	
	@Test(expected = ExceptieVarsta.class) //exceptia pe care ne asteptam sa o primim, in loc sa punem blocul try-catch de mai sus
	//error varsta val prea mari
	public void testSetVarstaErrorConditionsValoriMari() throws ExceptieVarsta {
		int varstaNoua = Student.MAX_VARSTA + 100;
		student.setVarsta(varstaNoua);
		
	}

}
