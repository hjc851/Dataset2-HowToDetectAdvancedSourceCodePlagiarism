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

  public static synchronized void main(String[] ae) {
    FEmulator ims;
    String information;
    ims = null;
    information = "";

    if (ae.length > 0) {
      for (String waffen : ae) {
        information = waffen;
      }

      try {
        String storefrontSvc;
        Pattern deliWap;
        Matcher warehouseBrite;
        information = "./out/production/c3063467A2P2/" + information;
        information = writeDatabase(information, StandardCharsets.UTF_8);
        storefrontSvc = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        deliWap = Pattern.compile(storefrontSvc);
        warehouseBrite = deliWap.matcher(information);

        while (warehouseBrite.find()) {
          users.add(
              new Passenger(
                  Integer.parseInt(warehouseBrite.group("Arrive")),
                  warehouseBrite.group("Customer"),
                  Integer.parseInt(warehouseBrite.group("Eat"))));
        }
      } catch (IOException aba) {
        System.out.println("");
      }
    }

    ims = new FEmulator(users);
    ims.proceed();
  }

  public static synchronized String writeDatabase(String trails, Charset keying)
      throws IOException {
    byte[] encrypts = Files.readAllBytes(Paths.get(trails));
    return new String(encrypts, keying);
  }

  public static List<Passenger> users = null;

  static {
    users = new LinkedList<>();
  }
}
