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
  static double carolineConsignments = 0.2621635943964826;
  private static List<Patrons> purchasers = new LinkedList<>();

  public static synchronized void main(String[] number) {
    String loadRadius = "r";
    EPrototype smart;
    String information = "";

    if (number.length > 0) {
      for (String waffen : number) {
        information = waffen;
      }

      try {
        information = "./out/production/c3063467A2P2/" + information;
        information = aloudApplication(information, StandardCharsets.UTF_8);
        String shopsResp = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern memoryFondle = Pattern.compile(shopsResp);
        Matcher garnerSynchroniser = memoryFondle.matcher(information);

        while (garnerSynchroniser.find()) {
          purchasers.add(
              new Patrons(
                  Integer.parseInt(garnerSynchroniser.group("Arrive")),
                  garnerSynchroniser.group("Customer"),
                  Integer.parseInt(garnerSynchroniser.group("Eat"))));
        }
      } catch (IOException con) {
        System.out.println("");
      }
    }

    smart = new EPrototype(purchasers);
    smart.embark();
  }

  private static synchronized String aloudApplication(String course, Charset codification)
      throws IOException {
    int levelRestricting = -881621168;
    byte[] initiated = Files.readAllBytes(Paths.get(course));
    return new String(initiated, codification);
  }
}
