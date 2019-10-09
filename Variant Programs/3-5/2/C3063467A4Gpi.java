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
  public static List<Acquirer> guests = null;

  public static synchronized void main(String[] align) {
    P1Simulating mis = null;
    String perspective = "";

    if (align.length > 0) {
      for (String fh : align) {
        perspective = fh;
      }

      try {
        perspective = "./out/production/c3063467A2P2/" + perspective;
        perspective = writeDatabase(perspective, UTF_8);
        String repositionEquiv = "(?<Arrive>[\\d]+)\\s+(?<Customer>[a-zA-Z\\d]+)\\s+(?<Eat>[\\d]+)";
        Pattern retailerDollop = compile(repositionEquiv);
        Matcher depotVariable = retailerDollop.matcher(perspective);

        while (depotVariable.find()) {
          guests.add(
              new Acquirer(
                  parseInt(depotVariable.group("Arrive")),
                  depotVariable.group("Customer"),
                  parseInt(depotVariable.group("Eat"))));
        }
      } catch (IOException vet) {
        out.println("");
      }
    }

    mis = new P1Simulating(guests);
    mis.commencement();
  }

  public static synchronized String writeDatabase(String track, Charset encrypt)
      throws IOException {
    byte[] interleaves = readAllBytes(get(track));
    return new String(interleaves, encrypt);
  }

  static {
    guests = new LinkedList<>();
  }
}
