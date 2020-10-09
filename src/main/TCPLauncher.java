package main;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class TCPLauncher extends Thread{
	
	private static TCPLauncher onlyInstance;
	
	
	//Singleton ()
	public static TCPLauncher getInstance() {
		if(onlyInstance == null) {
			onlyInstance = new TCPLauncher();
		}
		return onlyInstance;
	}
	
	private TCPLauncher() {}
	
	//Singleton
	
	//Atributos Globales 
	private Main main;
	private ServerSocket server;
	private ArrayList<Session> sessionArrayList;
	
	//Metodos
	
	//1.Metodo de session
	public void setServidor(Main main) {
		this.main = main;
	}
	
	public void run(){
		try {
			//1. Iniciar el servidor y esperar una conexión
			// tener en cuenta session primero
			sessionArrayList = new ArrayList<Session>();
			server = new ServerSocket(5000);
			System.out.println("Esperando conexión");
			
			while(true) {
				System.out.println("Esperando que se conecten...");
				Socket socket = server.accept();
				
				//Una vez conectados empezamos con los sessions
				Session session = new Session(socket);
				session.setMain(main);
				session.start();
				
				sessionArrayList.add(session);
				
				//3. Conectados!
				System.out.println("Cliente conectados");
	
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<Session> getSessions() {
		return this.sessionArrayList;
	}

}
