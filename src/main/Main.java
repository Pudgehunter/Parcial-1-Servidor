package main;

import com.google.gson.Gson;

import model.Jugador;
import processing.core.PApplet;

public class Main extends PApplet {

	private TCPLauncher tcplauncher;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("main.Main");
	}

	public void settings() {
		size(500,500);
	}
	
	public void setup() {
		//Iniciar mi singleton para conectar mi celular con este eclipse
		tcplauncher = TCPLauncher.getInstance();
		tcplauncher.setServidor(this);
		tcplauncher.start();
	}
	
	public void draw() {
		background(0);
		
		fill(255);
		//ellipse(x,y,50,50);
	}
	
	public void mensaje(Session session, String mensaje) {
		System.out.println("Mensaje recibido de: " + mensaje);
		Gson gson = new Gson();
		Jugador jugadorReader = gson.fromJson(mensaje, Jugador.class);
		//Aca tengo que hacer todo lo que entra en el while, pues los movimientos de los personajes...
	}
}