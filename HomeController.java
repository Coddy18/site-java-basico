
import com.sun.net.httpserver.*;
import java.io.*;

public class HomeController implements HttpHandler {
  @Override
  public void handle (HttpExchange exchange) throws IOException {
      File file = new File ("index.html");
      byte[] response = new byte [(int) file.length()];
      new FileInpuntStream(file).read(response):
      exchange.sendResponseHeaders(200,response.length);
      OUtputStream os = exchange.getResponseBody();
      os.write(response)
      os.close();
  }
}
