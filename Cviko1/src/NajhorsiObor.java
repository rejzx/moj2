

public class NajhorsiObor extends Obor {	   
	void odveta(Rytier rytier) {
		if (hladny)
			zjedz(rytier);
	}
	void zjedz(Rytier rytier) {
		rytier.energia = 0;
	}

}


