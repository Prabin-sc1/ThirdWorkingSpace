package generic;

public class Main {

	public static void main(String[] args) {
		SE prabin=new SE("Prabin");
		SE sahil=new SE("Sahil");
	    SE aashir=new SE("Aashirbad");
		SE aadesh=new SE("Aadesh");
		SE kuber=new SE("Kuber");
		
		Group<SE> logic =new Group<>("Logic");
		logic.addStudent(kuber);
		logic.addStudent(prabin);
		logic.addStudent(sahil);
		
		Group<SE> circuit =new Group<>("Circuit");
		circuit.addStudent(aashir);
		circuit.addStudent(aadesh);
		
		logic.result(circuit, 7, 5);
		
		System.out.println("rankings");
         System.out.println(circuit.getName()+":"+circuit.ranking());
         System.out.println(logic.getName()+":"+logic.ranking());
		
		
		

	}

}
