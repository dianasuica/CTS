package ro.ase.csie.cts.seminar6.prototype;

public class TestPrototype {

	public static void main(String[] args) {
		
		Model3DCaracter superman1 = new Model3DCaracter("albastru");
		try {
			Model3DCaracter superman2 = (Model3DCaracter) superman1.clone();
		    System.out.println("Superman 2 generat");
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
