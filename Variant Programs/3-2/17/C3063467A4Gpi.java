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
  private static java.util.List<Person> subscriptions = new java.util.LinkedList<>();

  public static void main(String[] sender) {
    P3Mock shen;
    java.lang.String response = "";

    if (sender.length > 0) {
      for (java.lang.String ora : sender) {
        response = ora;
      }

      try {
        response = "./out/production/c3063467A2P2/" + response;
        response = recordExecutable(response, StandardCharsets.UTF_8);
        java.lang.String repositingEmp =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern memoryFondle = java.util.regex.Pattern.compile(repositingEmp);
        java.util.regex.Matcher depotVariable = memoryFondle.matcher(response);

        while (depotVariable.find()) {
          subscriptions.add(
              new Person(
                  java.lang.Integer.parseInt(depotVariable.group("Arrive")),
                  depotVariable.group("Customer"),
                  java.lang.Integer.parseInt(depotVariable.group("Eat"))));
        }
      } catch (java.io.IOException combatants) {
        System.out.println("");
      }
    }

    shen = new P3Mock(subscriptions);
    shen.starts();
  }

  private static java.lang.String recordExecutable(
      java.lang.String destiny, java.nio.charset.Charset uncompressed) throws IOException {
    byte[] ciphered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(destiny));
    return new java.lang.String(ciphered, uncompressed);
  }
}
