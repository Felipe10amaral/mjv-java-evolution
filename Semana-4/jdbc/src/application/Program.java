package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.DB;
import database.DbException;

public class Program {
	public static void main(String[] args) {
		Connection conect = null; // é necessario ser inicializada apontando para nulo logo de inicio
		
		// essa classe serve para voce montar um comando sql para ser executado
		Statement st = null;
		
		/*
		 * essa classe vai representar para gente um objeto contendo o resultado da nossa consulta
		 * na forma de tabela 
		 */
		ResultSet rs = null;
		
		try {
			conect = DB.getConecction();
			
			st = conect.createStatement();
			
			rs = st.executeQuery("select * from department");
			
			while(rs.next()) {  // next retorna falso quando esta na ultima linha da tabela 
				System.out.println(rs.getInt("Id") + " " + rs.getString("Name"));
				
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {  //como essas classes são externas e não são controladas pela JVM, é interessante fecharmos manualmente
			DB.closeResultSet(rs);
			DB.closeStatement(st);
			DB.closeConnection();
		}
		
	}

}

