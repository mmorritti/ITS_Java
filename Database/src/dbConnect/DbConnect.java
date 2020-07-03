package dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {

	public static void main(String[] args) {
		
		
		//Caricamento del driver
		String driver ="com.mysql.jdbc.Driver";//indica il driver per mySql
		try {
			Class.forName(driver);//metodo che carica il driver o lancia l'eccezione
			System.out.println("CARICATO");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("ATTENZIONE");
		}
		
		//Connessione a mySql
		String url ="jdbc:mysql://localhost:3306";//host a cui connettersi
		String user = "root";
		String password = "";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);//Ci connette al db o lancia eccezione
			System.out.println("CONNESSO");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ATTENZIONE");
		}
		
		//Selezione del Database
		String database = "libreria";//Nome del database che si desidera selezionare
		try {
			conn.setCatalog(database); //Metodo per seleionare il db su cui si desidera lavorare o lancia eccezione
			System.out.println("SELEZIONATO");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ATTENZIONE");
		}
		
		//Preparazione e esecuzione di query
		Statement st = null;
		try {
			st = conn.createStatement();//Metodo che crea statement per inviare comandi al db o lancia eccezione
			System.out.println("ESEGUITO");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ATTENZIONE");
		}
		
		//Query Select
		String sqlQuery = "SELECT * "
				        + "FROM autori"
				        + " WHERE autID = 4";           //stringa che contiene la query
		try {
			ResultSet rs = st.executeQuery(sqlQuery);//Metodo che esegue le query select o lancia eccezione
			System.out.println("QUERY ESEGUITA");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ATTENZIONE");
		}
		
		//Query di aggiornamento
		/*String update = "INSERT INTO `autori` (`autID`, `nome`, `cognome`) VALUES (NULL, 'Cenerentola', 'Cenerella')";//Query di aggiornamento
		try {
			int rows = st.executeUpdate(update);//Metodo che esegue la query di aggiornamento o lancia eccezione
			System.out.println("AGGIORNAMENTO ESEGUITO");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ATTENZIONE");
		}*/
		
		
		
	
		

	}

}
