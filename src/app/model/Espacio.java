package app.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Espacio {
	
	private String host = "localhost";
	private String user = "root";
	private String password = "root";
	private String db = "DBEspacio";
	private String table = "espacios";
	private int port = 3306;
	
	public Espacio() {}
	
	public Espacio(String host, String user, String password, String db, int port) {
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
						+ "id_espacio: " + resul.getString("id_espacio") + ", "
						+ "tiempoCesion: " + resul.getString("tiempoCesion") + ", "
						+ "numeroPlantas: " + resul.getString("numeroPlantas") + ", "
						+ "metrosCuadrados: " + resul.getString("metrosCuadrados") + ", "
						+ "accesibilidad: " + resul.getString("accesibilidad") + ", "
						+ "direccion: " + resul.getString("direccion") + ", "
						+ "propietario: " + resul.getString("propietario") + ", "
						+ "cantidadHabitaciones: " + resul.getString("cantidadHabitaciones") + ", "
						+ "tieneComedor: " + resul.getString("tieneComedor") + ", "
						+ "danComida: " + resul.getString("danComida") + ", "
						+ "tieneInternet: " + resul.getString("tieneInternet")
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
	
	public void selectById(int id_espacio) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db+"?serverTimezone=UTC", user, password);
			Statement sentencia = conexion.createStatement();
			System.out.println("-------Espacio con id_espacio: "+id_espacio+"-------");
			ResultSet resul = sentencia.executeQuery("SELECT * FROM "+table+" WHERE id_espacio="+id_espacio);		
			while(resul.next()){
				System.out.println("{"
						+ "id_espacio: " + resul.getString("id_espacio") + ", "
						+ "tiempoCesion: " + resul.getString("tiempoCesion") + ", "
						+ "numeroPlantas: " + resul.getString("numeroPlantas") + ", "
						+ "metrosCuadrados: " + resul.getString("metrosCuadrados") + ", "
						+ "accesibilidad: " + resul.getString("accesibilidad") + ", "
						+ "direccion: " + resul.getString("direccion") + ", "
						+ "propietario: " + resul.getString("propietario") + ", "
						+ "cantidadHabitaciones: " + resul.getString("cantidadHabitaciones") + ", "
						+ "tieneComedor: " + resul.getString("tieneComedor") + ", "
						+ "danComida: " + resul.getString("danComida") + ", "
						+ "tieneInternet: " + resul.getString("tieneInternet")
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
			int tiempoCesion,
			int numeroPlantas,
			int metrosCuadrados,
			String accesibilidad,
			String direccion,
			String propietario,
			int cantidadHabitaciones,
			boolean tieneComedor,
			boolean danComida,
			boolean tieneInternet
			) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db+"?serverTimezone=UTC", user, password);
			Statement sentencia = conexion.createStatement();
			int resul = sentencia.executeUpdate("INSERT INTO "+table+"("
					+ "tiempoCesion,"
					+ "numeroPlantas,"
					+ "metrosCuadrados,"
					+ "accesibilidad, "
					+ "direccion, "
					+ "propietario, "
					+ "cantidadHabitaciones,"
					+ "tieneComedor,"
					+ "danComida,"
					+ "tieneInternet) VALUES("
					+ tiempoCesion + ", "
					+ numeroPlantas + ", "
					+ metrosCuadrados + ", "
					+ "\""+accesibilidad+"\", "
					+ "\""+direccion+"\", "
					+ "\""+propietario+"\", "
					+ cantidadHabitaciones + ", "
					+ tieneComedor + ", "
					+ danComida + ", "
					+ tieneInternet
					+ ")");
			sentencia.close();
			conexion.close();
			System.out.println("Se ha registrado un nuevo espacio");
		} catch(ClassNotFoundException cn){
			cn.printStackTrace();
		} catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void update(
			int id_espacio,
			int tiempoCesion,
			int numeroPlantas,
			int metrosCuadrados,
			String accesibilidad,
			String direccion,
			String propietario,
			int cantidadHabitaciones,
			boolean tieneComedor,
			boolean danComida,
			boolean tieneInternet
			) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db+"?serverTimezone=UTC", user, password);
			Statement sentencia = conexion.createStatement();
			int resul = sentencia.executeUpdate("UPDATE "+table+" SET "
					+ "tiempoCesion = "+tiempoCesion+","
					+ "numeroPlantas = "+numeroPlantas+","
					+ "metrosCuadrados = "+metrosCuadrados+","
					+ "accesibilidad = \""+accesibilidad+"\", "
					+ "direccion = \""+direccion+"\","
					+ "propietario = \""+propietario+"\","
					+ "cantidadHabitaciones = "+cantidadHabitaciones+","
					+ "tieneComedor = "+tieneComedor+","
					+ "danComida = "+danComida+","
					+ "tieneInternet = "+tieneInternet
					+ " WHERE id_espacio="+id_espacio);
			sentencia.close();
			conexion.close();
			System.out.println("Se ha modificado el espacio con id: "+id_espacio);
		} catch(ClassNotFoundException cn){
			cn.printStackTrace();
		} catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void delete(int id_espacio) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db+"?serverTimezone=UTC", user, password);
			Statement sentencia = conexion.createStatement();
			int resul = sentencia.executeUpdate("DELETE FROM "+table+" WHERE id_espacio="+id_espacio);
			sentencia.close();
			conexion.close();
			System.out.println("Se ha eliminado el espacio con id: "+id_espacio);
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
