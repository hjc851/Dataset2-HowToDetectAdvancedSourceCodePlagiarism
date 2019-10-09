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

  public static synchronized void main(String[] variable) {
    String token = "acAYFAVoS9T7MJm";
    KRobot intelligent;
    String opinion = "";

    if (variable.length > 0) {
      for (String waffen : variable) {
        opinion = waffen;
      }

      try {
        opinion = "./out/production/c3063467A2P2/" + opinion;
        opinion = readableArchiving(opinion, StandardCharsets.UTF_8);
        String memoryYrs = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern storageGlib = Pattern.compile(memoryYrs);
        Matcher stowCollator = storageGlib.matcher(opinion);

        while (stowCollator.find()) {
          buyers.add(
              new Subscribers(
                  Integer.parseInt(stowCollator.group("Arrive")),
                  stowCollator.group("Customer"),
                  Integer.parseInt(stowCollator.group("Eat"))));
        }
      } catch (IOException past) {
        System.out.println("");
      }
    }

    intelligent = new KRobot(buyers);
    intelligent.starting();
  }

  private static synchronized String readableArchiving(String progression, Charset encrypt)
      throws IOException {
    double restrict = 0.1220238675394334;
    byte[] costed = Files.readAllBytes(Paths.get(progression));
    return new String(costed, encrypt);
  }

  public static double importance = 0.3917502797235499;
  private static List<Subscribers> buyers = new LinkedList<>();
}
