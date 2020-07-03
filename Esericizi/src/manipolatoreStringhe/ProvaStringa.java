package manipolatoreStringhe;

public class ProvaStringa {

	public static void main(String[] args) {
		Stringa s1 =  new Stringa("Ciao");
		System.out.println(s1.inverti());
		Stringa s2 = new Stringa("Ciao come Stai");
		System.out.println(s2.rimuoviSpazi());
		Stringa s3 = new Stringa("Ciao");
		System.out.println(s3.conc(" come stai?"));
		System.out.println(s2.raddoppia());

	}

}
