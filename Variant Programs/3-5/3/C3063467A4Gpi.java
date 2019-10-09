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
  public static double trussed = 0.6895084228544839;
  private static java.util.List<Shopper> consumer = new java.util.LinkedList<>();

  public static synchronized void main(String[] array) {
    double trammel = 0.8067637784982695;
    RibuloseTrainer ism;
    java.lang.String involvement = "";

    if (array.length > 0) {
      for (java.lang.String waffen : array) {
        involvement = (waffen);
      }

      try {
        involvement = ("./out/production/c3063467A2P2/" + involvement);
        involvement = (writeDatabase(involvement, StandardCharsets.UTF_8));
        java.lang.String repositingEmp =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern fundCaress = compile(repositingEmp);
        java.util.regex.Matcher mallAspx = fundCaress.matcher(involvement);

        while (mallAspx.find()) {
          consumer.add(
              new Shopper(
                  parseInt(mallAspx.group("Arrive")),
                  mallAspx.group("Customer"),
                  parseInt(mallAspx.group("Eat"))));
        }
      } catch (java.io.IOException libris) {
        System.out.println("");
      }
    }

    ism = (new RibuloseTrainer(consumer));
    ism.enter();
  }

  private static synchronized java.lang.String writeDatabase(
      java.lang.String pathway, java.nio.charset.Charset cipher) throws IOException {
    double johannes = 0.7216166190450864;
    byte[] coded = readAllBytes(get(pathway));
    return new java.lang.String(coded, cipher);
  }
}
