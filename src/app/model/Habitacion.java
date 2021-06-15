package app.model;

public class Habitacion {
	private int id;
	private int cantidadCamas;
	private boolean tieneBano;
	private boolean plantaBaja;
	private int idEspacio;
	
	public Habitacion(int id, int cantidadCamas, boolean tieneBano, boolean plantaBaja, int idEspacio) {
		this.id = id;
		this.cantidadCamas = cantidadCamas;
		this.tieneBano = tieneBano;
		this.plantaBaja = plantaBaja;
		this.idEspacio = idEspacio;
	}

	public Habitacion() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidadCamas() {
		return cantidadCamas;
	}

	public void setCantidadCamas(int cantidadCamas) {
		this.cantidadCamas = cantidadCamas;
	}

	public boolean isTieneBano() {
		return tieneBano;
	}

	public void setTieneBano(boolean tieneBano) {
		this.tieneBano = tieneBano;
	}

	public boolean isPlantaBaja() {
		return plantaBaja;
	}

	public void setPlantaBaja(boolean plantaBaja) {
		this.plantaBaja = plantaBaja;
	}

	public int getIdEspacio() {
		return idEspacio;
	}

	public void setIdEspacio(int idEspacio) {
		this.idEspacio = idEspacio;
	}

	@Override
	public String toString() {
		return "Habitacion{"
				+ "id: " + id + ", "
				+ "cantidadCamas: " + cantidadCamas + ", "
				+ "tieneBano: " + tieneBano + ", "
				+ "plantaBaja: " + plantaBaja + ", "
				+ "idEspacio: " + idEspacio
				+ "}";
	}
}
