package rpgrevisao;

import entities.Elfo;

public class Main {

	public static void main(String[] args) {
		Elfo f = new Elfo(1.76, 68.0, 'M', 21, true, false, true);
		
		System.out.println(f.getSexo());
	}
	
	

}
