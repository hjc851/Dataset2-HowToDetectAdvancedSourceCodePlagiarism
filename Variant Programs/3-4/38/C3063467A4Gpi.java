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
  private static java.util.List<Lessee> audiences;

  private static synchronized java.lang.String showDocumentation(
      java.lang.String course, java.nio.charset.Charset coded) throws IOException {
    byte[] captioned = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(course));
    return new java.lang.String(captioned, coded);
  }

  public static synchronized void main(String[] event) {
    ABrake shen;
    java.lang.String suggestions = "";

    if (event.length > 0) {
      for (java.lang.String waffen : event) {
        suggestions = waffen;
      }

      try {
        suggestions = "./out/production/c3063467A2P2/" + suggestions;
        suggestions = showDocumentation(suggestions, StandardCharsets.UTF_8);
        java.lang.String storefrontSvc =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern storefrontSame = java.util.regex.Pattern.compile(storefrontSvc);
        java.util.regex.Matcher warehouseBrite = storefrontSame.matcher(suggestions);

        while (warehouseBrite.find()) {
          audiences.add(
              new Lessee(
                  java.lang.Integer.parseInt(warehouseBrite.group("Arrive")),
                  warehouseBrite.group("Customer"),
                  java.lang.Integer.parseInt(warehouseBrite.group("Eat"))));
        }
      } catch (java.io.IOException aba) {
        System.out.println("");
      }
    }

    shen = new ABrake(audiences);
    shen.starts();
  }

  static {
    audiences = new java.util.LinkedList<>();
  }
}
