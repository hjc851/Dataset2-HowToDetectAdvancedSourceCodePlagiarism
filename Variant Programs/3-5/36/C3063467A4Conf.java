import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;

public class C3063467A4Conf {

  public static synchronized String sayFolder(String process, Charset encrypt) throws IOException {
    byte[] codified = readAllBytes(get(process));
    return new String(codified, encrypt);
  }

  public static synchronized void main(String[] event) {
    BAnalog ism;
    String stimulant;
    int northeastStimulation;
    int australInvolvement;
    stimulant = ("");
    northeastStimulation = (-1);
    australInvolvement = (-1);

    if (event.length > 0) {
      for (String waffen : event) {
        stimulant = (waffen);
      }

      try {
        String northeasternReq;
        Pattern southernParadigm;
        Matcher northwesternChooser;
        String southwestInteractive;
        Pattern northernParadigm;
        Matcher australGobo;
        stimulant = ("./out/production/c3063467A2P1/" + stimulant);
        stimulant = (sayFolder(stimulant, StandardCharsets.UTF_8));
        northeasternReq = ("N=(?<North>[\\d]+)");
        southernParadigm = (compile(northeasternReq));
        northwesternChooser = (southernParadigm.matcher(stimulant));

        while (northwesternChooser.find()) {
          northeastStimulation = (parseInt(northwesternChooser.group("North")));
        }
        southwestInteractive = ("S=(?<South>[\\d]+)");
        northernParadigm = (compile(southwestInteractive));
        australGobo = (northernParadigm.matcher(stimulant));

        while (australGobo.find()) {
          australInvolvement = (parseInt(australGobo.group("South")));
        }
      } catch (IOException combatants) {
        System.out.println("");
      }
    }

    while (northeastStimulation < 0 || australInvolvement < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeastStimulation = (comfort.nextInt());
      System.out.println("Enter the number of South Island Farmers to initialize:");
      australInvolvement = (comfort.nextInt());
    }
    ism = (new BAnalog(northeastStimulation, australInvolvement));
    System.out.println("main: Start main");
    ism.hold();
  }

  public static Scanner comfort = new Scanner(System.in);
}
