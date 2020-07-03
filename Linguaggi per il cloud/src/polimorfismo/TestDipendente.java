package polimorfismo;

public class TestDipendente {

	public static void main(String[] args) {
		Amministrativo a1 = new Amministrativo("Pino Caluso",45,25.25,Mansione.DIRETTORE);
		Amministrativo a2 = new Amministrativo("Dino Caluso",35,20,Mansione.CONTABILE);
		Amministrativo a3 = new Amministrativo("Paolo Caluso",40,10,Mansione.RISORSEUMANE);
		
	
		
		Dipendente[] dipendenti = {a1,a2,a3};
		
		for (Dipendente d : dipendenti) {
			Amministrativo a = null;
			
			if (d instanceof Amministrativo)
				a = (Amministrativo)d;
				System.out.println(a.getNominativo()+": "+a.getMansione());
		}
		
		
		

	}

}
