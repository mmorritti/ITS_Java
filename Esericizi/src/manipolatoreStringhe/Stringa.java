package manipolatoreStringhe;

public class Stringa {
	private String s;

	public Stringa(String s) {
		this.s = s;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public String inverti() {
		String st="";
		for (int i = s.length()-1; i>=0; i--) {
			st=st+s.charAt(i);
		}
		return st;
	}
	
	public String rimuoviSpazi() {
		return s.replace(" ", "");
	}
	
	public String conc(String s2) {
		return s.concat(s2);
	}
	
	public String raddoppia() {
		return s.concat(s);
	}
	

}
