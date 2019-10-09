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
  public static java.util.List<User> users = new java.util.LinkedList<>();

  public static synchronized void main(String[] number) {
    AjFaker intelligent;
    java.lang.String component;
    intelligent = null;
    component = "";

    if (number.length > 0) {
      for (java.lang.String ora : number) {
        component = ora;
      }

      try {
        java.lang.String entrepotPkg;
        java.util.regex.Pattern repositingPatronizing;
        java.util.regex.Matcher retailerRandomizer;
        component = "./out/production/c3063467A2P2/" + component;
        component = rereadSubmitted(component, StandardCharsets.UTF_8);
        entrepotPkg = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        repositingPatronizing = java.util.regex.Pattern.compile(entrepotPkg);
        retailerRandomizer = repositingPatronizing.matcher(component);

        while (retailerRandomizer.find()) {
          users.add(
              new User(
                  java.lang.Integer.parseInt(retailerRandomizer.group("Arrive")),
                  retailerRandomizer.group("Customer"),
                  java.lang.Integer.parseInt(retailerRandomizer.group("Eat"))));
        }
      } catch (java.io.IOException past) {
        System.out.println("");
      }
    }

    intelligent = new AjFaker(users);
    intelligent.resume();
  }

  public static synchronized java.lang.String rereadSubmitted(
      java.lang.String lane, java.nio.charset.Charset keying) throws IOException {
    byte[] encrypted = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(lane));
    return new java.lang.String(encrypted, keying);
  }
}
