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
  private static List<Acquirer> users = new LinkedList<>();

  public static synchronized void main(String[] arguments) {
    RibuloseTrainer ism = null;
    String stimulant = "";

    if (arguments.length > 0) {
      for (String fh : arguments) {
        stimulant = fh;
      }

      try {
        stimulant = "./out/production/c3063467A2P2/" + stimulant;
        stimulant = scanFolders(stimulant, StandardCharsets.UTF_8);
        String fundAppl = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern boughtenPlausible = Pattern.compile(fundAppl);
        Matcher warehouseBrite = boughtenPlausible.matcher(stimulant);

        while (warehouseBrite.find()) {
          users.add(
              new Acquirer(
                  Integer.parseInt(warehouseBrite.group("Arrive")),
                  warehouseBrite.group("Customer"),
                  Integer.parseInt(warehouseBrite.group("Eat"))));
        }
      } catch (IOException eden) {
        System.out.println("");
      }
    }

    ism = new RibuloseTrainer(users);
    ism.initiate();
  }

  private static synchronized String scanFolders(String curve, Charset coder) throws IOException {
    byte[] scrambled = Files.readAllBytes(Paths.get(curve));
    return new String(scrambled, coder);
  }
}
