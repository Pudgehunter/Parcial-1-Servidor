package model;

//Clase Gson
public class Jugador {
	private String nombreJugador;
	private int coordenadaX;
	private int coordenadaY;
	private String detalles;
	private int r,g,b;
	
	//Necesario para Gson
	public Jugador() {}
	
	public Jugador(String nombreJugador,int coordenadaX, int coordenadaY, String detalles,int r, int g, int b) {
		this.nombreJugador = nombreJugador;
		this.coordenadaX = coordenadaX;
		this.coordenadaY = coordenadaY;
		this.detalles = detalles;
		this.r = r;
		this.g = g;
		this.b = b;
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

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getG() {
		return g;
	}

	public void setG(int g) {
		this.g = g;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	
	
	
	
}
