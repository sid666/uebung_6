

public class AutoTester {

	public static void main(String[] args) {
		new Auto();
		Auto testwagen1= new Auto();
		//Auto testwagen2= new Auto();
		
		//int a = Zufall.getZufallInt(1,500);
		
		testwagen1.fahre(1);
		testwagen1.fahre(1);
		//testwagen2.fahre(a);
		
		System.out.println(testwagen1.kilometerstand);
		System.out.println(testwagen1.tankinhalt);
		
		//System.out.println(testwagen2.kilometerstand);
		//System.out.println(testwagen2.tankinhalt);
	}

}
