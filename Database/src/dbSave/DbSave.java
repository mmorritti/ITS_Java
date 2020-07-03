package dbSave;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class DbSave {
	public static void main (String [] args) {
		//Caricamento driver db
		String driver = "com.mysql.jdbc.Driver";
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		//Connessione a mySql
		String url ="jdbc:mysql://localhost:3306";//host a cui connettersi
		String user = "root";
		String password = "";
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//Selezione del db
		String database = "dati";//db a cui connettersi
		
		try {
			conn.setCatalog(database);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//Preparazione query
		Statement st = null;
		String nome = JOptionPane.showInputDialog("Inserisci nome");
		String cognome = JOptionPane.showInputDialog("Inserisci Cognome");
		
		String update = "INSERT INTO `dati` (`id`, `nome`, `cognome`)"+
						"VALUES (NULL"+",`"+nome+"`,`"+cognome+"`)";
		
		try {
			int rows = st.executeUpdate(update);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
