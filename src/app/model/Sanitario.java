package app.model;

import java.sql.Date;

public class Sanitario {
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	private String titulacion;
	private String dondeTrabaja;
	private int tiempoEstancia;
	private Date fechaEntrada;
	private Date fechaSalida;
	private int idHabitacion;
	
	public Sanitario(String dni, String nombre, String apellidos, int edad, String titulacion,
			String dondeTrabaja, int tiempoEstancia, Date fechaEntrada, Date fechaSalida, int idHabitacion) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.titulacion = titulacion;
		this.dondeTrabaja = dondeTrabaja;
		this.tiempoEstancia = tiempoEstancia;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.idHabitacion = idHabitacion;
	}

	public Sanitario() {
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public String getDondeTrabaja() {
		return dondeTrabaja;
	}

	public void setDondeTrabaja(String dondeTrabaja) {
		this.dondeTrabaja = dondeTrabaja;
	}

	public int getTiempoEstancia() {
		return tiempoEstancia;
	}

	public void setTiempoEstancia(int tiempoEstancia) {
		this.tiempoEstancia = tiempoEstancia;
	}

	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public int getIdHabitacion() {
		return idHabitacion;
	}

	public void setIdHabitacion(int idHabitacion) {
		this.idHabitacion = idHabitacion;
	}

	@Override
	public String toString() {
		return "Sanitario{"
				+ "dni: " + dni + ", "
				+ "nombre: " + nombre + ", "
				+ "apellidos: " + apellidos + ", "
				+ "edad: " + edad + ", "
				+ "titulacion: " + titulacion + ", "
				+ "dondeTrabaja: " + dondeTrabaja + ", "
				+ "tiempoEstancia: " + tiempoEstancia + ", "
				+ "fechaEntrada: " + fechaEntrada + ", "
				+ "fechaSalida: " + fechaSalida + ", "
				+ "idHabitacion: " + idHabitacion
				+ "}";
	}
}
