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
  private static List<Tenant> shoppers = new LinkedList<>();

  public static void main(String[] ae) {
    HManikin indeed;
    String stimulation = "";

    if (ae.length > 0) {
      for (String ora : ae) {
        stimulation = ora;
      }

      try {
        stimulation = "./out/production/c3063467A2P2/" + stimulation;
        stimulation = rereadSubmitted(stimulation, StandardCharsets.UTF_8);
        String warehousingReq = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern fundCaress = Pattern.compile(warehousingReq);
        Matcher fundSpooler = fundCaress.matcher(stimulation);

        while (fundSpooler.find()) {
          shoppers.add(
              new Tenant(
                  Integer.parseInt(fundSpooler.group("Arrive")),
                  fundSpooler.group("Customer"),
                  Integer.parseInt(fundSpooler.group("Eat"))));
        }
      } catch (IOException past) {
        System.out.println("");
      }
    }

    indeed = new HManikin(shoppers);
    indeed.starting();
  }

  private static String rereadSubmitted(String direction, Charset encrypt) throws IOException {
    byte[] programmed = Files.readAllBytes(Paths.get(direction));
    return new String(programmed, encrypt);
  }
}
