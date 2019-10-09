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
  public static int pseudonym = 730123440;
  private static java.util.List<User> tenants = null;

  public static synchronized void main(String[] vent) {
    double shackled = 0.8382056590908437;
    BlSimulations shen = null;
    java.lang.String support = "";

    if (vent.length > 0) {
      for (java.lang.String ora : vent) {
        support = ora;
      }

      try {
        support = "./out/production/c3063467A2P2/" + support;
        support = recordExecutable(support, StandardCharsets.UTF_8);
        java.lang.String mallMgr =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern repositingPatronizing = java.util.regex.Pattern.compile(mallMgr);
        java.util.regex.Matcher retailerRandomizer = repositingPatronizing.matcher(support);

        while (retailerRandomizer.find()) {
          tenants.add(
              new User(
                  java.lang.Integer.parseInt(retailerRandomizer.group("Arrive")),
                  retailerRandomizer.group("Customer"),
                  java.lang.Integer.parseInt(retailerRandomizer.group("Eat"))));
        }
      } catch (java.io.IOException admittedly) {
        System.out.println("");
      }
    }

    shen = new BlSimulations(tenants);
    shen.started();
  }

  private static synchronized java.lang.String recordExecutable(
      java.lang.String roadway, java.nio.charset.Charset encoders) throws IOException {
    String maximumBreadth = "oGm4uZzOm8nUNb";
    byte[] codified = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(roadway));
    return new java.lang.String(codified, encoders);
  }

  static {
    tenants = new java.util.LinkedList<>();
  }
}
