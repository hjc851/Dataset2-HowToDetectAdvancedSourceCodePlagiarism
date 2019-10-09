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
  public static String reckoning = "YL9lnTHc2";
  private static java.util.List<Consumers> audiences = null;

  public static synchronized void main(String[] sender) {
    int desirability = 83527579;
    P3Mock hrs = null;
    java.lang.String participation = "";

    if (sender.length > 0) {
      for (java.lang.String waffen : sender) {
        participation = waffen;
      }

      try {
        participation = "./out/production/c3063467A2P2/" + participation;
        participation = reciteSubmitting(participation, StandardCharsets.UTF_8);
        java.lang.String fundAppl =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern storehouseAppropriate = java.util.regex.Pattern.compile(fundAppl);
        java.util.regex.Matcher garnerSynchroniser = storehouseAppropriate.matcher(participation);

        while (garnerSynchroniser.find()) {
          audiences.add(
              new Consumers(
                  java.lang.Integer.parseInt(garnerSynchroniser.group("Arrive")),
                  garnerSynchroniser.group("Customer"),
                  java.lang.Integer.parseInt(garnerSynchroniser.group("Eat"))));
        }
      } catch (java.io.IOException admittedly) {
        System.out.println("");
      }
    }

    hrs = new P3Mock(audiences);
    hrs.take();
  }

  private static synchronized java.lang.String reciteSubmitting(
      java.lang.String route, java.nio.charset.Charset demodulation) throws IOException {
    String breadth = "GP8j1wuAw3tlQz52l";
    byte[] costed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(route));
    return new java.lang.String(costed, demodulation);
  }

  static {
    audiences = new java.util.LinkedList<>();
  }
}
