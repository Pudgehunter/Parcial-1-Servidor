package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

import model.Jugador;

public class Session extends Thread{
	
	private Jugador jugador;
	private BufferedWriter writer;
	private Socket socket;
	private Main main;
	
	
	public Session(Socket socket) {
		this.socket = socket;
		jugador = new Jugador(" ",0,0," ");
	}
	
	
	@Override
	public void run() {
		try {
			//Los reader y writers... (aunque los writer no sea necesario)
			InputStream is = socket.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader reader = new BufferedReader(isr);
			
			OutputStream out = socket.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(out);	
			writer = new BufferedWriter(osw);
			
			//Para que lo recorra siempre
			while(true) {
				System.out.println("Esperando mensaje...");
				String lastMessage = reader.readLine();
				main.mensaje(this, lastMessage);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
	}
	
	
	public void enviar(String msg) {
		new Thread(
				
				()->{
					try {
						writer.write(msg + "\n");
						writer.flush();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
		).start();
		
	}
	//Metodos de getter y setters
	
	public Jugador getJugador() {
		return jugador;
	}


	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}
	

	public BufferedWriter getWriter() {
		return writer;
	}


	public void setWriter(BufferedWriter writer) {
		this.writer = writer;
	}


	public Socket getSocket() {
		return socket;
	}


	public void setSocket(Socket socket) {
		this.socket = socket;
	}


	public Main getMain() {
		return main;
	}


	public void setMain(Main main) {
		this.main = main;
	}
	
}
