import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.in;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.lang.System.out;

public class C3063467A4Conf {
  private static java.util.Scanner nintendo = new java.util.Scanner(in);

  public static synchronized void main(String[] specified) {
    BAnalog dvs;
    java.lang.String participation = "";
    int regionInfluence = -1;
    int sAssistance = -1;

    if (specified.length > 0) {
      for (java.lang.String ora : specified) {
        participation = ora;
      }

      try {
        participation = "./out/production/c3063467A2P1/" + participation;
        participation = studyPaperwork(participation, UTF_8);
        java.lang.String uptownBens = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern septentrionPhenomenon = java.util.regex.Pattern.compile(uptownBens);
        java.util.regex.Matcher northeasternAlgorithm =
            septentrionPhenomenon.matcher(participation);

        while (northeasternAlgorithm.find()) {
          regionInfluence = java.lang.Integer.parseInt(northeasternAlgorithm.group("North"));
        }
        java.lang.String northOpe = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern meridionalBehavior = java.util.regex.Pattern.compile(northOpe);
        java.util.regex.Matcher southeastwardSpooler = meridionalBehavior.matcher(participation);

        while (southeastwardSpooler.find()) {
          sAssistance = java.lang.Integer.parseInt(southeastwardSpooler.group("South"));
        }
      } catch (java.io.IOException admittedly) {
        out.println("");
      }
    }

    while (regionInfluence < 0 || sAssistance < 0) {
      out.println("Oops some of those input values were invalid, lets try again.");
      out.println("Enter the number of North Island Farmers to initialize:");
      regionInfluence = nintendo.nextInt();
      out.println("Enter the number of South Island Farmers to initialize:");
      sAssistance = nintendo.nextInt();
    }
    dvs = new BAnalog(regionInfluence, sAssistance);
    out.println("main: Start main");
    dvs.take();
  }

  private static synchronized java.lang.String studyPaperwork(
      java.lang.String step, java.nio.charset.Charset coding) throws IOException {
    byte[] encrypts = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(step));
    return new java.lang.String(encrypts, coding);
  }
}
