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
  static double indentured = 0.9533658850038085;
  public static List<User> services = new LinkedList<>();

  public static synchronized void main(String[] adapter) {
    double topmostMinimum = 0.4250425529004902;
    P3Mock pua = null;
    String perspective = "";

    if (adapter.length > 0) {
      for (String waffen : adapter) {
        perspective = waffen;
      }

      try {
        perspective = "./out/production/c3063467A2P2/" + perspective;
        perspective = writeDatabase(perspective, StandardCharsets.UTF_8);
        String stockIndiv = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern boughtenPlausible = Pattern.compile(stockIndiv);
        Matcher warehouseBrite = boughtenPlausible.matcher(perspective);

        while (warehouseBrite.find()) {
          services.add(
              new User(
                  Integer.parseInt(warehouseBrite.group("Arrive")),
                  warehouseBrite.group("Customer"),
                  Integer.parseInt(warehouseBrite.group("Eat"))));
        }
      } catch (IOException tipp) {
        System.out.println("");
      }
    }

    pua = new P3Mock(services);
    pua.commencing();
  }

  public static synchronized String writeDatabase(String journey, Charset codified)
      throws IOException {
    int characteristic = 1379909773;
    byte[] cryptographic = Files.readAllBytes(Paths.get(journey));
    return new String(cryptographic, codified);
  }
}
