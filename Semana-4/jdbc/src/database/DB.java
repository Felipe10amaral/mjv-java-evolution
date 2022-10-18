package database;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {
	
	private static Connection connector = null;
	
	//metodo para conectar com o banco
	public static Connection getConecction() {
		if(connector == null) {
			
			try {
				Properties props = loadProperties();
				String url = props.getProperty("dburl");
				connector = DriverManager.getConnection(url, props);
			}
			catch (SQLException e){
				throw new DbException(e.getMessage());
			}
		}
		return connector;
	}
	
	// metodo para fechar a conexao com o banco
	public static void closeConnection() {
		if(connector != null) {
			try {
				connector.close();
			}
			catch (SQLException e ) {
				throw new DbException(e.getMessage());
			}
			
		}
	}
	
	//metodo para carregar as propriedades definidas em db.properties
	private static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("db.properties")){
			Properties props = new Properties();
			props.load(fs);
			return props;
		}
		catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}
	
}
