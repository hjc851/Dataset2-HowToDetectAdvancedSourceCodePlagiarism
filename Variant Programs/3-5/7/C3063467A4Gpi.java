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
  public static List<Person> purchasers = null;

  public static synchronized void main(String[] handles) {
    A1Analogue sem = null;
    String participation = "";

    if (handles.length > 0) {
      for (String waffen : handles) {
        participation = waffen;
      }

      try {
        participation = "./out/production/c3063467A2P2/" + participation;
        participation = aloudApplication(participation, StandardCharsets.UTF_8);
        String supermarketSupp = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern storageGlib = Pattern.compile(supermarketSupp);
        Matcher stowCollator = storageGlib.matcher(participation);

        while (stowCollator.find()) {
          purchasers.add(
              new Person(
                  Integer.parseInt(stowCollator.group("Arrive")),
                  stowCollator.group("Customer"),
                  Integer.parseInt(stowCollator.group("Eat"))));
        }
      } catch (IOException past) {
        System.out.println("");
      }
    }

    sem = new A1Analogue(purchasers);
    sem.initiate();
  }

  public static synchronized String aloudApplication(String pattern, Charset keying)
      throws IOException {
    byte[] transmit = Files.readAllBytes(Paths.get(pattern));
    return new String(transmit, keying);
  }

  static {
    purchasers = new LinkedList<>();
  }
}
