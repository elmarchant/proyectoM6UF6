package app.model;

import java.sql.Date;

public class Personal {
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	private String funcion;
	private int tiempoEstancia;
	private Date fechaAlta;
	private Date fechaBaja;
	private double salario;
	private int idEspacio;
	
	public Personal(String dni, String nombre, String apellidos, int edad, String funcion, int tiempoEstancia,
			Date fechaAlta, Date fechaBaja, double salario, int idEspacio) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.funcion = funcion;
		this.tiempoEstancia = tiempoEstancia;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.salario = salario;
		this.idEspacio = idEspacio;
	}

	public Personal() {
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

	public String getFuncion() {
		return funcion;
	}

	public void setFuncion(String funcion) {
		this.funcion = funcion;
	}

	public int getTiempoEstancia() {
		return tiempoEstancia;
	}

	public void setTiempoEstancia(int tiempoEstancia) {
		this.tiempoEstancia = tiempoEstancia;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaBaja() {
		return fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getIdEspacio() {
		return idEspacio;
	}

	public void setIdEspacio(int idEspacio) {
		this.idEspacio = idEspacio;
	}

	@Override
	public String toString() {
		return "Personal{"
				+ "dni" + dni + ", "
				+ "nombre" + nombre + ", "
				+ "apellidos" + apellidos + ", "
				+ "edad" + edad + ", "
				+ "funcion" + funcion + ", "
				+ "tiempoEstancia" + tiempoEstancia + ", "
				+ "fechaAlta" + fechaAlta + ", "
				+ "fechaBaja" + fechaBaja + ", "
				+ "salario" + salario + ", "
				+ "idEspacio" + idEspacio
				+ "}";
	}
	
	
	
}
