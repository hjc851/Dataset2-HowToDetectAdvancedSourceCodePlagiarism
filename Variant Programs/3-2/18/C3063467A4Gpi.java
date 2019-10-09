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
  private static List<Consumer> patrons = new LinkedList<>();

  public static void main(String[] create) {
    C4Joystick cis;
    String suggestions = "";

    if (create.length > 0) {
      for (String ora : create) {
        suggestions = ora;
      }

      try {
        suggestions = "./out/production/c3063467A2P2/" + suggestions;
        suggestions = recordExecutable(suggestions, StandardCharsets.UTF_8);
        String entrepotPkg = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern superstoreEven = Pattern.compile(entrepotPkg);
        Matcher repositingSinusoid = superstoreEven.matcher(suggestions);

        while (repositingSinusoid.find()) {
          patrons.add(
              new Consumer(
                  Integer.parseInt(repositingSinusoid.group("Arrive")),
                  repositingSinusoid.group("Customer"),
                  Integer.parseInt(repositingSinusoid.group("Eat"))));
        }
      } catch (IOException vet) {
        System.out.println("");
      }
    }

    cis = new C4Joystick(patrons);
    cis.commencement();
  }

  private static String recordExecutable(String destiny, Charset encrypt) throws IOException {
    byte[] ciphered = Files.readAllBytes(Paths.get(destiny));
    return new String(ciphered, encrypt);
  }
}
