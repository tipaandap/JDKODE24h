package serveur;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;
 
import com.sun.net.httpserver.HttpServer;

@SuppressWarnings("restriction")
public class ServeurHTTP implements Runnable{
	
	//Attributs
	private InetSocketAddress addr;
	private HttpServer serveur;
	
	//Constructeurs
	//Constructeur par défaut
	public ServeurHTTP(){
		addr=new InetSocketAddress(7777);
		try {
			serveur=HttpServer.create(addr,0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//Constructeur prennant un port en parametre
	public ServeurHTTP(int port){
		addr=new InetSocketAddress(port);
		try {
			serveur=HttpServer.create(addr,0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		serveur.createContext("/", new Gestionnaire());
	    serveur.setExecutor(Executors.newCachedThreadPool());
	    serveur.start();
	}
	
}
