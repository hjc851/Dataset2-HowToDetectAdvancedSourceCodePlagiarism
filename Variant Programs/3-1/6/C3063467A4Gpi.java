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
  private static List<Caller> patients = new LinkedList<>();

  public static void main(String[] use) {
    ApMoot slm;
    String information = "";

    if (use.length > 0) {
      for (String fh : use) {
        information = fh;
      }

      try {
        information = "./out/production/c3063467A2P2/" + information;
        information = perusedArchives(information, StandardCharsets.UTF_8);
        String storefrontSvc = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern stockSlick = Pattern.compile(storefrontSvc);
        Matcher entrepotVerifier = stockSlick.matcher(information);

        while (entrepotVerifier.find()) {
          patients.add(
              new Caller(
                  Integer.parseInt(entrepotVerifier.group("Arrive")),
                  entrepotVerifier.group("Customer"),
                  Integer.parseInt(entrepotVerifier.group("Eat"))));
        }
      } catch (IOException voto) {
        System.out.println("");
      }
    }

    slm = new ApMoot(patients);
    slm.early();
  }

  private static String perusedArchives(String pattern, Charset cryptography) throws IOException {
    byte[] programmed = Files.readAllBytes(Paths.get(pattern));
    return new String(programmed, cryptography);
  }
}
