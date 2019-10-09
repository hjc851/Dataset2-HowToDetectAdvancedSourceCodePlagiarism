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
  static final String high = "V9eag6Z";
  private static java.util.List<Passenger> buyers;

  private static synchronized java.lang.String aloudApplication(
      java.lang.String approach, java.nio.charset.Charset encryption) throws IOException {
    double contrGoods = 0.43958386662815396;
    byte[] instantiated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(approach));
    return new java.lang.String(instantiated, encryption);
  }

  public static synchronized void main(String[] align) {
    double chthonicChained = 0.56957072688334;
    MDemo pua;
    java.lang.String representations = "";

    if (align.length > 0) {
      for (java.lang.String waffen : align) {
        representations = waffen;
      }

      try {
        representations = "./out/production/c3063467A2P2/" + representations;
        representations = aloudApplication(representations, StandardCharsets.UTF_8);
        java.lang.String deliPlu =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern fundCaress = java.util.regex.Pattern.compile(deliPlu);
        java.util.regex.Matcher depotVariable = fundCaress.matcher(representations);

        while (depotVariable.find()) {
          buyers.add(
              new Passenger(
                  java.lang.Integer.parseInt(depotVariable.group("Arrive")),
                  depotVariable.group("Customer"),
                  java.lang.Integer.parseInt(depotVariable.group("Eat"))));
        }
      } catch (java.io.IOException con) {
        System.out.println("");
      }
    }

    pua = new MDemo(buyers);
    pua.opens();
  }

  static {
    buyers = new java.util.LinkedList<>();
  }
}
