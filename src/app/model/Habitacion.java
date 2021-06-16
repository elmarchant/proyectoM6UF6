package app.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Habitacion {
	private String host = "localhost";
	private String user = "root";
	private String password = "root";
	private String db = "DBEspacio";
	private String table = "habitaciones";
	private int port = 3306;
	
	public Habitacion(){}
	
	public Habitacion(String host, String user, String password, String db, int port) {
		this.host = host;
		this.user = user;
		this.password = password;
		this.db = db;
		this.port = port;
	}

	public void selectAll() {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db+"?serverTimezone=UTC", user, password);
			Statement sentencia = conexion.createStatement();
			System.out.println("-------Todos los espacios-------");
			ResultSet resul = sentencia.executeQuery("SELECT * FROM "+table);		
			while(resul.next()){
				System.out.println("{"
						+ "id_habitacion: " + resul.getString("id_habitacion") + ", "
						+ "metrosCuadrados: " + resul.getString("metrosCuadrados") + ", "
						+ "cantidadCamas: " + resul.getString("cantidadCamas") + ", "
						+ "tieneBano: " + resul.getString("tieneBano") + ", "
						+ "plantaBaja: " + resul.getString("plantaBaja") + ", "
						+ "id_espacio: " + resul.getString("id_espacio")
						+ "}");			
			}
			resul.close();
			sentencia.close();
			conexion.close();
		} catch(ClassNotFoundException cn){
			cn.printStackTrace();
		} catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void selectById(int id) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db+"?serverTimezone=UTC", user, password);
			Statement sentencia = conexion.createStatement();
			System.out.println("-------Habitacion con id: "+id+"-------");
			ResultSet resul = sentencia.executeQuery("SELECT * FROM "+table+" WHERE id_habitacion="+id);		
			while(resul.next()){
				System.out.println("{"
						+ "id_habitacion: " + resul.getString("id_habitacion") + ", "
						+ "metrosCuadrados: " + resul.getString("metrosCuadrados") + ", "
						+ "cantidadCamas: " + resul.getString("cantidadCamas") + ", "
						+ "tieneBano: " + resul.getString("tieneBano") + ", "
						+ "plantaBaja: " + resul.getString("plantaBaja") + ", "
						+ "id_espacio: " + resul.getString("id_espacio")
						+ "}");			
			}
			resul.close();
			sentencia.close();
			conexion.close();
		} catch(ClassNotFoundException cn){
			cn.printStackTrace();
		} catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void insert(
			int metrosCuadrados,
			int cantidadCamas,
			boolean tieneBano,
			boolean plantaBaja,
			int id_espacio
			) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db+"?serverTimezone=UTC", user, password);
			Statement sentencia = conexion.createStatement();
			int resul = sentencia.executeUpdate("INSERT INTO "+table+"("
					+ "metrosCuadrados,"
					+ "cantidadCamas,"
					+ "tieneBano,"
					+ "plantaBaja, "
					+ "id_espacio) VALUES("
					+ metrosCuadrados + ", "
					+ cantidadCamas + ", "
					+ tieneBano + ", "
					+ plantaBaja + ", "
					+ id_espacio
					+ ")");
			sentencia.close();
			conexion.close();
			System.out.println("Se ha registrado una nueva habitación.");
		} catch(ClassNotFoundException cn){
			cn.printStackTrace();
		} catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void update(
			int id_habitacion,
			int metrosCuadrados,
			int cantidadCamas,
			boolean tieneBano,
			boolean plantaBaja,
			int id_espacio
			) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db+"?serverTimezone=UTC", user, password);
			Statement sentencia = conexion.createStatement();
			int resul = sentencia.executeUpdate("UPDATE "+table+" SET "
					+ "metrosCuadrados = "+metrosCuadrados+","
					+ "cantidadCamas = "+cantidadCamas+","
					+ "tieneBano = "+tieneBano+","
					+ "plantaBaja = "+plantaBaja+","
					+ "id_espacio = "+id_espacio
					+ " WHERE id_habitacion="+id_habitacion);
			sentencia.close();
			conexion.close();
			System.out.println("Se ha modificado la habitacion con id: "+id_habitacion);
		} catch(ClassNotFoundException cn){
			cn.printStackTrace();
		} catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void delete(int id) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db+"?serverTimezone=UTC", user, password);
			Statement sentencia = conexion.createStatement();
			int resul = sentencia.executeUpdate("DELETE FROM "+table+" WHERE id_habitacion="+id);
			sentencia.close();
			conexion.close();
			System.out.println("Se ha eliminado la habitación con id: "+id);
		} catch(ClassNotFoundException cn){
			cn.printStackTrace();
		} catch(SQLException e){
			e.printStackTrace();
		}
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}
