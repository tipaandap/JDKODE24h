package serveur;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
 
import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class serveurHTTP {
	
	//Attributs
	private InetSocketAddress addr;
	private HttpServer serveur;
	private int port;
	
	//Constructeurs
	//Constructeur par défaut
	public serveurHTTP(){
		
	}
	
	public serveurHTTP(int port){
		addr=new InetSocketAddress(port);
		try {
			serveur=HttpServer.create(addr,0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
	    InetSocketAddress addr = new InetSocketAddress(1985);
	    HttpServer server = HttpServer.create(addr, 0);
	 
	    server.createContext("/", new Gestionnaire());
	    server.setExecutor(Executors.newCachedThreadPool());
	    server.start();
	    System.out.println("Le serveur en ecoute sur le port: "+addr.getPort());
	  }
}
