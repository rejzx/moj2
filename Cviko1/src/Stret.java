
public class Stret {
	static void stret(Obor obor, Rytier rytier) {
		rytier.utok(obor);
	}

	public static void main(String[] args) {
		Rytier[] r = new Rytier[140];
		Obor[] o = new Obor[140];
/*

		//stret 100 rytierov a 100 obrov: inicializacia
		for (int i = 0; i < 100; i++) {
			r[i] = new Rytier();
			o[i] = new Obor();
			r[i].energia = 40;
			o[i].energia = 50;
		}
*/
		// pribudol dalsi druh obra: ZlyObor
		// toto je len inicializacia poli obrov a rytierov tak, aby sa prejavili rozne kombinacie
		for (int i = 0; i < 20; i++) {
			r[i] = new Rytier();
			r[i].energia = 40;
			o[i] = new ZlyObor();
			o[i].energia = 50;
			o[i].hladny = true;
		}

		for (int i = 20; i < 40; i++) {
			r[i] = new Rytier();
			r[i].energia = 40;
			o[i] = new ZlyObor();
			o[i].energia = 50;
		}

		for (int i = 40; i < 100; i++) {
			r[i] = new Rytier();
			r[i].energia = 40;
			o[i] = new Obor();
			o[i].energia = 50;
		}
		
		for (int i = 100; i < 120; i++) {
			r[i] = new Rytier();
			r[i].energia = 40;
			o[i] = new NajhorsiObor();
			o[i].energia = 50;
			o[i].hladny = true;
		}
		
		for (int i = 120; i < 140; i++) {
			r[i] = new ZlyRytier();
			r[i].energia = 40;
			o[i] = new NajhorsiObor();
			o[i].energia = 50;
			o[i].hladny = false;
		}
		
		

		// slucka stretu s vypisom
		for (int i = 0; i < 140; i++) {
			stret(o[i], r[i]);
			
			System.out.println(i + ": "
					+ "rytier " + r[i].energia + " / "
					+ "obor " + o[i].energia);
		}
	}
}
