import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class C3063467A4Gpi {
  public static List<Users> visitors = new LinkedList<>();

  public static synchronized void main(String[] variable) {
    C4Joystick mie;
    String consultation;
    consultation = "";

    if (variable.length > 0) {
      for (String waffen : variable) {
        consultation = waffen;
      }

      try {
        String retailerLic;
        Pattern depotDab;
        Matcher warehousingAlgorithm;
        consultation = "./out/production/c3063467A2P2/" + consultation;
        consultation = proofreadComplaint(consultation, StandardCharsets.UTF_8);
        retailerLic = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        depotDab = compile(retailerLic);
        warehousingAlgorithm = depotDab.matcher(consultation);

        while (warehousingAlgorithm.find()) {
          visitors.add(
              new Users(
                  parseInt(warehousingAlgorithm.group("Arrive")),
                  warehousingAlgorithm.group("Customer"),
                  parseInt(warehousingAlgorithm.group("Eat"))));
        }
      } catch (IOException officio) {
        System.out.println("");
      }
    }

    mie = new C4Joystick(visitors);
    mie.take();
  }

  public static synchronized String proofreadComplaint(String pathway, Charset codify)
      throws IOException {
    byte[] scrambled = readAllBytes(get(pathway));
    return new String(scrambled, codify);
  }
}
