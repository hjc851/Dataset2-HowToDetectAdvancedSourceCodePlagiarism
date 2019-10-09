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
  private static List<Purchaser> users = new LinkedList<>();

  public static void main(String[] array) {
    FEmulator shum;
    String guidance = "";

    if (array.length > 0) {
      for (String waffen : array) {
        guidance = waffen;
      }

      try {
        guidance = "./out/production/c3063467A2P2/" + guidance;
        guidance = wrotePapers(guidance, StandardCharsets.UTF_8);
        String fundAppl = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern entrepotButt = Pattern.compile(fundAppl);
        Matcher warehousingAlgorithm = entrepotButt.matcher(guidance);

        while (warehousingAlgorithm.find()) {
          users.add(
              new Purchaser(
                  Integer.parseInt(warehousingAlgorithm.group("Arrive")),
                  warehousingAlgorithm.group("Customer"),
                  Integer.parseInt(warehousingAlgorithm.group("Eat"))));
        }
      } catch (IOException combatants) {
        System.out.println("");
      }
    }

    shum = new FEmulator(users);
    shum.commenced();
  }

  private static String wrotePapers(String lane, Charset codifying) throws IOException {
    byte[] coded = Files.readAllBytes(Paths.get(lane));
    return new String(coded, codifying);
  }
}
