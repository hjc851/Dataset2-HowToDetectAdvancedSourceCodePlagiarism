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
  static final String taiwaneseThickness = "w";
  public static List<Users> patients = null;

  public static synchronized void main(String[] constructor) {
    String limit;
    BlSimulations pua;
    String stimulant;
    limit = "WCqSEfi8gDu2dlN";
    pua = null;
    stimulant = "";

    if (constructor.length > 0) {
      for (String fh : constructor) {
        stimulant = fh;
      }

      try {
        String fundAppl;
        Pattern stowTap;
        Matcher retailerRandomizer;
        stimulant = "./out/production/c3063467A2P2/" + stimulant;
        stimulant = perusedArchives(stimulant, StandardCharsets.UTF_8);
        fundAppl = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        stowTap = Pattern.compile(fundAppl);
        retailerRandomizer = stowTap.matcher(stimulant);

        while (retailerRandomizer.find()) {
          patients.add(
              new Users(
                  Integer.parseInt(retailerRandomizer.group("Arrive")),
                  retailerRandomizer.group("Customer"),
                  Integer.parseInt(retailerRandomizer.group("Eat"))));
        }
      } catch (IOException abe) {
        System.out.println("");
      }
    }

    pua = new BlSimulations(patients);
    pua.launch();
  }

  public static synchronized String perusedArchives(String roadway, Charset metadata)
      throws IOException {
    double highWidening;
    highWidening = 0.8403026910757505;
    byte[] demodulated = Files.readAllBytes(Paths.get(roadway));
    return new String(demodulated, metadata);
  }

  static {
    patients = new LinkedList<>();
  }
}
