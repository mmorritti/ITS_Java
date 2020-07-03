package interfacce;

public class TestAtleta {

	public static void main(String[] args) {
		
		Atleta a1 = new Atleta("Dino Parisi","Calcio","ParisiClub",36);
		System.out.println(a1);

		Calciatore c1 = new Calciatore("Pino Sapia","Calcio","Nichelino",15,5,0);
		Calciatore c2 = new Calciatore("Rino Rania","Calcio","Nichelino",17,9,10);
		
		System.out.println(c1);
		System.out.println(c2);
		
		if(c1.compareTo(c2)==1)
			System.out.println(c1.getNominativo()+" ha media goal maggiore di "+c2.getNominativo());
		else if(c1.compareTo(c2)==-1)
			System.out.println(c1.getNominativo()+" ha media goal minore di "+c2.getNominativo());
		
		
		Calciatore c3 = null;
		try {
			c3 = (Calciatore)c1.clone();
			c3.setDisciplina("Basket");
			System.out.println(c3);
		}catch(CloneNotSupportedException e) {
			System.out.println("Errore!");
			System.out.println(e.getMessage());
			//System.exit(0);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
