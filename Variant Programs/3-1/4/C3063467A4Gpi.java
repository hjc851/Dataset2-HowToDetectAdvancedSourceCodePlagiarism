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
  private static List<Purchaser> purchasers = new LinkedList<>();

  public static void main(String[] param) {
    N1Simulated intelligent;
    String response = "";

    if (param.length > 0) {
      for (String ora : param) {
        response = ora;
      }

      try {
        response = "./out/production/c3063467A2P2/" + response;
        response = sayFolder(response, StandardCharsets.UTF_8);
        String drugstoreKnowl = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern deliWap = Pattern.compile(drugstoreKnowl);
        Matcher repositingSinusoid = deliWap.matcher(response);

        while (repositingSinusoid.find()) {
          purchasers.add(
              new Purchaser(
                  Integer.parseInt(repositingSinusoid.group("Arrive")),
                  repositingSinusoid.group("Customer"),
                  Integer.parseInt(repositingSinusoid.group("Eat"))));
        }
      } catch (IOException afterwards) {
        System.out.println("");
      }
    }

    intelligent = new N1Simulated(purchasers);
    intelligent.introduce();
  }

  private static String sayFolder(String approach, Charset keying) throws IOException {
    byte[] keyed = Files.readAllBytes(Paths.get(approach));
    return new String(keyed, keying);
  }
}
