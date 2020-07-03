package pojo2;

import java.util.ArrayList;

public class Collezione {

	private String nome;
	private String luogo;
	private ArrayList<OperaArte> opere = new ArrayList<OperaArte>();
	
		
	public Collezione(String nome, String luogo, ArrayList<OperaArte> opere) {
		this.nome = nome;
		this.luogo = luogo;
		this.opere = opere;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getLuogo() {
		return luogo;
	}



	public void setLuogo(String luogo) {
		this.luogo = luogo;
	}

	public ArrayList<OperaArte> getOpere() {
		return opere;
	}

	public void setOpere(ArrayList<OperaArte> opere) {
		this.opere = opere;
	}

	public void addOpera(OperaArte opera) {
		opere.add(opera);
	}
	
	public OperaArte removeOpera(String titolo) {	
		int i = 0;
		boolean trovato = false;
		while (i < opere.size() && !trovato) {
			if (opere.get(i) != null && titolo.equals(opere.get(i).titolo))
				trovato = true;
			i++;
		}
		if (!trovato)
			return null;
		else {
			OperaArte op = opere.remove(i);
			return op;
		}		
		
	}
	
	public boolean removeOpera(OperaArte opera) {
		return opere.remove(opera);
	}

	@Override
	public String toString() {
		return "Collezione [nome=" + nome + ", luogo=" + luogo + ", opere=" + opere + "]";
	}
	
}
