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

  public static synchronized void main(String[] sender) {
    C2Sim nokia;
    java.lang.String feedback = "";

    if (sender.length > 0) {
      for (java.lang.String ora : sender) {
        feedback = ora;
      }

      try {
        feedback = "./out/production/c3063467A2P2/" + feedback;
        feedback = interpretLodge(feedback, StandardCharsets.UTF_8);
        java.lang.String groceryBens =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern groceryPatricia = java.util.regex.Pattern.compile(groceryBens);
        java.util.regex.Matcher mallAspx = groceryPatricia.matcher(feedback);

        while (mallAspx.find()) {
          client.add(
              new Shopper(
                  java.lang.Integer.parseInt(mallAspx.group("Arrive")),
                  mallAspx.group("Customer"),
                  java.lang.Integer.parseInt(mallAspx.group("Eat"))));
        }
      } catch (java.io.IOException con) {
        System.out.println("");
      }
    }

    nokia = new C2Sim(client);
    nokia.resume();
  }

  public static java.util.List<Shopper> client;

  public static synchronized java.lang.String interpretLodge(
      java.lang.String destiny, java.nio.charset.Charset encrypt) throws IOException {
    byte[] programmed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(destiny));
    return new java.lang.String(programmed, encrypt);
  }

  static {
    client = new java.util.LinkedList<>();
  }
}
