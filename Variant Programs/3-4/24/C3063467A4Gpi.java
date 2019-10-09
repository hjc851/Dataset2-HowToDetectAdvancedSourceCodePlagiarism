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

  public static synchronized String tellReadme(String track, Charset coded) throws IOException {
    byte[] instantiated = Files.readAllBytes(Paths.get(track));
    return new String(instantiated, coded);
  }

  static {
    clientele = new LinkedList<>();
  }

  public static List<Patient> clientele;

  public static synchronized void main(String[] abscissa) {
    P1Simulating mie;
    String information;
    information = "";

    if (abscissa.length > 0) {
      for (String ora : abscissa) {
        information = ora;
      }

      try {
        String shopExplanatory;
        Pattern warehousingRap;
        Matcher drugstoreRadian;
        information = "./out/production/c3063467A2P2/" + information;
        information = tellReadme(information, StandardCharsets.UTF_8);
        shopExplanatory = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        warehousingRap = Pattern.compile(shopExplanatory);
        drugstoreRadian = warehousingRap.matcher(information);

        while (drugstoreRadian.find()) {
          clientele.add(
              new Patient(
                  Integer.parseInt(drugstoreRadian.group("Arrive")),
                  drugstoreRadian.group("Customer"),
                  Integer.parseInt(drugstoreRadian.group("Eat"))));
        }
      } catch (IOException afterwards) {
        System.out.println("");
      }
    }

    mie = new P1Simulating(clientele);
    mie.conduct();
  }
}
