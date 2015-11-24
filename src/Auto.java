

public class Auto {
public double kilometerstand;
public double tankinhalt = 40;
public double benzinverbrauch = 0.1;
public double tanke = 50;

public void tanken (int liter)	{

tankinhalt = tankinhalt + tanke;
}

public void fahre (double kilometer){
	
	double reichweite = tankinhalt/(benzinverbrauch*100);
	
	//reichweite ausrechenen, und dann entschedien ob auto reichweite oder kilometer fahren soll 

	if (tankinhalt > 0) {
			kilometerstand = kilometerstand + kilometer;
			tankinhalt = tankinhalt - (kilometer*benzinverbrauch);		
		} else if (tankinhalt <= 0)  {
			System.out.println("PSYYYCH Kein Sprit mehr!");
		}
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
