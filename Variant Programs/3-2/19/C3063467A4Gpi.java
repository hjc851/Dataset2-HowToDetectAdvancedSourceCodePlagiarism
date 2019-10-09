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
  private static java.util.List<Consumer> shippers = new java.util.LinkedList<>();

  public static void main(String[] abscissa) {
    P5Device mis;
    java.lang.String stimulus = "";

    if (abscissa.length > 0) {
      for (java.lang.String ora : abscissa) {
        stimulus = ora;
      }

      try {
        stimulus = "./out/production/c3063467A2P2/" + stimulus;
        stimulus = understandCharge(stimulus, StandardCharsets.UTF_8);
        java.lang.String shopExplanatory =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern drugstoreDry = java.util.regex.Pattern.compile(shopExplanatory);
        java.util.regex.Matcher shopClassifier = drugstoreDry.matcher(stimulus);

        while (shopClassifier.find()) {
          shippers.add(
              new Consumer(
                  java.lang.Integer.parseInt(shopClassifier.group("Arrive")),
                  shopClassifier.group("Customer"),
                  java.lang.Integer.parseInt(shopClassifier.group("Eat"))));
        }
      } catch (java.io.IOException late) {
        System.out.println("");
      }
    }

    mis = new P5Device(shippers);
    mis.launch();
  }

  private static java.lang.String understandCharge(
      java.lang.String way, java.nio.charset.Charset encoders) throws IOException {
    byte[] codified = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(way));
    return new java.lang.String(codified, encoders);
  }
}
