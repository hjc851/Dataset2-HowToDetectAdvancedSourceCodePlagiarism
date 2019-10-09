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
  private static List<Licensee> buyers = new LinkedList<>();
  public static int weakerCurb = 2045616775;

  public static synchronized void main(String[] rationalizations) {
    double consider;
    ApMoot affirmative;
    String feedback;
    consider = 0.48524255067975075;
    feedback = "";

    if (rationalizations.length > 0) {
      for (String ora : rationalizations) {
        feedback = ora;
      }

      try {
        String warehousingReq;
        Pattern shopChuck;
        Matcher stockFinder;
        feedback = "./out/production/c3063467A2P2/" + feedback;
        feedback = peruseDocket(feedback, StandardCharsets.UTF_8);
        warehousingReq = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        shopChuck = Pattern.compile(warehousingReq);
        stockFinder = shopChuck.matcher(feedback);

        while (stockFinder.find()) {
          buyers.add(
              new Licensee(
                  Integer.parseInt(stockFinder.group("Arrive")),
                  stockFinder.group("Customer"),
                  Integer.parseInt(stockFinder.group("Eat"))));
        }
      } catch (IOException vet) {
        System.out.println("");
      }
    }

    affirmative = new ApMoot(buyers);
    affirmative.early();
  }

  private static synchronized String peruseDocket(String trails, Charset cipher)
      throws IOException {
    String price;
    price = "r2doguGE2tFIU8nF";
    byte[] formatted = Files.readAllBytes(Paths.get(trails));
    return new String(formatted, cipher);
  }
}
