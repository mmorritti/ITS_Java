package pojo;

public class Televisore {
	
	final private int volumeSu = 1;
	final private int volumeGiu = -1;
	final private int canaleSu = 1;
	final private int canaleGiu = -1;
	private int cambiaCanale;
	
	public Televisore() {
	}

	public Televisore(int cambiaCanale) {
		this.cambiaCanale = cambiaCanale;
	}

	public int getCambiaCanale() {
		return cambiaCanale;
	}

	public void setCambiaCanale(int cambiaCanale) {
		this.cambiaCanale = cambiaCanale;
	}

	public int getVolumeSu() {
		return volumeSu;
	}

	public int getVolumeGiu() {
		return volumeGiu;
	}

	public int getCanaleSu() {
		return canaleSu;
	}

	public int getCanaleGiu() {
		return canaleGiu;
	}
	
	
	
	
	
	

}
