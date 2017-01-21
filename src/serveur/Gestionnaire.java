package serveur;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpUpgradeHandler;
import javax.servlet.http.WebConnection;
import javax.xml.ws.spi.http.HttpExchange;

import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class Gestionnaire implements HttpHandler{
	
	public void handle(HttpExchange exchange) throws IOException {
	    String methodeRequete = exchange.getRequestMethod();
	    if (methodeRequete.equalsIgnoreCase("GET")) {
	      Headers reponseEntete = exchange.getResponseHeaders();
	      reponseEntete.set("Content-Type", "text/plain");
	      exchange.sendResponseHeaders(200, 0);
	 
	      OutputStream reponse = exchange.getResponseBody();
	      Headers requeteEntete = exchange.getRequestHeaders();
	      Set<String> keySet = requeteEntete.keySet();
	      Iterator<String> iter = keySet.iterator();
	      while (iter.hasNext()) {
	        String key = iter.next();
	        List values = requeteEntete.get(key);
	        String s = key + " = " + values.toString() + "";
	        reponse.write(s.getBytes());
	      }
	      reponse.close();
	    }
	  }

	@Override
	public void handle(com.sun.net.httpserver.HttpExchange arg0) throws IOException {
		// TODO Auto-generated method stub
		
	}
	
}
