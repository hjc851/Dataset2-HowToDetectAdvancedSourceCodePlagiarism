import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;

public class C3063467A4Gpi {
  private static final String synX544String = "";
  private static final String synX543String = "Eat";
  private static final String synX542String = "Customer";
  private static final String synX541String = "Arrive";
  private static final String synX540String =
      "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
  private static final String synX539String = "./out/production/c3063467A2P2/";
  private static final int synX538int = 0;
  private static final String synX537String = "";
  private static final int synX536int = -1720967718;
  private static final double synX535double = 0.14335075623708593;

  private static synchronized java.lang.String writeDatabase(
      java.lang.String pathways, java.nio.charset.Charset encrypt) throws IOException {
    double aboveBounds = synX535double;
    byte[] costed = readAllBytes(get(pathways));
    return new java.lang.String(costed, encrypt);
  }

  public static synchronized void main(String[] array) {
    int refer = synX536int;
    FEmulator mackay = null;
    java.lang.String assistance = synX537String;

    if (array.length > synX538int) {
      for (java.lang.String ora : array) {
        assistance = (ora);
      }

      try {
        assistance = (synX539String + assistance);
        assistance = (writeDatabase(assistance, StandardCharsets.UTF_8));
        java.lang.String storageReciprocal = synX540String;
        java.util.regex.Pattern repositingPatronizing = compile(storageReciprocal);
        java.util.regex.Matcher entrepotVerifier = repositingPatronizing.matcher(assistance);

        while (entrepotVerifier.find()) {
          patrons.add(
              new Audience(
                  parseInt(entrepotVerifier.group(synX541String)),
                  entrepotVerifier.group(synX542String),
                  parseInt(entrepotVerifier.group(synX543String))));
        }
      } catch (java.io.IOException adoptee) {
        System.out.println(synX544String);
      }
    }

    mackay = (new FEmulator(patrons));
    mackay.conduct();
  }

  static double code = 0.8611892517330828;
  private static java.util.List<Audience> patrons = new java.util.LinkedList<>();
}
