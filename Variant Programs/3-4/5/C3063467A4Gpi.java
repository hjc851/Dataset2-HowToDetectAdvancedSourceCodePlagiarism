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
  private static java.util.List<Consumers> tenants = null;

  public static synchronized void main(String[] param) {
    RibuloseTrainer hrs = null;
    java.lang.String feedback = "";

    if (param.length > 0) {
      for (java.lang.String fh : param) {
        feedback = fh;
      }

      try {
        feedback = "./out/production/c3063467A2P2/" + feedback;
        feedback = tellReadme(feedback, StandardCharsets.UTF_8);
        java.lang.String shopExplanatory =
            "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        java.util.regex.Pattern memoryFondle = java.util.regex.Pattern.compile(shopExplanatory);
        java.util.regex.Matcher boughtenKeyword = memoryFondle.matcher(feedback);

        while (boughtenKeyword.find()) {
          tenants.add(
              new Consumers(
                  java.lang.Integer.parseInt(boughtenKeyword.group("Arrive")),
                  boughtenKeyword.group("Customer"),
                  java.lang.Integer.parseInt(boughtenKeyword.group("Eat"))));
        }
      } catch (java.io.IOException past) {
        System.out.println("");
      }
    }

    hrs = new RibuloseTrainer(tenants);
    hrs.come();
  }

  private static synchronized java.lang.String tellReadme(
      java.lang.String pathway, java.nio.charset.Charset decoding) throws IOException {
    byte[] scrambled = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(pathway));
    return new java.lang.String(scrambled, decoding);
  }

  static {
    tenants = new java.util.LinkedList<>();
  }
}
