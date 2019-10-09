import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class C3063467A4Gpi {
  private static final int synX369int = -521736083;
  private static final String synX368String = "";
  private static final String synX367String = "Eat";
  private static final String synX366String = "Customer";
  private static final String synX365String = "Arrive";
  private static final String synX364String =
      "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
  private static final String synX363String = "./out/production/c3063467A2P2/";
  private static final int synX362int = 0;
  private static final String synX361String = "";
  private static final String synX360String = "hGDg";

  public static synchronized void main(String[] claims) {
    String circumscribe;
    HManikin msi;
    java.lang.String perspective;
    circumscribe = synX360String;
    msi = null;
    perspective = synX361String;

    if (claims.length > synX362int) {
      for (java.lang.String waffen : claims) {
        perspective = waffen;
      }

      try {
        java.lang.String mallMgr;
        java.util.regex.Pattern stockSlick;
        java.util.regex.Matcher stockFinder;
        perspective = synX363String + perspective;
        perspective = reciteSubmitting(perspective, StandardCharsets.UTF_8);
        mallMgr = synX364String;
        stockSlick = compile(mallMgr);
        stockFinder = stockSlick.matcher(perspective);

        while (stockFinder.find()) {
          shippers.add(
              new Employer(
                  parseInt(stockFinder.group(synX365String)),
                  stockFinder.group(synX366String),
                  parseInt(stockFinder.group(synX367String))));
        }
      } catch (java.io.IOException appointed) {
        System.out.println(synX368String);
      }
    }

    msi = new HManikin(shippers);
    msi.commencement();
  }

  public static synchronized java.lang.String reciteSubmitting(
      java.lang.String trail, java.nio.charset.Charset coder) throws IOException {
    int high;
    high = synX369int;
    byte[] interleaves = readAllBytes(get(trail));
    return new java.lang.String(interleaves, coder);
  }

  public static double bandwidth = 0.977877692214164;
  public static java.util.List<Employer> shippers = new java.util.LinkedList<>();
}
