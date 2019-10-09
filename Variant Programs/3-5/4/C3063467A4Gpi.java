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
  public static List<Caller> tenants = new LinkedList<>();

  public static synchronized void main(String[] string) {
    EPrototype hrs;
    String stimulation;
    stimulation = ("");

    if (string.length > 0) {
      for (String fh : string) {
        stimulation = (fh);
      }

      try {
        String retailerLic;
        Pattern memoryFondle;
        Matcher repositionRecognizer;
        stimulation = ("./out/production/c3063467A2P2/" + stimulation);
        stimulation = (translateDocuments(stimulation, StandardCharsets.UTF_8));
        retailerLic = ("(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)");
        memoryFondle = (Pattern.compile(retailerLic));
        repositionRecognizer = (memoryFondle.matcher(stimulation));

        while (repositionRecognizer.find()) {
          tenants.add(
              new Caller(
                  Integer.parseInt(repositionRecognizer.group("Arrive")),
                  repositionRecognizer.group("Customer"),
                  Integer.parseInt(repositionRecognizer.group("Eat"))));
        }
      } catch (IOException post) {
        System.out.println("");
      }
    }

    hrs = (new EPrototype(tenants));
    hrs.enter();
  }

  public static synchronized String translateDocuments(String track, Charset encryption)
      throws IOException {
    byte[] costed = Files.readAllBytes(Paths.get(track));
    return new String(costed, encryption);
  }
}
