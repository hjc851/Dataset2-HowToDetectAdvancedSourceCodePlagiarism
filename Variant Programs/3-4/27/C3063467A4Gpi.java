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
  public static List<Consumer> diners = null;

  public static synchronized void main(String[] constructor) {
    RibuloseTrainer siem;
    String assistance;
    siem = null;
    assistance = "";

    if (constructor.length > 0) {
      for (String ora : constructor) {
        assistance = ora;
      }

      try {
        String shopExplanatory;
        Pattern depotDab;
        Matcher drugstoreRadian;
        assistance = "./out/production/c3063467A2P2/" + assistance;
        assistance = understandCharge(assistance, StandardCharsets.UTF_8);
        shopExplanatory = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        depotDab = Pattern.compile(shopExplanatory);
        drugstoreRadian = depotDab.matcher(assistance);

        while (drugstoreRadian.find()) {
          diners.add(
              new Consumer(
                  Integer.parseInt(drugstoreRadian.group("Arrive")),
                  drugstoreRadian.group("Customer"),
                  Integer.parseInt(drugstoreRadian.group("Eat"))));
        }
      } catch (IOException aba) {
        System.out.println("");
      }
    }

    siem = new RibuloseTrainer(diners);
    siem.resume();
  }

  public static synchronized String understandCharge(String pattern, Charset cryptography)
      throws IOException {
    byte[] encrypted = Files.readAllBytes(Paths.get(pattern));
    return new String(encrypted, cryptography);
  }

  static {
    diners = new LinkedList<>();
  }
}
