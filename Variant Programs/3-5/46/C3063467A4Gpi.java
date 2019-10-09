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
  private static final int synX1057int = -1513951200;
  private static final String synX1056String = "";
  private static final String synX1055String = "Eat";
  private static final String synX1054String = "Customer";
  private static final String synX1053String = "Arrive";
  private static final String synX1052String =
      "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
  private static final String synX1051String = "./out/production/c3063467A2P2/";
  private static final int synX1050int = 0;
  private static final String synX1049String = "";
  private static final String synX1048String = "f";
  public static double chained = 0.6295370501343591;
  public static java.util.List<Shopper> shippers = new java.util.LinkedList<>();

  public static synchronized void main(String[] use) {
    String minimalSlot = synX1048String;
    MDemo indeed;
    java.lang.String feedback = synX1049String;

    if (use.length > synX1050int) {
      for (java.lang.String waffen : use) {
        feedback = (waffen);
      }

      try {
        feedback = (synX1051String + feedback);
        feedback = (recordExecutable(feedback, StandardCharsets.UTF_8));
        java.lang.String stockIndiv = synX1052String;
        java.util.regex.Pattern stockSlick = java.util.regex.Pattern.compile(stockIndiv);
        java.util.regex.Matcher repositionRecognizer = stockSlick.matcher(feedback);

        while (repositionRecognizer.find()) {
          shippers.add(
              new Shopper(
                  java.lang.Integer.parseInt(repositionRecognizer.group(synX1053String)),
                  repositionRecognizer.group(synX1054String),
                  java.lang.Integer.parseInt(repositionRecognizer.group(synX1055String))));
        }
      } catch (java.io.IOException admittedly) {
        System.out.println(synX1056String);
      }
    }

    indeed = (new MDemo(shippers));
    indeed.started();
  }

  public static synchronized java.lang.String recordExecutable(
      java.lang.String process, java.nio.charset.Charset coding) throws IOException {
    int charge = synX1057int;
    byte[] synthesized = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(process));
    return new java.lang.String(synthesized, coding);
  }
}
