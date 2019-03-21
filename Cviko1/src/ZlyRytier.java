
public class  ZlyRytier extends Rytier {
	int energia;
	
	void utok(Obor obor) {
		obor.energia = (int) (0.9 * obor.energia); // (int) len pretypuje float vysledok na int
		obor.odveta(this); // premenna this obsahuje odkaz na aktualny objekt rytiera 
		System.out.println(this);
	}

}
