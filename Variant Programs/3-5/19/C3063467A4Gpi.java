import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.lang.System.out;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class C3063467A4Gpi {
  private static final double synX424double = 0.1469274355989818;
  private static final String synX423String = "";
  private static final String synX422String = "Eat";
  private static final String synX421String = "Customer";
  private static final String synX420String = "Arrive";
  private static final String synX419String =
      "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
  private static final String synX418String = "./out/production/c3063467A2P2/";
  private static final int synX417int = 0;
  private static final String synX416String = "";
  private static final double synX415double = 0.009732334489756522;
  public static List<Subscriber> patients = null;
  static double less = 0.6441712700640065;

  public static synchronized void main(String[] string) {
    double depressLimitation;
    A3Modelling slm;
    String consultation;
    depressLimitation = (synX415double);
    slm = (null);
    consultation = (synX416String);

    if (string.length > synX417int) {
      for (String fh : string) {
        consultation = (fh);
      }

      try {
        String groceryBens;
        Pattern warehouseWell;
        Matcher superstoreConverter;
        consultation = (synX418String + consultation);
        consultation = (readerInitiate(consultation, UTF_8));
        groceryBens = (synX419String);
        warehouseWell = (compile(groceryBens));
        superstoreConverter = (warehouseWell.matcher(consultation));

        while (superstoreConverter.find()) {
          patients.add(
              new Subscriber(
                  parseInt(superstoreConverter.group(synX420String)),
                  superstoreConverter.group(synX421String),
                  parseInt(superstoreConverter.group(synX422String))));
        }
      } catch (IOException former) {
        out.println(synX423String);
      }
    }

    slm = (new A3Modelling(patients));
    slm.inaugurate();
  }

  public static synchronized String readerInitiate(String track, Charset scrambling)
      throws IOException {
    double nominal;
    nominal = (synX424double);
    byte[] transmit = readAllBytes(get(track));
    return new String(transmit, scrambling);
  }

  static {
    patients = (new LinkedList<>());
  }
}
