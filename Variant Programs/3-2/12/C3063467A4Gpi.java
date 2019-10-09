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
  private static List<Receivable> subscribers = new LinkedList<>();

  public static void main(String[] handles) {
    B2Impactor indeed;
    String advice = "";

    if (handles.length > 0) {
      for (String ora : handles) {
        advice = ora;
      }

      try {
        advice = "./out/production/c3063467A2P2/" + advice;
        advice = studyPaperwork(advice, StandardCharsets.UTF_8);
        String retailerLic = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern repositionSlap = Pattern.compile(retailerLic);
        Matcher storefrontCreaser = repositionSlap.matcher(advice);

        while (storefrontCreaser.find()) {
          subscribers.add(
              new Receivable(
                  Integer.parseInt(storefrontCreaser.group("Arrive")),
                  storefrontCreaser.group("Customer"),
                  Integer.parseInt(storefrontCreaser.group("Eat"))));
        }
      } catch (IOException adoptee) {
        System.out.println("");
      }
    }

    indeed = new B2Impactor(subscribers);
    indeed.undertake();
  }

  private static String studyPaperwork(String pathway, Charset encrypted) throws IOException {
    byte[] interlaced = Files.readAllBytes(Paths.get(pathway));
    return new String(interlaced, encrypted);
  }
}
