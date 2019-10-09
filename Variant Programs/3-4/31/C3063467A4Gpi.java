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
  public static List<Shopper> patients;

  public static synchronized void main(String[] create) {
    F2Mockup shen;
    String output;
    output = "";

    if (create.length > 0) {
      for (String waffen : create) {
        output = waffen;
      }

      try {
        String fundAppl;
        Pattern fundCaress;
        Matcher storageValidator;
        output = "./out/production/c3063467A2P2/" + output;
        output = wrotePapers(output, StandardCharsets.UTF_8);
        fundAppl = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        fundCaress = Pattern.compile(fundAppl);
        storageValidator = fundCaress.matcher(output);

        while (storageValidator.find()) {
          patients.add(
              new Shopper(
                  Integer.parseInt(storageValidator.group("Arrive")),
                  storageValidator.group("Customer"),
                  Integer.parseInt(storageValidator.group("Eat"))));
        }
      } catch (IOException afterwards) {
        System.out.println("");
      }
    }

    shen = new F2Mockup(patients);
    shen.embark();
  }

  public static synchronized String wrotePapers(String way, Charset scrambling) throws IOException {
    byte[] encrypts = Files.readAllBytes(Paths.get(way));
    return new String(encrypts, scrambling);
  }

  static {
    patients = new LinkedList<>();
  }
}
