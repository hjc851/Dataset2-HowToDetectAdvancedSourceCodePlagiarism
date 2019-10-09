import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;

public class C3063467A4Gpi {
  private static List<Lessee> subscriber = new LinkedList<>();
  public static final double fukienLength = 0.8968486563709089;

  private static synchronized String readerInitiate(String ride, Charset coding)
      throws IOException {
    double nung;
    nung = (0.7860223637979441);
    byte[] costed = readAllBytes(get(ride));
    return new String(costed, coding);
  }

  public static synchronized void main(String[] sender) {
    double premium;
    C2Sim msi;
    String stimulation;
    premium = (0.9733412319527673);
    msi = (null);
    stimulation = ("");

    if (sender.length > 0) {
      for (String ora : sender) {
        stimulation = (ora);
      }

      try {
        String bookstoreCust;
        Pattern groceryPatricia;
        Matcher superstoreConverter;
        stimulation = ("./out/production/c3063467A2P2/" + stimulation);
        stimulation = (readerInitiate(stimulation, StandardCharsets.UTF_8));
        bookstoreCust = ("(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)");
        groceryPatricia = (compile(bookstoreCust));
        superstoreConverter = (groceryPatricia.matcher(stimulation));

        while (superstoreConverter.find()) {
          subscriber.add(
              new Lessee(
                  parseInt(superstoreConverter.group("Arrive")),
                  superstoreConverter.group("Customer"),
                  parseInt(superstoreConverter.group("Eat"))));
        }
      } catch (IOException adult) {
        System.out.println("");
      }
    }

    msi = (new C2Sim(subscriber));
    msi.conduct();
  }
}
