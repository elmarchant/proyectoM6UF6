package app.model;

public class Espacio {
	private int id;
	private int tiempoCesion;
	private int numeroPlantas;
	private int metrosCuadrados;
	private String accesibilidad;
	private String direccion;
	private String propietario;
	private int cantidadHabitaciones;
	private boolean tieneComedor;
	private boolean danComida;
	private boolean tieneInternet;

	public Espacio(int id, int tiempoCesion, int numeroPlantas, int metrosCuadrados, String accesibilidad,
			String direccion, String propietario, int cantidadHabitaciones, boolean tieneComedor, boolean danComida,
			boolean tieneInternet) {
		this.id = id;
		this.tiempoCesion = tiempoCesion;
		this.numeroPlantas = numeroPlantas;
		this.metrosCuadrados = metrosCuadrados;
		this.accesibilidad = accesibilidad;
		this.direccion = direccion;
		this.propietario = propietario;
		this.cantidadHabitaciones = cantidadHabitaciones;
		this.tieneComedor = tieneComedor;
		this.danComida = danComida;
		this.tieneInternet = tieneInternet;
	}

	public Espacio() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTiempoCesion() {
		return tiempoCesion;
	}

	public void setTiempoCesion(int tiempoCesion) {
		this.tiempoCesion = tiempoCesion;
	}

	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}

	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	public String getAccesibilidad() {
		return accesibilidad;
	}

	public void setAccesibilidad(String accesibilidad) {
		this.accesibilidad = accesibilidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public int getCantidadHabitaciones() {
		return cantidadHabitaciones;
	}

	public void setCantidadHabitaciones(int cantidadHabitaciones) {
		this.cantidadHabitaciones = cantidadHabitaciones;
	}

	public boolean isTieneComedor() {
		return tieneComedor;
	}

	public void setTieneComedor(boolean tieneComedor) {
		this.tieneComedor = tieneComedor;
	}

	public boolean isDanComida() {
		return danComida;
	}

	public void setDanComida(boolean danComida) {
		this.danComida = danComida;
	}

	public boolean isTieneInternet() {
		return tieneInternet;
	}

	public void setTieneInternet(boolean tieneInternet) {
		this.tieneInternet = tieneInternet;
	}

	public int getNumeroPlantas() {
		return numeroPlantas;
	}

	public void setNumeroPlantas(int numeroPlantas) {
		this.numeroPlantas = numeroPlantas;
	}

	@Override
	public String toString() {
		return "Espacio{"
				+ "id: " + id
				+ "tiempoCesion: " + tiempoCesion + ", "
				+ "numeroPlantas: " + numeroPlantas + ", "
				+ "metrosCuadrados: " + metrosCuadrados + ", "
				+ "accesibilidad: " + accesibilidad + ", "
				+ "direccion: " + direccion + ", "
				+ "propietario: " + propietario + ", "
				+ "cantidadHabitaciones: " + cantidadHabitaciones + ", "
				+ "tieneComedor: " + tieneComedor + ", "
				+ "danComida: " + danComida + ", "
				+ "tieneInternet: " + tieneInternet
				+ "}";
	}
}
