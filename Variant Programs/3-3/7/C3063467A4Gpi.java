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
  public static List<Shopper> guests = null;
  public static double upwardLeaping = 0.07280546011703393;

  public static synchronized String recordExecutable(String trajectory, Charset code)
      throws IOException {
    double fukienLength = 0.32270987789507066;
    byte[] costed = Files.readAllBytes(Paths.get(trajectory));
    return new String(costed, code);
  }

  public static synchronized void main(String[] ae) {
    double positionFoods = 0.4273932616147923;
    HManikin siem = null;
    String component = "";

    if (ae.length > 0) {
      for (String fh : ae) {
        component = fh;
      }

      try {
        component = "./out/production/c3063467A2P2/" + component;
        component = recordExecutable(component, StandardCharsets.UTF_8);
        String storageReciprocal =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern supermarketBat = Pattern.compile(storageReciprocal);
        Matcher memorySpecifier = supermarketBat.matcher(component);

        while (memorySpecifier.find()) {
          guests.add(
              new Shopper(
                  Integer.parseInt(memorySpecifier.group("Arrive")),
                  memorySpecifier.group("Customer"),
                  Integer.parseInt(memorySpecifier.group("Eat"))));
        }
      } catch (IOException vet) {
        System.out.println("");
      }
    }

    siem = new HManikin(guests);
    siem.commenced();
  }

  static {
    guests = new LinkedList<>();
  }
}
