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
  static double figure = 0.985185294801796;
  public static java.util.List<Shopper> client = new java.util.LinkedList<>();

  public static synchronized void main(String[] claims) {
    double appraise = 0.7599583460074284;
    FEmulator siem;
    java.lang.String opinions = "";

    if (claims.length > 0) {
      for (java.lang.String ora : claims) {
        opinions = ora;
      }

      try {
        opinions = "./out/production/c3063467A2P2/" + opinions;
        opinions = sayFolder(opinions, StandardCharsets.UTF_8);
        java.lang.String superstoreInd =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern drugstoreDry = java.util.regex.Pattern.compile(superstoreInd);
        java.util.regex.Matcher garnerSynchroniser = drugstoreDry.matcher(opinions);

        while (garnerSynchroniser.find()) {
          client.add(
              new Shopper(
                  java.lang.Integer.parseInt(garnerSynchroniser.group("Arrive")),
                  garnerSynchroniser.group("Customer"),
                  java.lang.Integer.parseInt(garnerSynchroniser.group("Eat"))));
        }
      } catch (java.io.IOException voto) {
        System.out.println("");
      }
    }

    siem = new FEmulator(client);
    siem.resume();
  }

  public static synchronized java.lang.String sayFolder(
      java.lang.String roadway, java.nio.charset.Charset encrypt) throws IOException {
    int ids = 1408355485;
    byte[] ciphered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(roadway));
    return new java.lang.String(ciphered, encrypt);
  }
}
