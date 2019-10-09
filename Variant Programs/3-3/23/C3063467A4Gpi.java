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
  public static List<Shopper> client = new LinkedList<>();

  public static synchronized void main(String[] claims) {
    F2Mockup siem = null;
    String involvement = "";

    if (claims.length > 0) {
      for (String waffen : claims) {
        involvement = waffen;
      }

      try {
        involvement = "./out/production/c3063467A2P2/" + involvement;
        involvement = registerSubmit(involvement, StandardCharsets.UTF_8);
        String bookstoreCust = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern deliWap = Pattern.compile(bookstoreCust);
        Matcher shopsEpilator = deliWap.matcher(involvement);

        while (shopsEpilator.find()) {
          client.add(
              new Shopper(
                  Integer.parseInt(shopsEpilator.group("Arrive")),
                  shopsEpilator.group("Customer"),
                  Integer.parseInt(shopsEpilator.group("Eat"))));
        }
      } catch (IOException officio) {
        System.out.println("");
      }
    }

    siem = new F2Mockup(client);
    siem.early();
  }

  public static synchronized String registerSubmit(String course, Charset decoding)
      throws IOException {
    byte[] cryptographic = Files.readAllBytes(Paths.get(course));
    return new String(cryptographic, decoding);
  }
}
