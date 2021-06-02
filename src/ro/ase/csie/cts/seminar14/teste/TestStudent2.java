package ro.ase.csie.cts.seminar14.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.seminar13.exceptii.ExceptieNota;
import ro.ase.csie.cts.seminar13.exceptii.ExceptieVarsta;
import ro.ase.csie.cts.seminar14.modele.Student;
import ro.ase.csie.cts.seminar14.teste.categorii.TesteImportante;

public class TestStudent2 {
	
	//test fixture
	static Student student;
	static ArrayList<Integer> note;
	static String numeInitial;
	static int varstaInitiala;
	static int nrNoteInitiale;
	static ArrayList<Integer> noteTestPerformanta;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		note = new ArrayList();
		nrNoteInitiale = 3;
		Random random = new Random();
		for(int i = 0; i< nrNoteInitiale;i++) {
			note.add(random.nextInt(Student.MAX_NOTA)+1);
		}
		numeInitial = "Gigel";
		varstaInitiala = Student.MIN_VARSTA + 1;
		
		noteTestPerformanta = new ArrayList();
		int nrNote = 1000;
		for(int i=0; i< nrNote;i++) {
			noteTestPerformanta.add(Student.MAX_NOTA);
		}
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		student = new Student(numeInitial,varstaInitiala,note);;
	}

	@After
	public void tearDown() throws Exception {
	}
	
	//range si error condition in acelasi timp min int
	@Test(expected = ExceptieVarsta.class)
	public void testSetVarstaRangeMinInt() throws ExceptieVarsta {
		int varsta_noua = Integer.MIN_VALUE;
		student.setVarsta(varsta_noua);
	}
	
	//range si error condition in acelasi timp max int
	@Test(expected = ExceptieVarsta.class)
	public void testSetVarstaRangeMaxInt() throws ExceptieVarsta {
		int varsta_noua = Integer.MAX_VALUE;
		student.setVarsta(varsta_noua);
	}
	
	//boundary si right in acelasi timp - varsta minima
	@Test
	public void testSetVarstaBoundaryVarstaMinima() throws ExceptieVarsta {
		int varstaNoua = Student.MIN_VARSTA;
		student.setVarsta(varstaNoua);
		int varstaModificata = student.getVarsta();
		assertEquals("Test pentru limita inferioara varsta", varstaNoua,varstaModificata);
	}
	
	//boundary si right in acelasi timp - varsta maxima
		@Test
		public void testSetVarstaBoundaryVarstaMaxima() throws ExceptieVarsta {
			int varstaNoua = Student.MAX_VARSTA;
			student.setVarsta(varstaNoua);
			int varstaModificata = student.getVarsta();
			assertEquals("Test pentru limita superioara varsta", varstaNoua,varstaModificata);
		}
		
	//reference
	@Test
	public void testSetNoteReference() throws ExceptieNota {
		ArrayList<Integer> note = new ArrayList<>();
		note.add(10);
		note.add(10);
		note.add(10);
		student.setNote(note);
		
		int[] noteStudent = new int[student.getNrNote()];
		for(int i=0;i<student.getNrNote();i++) {
			noteStudent[i]=student.getNota(i);
		}
		
		note.set(0, 5);
		
		int[] noteStudentDupaModificare = new int[note.size()];
		for(int i=0;i<student.getNrNote();i++) {
			noteStudentDupaModificare[i]=student.getNota(i);
		}
		
		assertArrayEquals("Test modificare colectie note externa obiectului", noteStudent,noteStudentDupaModificare);;
		
	}

	//performance stil junit3
	@Test
	public void testGetMediePerformance() throws ExceptieNota {
		ArrayList<Integer> note = new ArrayList();
		int nrNote = 1000;
		for(int i=0; i< nrNote;i++) {
			note.add(Student.MAX_NOTA);
		}
		student.setNote(note);
		
		long tStart = System.currentTimeMillis();
		float medieCalculata = student.getMedie();
		long tFinal = System.currentTimeMillis();
		
		long durata = tFinal - tStart;
		long durataMinima = 10; //100 de milisecunde
		if(durata < durataMinima) {
			assertTrue(true);
		}else {
			fail("Testul a depasit durata minima");
		}
	}
	
	//performace stil junit4
	@Test(timeout = 10)
	public void testGetMediePerformanceJUnit4() throws ExceptieNota {
		student.setNote(noteTestPerformanta);
		student.getMedie();
	}
	
	//inverseRelationship - luam rezultatul calculat si incercam sa l comparam cu alte repere
	@Test
	public void testGetNotaMinimanverseRelationship() throws ExceptieNota {
		ArrayList<Integer> note = new ArrayList();
		int nrNote = 10000;
		Random random = new Random();
		for(int i=0; i< nrNote;i++) {
			note.add(random.nextInt(Student.MAX_NOTA+1));
		}
		student.setNote(note);
		
		int minimCalculat = student.getNotaMinima();
		
		//pt ca nu putem determina valoarea estimata
		//verificam relatia dintre minim si valorile initiale
		for(int i = 0; i < nrNote; i++) {
			if(minimCalculat > note.get(i)) {
				fail("Minimul calculat nu este colect");
			}
		}
		assertTrue(true);
	}
	
	//cross-check
	@Test
	@Category(TesteImportante.class)
	public void testGetMedieCrossCheck() throws ExceptieNota {
		ArrayList<Integer> note = new ArrayList<>();
		int nrNote = 10;
		Random random = new Random();
		for(int i=0; i< nrNote;i++) {
			note.add(random.nextInt(Student.MAX_NOTA+1));
		}
		
		student.setNote(note);
		
		float medieEstimata = getMedieVariantaInitiala(note); //aici in loc sa hardcodam, apelam functia
		float medieCalculata = student.getMedie();
		assertEquals("Valorile calculate de cele 2 functii nu sunt identice",
				medieEstimata,medieCalculata,0);
	}
	
	public float getMedieVariantaInitiala(ArrayList<Integer> valori) {
		float suma = 0;
		for(int val : valori) {
			suma += val;
		}
		return suma/valori.size();
	}
	
	//suite
	
}
