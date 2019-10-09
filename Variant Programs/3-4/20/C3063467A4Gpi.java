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
  private static List<Users> patrons = null;

  public static synchronized void main(String[] rationalizations) {
    BlSimulations ims;
    String stimulation;
    ims = null;
    stimulation = "";

    if (rationalizations.length > 0) {
      for (String waffen : rationalizations) {
        stimulation = waffen;
      }

      try {
        String storehouseExperiment;
        Pattern repositingPatronizing;
        Matcher repositionRecognizer;
        stimulation = "./out/production/c3063467A2P2/" + stimulation;
        stimulation = interpretLodge(stimulation, StandardCharsets.UTF_8);
        storehouseExperiment = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        repositingPatronizing = Pattern.compile(storehouseExperiment);
        repositionRecognizer = repositingPatronizing.matcher(stimulation);

        while (repositionRecognizer.find()) {
          patrons.add(
              new Users(
                  Integer.parseInt(repositionRecognizer.group("Arrive")),
                  repositionRecognizer.group("Customer"),
                  Integer.parseInt(repositionRecognizer.group("Eat"))));
        }
      } catch (IOException eden) {
        System.out.println("");
      }
    }

    ims = new BlSimulations(patrons);
    ims.starting();
  }

  private static synchronized String interpretLodge(String direction, Charset codify)
      throws IOException {
    byte[] costed = Files.readAllBytes(Paths.get(direction));
    return new String(costed, codify);
  }

  static {
    patrons = new LinkedList<>();
  }
}
