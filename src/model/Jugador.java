package model;

//Clase Gson
public class Jugador {
	private String nombreJugador;
	private int coordenadaX;
	private int coordenadaY;
	private String detalles;
	
	//Necesario para Gson
	public Jugador() {}
	
	public Jugador(String nombreJugador,int coordenadaX, int coordenadaY, String detalles) {
		this.nombreJugador = nombreJugador;
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.detalles = detalles;
	}
	
	//Metodos
	public String getNombreJugador() {
		return nombreJugador;
	}

	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador = nombreJugador;
	}

	public int getCoordenadaX() {
		return coordenadaX;
	}

	public void setCoordenadaX(int coordenadaX) {
		this.coordenadaX = coordenadaX;
	}

	public int getCoordenadaY() {
		return coordenadaY;
	}

	public void setCoordenadaY(int coordenadaY) {
		this.coordenadaY = coordenadaY;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}
}
