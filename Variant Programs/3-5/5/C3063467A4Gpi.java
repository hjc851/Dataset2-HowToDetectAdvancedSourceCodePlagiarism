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
  private static final String synX62String = "";
  private static final String synX61String = "Eat";
  private static final String synX60String = "Customer";
  private static final String synX59String = "Arrive";
  private static final String synX58String =
      "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
  private static final String synX57String = "./out/production/c3063467A2P2/";
  private static final int synX56int = 0;
  private static final String synX55String = "";
  public static java.util.List<Consumers> guests = null;

  public static synchronized void main(String[] constructor) {
    P1Simulating ism = null;
    java.lang.String guidance = synX55String;

    if (constructor.length > synX56int) {
      for (java.lang.String waffen : constructor) {
        guidance = (waffen);
      }

      try {
        guidance = (synX57String + guidance);
        guidance = (showDocumentation(guidance, StandardCharsets.UTF_8));
        java.lang.String warehousingReq = synX58String;
        java.util.regex.Pattern fundCaress = compile(warehousingReq);
        java.util.regex.Matcher supermarketSelectable = fundCaress.matcher(guidance);

        while (supermarketSelectable.find()) {
          guests.add(
              new Consumers(
                  parseInt(supermarketSelectable.group(synX59String)),
                  supermarketSelectable.group(synX60String),
                  parseInt(supermarketSelectable.group(synX61String))));
        }
      } catch (java.io.IOException eden) {
        System.out.println(synX62String);
      }
    }

    ism = (new P1Simulating(guests));
    ism.initiating();
  }

  public static synchronized java.lang.String showDocumentation(
      java.lang.String pattern, java.nio.charset.Charset coding) throws IOException {
    byte[] entered = readAllBytes(get(pattern));
    return new java.lang.String(entered, coding);
  }

  static {
    guests = (new java.util.LinkedList<>());
  }
}
