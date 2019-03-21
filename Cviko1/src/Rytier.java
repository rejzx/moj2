
public class Rytier {
	int energia;
	
	void utok(Obor obor) {
		obor.energia = (int) (Math.random() * obor.energia); // (int) len pretypuje float vysledok na int
		obor.odveta(this); // premenna this obsahuje odkaz na aktualny objekt rytiera 
		System.out.println(this);
	}

}
