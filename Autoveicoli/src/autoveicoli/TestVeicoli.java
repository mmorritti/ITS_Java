package autoveicoli;

public class TestVeicoli {

	public static void main(String args[]) {

		Veicolo v = new Veicolo("123to", "punto", "fiat", 3);
		AutoVeicolo av = new AutoVeicolo("aq111qa", "panda", "fiat", 5, 5);
		Autocarro ac = new Autocarro("ddd3432", "iveco", "tracker", 3, 30);

		System.out.println(v.toString());
		System.out.println(av.toString());
		System.out.println(ac.toString());

		Veicolo[] veicoli = { v, av, ac, new Veicolo("223to", "punto", "fiat", 3),
				new AutoVeicolo("aq1d11qa", "panda", "fiat", 5, 3),
				new Autocarro("ddd343452", "iveco", "tracker", 3, 35) };

		System.out.println("STAMPA ELENCO \n");
		for (Veicolo ve : veicoli) {
			System.out.println(ve);
		}

		System.out.println("STAMPA AUTOCARRI\n");

		for (Veicolo ve : veicoli) {
			Autocarro ac1 = null;
			if (ve instanceof Autocarro) {
				ac1 = (Autocarro) ve;
				ac1.setModello("AAA");
				System.out.println(ve);
			}
		}

		// ricerca di un elemento in un array
		for (Veicolo veic : veicoli) {
			if (veic.equals(v)) {
				System.out.println("trovato");

			}

		}

	}
}
