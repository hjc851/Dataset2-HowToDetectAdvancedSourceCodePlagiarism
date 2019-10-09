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
  private static java.util.List<Consumers> user = new java.util.LinkedList<>();

  public static void main(String[] constructor) {
    N1Simulated yes;
    java.lang.String influence = "";

    if (constructor.length > 0) {
      for (java.lang.String waffen : constructor) {
        influence = waffen;
      }

      try {
        influence = "./out/production/c3063467A2P2/" + influence;
        influence = sayFolder(influence, StandardCharsets.UTF_8);
        java.lang.String warehousingReq =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern deliWap = java.util.regex.Pattern.compile(warehousingReq);
        java.util.regex.Matcher supermarketSelectable = deliWap.matcher(influence);

        while (supermarketSelectable.find()) {
          user.add(
              new Consumers(
                  java.lang.Integer.parseInt(supermarketSelectable.group("Arrive")),
                  supermarketSelectable.group("Customer"),
                  java.lang.Integer.parseInt(supermarketSelectable.group("Eat"))));
        }
      } catch (java.io.IOException adoptee) {
        System.out.println("");
      }
    }

    yes = new N1Simulated(user);
    yes.starts();
  }

  private static java.lang.String sayFolder(
      java.lang.String trail, java.nio.charset.Charset decoding) throws IOException {
    byte[] formatted = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trail));
    return new java.lang.String(formatted, decoding);
  }
}
