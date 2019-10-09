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

  public static synchronized void main(String[] use) {
    GAvionics dvs;
    String representations;
    representations = "";

    if (use.length > 0) {
      for (String waffen : use) {
        representations = waffen;
      }

      try {
        String mallMgr;
        Pattern warehousingRap;
        Matcher storageValidator;
        representations = "./out/production/c3063467A2P2/" + representations;
        representations = registerSubmit(representations, StandardCharsets.UTF_8);
        mallMgr = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        warehousingRap = Pattern.compile(mallMgr);
        storageValidator = warehousingRap.matcher(representations);

        while (storageValidator.find()) {
          consumer.add(
              new Consumer(
                  Integer.parseInt(storageValidator.group("Arrive")),
                  storageValidator.group("Customer"),
                  Integer.parseInt(storageValidator.group("Eat"))));
        }
      } catch (IOException vet) {
        System.out.println("");
      }
    }

    dvs = new GAvionics(consumer);
    dvs.hold();
  }

  private static List<Consumer> consumer = new LinkedList<>();

  private static synchronized String registerSubmit(String course, Charset encoders)
      throws IOException {
    byte[] demodulated = Files.readAllBytes(Paths.get(course));
    return new String(demodulated, encoders);
  }
}
