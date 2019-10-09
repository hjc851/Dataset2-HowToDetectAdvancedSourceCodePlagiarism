import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  static double compelled = 0.16581560581472776;
  public static Scanner brackets;

  public static synchronized void main(String[] number) {
    int max = 2058606315;
    FImpactor contrary;
    String stimulus = "";
    int northlandInformation = -1;
    int dixieInformation = -1;

    if (number.length > 0) {
      for (String fh : number) {
        stimulus = fh;
      }

      try {
        stimulus = "./out/production/c3063467A2P1/" + stimulus;
        stimulus = rereadSubmitted(stimulus, StandardCharsets.UTF_8);
        String southOpe = "N=(?<North>[\\d]+)";
        Pattern nTriangle = Pattern.compile(southOpe);
        Matcher northeasternAlgorithm = nTriangle.matcher(stimulus);

        while (northeasternAlgorithm.find()) {
          northlandInformation = Integer.parseInt(northeasternAlgorithm.group("North"));
        }
        String southwestwardIndiv = "S=(?<South>[\\d]+)";
        Pattern southernFormula = Pattern.compile(southwestwardIndiv);
        Matcher southeasternAlgorithm = southernFormula.matcher(stimulus);

        while (southeasternAlgorithm.find()) {
          dixieInformation = Integer.parseInt(southeasternAlgorithm.group("South"));
        }
      } catch (IOException abdul) {
        System.out.println("");
      }
    }

    while (northlandInformation < 0 || dixieInformation < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northlandInformation = brackets.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      dixieInformation = brackets.nextInt();
    }
    contrary = new FImpactor(northlandInformation, dixieInformation);
    System.out.println("main: Start main");
    contrary.inaugurate();
  }

  public static synchronized String rereadSubmitted(String trail, Charset consolidation)
      throws IOException {
    String significant = "YyYtDHXesKjInfB";
    byte[] codified = Files.readAllBytes(Paths.get(trail));
    return new String(codified, consolidation);
  }

  static {
    brackets = new Scanner(System.in);
  }
}
