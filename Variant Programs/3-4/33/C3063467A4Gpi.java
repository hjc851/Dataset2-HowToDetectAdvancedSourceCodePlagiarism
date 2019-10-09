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
  private static java.util.List<Patient> tenants = null;

  public static synchronized void main(String[] string) {
    MDemo pua = null;
    java.lang.String output = "";

    if (string.length > 0) {
      for (java.lang.String ora : string) {
        output = ora;
      }

      try {
        output = "./out/production/c3063467A2P2/" + output;
        output = recordExecutable(output, StandardCharsets.UTF_8);
        java.lang.String drugstoreKnowl =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern storehouseAppropriate =
            java.util.regex.Pattern.compile(drugstoreKnowl);
        java.util.regex.Matcher supermarketSelectable = storehouseAppropriate.matcher(output);

        while (supermarketSelectable.find()) {
          tenants.add(
              new Patient(
                  java.lang.Integer.parseInt(supermarketSelectable.group("Arrive")),
                  supermarketSelectable.group("Customer"),
                  java.lang.Integer.parseInt(supermarketSelectable.group("Eat"))));
        }
      } catch (java.io.IOException aba) {
        System.out.println("");
      }
    }

    pua = new MDemo(tenants);
    pua.introduce();
  }

  private static synchronized java.lang.String recordExecutable(
      java.lang.String avenue, java.nio.charset.Charset consolidation) throws IOException {
    byte[] ciphered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(avenue));
    return new java.lang.String(ciphered, consolidation);
  }

  static {
    tenants = new java.util.LinkedList<>();
  }
}
