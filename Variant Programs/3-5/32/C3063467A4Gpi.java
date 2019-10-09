import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class C3063467A4Gpi {
  private static List<Patient> purchasers = new LinkedList<>();

  public static synchronized void main(String[] use) {
    FEmulator mis;
    String information;
    information = ("");

    if (use.length > 0) {
      for (String fh : use) {
        information = (fh);
      }

      try {
        String storefrontSvc;
        Pattern shopsBatt;
        Matcher shopsEpilator;
        information = ("./out/production/c3063467A2P2/" + information);
        information = (learnRegister(information, StandardCharsets.UTF_8));
        storefrontSvc = ("(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)");
        shopsBatt = (compile(storefrontSvc));
        shopsEpilator = (shopsBatt.matcher(information));

        while (shopsEpilator.find()) {
          purchasers.add(
              new Patient(
                  parseInt(shopsEpilator.group("Arrive")),
                  shopsEpilator.group("Customer"),
                  parseInt(shopsEpilator.group("Eat"))));
        }
      } catch (IOException late) {
        System.out.println("");
      }
    }

    mis = (new FEmulator(purchasers));
    mis.come();
  }

  private static synchronized String learnRegister(String journey, Charset metadata)
      throws IOException {
    byte[] cryptographic = readAllBytes(get(journey));
    return new String(cryptographic, metadata);
  }
}
