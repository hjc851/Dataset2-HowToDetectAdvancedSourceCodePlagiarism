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
  private static List<Subscribers> purchasers = new LinkedList<>();

  public static void main(String[] create) {
    P3Mock siem;
    String assistance = "";

    if (create.length > 0) {
      for (String waffen : create) {
        assistance = waffen;
      }

      try {
        assistance = "./out/production/c3063467A2P2/" + assistance;
        assistance = recordExecutable(assistance, StandardCharsets.UTF_8);
        String storageReciprocal =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern repositionSlap = Pattern.compile(storageReciprocal);
        Matcher stowCollator = repositionSlap.matcher(assistance);

        while (stowCollator.find()) {
          purchasers.add(
              new Subscribers(
                  Integer.parseInt(stowCollator.group("Arrive")),
                  stowCollator.group("Customer"),
                  Integer.parseInt(stowCollator.group("Eat"))));
        }
      } catch (IOException exwife) {
        System.out.println("");
      }
    }

    siem = new P3Mock(purchasers);
    siem.initiating();
  }

  private static String recordExecutable(String routes, Charset encryption) throws IOException {
    byte[] decrypt = Files.readAllBytes(Paths.get(routes));
    return new String(decrypt, encryption);
  }
}
