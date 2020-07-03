package password;

import java.util.Random;

public class Password {
	
	private String nome;
	private String psw;
	
	public Password() {
	}

	public Password(String nome, String psw) {
		this.nome = nome;
		this.psw = psw;
	}


	public String GeneraPass(int dim) {
		
		Random rand = new Random();
		String psw = "";
		String charPsw = "ABCDEFGHIJKLMNOPQRSTUVWXYXZ"+
						"abcdefghijklmnopqrstuvwxyz"+
						"1234567890"+
						"!$&/()[]{}@.-_#"; //77
		
		for(int i = 0; i < dim; i++) {
			psw += charPsw.charAt(rand.nextInt(charPsw.length()));
		}
		
		return psw;			
	}

	@Override
	public String toString() {
		return (nome != null ?  nome + ": " : "") + (psw != null ? psw : "");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPsw() {
		return psw;
	}

	public void setPsw(String psw) {
		this.psw = psw;
	}
	
	
	
	
	
	
	
	

}
