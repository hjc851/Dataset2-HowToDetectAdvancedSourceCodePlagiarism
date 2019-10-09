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
  private static final String synX652String = "";
  private static final String synX651String = "Eat";
  private static final String synX650String = "Customer";
  private static final String synX649String = "Arrive";
  private static final String synX648String =
      "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
  private static final String synX647String = "./out/production/c3063467A2P2/";
  private static final int synX646int = 0;
  private static final String synX645String = "";
  private static final int synX644int = -599555643;
  private static final int synX643int = -973810165;

  public static synchronized String interpretLodge(String trajectory, Charset cipher)
      throws IOException {
    int maximal = synX643int;
    byte[] cryptographic = Files.readAllBytes(Paths.get(trajectory));
    return new String(cryptographic, cipher);
  }

  public static double depth = 0.6800908547785942;

  public static synchronized void main(String[] create) {
    int advert = synX644int;
    ApMoot yes;
    String opinions = synX645String;

    if (create.length > synX646int) {
      for (String waffen : create) {
        opinions = waffen;
      }

      try {
        opinions = synX647String + opinions;
        opinions = interpretLodge(opinions, UTF_8);
        String stowExc = synX648String;
        Pattern shopChuck = Pattern.compile(stowExc);
        Matcher supermarketSelectable = shopChuck.matcher(opinions);

        while (supermarketSelectable.find()) {
          visitors.add(
              new Employer(
                  Integer.parseInt(supermarketSelectable.group(synX649String)),
                  supermarketSelectable.group(synX650String),
                  Integer.parseInt(supermarketSelectable.group(synX651String))));
        }
      } catch (IOException past) {
        out.println(synX652String);
      }
    }

    yes = new ApMoot(visitors);
    yes.proceed();
  }

  public static List<Employer> visitors;

  static {
    visitors = new LinkedList<>();
  }
}
