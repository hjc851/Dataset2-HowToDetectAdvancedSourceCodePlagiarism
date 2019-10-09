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
  private static List<Users> services = new LinkedList<>();

  public static void main(String[] rationalizations) {
    MDemo dvs;
    String participatory = "";

    if (rationalizations.length > 0) {
      for (String fh : rationalizations) {
        participatory = fh;
      }

      try {
        participatory = "./out/production/c3063467A2P2/" + participatory;
        participatory = understandCharge(participatory, StandardCharsets.UTF_8);
        String superstoreInd = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern drugstoreDry = Pattern.compile(superstoreInd);
        Matcher depotVariable = drugstoreDry.matcher(participatory);

        while (depotVariable.find()) {
          services.add(
              new Users(
                  Integer.parseInt(depotVariable.group("Arrive")),
                  depotVariable.group("Customer"),
                  Integer.parseInt(depotVariable.group("Eat"))));
        }
      } catch (IOException abbe) {
        System.out.println("");
      }
    }

    dvs = new MDemo(services);
    dvs.introduce();
  }

  private static String understandCharge(String trajectory, Charset scrambling) throws IOException {
    byte[] concatenated = Files.readAllBytes(Paths.get(trajectory));
    return new String(concatenated, scrambling);
  }
}
