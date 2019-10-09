import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner videogame = new Scanner(System.in);

  public static void main(String[] adapter) {
    AtAnalogue siem;
    String stimulant = "";
    int northernStimulant = -1;
    int sAssistance = -1;

    if (adapter.length > 0) {
      for (String fh : adapter) {
        stimulant = fh;
      }

      try {
        stimulant = "./out/production/c3063467A2P1/" + stimulant;
        stimulant = wrotePapers(stimulant, StandardCharsets.UTF_8);
        String nLic = "N=(?<North>[\\d]+)";
        Pattern unionNorm = Pattern.compile(nLic);
        Matcher northerlyRecognizer = unionNorm.matcher(stimulant);

        while (northerlyRecognizer.find()) {
          northernStimulant = Integer.parseInt(northerlyRecognizer.group("North"));
        }
        String dixieInd = "S=(?<South>[\\d]+)";
        Pattern southeasterlyFigure = Pattern.compile(dixieInd);
        Matcher southwardChooser = southeasterlyFigure.matcher(stimulant);

        while (southwardChooser.find()) {
          sAssistance = Integer.parseInt(southwardChooser.group("South"));
        }
      } catch (IOException adult) {
        System.out.println("");
      }
    }

    while (northernStimulant < 0 || sAssistance < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northernStimulant = videogame.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      sAssistance = videogame.nextInt();
    }
    siem = new AtAnalogue(northernStimulant, sAssistance);
    System.out.println("main: Start main");
    siem.undertake();
  }

  private static String wrotePapers(String avenue, Charset crypto) throws IOException {
    byte[] coded = Files.readAllBytes(Paths.get(avenue));
    return new String(coded, crypto);
  }
}
