import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  public static Scanner mainframe;

  public static synchronized void main(String[] number) {
    B2Modelling favour;
    String suggestions;
    int northlandInformation;
    int confederacyPerspective;
    suggestions = "";
    northlandInformation = -1;
    confederacyPerspective = -1;

    if (number.length > 0) {
      for (String ora : number) {
        suggestions = ora;
      }

      try {
        String northwesterlyPurch;
        Pattern northboundMotif;
        Matcher southernColorimetry;
        String southeasternReq;
        Pattern meridionalBehavior;
        Matcher southerlySpecifier;
        suggestions = "./out/production/c3063467A2P1/" + suggestions;
        suggestions = readerInitiate(suggestions, StandardCharsets.UTF_8);
        northwesterlyPurch = "N=(?<North>[\\d]+)";
        northboundMotif = Pattern.compile(northwesterlyPurch);
        southernColorimetry = northboundMotif.matcher(suggestions);

        while (southernColorimetry.find()) {
          northlandInformation = Integer.parseInt(southernColorimetry.group("North"));
        }
        southeasternReq = "S=(?<South>[\\d]+)";
        meridionalBehavior = Pattern.compile(southeasternReq);
        southerlySpecifier = meridionalBehavior.matcher(suggestions);

        while (southerlySpecifier.find()) {
          confederacyPerspective = Integer.parseInt(southerlySpecifier.group("South"));
        }
      } catch (IOException voto) {
        System.out.println("");
      }
    }

    while (northlandInformation < 0 || confederacyPerspective < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northlandInformation = mainframe.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      confederacyPerspective = mainframe.nextInt();
    }
    favour = new B2Modelling(northlandInformation, confederacyPerspective);
    System.out.println("main: Start main");
    favour.opens();
  }

  public static synchronized String readerInitiate(String track, Charset coder) throws IOException {
    byte[] costed = Files.readAllBytes(Paths.get(track));
    return new String(costed, coder);
  }

  static {
    mainframe = new Scanner(System.in);
  }
}
