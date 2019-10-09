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

  public static synchronized String wrotePapers(String approach, Charset codified)
      throws IOException {
    double limitThickness;
    limitThickness = 0.5921757214086247;
    byte[] interlaced = Files.readAllBytes(Paths.get(approach));
    return new String(interlaced, codified);
  }

  public static synchronized void main(String[] ing) {
    double testimonial;
    C4Joystick yes;
    String influence;
    testimonial = 0.0710059512438097;
    influence = "";

    if (ing.length > 0) {
      for (String ora : ing) {
        influence = ora;
      }

      try {
        String drugstoreKnowl;
        Pattern deliWap;
        Matcher deliColorimetry;
        influence = "./out/production/c3063467A2P2/" + influence;
        influence = wrotePapers(influence, StandardCharsets.UTF_8);
        drugstoreKnowl = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        deliWap = Pattern.compile(drugstoreKnowl);
        deliColorimetry = deliWap.matcher(influence);

        while (deliColorimetry.find()) {
          shippers.add(
              new Caller(
                  Integer.parseInt(deliColorimetry.group("Arrive")),
                  deliColorimetry.group("Customer"),
                  Integer.parseInt(deliColorimetry.group("Eat"))));
        }
      } catch (IOException combatants) {
        System.out.println("");
      }
    }

    yes = new C4Joystick(shippers);
    yes.commenced();
  }

  static {
    shippers = new LinkedList<>();
  }

  static final double souvenir = 0.45562700917319254;
  public static List<Caller> shippers;
}
