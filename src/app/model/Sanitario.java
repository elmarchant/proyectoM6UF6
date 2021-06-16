package app.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sanitario {
	
	private String host = "localhost";
	private String user = "root";
	private String password = "root";
	private String db = "DBEspacio";
	private String table = "sanitarios";
	private int port = 3306;
	
	
	
	public Sanitario() {
	}

	public Sanitario(String host, String user, String password, String db, int port) {
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
			System.out.println("-------Todos los sanitarios-------");
			ResultSet resul = sentencia.executeQuery("SELECT * FROM "+table);		
			while(resul.next()){
				System.out.println("{"
						+ "dni: " + resul.getString("dni") + ", "
						+ "nombre: " + resul.getString("nombre") + ", "
						+ "apellidos: " + resul.getString("apellidos") + ", "
						+ "edad: " + resul.getString("edad") + ", "
						+ "titulacion: " + resul.getString("titulacion") + ", "
						+ "dondeTrabaja: " + resul.getString("dondeTrabaja") + ", "
						+ "tiempoEstancia: " + resul.getString("tiempoEstancia") + ", "
						+ "fechaEntrada: " + resul.getString("fechaEntrada") + ", "
						+ "fechaSalida: " + resul.getString("fechaSalida") + ", "
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
	
	public void selectById(String dni) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db+"?serverTimezone=UTC", user, password);
			Statement sentencia = conexion.createStatement();
			System.out.println("-------Sanitario con DNI: "+dni+"-------");
			ResultSet resul = sentencia.executeQuery("SELECT * FROM "+table+" WHERE dni="+dni);		
			while(resul.next()){
				System.out.println("{"
						+ "dni: " + resul.getString("dni") + ", "
						+ "nombre: " + resul.getString("nombre") + ", "
						+ "apellidos: " + resul.getString("apellidos") + ", "
						+ "edad: " + resul.getString("edad") + ", "
						+ "titulacion: " + resul.getString("titulacion") + ", "
						+ "dondeTrabaja: " + resul.getString("dondeTrabaja") + ", "
						+ "tiempoEstancia: " + resul.getString("tiempoEstancia") + ", "
						+ "fechaEntrada: " + resul.getString("fechaEntrada") + ", "
						+ "fechaSalida: " + resul.getString("fechaSalida") + ", "
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
			String dni,
			String nombre,
			String apellidos,
			int edad,
			String titulacion,
			String dondeTrabaja,
			int tiempoEstancia,
			String fechaEntrada,
			String fechaSalida,
			int id_espacio
			) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db+"?serverTimezone=UTC", user, password);
			Statement sentencia = conexion.createStatement();
			int resul = sentencia.executeUpdate("INSERT INTO "+table+" VALUES("
					+ "\""+dni+"\", "
					+ "\""+nombre+"\", "
					+ "\""+apellidos+"\", "
					+ edad + ", "
					+ "\""+titulacion+"\", "
					+ "\""+dondeTrabaja+"\", "
					+ tiempoEstancia + ", "
					+ "\""+fechaEntrada+"\", "
					+ "\""+fechaSalida+"\", "
					+ id_espacio
					+ ")");
			sentencia.close();
			conexion.close();
			System.out.println("Se ha registrado un nuevo Sanitario");
		} catch(ClassNotFoundException cn){
			cn.printStackTrace();
		} catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void update(
			String dni,
			String nombre,
			String apellidos,
			int edad,
			String titulacion,
			String dondeTrabaja,
			int tiempoEstancia,
			String fechaEntrada,
			String fechaSalida,
			int id_espacio
			) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db+"?serverTimezone=UTC", user, password);
			Statement sentencia = conexion.createStatement();
			int resul = sentencia.executeUpdate("UPDATE "+table+" SET "
					+ "nombre = \""+nombre+"\","
					+ "apellidos = \""+apellidos+"\","
					+ "edad = "+edad+", "
					+ "titulacion = \""+titulacion+"\","
					+ "dondeTrabaja = \""+dondeTrabaja+"\","
					+ "tiempoEstancia = "+tiempoEstancia+", "
					+ "fechaEntrada = \""+fechaEntrada+"\","
					+ "fechaSalida = \""+fechaSalida+"\","
					+ "id_espacio = "+id_espacio
					+ " WHERE dni="+dni);
			sentencia.close();
			conexion.close();
			System.out.println("Se ha modificado el sanitario con DNI: "+dni);
		} catch(ClassNotFoundException cn){
			cn.printStackTrace();
		} catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void delete(String dni) {
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conexion = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+db+"?serverTimezone=UTC", user, password);
			Statement sentencia = conexion.createStatement();
			int resul = sentencia.executeUpdate("DELETE FROM "+table+" WHERE dni="+dni);
			sentencia.close();
			conexion.close();
			System.out.println("Se ha eliminado el sanitario con DNI: "+dni);
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
