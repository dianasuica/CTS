package ro.ase.csie.cts.seminar13.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import ro.ase.csie.cts.seminar13.exceptii.ExceptieNota;
import ro.ase.csie.cts.seminar13.exceptii.ExceptieNume;
import ro.ase.csie.cts.seminar13.exceptii.ExceptieVarsta;
import ro.ase.csie.cts.seminar13.modele.Student;

public class TestStudent {
	
   //Test fixture (datele de care ne folosim in test case-uri definite aici)
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
	
	//error varsta val prea mari
	@Test(expected = ExceptieVarsta.class) //exceptia pe care ne asteptam sa o primim, in loc sa punem blocul try-catch de mai sus
	public void testSetVarstaErrorConditionsValoriMari() throws ExceptieVarsta {
		int varstaNoua = Student.MAX_VARSTA + 100;
		student.setVarsta(varstaNoua);
		
	}
	
	//ordering
	@Test
	public void testGetNotaMinimaOrderingSprtateCrescator() throws ExceptieNota {
		int notaMinima = 4;
		ArrayList<Integer> noteSortate = new ArrayList<>();
		for(int i=0;i<5;i++) {
			noteSortate.add(notaMinima + i);
		}
		
		student.setNote(noteSortate);
		
		int notaDeterminata = student.getNotaMinima();
		assertEquals("Test cu note sortate crescator", notaMinima, notaDeterminata);
	}
	
	//cardinality - 0 elemente
	@Test
	public void testGetNotaMinimaCardinalityZero() throws ExceptieNota {
		ArrayList<Integer> note = new ArrayList<>();
		student.setNote(note);
		
		int notaMinima = 0; //daca nu are note ne asteptam sa primim 0
		int notaMinimaCalculata = student.getNotaMinima();
		assertEquals("Test fara note", notaMinima, notaMinimaCalculata);
	}
	
	//cardinality - 1 element
	@Test
	public void testGetNotaMinimaCardinalityUnu() throws ExceptieNota {
		ArrayList<Integer> note = new ArrayList<>();
		note.add(Student.MAX_NOTA);
		student.setNote(note);
		
		int notaMinima = Student.MAX_NOTA; 
		int notaMinimaCalculata = student.getNotaMinima();
		assertEquals("Test cu o singura nota", notaMinima, notaMinimaCalculata);
	}
	
	//existence
	@Test
	public void testGetNotaMinimaExistanceReferintaNull() throws ExceptieNota {
		student.setNote(null);
		int notaMinima = 0;
		int notaMinimaCalculata = student.getNotaMinima();
		assertEquals("Test cu referinta null pt note", notaMinima, notaMinimaCalculata);
	}

}
