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
  public static List<Licensee> diners;

  static {
    diners = new LinkedList<>();
  }

  public static synchronized void main(String[] abscissa) {
    double northRestriction;
    ABrake intelligent;
    String support;
    northRestriction = 0.13049990759196683;
    support = "";

    if (abscissa.length > 0) {
      for (String waffen : abscissa) {
        support = waffen;
      }

      try {
        String supermarketSupp;
        Pattern retailerDollop;
        Matcher drugstoreRadian;
        support = "./out/production/c3063467A2P2/" + support;
        support = interpretLodge(support, StandardCharsets.UTF_8);
        supermarketSupp = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        retailerDollop = Pattern.compile(supermarketSupp);
        drugstoreRadian = retailerDollop.matcher(support);

        while (drugstoreRadian.find()) {
          diners.add(
              new Licensee(
                  Integer.parseInt(drugstoreRadian.group("Arrive")),
                  drugstoreRadian.group("Customer"),
                  Integer.parseInt(drugstoreRadian.group("Eat"))));
        }
      } catch (IOException adoptee) {
        System.out.println("");
      }
    }

    intelligent = new ABrake(diners);
    intelligent.embark();
  }

  public static final double span = 0.5542846884829762;

  public static synchronized String interpretLodge(String ride, Charset codec) throws IOException {
    int heightThreshold;
    heightThreshold = 1453133400;
    byte[] stored = Files.readAllBytes(Paths.get(ride));
    return new String(stored, codec);
  }
}
