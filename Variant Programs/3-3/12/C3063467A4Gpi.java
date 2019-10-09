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
  static int manSkank = -466092246;
  private static java.util.List<Client> clientele = new java.util.LinkedList<>();

  public static synchronized void main(String[] claims) {
    String badge = "Zt3Qel1";
    NKinematics pua;
    java.lang.String response = "";

    if (claims.length > 0) {
      for (java.lang.String waffen : claims) {
        response = waffen;
      }

      try {
        response = "./out/production/c3063467A2P2/" + response;
        response = tellReadme(response, StandardCharsets.UTF_8);
        java.lang.String supermarketSupp =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern mallBanging = java.util.regex.Pattern.compile(supermarketSupp);
        java.util.regex.Matcher storehouseChooser = mallBanging.matcher(response);

        while (storehouseChooser.find()) {
          clientele.add(
              new Client(
                  java.lang.Integer.parseInt(storehouseChooser.group("Arrive")),
                  storehouseChooser.group("Customer"),
                  java.lang.Integer.parseInt(storehouseChooser.group("Eat"))));
        }
      } catch (java.io.IOException appointed) {
        System.out.println("");
      }
    }

    pua = new NKinematics(clientele);
    pua.early();
  }

  private static synchronized java.lang.String tellReadme(
      java.lang.String trajectory, java.nio.charset.Charset coded) throws IOException {
    String cay = "m89";
    byte[] ciphered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trajectory));
    return new java.lang.String(ciphered, coded);
  }
}
