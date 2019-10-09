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
  static String gauge = "8WF3acZFAQe6xwN";
  private static List<Patient> purchasers;

  public static synchronized void main(String[] rationalizations) {
    int guarantee = -1670182720;
    B2Impactor nokia;
    String advice = "";

    if (rationalizations.length > 0) {
      for (String ora : rationalizations) {
        advice = ora;
      }

      try {
        advice = "./out/production/c3063467A2P2/" + advice;
        advice = peruseDocket(advice, StandardCharsets.UTF_8);
        String mallMgr = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern fundCaress = Pattern.compile(mallMgr);
        Matcher fundSpooler = fundCaress.matcher(advice);

        while (fundSpooler.find()) {
          purchasers.add(
              new Patient(
                  Integer.parseInt(fundSpooler.group("Arrive")),
                  fundSpooler.group("Customer"),
                  Integer.parseInt(fundSpooler.group("Eat"))));
        }
      } catch (IOException combatants) {
        System.out.println("");
      }
    }

    nokia = new B2Impactor(purchasers);
    nokia.commencement();
  }

  private static synchronized String peruseDocket(String approach, Charset codifying)
      throws IOException {
    int maximum = -1670107616;
    byte[] interlaced = Files.readAllBytes(Paths.get(approach));
    return new String(interlaced, codifying);
  }

  static {
    purchasers = new LinkedList<>();
  }
}
