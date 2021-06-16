package app.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Personal {

	private String host = "localhost";
	private String user = "root";
	private String password = "root";
	private String db = "DBEspacio";
	private String table = "personal";
	private int port = 3308;
	
	
	
	public Personal() {
	}

	public Personal(String host, String user, String password, String db, int port) {
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
			System.out.println("-------Todo el personal-------");
			ResultSet resul = sentencia.executeQuery("SELECT * FROM "+table);		
			while(resul.next()){
				System.out.println("{"
						+ "dni: " + resul.getString("dni") + ", "
						+ "nombre: " + resul.getString("nombre") + ", "
						+ "apellidos: " + resul.getString("apellidos") + ", "
						+ "edad: " + resul.getString("edad") + ", "
						+ "funcion: " + resul.getString("funcion") + ", "
						+ "tiempoEstancia: " + resul.getString("tiempoEstancia") + ", "
						+ "fechaAlta: " + resul.getString("fechaAlta") + ", "
						+ "fechaBaja: " + resul.getString("fechaBaja") + ", "
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
			System.out.println("-------Miembro del personal DNI: "+dni+"-------");
			ResultSet resul = sentencia.executeQuery("SELECT * FROM "+table+" WHERE dni="+dni);		
			while(resul.next()){
				System.out.println("{"
						+ "dni: " + resul.getString("dni") + ", "
						+ "nombre: " + resul.getString("nombre") + ", "
						+ "apellidos: " + resul.getString("apellidos") + ", "
						+ "edad: " + resul.getString("edad") + ", "
						+ "funcion: " + resul.getString("funcion") + ", "
						+ "tiempoEstancia: " + resul.getString("tiempoEstancia") + ", "
						+ "fechaAlta: " + resul.getString("fechaAlta") + ", "
						+ "fechaBaja: " + resul.getString("fechaBaja") + ", "
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
			String funcion,
			int tiempoEstancia,
			String fechaAlta,
			String fechaBaja,
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
					+ "\""+funcion+"\", "
					+ tiempoEstancia + ", "
					+ "\""+fechaAlta+"\", "
					+ "\""+fechaAlta+"\", "
					+ id_espacio
					+ ")");
			sentencia.close();
			conexion.close();
			System.out.println("Se ha registrado un nuevo miembro del Personal");
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
			String funcion,
			int tiempoEstancia,
			String fechaAlta,
			String fechaBaja,
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
					+ "funcion = \""+funcion+"\","
					+ "tiempoEstancia = "+tiempoEstancia+", "
					+ "fechaAlta = \""+fechaAlta+"\","
					+ "fechaBaja = \""+fechaBaja+"\","
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
			System.out.println("Se ha eliminado un miembro del personal con DNI: "+dni);
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
