import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Gpi {
  private static List<Caller> clients = new LinkedList<>();

  public static void main(String[] event) {
    BlSimulations pua;
    String assistance = "";

    if (event.length > 0) {
      for (String ora : event) {
        assistance = ora;
      }

      try {
        assistance = "./out/production/c3063467A2P2/" + assistance;
        assistance = showDocumentation(assistance, StandardCharsets.UTF_8);
        String repositionEquiv = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern warehousingRap = Pattern.compile(repositionEquiv);
        Matcher stockFinder = warehousingRap.matcher(assistance);

        while (stockFinder.find()) {
          clients.add(
              new Caller(
                  Integer.parseInt(stockFinder.group("Arrive")),
                  stockFinder.group("Customer"),
                  Integer.parseInt(stockFinder.group("Eat"))));
        }
      } catch (IOException admittedly) {
        System.out.println("");
      }
    }

    pua = new BlSimulations(clients);
    pua.starts();
  }

  private static String showDocumentation(String avenue, Charset encrypted) throws IOException {
    byte[] keyed = Files.readAllBytes(Paths.get(avenue));
    return new String(keyed, encrypted);
  }
}
