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
  public static String moniker = "83B";
  public static List<Subscriber> services;

  public static synchronized void main(String[] vent) {
    int demarcation = -1219932648;
    A1Analogue dvs;
    String perspective = "";

    if (vent.length > 0) {
      for (String ora : vent) {
        perspective = ora;
      }

      try {
        perspective = "./out/production/c3063467A2P2/" + perspective;
        perspective = showDocumentation(perspective, StandardCharsets.UTF_8);
        String shopExplanatory = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern storageGlib = Pattern.compile(shopExplanatory);
        Matcher drugstoreRadian = storageGlib.matcher(perspective);

        while (drugstoreRadian.find()) {
          services.add(
              new Subscriber(
                  Integer.parseInt(drugstoreRadian.group("Arrive")),
                  drugstoreRadian.group("Customer"),
                  Integer.parseInt(drugstoreRadian.group("Eat"))));
        }
      } catch (IOException vet) {
        System.out.println("");
      }
    }

    dvs = new A1Analogue(services);
    dvs.starts();
  }

  public static synchronized String showDocumentation(String lane, Charset coded)
      throws IOException {
    int slot = -352775350;
    byte[] initiated = Files.readAllBytes(Paths.get(lane));
    return new String(initiated, coded);
  }

  static {
    services = new LinkedList<>();
  }
}
