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
  private static java.util.List<Client> purchasers = new java.util.LinkedList<>();

  public static void main(String[] string) {
    A2Analog shim;
    java.lang.String advice = "";

    if (string.length > 0) {
      for (java.lang.String fh : string) {
        advice = fh;
      }

      try {
        advice = "./out/production/c3063467A2P2/" + advice;
        advice = aloudApplication(advice, StandardCharsets.UTF_8);
        java.lang.String deliPlu =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern repositionSlap = java.util.regex.Pattern.compile(deliPlu);
        java.util.regex.Matcher warehousingAlgorithm = repositionSlap.matcher(advice);

        while (warehousingAlgorithm.find()) {
          purchasers.add(
              new Client(
                  java.lang.Integer.parseInt(warehousingAlgorithm.group("Arrive")),
                  warehousingAlgorithm.group("Customer"),
                  java.lang.Integer.parseInt(warehousingAlgorithm.group("Eat"))));
        }
      } catch (java.io.IOException abbe) {
        System.out.println("");
      }
    }

    shim = new A2Analog(purchasers);
    shim.resume();
  }

  private static java.lang.String aloudApplication(
      java.lang.String route, java.nio.charset.Charset encrypting) throws IOException {
    byte[] formatted = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(route));
    return new java.lang.String(formatted, encrypting);
  }
}
