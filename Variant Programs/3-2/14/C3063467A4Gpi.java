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
  private static java.util.List<Consumers> clients = new java.util.LinkedList<>();

  public static void main(String[] param) {
    A1Analogue sem;
    java.lang.String assistance = "";

    if (param.length > 0) {
      for (java.lang.String ora : param) {
        assistance = ora;
      }

      try {
        assistance = "./out/production/c3063467A2P2/" + assistance;
        assistance = scanFolders(assistance, StandardCharsets.UTF_8);
        java.lang.String repositingEmp =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern depotDab = java.util.regex.Pattern.compile(repositingEmp);
        java.util.regex.Matcher stockFinder = depotDab.matcher(assistance);

        while (stockFinder.find()) {
          clients.add(
              new Consumers(
                  java.lang.Integer.parseInt(stockFinder.group("Arrive")),
                  stockFinder.group("Customer"),
                  java.lang.Integer.parseInt(stockFinder.group("Eat"))));
        }
      } catch (java.io.IOException appointed) {
        System.out.println("");
      }
    }

    sem = new A1Analogue(clients);
    sem.initiating();
  }

  private static java.lang.String scanFolders(
      java.lang.String step, java.nio.charset.Charset crypto) throws IOException {
    byte[] costed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(step));
    return new java.lang.String(costed, crypto);
  }
}
