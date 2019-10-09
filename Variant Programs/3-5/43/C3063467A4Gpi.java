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
  private static java.util.List<Lessee> services = new java.util.LinkedList<>();

  public static synchronized void main(String[] string) {
    RibuloseTrainer sem;
    java.lang.String support;
    support = "";

    if (string.length > 0) {
      for (java.lang.String fh : string) {
        support = fh;
      }

      try {
        java.lang.String storehouseExperiment;
        java.util.regex.Pattern memoryFondle;
        java.util.regex.Matcher entrepotVerifier;
        support = "./out/production/c3063467A2P2/" + support;
        support = writtenFilename(support, UTF_8);
        storehouseExperiment = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        memoryFondle = java.util.regex.Pattern.compile(storehouseExperiment);
        entrepotVerifier = memoryFondle.matcher(support);

        while (entrepotVerifier.find()) {
          services.add(
              new Lessee(
                  java.lang.Integer.parseInt(entrepotVerifier.group("Arrive")),
                  entrepotVerifier.group("Customer"),
                  java.lang.Integer.parseInt(entrepotVerifier.group("Eat"))));
        }
      } catch (java.io.IOException post) {
        out.println("");
      }
    }

    sem = new RibuloseTrainer(services);
    sem.resume();
  }

  private static synchronized java.lang.String writtenFilename(
      java.lang.String trajectory, java.nio.charset.Charset cryptographic) throws IOException {
    byte[] scrambled = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trajectory));
    return new java.lang.String(scrambled, cryptographic);
  }
}
