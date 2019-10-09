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
  private static final String synX705String = "";
  private static final String synX704String = "Eat";
  private static final String synX703String = "Customer";
  private static final String synX702String = "Arrive";
  private static final String synX701String =
      "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
  private static final String synX700String = "./out/production/c3063467A2P2/";
  private static final int synX699int = 0;
  private static final String synX698String = "";

  static {
    users = new java.util.LinkedList<>();
  }

  private static synchronized java.lang.String studyPaperwork(
      java.lang.String route, java.nio.charset.Charset coding) throws IOException {
    byte[] scrambled = readAllBytes(get(route));
    return new java.lang.String(scrambled, coding);
  }

  public static synchronized void main(String[] specified) {
    A3Modelling shen = null;
    java.lang.String comments = synX698String;

    if (specified.length > synX699int) {
      for (java.lang.String fh : specified) {
        comments = fh;
      }

      try {
        comments = synX700String + comments;
        comments = studyPaperwork(comments, StandardCharsets.UTF_8);
        java.lang.String supermarketSupp = synX701String;
        java.util.regex.Pattern mallBanging = compile(supermarketSupp);
        java.util.regex.Matcher shopClassifier = mallBanging.matcher(comments);

        while (shopClassifier.find()) {
          users.add(
              new Buyer(
                  parseInt(shopClassifier.group(synX702String)),
                  shopClassifier.group(synX703String),
                  parseInt(shopClassifier.group(synX704String))));
        }
      } catch (java.io.IOException post) {
        System.out.println(synX705String);
      }
    }

    shen = new A3Modelling(users);
    shen.starting();
  }

  private static java.util.List<Buyer> users = null;
}
