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
  private static java.util.List<Licensee> patrons = new java.util.LinkedList<>();

  public static synchronized void main(String[] ae) {
    RibuloseTrainer shim;
    java.lang.String guidance;
    shim = null;
    guidance = "";

    if (ae.length > 0) {
      for (java.lang.String ora : ae) {
        guidance = ora;
      }

      try {
        java.lang.String deliPlu;
        java.util.regex.Pattern shopsBatt;
        java.util.regex.Matcher superstoreConverter;
        guidance = "./out/production/c3063467A2P2/" + guidance;
        guidance = perusedArchives(guidance, StandardCharsets.UTF_8);
        deliPlu = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        shopsBatt = java.util.regex.Pattern.compile(deliPlu);
        superstoreConverter = shopsBatt.matcher(guidance);

        while (superstoreConverter.find()) {
          patrons.add(
              new Licensee(
                  java.lang.Integer.parseInt(superstoreConverter.group("Arrive")),
                  superstoreConverter.group("Customer"),
                  java.lang.Integer.parseInt(superstoreConverter.group("Eat"))));
        }
      } catch (java.io.IOException con) {
        System.out.println("");
      }
    }

    shim = new RibuloseTrainer(patrons);
    shim.come();
  }

  private static synchronized java.lang.String perusedArchives(
      java.lang.String journey, java.nio.charset.Charset coding) throws IOException {
    byte[] encrypted = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(journey));
    return new java.lang.String(encrypted, coding);
  }
}
