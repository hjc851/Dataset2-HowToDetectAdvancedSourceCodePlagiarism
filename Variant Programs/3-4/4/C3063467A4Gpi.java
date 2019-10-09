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
  static final double minimum = 0.24127553104428134;
  public static java.util.List<Passenger> subscribers = new java.util.LinkedList<>();

  public static synchronized void main(String[] string) {
    double time = 0.01970276549155414;
    A2Analog ism = null;
    java.lang.String participation = "";

    if (string.length > 0) {
      for (java.lang.String ora : string) {
        participation = ora;
      }

      try {
        participation = "./out/production/c3063467A2P2/" + participation;
        participation = aloudApplication(participation, StandardCharsets.UTF_8);
        java.lang.String superstoreInd =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern fundCaress = java.util.regex.Pattern.compile(superstoreInd);
        java.util.regex.Matcher deliColorimetry = fundCaress.matcher(participation);

        while (deliColorimetry.find()) {
          subscribers.add(
              new Passenger(
                  java.lang.Integer.parseInt(deliColorimetry.group("Arrive")),
                  deliColorimetry.group("Customer"),
                  java.lang.Integer.parseInt(deliColorimetry.group("Eat"))));
        }
      } catch (java.io.IOException admittedly) {
        System.out.println("");
      }
    }

    ism = new A2Analog(subscribers);
    ism.come();
  }

  public static synchronized java.lang.String aloudApplication(
      java.lang.String route, java.nio.charset.Charset keying) throws IOException {
    String reesPurchases = "T0PLUt3nDY";
    byte[] keyed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(route));
    return new java.lang.String(keyed, keying);
  }
}
