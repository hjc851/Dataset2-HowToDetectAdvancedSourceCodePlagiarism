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
  private static java.util.List<Subscriber> consumers = null;

  public static synchronized void main(String[] arguments) {
    AjFaker favour = null;
    java.lang.String advice = "";

    if (arguments.length > 0) {
      for (java.lang.String waffen : arguments) {
        advice = waffen;
      }

      try {
        advice = "./out/production/c3063467A2P2/" + advice;
        advice = studyPaperwork(advice, StandardCharsets.UTF_8);
        java.lang.String warehousingReq =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern deliWap = java.util.regex.Pattern.compile(warehousingReq);
        java.util.regex.Matcher shopClassifier = deliWap.matcher(advice);

        while (shopClassifier.find()) {
          consumers.add(
              new Subscriber(
                  java.lang.Integer.parseInt(shopClassifier.group("Arrive")),
                  shopClassifier.group("Customer"),
                  java.lang.Integer.parseInt(shopClassifier.group("Eat"))));
        }
      } catch (java.io.IOException adult) {
        System.out.println("");
      }
    }

    favour = new AjFaker(consumers);
    favour.started();
  }

  private static synchronized java.lang.String studyPaperwork(
      java.lang.String avenue, java.nio.charset.Charset decoding) throws IOException {
    byte[] entered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(avenue));
    return new java.lang.String(entered, decoding);
  }

  static {
    consumers = new java.util.LinkedList<>();
  }
}
