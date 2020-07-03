package funzioni;

public class dado {
	private int facce;

	public dado(int facce) {
		super();
		this.facce = facce;
	}

	public int getFacce() {
		return facce;
	}

	public void setFacce(int facce) {
		this.facce = facce;
	}
	
	public int lancio() {
		return MyLibrary.casuale(1, facce);
	}

	@Override
	public String toString() {
		return "dado [facce=" + facce + ", lancio()=" + lancio() + "]";
	}

		

}
