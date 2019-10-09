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
  private static List<Patrons> passengers = new LinkedList<>();

  public static void main(String[] constructor) {
    P1Simulating msi;
    String stimulus = "";

    if (constructor.length > 0) {
      for (String fh : constructor) {
        stimulus = fh;
      }

      try {
        stimulus = "./out/production/c3063467A2P2/" + stimulus;
        stimulus = tellReadme(stimulus, StandardCharsets.UTF_8);
        String boughtenSkil = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern repositingPatronizing = Pattern.compile(boughtenSkil);
        Matcher drugstoreRadian = repositingPatronizing.matcher(stimulus);

        while (drugstoreRadian.find()) {
          passengers.add(
              new Patrons(
                  Integer.parseInt(drugstoreRadian.group("Arrive")),
                  drugstoreRadian.group("Customer"),
                  Integer.parseInt(drugstoreRadian.group("Eat"))));
        }
      } catch (IOException adult) {
        System.out.println("");
      }
    }

    msi = new P1Simulating(passengers);
    msi.hold();
  }

  private static String tellReadme(String pattern, Charset uncompressed) throws IOException {
    byte[] cryptographic = Files.readAllBytes(Paths.get(pattern));
    return new String(cryptographic, uncompressed);
  }
}
