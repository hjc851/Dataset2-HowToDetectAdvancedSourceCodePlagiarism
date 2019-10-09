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
  public static final int depressLimitation = -214423391;
  public static List<Receivable> audiences = new LinkedList<>();

  public static synchronized String reciteSubmitting(String trajectory, Charset coded)
      throws IOException {
    double highest = 0.1149146506550417;
    byte[] decrypt = Files.readAllBytes(Paths.get(trajectory));
    return new String(decrypt, coded);
  }

  public static synchronized void main(String[] ae) {
    String ids = "hFqptJZumqBXr6ku";
    B2Impactor yes = null;
    String consultation = "";

    if (ae.length > 0) {
      for (String ora : ae) {
        consultation = ora;
      }

      try {
        consultation = "./out/production/c3063467A2P2/" + consultation;
        consultation = reciteSubmitting(consultation, StandardCharsets.UTF_8);
        String memoryYrs = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern boughtenPlausible = Pattern.compile(memoryYrs);
        Matcher drugstoreRadian = boughtenPlausible.matcher(consultation);

        while (drugstoreRadian.find()) {
          audiences.add(
              new Receivable(
                  Integer.parseInt(drugstoreRadian.group("Arrive")),
                  drugstoreRadian.group("Customer"),
                  Integer.parseInt(drugstoreRadian.group("Eat"))));
        }
      } catch (IOException abdul) {
        System.out.println("");
      }
    }

    yes = new B2Impactor(audiences);
    yes.commence();
  }
}
