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
  private static List<Consumers> clients = new LinkedList<>();

  public static void main(String[] constructor) {
    C4Joystick shum;
    String involvement = "";

    if (constructor.length > 0) {
      for (String fh : constructor) {
        involvement = fh;
      }

      try {
        involvement = "./out/production/c3063467A2P2/" + involvement;
        involvement = sayFolder(involvement, StandardCharsets.UTF_8);
        String storefrontSvc = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern boughtenPlausible = Pattern.compile(storefrontSvc);
        Matcher fundSpooler = boughtenPlausible.matcher(involvement);

        while (fundSpooler.find()) {
          clients.add(
              new Consumers(
                  Integer.parseInt(fundSpooler.group("Arrive")),
                  fundSpooler.group("Customer"),
                  Integer.parseInt(fundSpooler.group("Eat"))));
        }
      } catch (IOException appointed) {
        System.out.println("");
      }
    }

    shum = new C4Joystick(clients);
    shum.opens();
  }

  private static String sayFolder(String roadway, Charset code) throws IOException {
    byte[] formatted = Files.readAllBytes(Paths.get(roadway));
    return new String(formatted, code);
  }
}
