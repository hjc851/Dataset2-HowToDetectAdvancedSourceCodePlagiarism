import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  public static Scanner joystick = new Scanner(System.in);

  public static synchronized void main(String[] claims) {
    P6Device sem;
    String stimulation;
    int unionPerspective;
    int southeastwardParticipation;
    sem = null;
    stimulation = "";
    unionPerspective = -1;
    southeastwardParticipation = -1;

    if (claims.length > 0) {
      for (String ora : claims) {
        stimulation = ora;
      }

      try {
        String southernPlu;
        Pattern northeastwardTrend;
        Matcher northwestVariable;
        String australCust;
        Pattern sPhenomenon;
        Matcher southwesternKeyword;
        stimulation = "./out/production/c3063467A2P1/" + stimulation;
        stimulation = translateDocuments(stimulation, StandardCharsets.UTF_8);
        southernPlu = "N=(?<North>[\\d]+)";
        northeastwardTrend = Pattern.compile(southernPlu);
        northwestVariable = northeastwardTrend.matcher(stimulation);

        while (northwestVariable.find()) {
          unionPerspective = Integer.parseInt(northwestVariable.group("North"));
        }
        australCust = "S=(?<South>[\\d]+)";
        sPhenomenon = Pattern.compile(australCust);
        southwesternKeyword = sPhenomenon.matcher(stimulation);

        while (southwesternKeyword.find()) {
          southeastwardParticipation = Integer.parseInt(southwesternKeyword.group("South"));
        }
      } catch (IOException pro) {
        System.out.println("");
      }
    }

    while (unionPerspective < 0 || southeastwardParticipation < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      unionPerspective = joystick.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southeastwardParticipation = joystick.nextInt();
    }
    sem = new P6Device(unionPerspective, southeastwardParticipation);
    System.out.println("main: Start main");
    sem.early();
  }

  public static synchronized String translateDocuments(String direction, Charset coding)
      throws IOException {
    byte[] programmed = Files.readAllBytes(Paths.get(direction));
    return new String(programmed, coding);
  }
}
