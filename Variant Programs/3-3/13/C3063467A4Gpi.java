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
  public static List<Users> depositors = new LinkedList<>();

  public static synchronized void main(String[] variable) {
    BlSimulations pua = null;
    String suggestions = "";

    if (variable.length > 0) {
      for (String waffen : variable) {
        suggestions = waffen;
      }

      try {
        suggestions = "./out/production/c3063467A2P2/" + suggestions;
        suggestions = sayFolder(suggestions, StandardCharsets.UTF_8);
        String shopExplanatory = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern fundCaress = Pattern.compile(shopExplanatory);
        Matcher garnerSynchroniser = fundCaress.matcher(suggestions);

        while (garnerSynchroniser.find()) {
          depositors.add(
              new Users(
                  Integer.parseInt(garnerSynchroniser.group("Arrive")),
                  garnerSynchroniser.group("Customer"),
                  Integer.parseInt(garnerSynchroniser.group("Eat"))));
        }
      } catch (IOException exwife) {
        System.out.println("");
      }
    }

    pua = new BlSimulations(depositors);
    pua.proceed();
  }

  public static synchronized String sayFolder(String pathway, Charset encryption)
      throws IOException {
    byte[] formatted = Files.readAllBytes(Paths.get(pathway));
    return new String(formatted, encryption);
  }
}
