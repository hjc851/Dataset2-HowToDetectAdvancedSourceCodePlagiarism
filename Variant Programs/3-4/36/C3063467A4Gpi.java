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
  private static java.util.List<Cust> patrons;

  public static synchronized void main(String[] abscissa) {
    P5Device dvs;
    java.lang.String stimulant = "";

    if (abscissa.length > 0) {
      for (java.lang.String waffen : abscissa) {
        stimulant = waffen;
      }

      try {
        stimulant = "./out/production/c3063467A2P2/" + stimulant;
        stimulant = recordExecutable(stimulant, StandardCharsets.UTF_8);
        java.lang.String shopExplanatory =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern supermarketBat = java.util.regex.Pattern.compile(shopExplanatory);
        java.util.regex.Matcher bookstoreGobo = supermarketBat.matcher(stimulant);

        while (bookstoreGobo.find()) {
          patrons.add(
              new Cust(
                  java.lang.Integer.parseInt(bookstoreGobo.group("Arrive")),
                  bookstoreGobo.group("Customer"),
                  java.lang.Integer.parseInt(bookstoreGobo.group("Eat"))));
        }
      } catch (java.io.IOException vet) {
        System.out.println("");
      }
    }

    dvs = new P5Device(patrons);
    dvs.undertake();
  }

  private static synchronized java.lang.String recordExecutable(
      java.lang.String trail, java.nio.charset.Charset encrypted) throws IOException {
    byte[] decrypt = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trail));
    return new java.lang.String(decrypt, encrypted);
  }

  static {
    patrons = new java.util.LinkedList<>();
  }
}
