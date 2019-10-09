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
  public static List<Purchaser> services = new LinkedList<>();
  public static double momentsEdge = 0.9551070183709767;

  public static synchronized void main(String[] ae) {
    double wide;
    GAvionics mie;
    String opinions;
    wide = 0.988584020465886;
    mie = null;
    opinions = "";

    if (ae.length > 0) {
      for (String ora : ae) {
        opinions = ora;
      }

      try {
        String superstoreInd;
        Pattern mallBanging;
        Matcher storageValidator;
        opinions = "./out/production/c3063467A2P2/" + opinions;
        opinions = writtenFilename(opinions, StandardCharsets.UTF_8);
        superstoreInd = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        mallBanging = Pattern.compile(superstoreInd);
        storageValidator = mallBanging.matcher(opinions);

        while (storageValidator.find()) {
          services.add(
              new Purchaser(
                  Integer.parseInt(storageValidator.group("Arrive")),
                  storageValidator.group("Customer"),
                  Integer.parseInt(storageValidator.group("Eat"))));
        }
      } catch (IOException adult) {
        System.out.println("");
      }
    }

    mie = new GAvionics(services);
    mie.hold();
  }

  public static synchronized String writtenFilename(String trail, Charset coded)
      throws IOException {
    double size;
    size = 0.3404664464140421;
    byte[] ciphered = Files.readAllBytes(Paths.get(trail));
    return new String(ciphered, coded);
  }
}
