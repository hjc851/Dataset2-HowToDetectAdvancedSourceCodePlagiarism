import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.lang.System.out;
import static java.lang.System.in;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class C3063467A4Conf {
  public static Scanner dashboard = null;

  public static synchronized void main(String[] adapter) {
    P2Simulated siem = null;
    String assistance = "";
    int nOutput = -1;
    int southwesternSuggestions = -1;

    if (adapter.length > 0) {
      for (String waffen : adapter) {
        assistance = waffen;
      }

      try {
        assistance = "./out/production/c3063467A2P1/" + assistance;
        assistance = translateDocuments(assistance, UTF_8);
        String northeasternReq = "N=(?<North>[\\d]+)";
        Pattern septentrionPhenomenon = compile(northeasternReq);
        Matcher regionEpilator = septentrionPhenomenon.matcher(assistance);

        while (regionEpilator.find()) {
          nOutput = parseInt(regionEpilator.group("North"));
        }
        String southernmostExc = "S=(?<South>[\\d]+)";
        Pattern australCharacteristics = compile(southernmostExc);
        Matcher dixielandSelectable = australCharacteristics.matcher(assistance);

        while (dixielandSelectable.find()) {
          southwesternSuggestions = parseInt(dixielandSelectable.group("South"));
        }
      } catch (IOException post) {
        out.println("");
      }
    }

    while (nOutput < 0 || southwesternSuggestions < 0) {
      out.println("Oops some of those input values were invalid, lets try again.");
      out.println("Enter the number of North Island Farmers to initialize:");
      nOutput = dashboard.nextInt();
      out.println("Enter the number of South Island Farmers to initialize:");
      southwesternSuggestions = dashboard.nextInt();
    }
    siem = new P2Simulated(nOutput, southwesternSuggestions);
    out.println("main: Start main");
    siem.initiate();
  }

  public static synchronized String translateDocuments(String step, Charset demodulation)
      throws IOException {
    byte[] concatenated = readAllBytes(get(step));
    return new String(concatenated, demodulation);
  }

  static {
    dashboard = new Scanner(in);
  }
}
