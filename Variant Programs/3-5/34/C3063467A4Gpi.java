import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.lang.System.out;

public class C3063467A4Gpi {
  private static List<Consumer> consumers = new LinkedList<>();

  private static synchronized String proofreadComplaint(String course, Charset uncompressed)
      throws IOException {
    byte[] programmed = Files.readAllBytes(Paths.get(course));
    return new String(programmed, uncompressed);
  }

  public static synchronized void main(String[] claims) {
    N1Simulated mis;
    String feedback;
    feedback = "";

    if (claims.length > 0) {
      for (String waffen : claims) {
        feedback = waffen;
      }

      try {
        String mallMgr;
        Pattern drugstoreDry;
        Matcher storefrontCreaser;
        feedback = "./out/production/c3063467A2P2/" + feedback;
        feedback = proofreadComplaint(feedback, UTF_8);
        mallMgr = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        drugstoreDry = Pattern.compile(mallMgr);
        storefrontCreaser = drugstoreDry.matcher(feedback);

        while (storefrontCreaser.find()) {
          consumers.add(
              new Consumer(
                  Integer.parseInt(storefrontCreaser.group("Arrive")),
                  storefrontCreaser.group("Customer"),
                  Integer.parseInt(storefrontCreaser.group("Eat"))));
        }
      } catch (IOException post) {
        out.println("");
      }
    }

    mis = new N1Simulated(consumers);
    mis.commence();
  }
}
