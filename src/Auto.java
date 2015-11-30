
public class Auto {
	public double kilometerstand;
	public double tankinhalt = 40;
	public double benzinverbrauch = 0.1;
	public double tanke = 50;

	public void tanken(int liter) {

		tankinhalt = tankinhalt + tanke;
	}

	public void fahre(double kilometer) {

		double reichweite = tankinhalt * (benzinverbrauch * 100);

		System.out.println("reichweite"+reichweite);
		
		if (reichweite < kilometer) {
			kilometer = reichweite;
		}
		System.out.println("Kilometer"+kilometer);

		kilometerstand = kilometerstand + kilometer;
		tankinhalt = tankinhalt - (kilometer * benzinverbrauch);

	}

}
