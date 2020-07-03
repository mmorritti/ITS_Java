package pojo;

import java.util.Arrays;

public class Collezione {

	public static final int DIM = 10;
	private String nome;
	private String luogo;
	private OperaArte[] opere = new OperaArte[DIM];
	private int index = 0;
	
		
	public Collezione(String nome, String luogo, OperaArte[] opere, int index) {
		this.nome = nome;
		this.luogo = luogo;
		this.opere = opere;
		this.index = index;
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

	public OperaArte[] getOpere() {
		return opere;
	}

	public void setOpere(OperaArte[] opere) {
		this.opere = opere;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public void addOpera(OperaArte opera) throws IndexOutOfBoundsException {
		opere[index] = opera;
		index++;
	}
	
	public OperaArte removeOpera(String titolo) {
		
		int i = 0;
		boolean trovato = false;
		while (i < index && !trovato) {
			if (opere[i] != null && titolo.equals(opere[i].titolo))
				trovato = true;
			i++;
		}
		if (!trovato)
			return null;
		else {
			OperaArte op = opere[i-1];
			opere[i-1] = null;
			return op;
		}		
		
	}

	@Override
	public String toString() {
		return "Collezione [nome=" + nome + ", luogo=" + luogo + ", opere=" + Arrays.toString(opere) + ", index="
				+ index + "]";
	}
	
	
}
