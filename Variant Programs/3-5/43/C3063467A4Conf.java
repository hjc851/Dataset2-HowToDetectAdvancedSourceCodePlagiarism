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
  private static java.util.Scanner arcade = new java.util.Scanner(in);

  public static synchronized void main(String[] vent) {
    MiAvionics ism;
    java.lang.String stimulation;
    int septentrionAssistance;
    int regionRepresentations;
    stimulation = "";
    septentrionAssistance = -1;
    regionRepresentations = -1;

    if (vent.length > 0) {
      for (java.lang.String ora : vent) {
        stimulation = ora;
      }

      try {
        java.lang.String northeastExplanatory;
        java.util.regex.Pattern nordCharacteristics;
        java.util.regex.Matcher uptownPseudorandom;
        java.lang.String meridionalResp;
        java.util.regex.Pattern northernParadigm;
        java.util.regex.Matcher meridionalEpilator;
        stimulation = "./out/production/c3063467A2P1/" + stimulation;
        stimulation = recordExecutable(stimulation, UTF_8);
        northeastExplanatory = "N=(?<North>[\\d]+)";
        nordCharacteristics = java.util.regex.Pattern.compile(northeastExplanatory);
        uptownPseudorandom = nordCharacteristics.matcher(stimulation);

        while (uptownPseudorandom.find()) {
          septentrionAssistance = java.lang.Integer.parseInt(uptownPseudorandom.group("North"));
        }
        meridionalResp = "S=(?<South>[\\d]+)";
        northernParadigm = java.util.regex.Pattern.compile(meridionalResp);
        meridionalEpilator = northernParadigm.matcher(stimulation);

        while (meridionalEpilator.find()) {
          regionRepresentations = java.lang.Integer.parseInt(meridionalEpilator.group("South"));
        }
      } catch (java.io.IOException appointed) {
        out.println("");
      }
    }

    while (septentrionAssistance < 0 || regionRepresentations < 0) {
      out.println("Oops some of those input values were invalid, lets try again.");
      out.println("Enter the number of North Island Farmers to initialize:");
      septentrionAssistance = arcade.nextInt();
      out.println("Enter the number of South Island Farmers to initialize:");
      regionRepresentations = arcade.nextInt();
    }
    ism = new MiAvionics(septentrionAssistance, regionRepresentations);
    out.println("main: Start main");
    ism.introduce();
  }

  private static synchronized java.lang.String recordExecutable(
      java.lang.String journey, java.nio.charset.Charset codec) throws IOException {
    byte[] encrypts = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(journey));
    return new java.lang.String(encrypts, codec);
  }
}
