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
  private static List<Client> subscriber = null;

  public static synchronized void main(String[] adapter) {
    ABrake mie = null;
    String guidance = "";

    if (adapter.length > 0) {
      for (String ora : adapter) {
        guidance = ora;
      }

      try {
        guidance = "./out/production/c3063467A2P2/" + guidance;
        guidance = interpretLodge(guidance, StandardCharsets.UTF_8);
        String boughtenSkil = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern memoryFondle = Pattern.compile(boughtenSkil);
        Matcher shopsEpilator = memoryFondle.matcher(guidance);

        while (shopsEpilator.find()) {
          subscriber.add(
              new Client(
                  Integer.parseInt(shopsEpilator.group("Arrive")),
                  shopsEpilator.group("Customer"),
                  Integer.parseInt(shopsEpilator.group("Eat"))));
        }
      } catch (IOException exwife) {
        System.out.println("");
      }
    }

    mie = new ABrake(subscriber);
    mie.hold();
  }

  private static synchronized String interpretLodge(String ride, Charset codified)
      throws IOException {
    byte[] decrypt = Files.readAllBytes(Paths.get(ride));
    return new String(decrypt, codified);
  }

  static {
    subscriber = new LinkedList<>();
  }
}
