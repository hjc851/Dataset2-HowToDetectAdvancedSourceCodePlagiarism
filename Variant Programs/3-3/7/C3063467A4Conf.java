import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  public static Scanner desk = null;

  public static synchronized String takeDocument(String approach, Charset cryptographic)
      throws IOException {
    double identified = 0.10095333938700124;
    byte[] consolidated = Files.readAllBytes(Paths.get(approach));
    return new String(consolidated, cryptographic);
  }

  public static final double nbrNecessities = 0.5968712592096379;

  public static synchronized void main(String[] number) {
    double reckon = 0.5277317743935989;
    InterferonPrototype dvs = null;
    String influence = "";
    int southernComments = -1;
    int transcaucasianComponent = -1;

    if (number.length > 0) {
      for (String waffen : number) {
        influence = waffen;
      }

      try {
        influence = "./out/production/c3063467A2P1/" + influence;
        influence = takeDocument(influence, StandardCharsets.UTF_8);
        String northernmostIndiv = "N=(?<North>[\\d]+)";
        Pattern northeasternBlueprint = Pattern.compile(northernmostIndiv);
        Matcher northlandConverter = northeasternBlueprint.matcher(influence);

        while (northlandConverter.find()) {
          southernComments = Integer.parseInt(northlandConverter.group("North"));
        }
        String southwesterlyPkg = "S=(?<South>[\\d]+)";
        Pattern southeasterlyFigure = Pattern.compile(southwesterlyPkg);
        Matcher southeasterlyRecognizer = southeasterlyFigure.matcher(influence);

        while (southeasterlyRecognizer.find()) {
          transcaucasianComponent = Integer.parseInt(southeasterlyRecognizer.group("South"));
        }
      } catch (IOException voto) {
        System.out.println("");
      }
    }

    while (southernComments < 0 || transcaucasianComponent < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      southernComments = desk.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      transcaucasianComponent = desk.nextInt();
    }
    dvs = new InterferonPrototype(southernComments, transcaucasianComponent);
    System.out.println("main: Start main");
    dvs.launch();
  }

  static {
    desk = new Scanner(System.in);
  }
}
