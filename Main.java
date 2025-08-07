import java.io.*;
import java.net.*;
import com.sun.net.httpserver.*;

public class Main {
  public static void main (String[] args) throws Exception {
    HttpServer server = HttpServer.create(new InetSoketAddress(8080),0);
    server.createContext("/", new HomeController());
    server.setExecutor(null);
    server.start();
    System.out.println(" Sevidor rodando em http://localhost:8000/");
  }
}
