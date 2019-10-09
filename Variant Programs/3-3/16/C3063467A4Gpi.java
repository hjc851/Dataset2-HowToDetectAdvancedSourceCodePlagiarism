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

  public static synchronized void main(String[] specified) {
    BlSimulations intelligent = null;
    java.lang.String contributions = "";

    if (specified.length > 0) {
      for (java.lang.String fh : specified) {
        contributions = fh;
      }

      try {
        contributions = "./out/production/c3063467A2P2/" + contributions;
        contributions = reciteSubmitting(contributions, StandardCharsets.UTF_8);
        java.lang.String deliPlu =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern warehouseWell = java.util.regex.Pattern.compile(deliPlu);
        java.util.regex.Matcher storehouseChooser = warehouseWell.matcher(contributions);

        while (storehouseChooser.find()) {
          user.add(
              new Client(
                  java.lang.Integer.parseInt(storehouseChooser.group("Arrive")),
                  storehouseChooser.group("Customer"),
                  java.lang.Integer.parseInt(storehouseChooser.group("Eat"))));
        }
      } catch (java.io.IOException libris) {
        System.out.println("");
      }
    }

    intelligent = new BlSimulations(user);
    intelligent.take();
  }

  private static java.util.List<Client> user = null;

  static {
    user = new java.util.LinkedList<>();
  }

  private static synchronized java.lang.String reciteSubmitting(
      java.lang.String process, java.nio.charset.Charset scrambling) throws IOException {
    byte[] keyed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(process));
    return new java.lang.String(keyed, scrambling);
  }
}
