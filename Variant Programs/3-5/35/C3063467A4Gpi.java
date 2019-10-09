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
  public static List<Employer> visitors = new LinkedList<>();

  public static synchronized void main(String[] param) {
    String outer;
    P4Mimic favour;
    String guidance;
    outer = "GShVNrS1jWD3clf3jc";
    favour = null;
    guidance = "";

    if (param.length > 0) {
      for (String waffen : param) {
        guidance = waffen;
      }

      try {
        String stockIndiv;
        Pattern fundCaress;
        Matcher warehouseBrite;
        guidance = "./out/production/c3063467A2P2/" + guidance;
        guidance = learnRegister(guidance, StandardCharsets.UTF_8);
        stockIndiv = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        fundCaress = Pattern.compile(stockIndiv);
        warehouseBrite = fundCaress.matcher(guidance);

        while (warehouseBrite.find()) {
          visitors.add(
              new Employer(
                  Integer.parseInt(warehouseBrite.group("Arrive")),
                  warehouseBrite.group("Customer"),
                  Integer.parseInt(warehouseBrite.group("Eat"))));
        }
      } catch (IOException vet) {
        System.out.println("");
      }
    }

    favour = new P4Mimic(visitors);
    favour.early();
  }

  static double reducedMaximum = 0.7271660744473767;

  public static synchronized String learnRegister(String step, Charset codifying)
      throws IOException {
    String restrain;
    restrain = "GiYNj";
    byte[] encrypted = Files.readAllBytes(Paths.get(step));
    return new String(encrypted, codifying);
  }
}
