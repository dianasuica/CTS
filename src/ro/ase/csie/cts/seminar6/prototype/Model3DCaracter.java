package ro.ase.csie.cts.seminar6.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Model3DCaracter implements Cloneable {
	
	String culoare;
	int inaltime;
	
	//cand folosim colectii este bine sa facem eager instantiation
	ArrayList<Integer> puncte = new ArrayList<>();
	
	private Model3DCaracter() {
		
	}
	
	public Model3DCaracter(String culoare) {
		this.culoare = culoare;
		
		System.out.println("Incarcare model 3D");
		
		try {
			Thread.sleep(2000);
			
			Random random = new Random(10);
			for(int i = 0; i < 20; i++ ) {
				this.puncte.add(random.nextInt(1000));
			}
			
			System.out.println("Model 3D generat");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Model3DCaracter copie = new Model3DCaracter();
		copie.culoare = this.culoare;
		copie.inaltime = this.inaltime;
		//deep copy
		copie.puncte = (ArrayList<Integer>) this.puncte.clone();
		return copie;
	}
	
	

}
