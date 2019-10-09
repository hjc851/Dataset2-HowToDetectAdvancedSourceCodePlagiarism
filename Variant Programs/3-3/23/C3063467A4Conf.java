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

  public static synchronized void main(String[] use) {
    BAnalog sem = null;
    String opinion = "";
    int southernComments = -1;
    int southeasternConsultation = -1;

    if (use.length > 0) {
      for (String fh : use) {
        opinion = fh;
      }

      try {
        opinion = "./out/production/c3063467A2P1/" + opinion;
        opinion = understandCharge(opinion, StandardCharsets.UTF_8);
        String southernPlu = "N=(?<North>[\\d]+)";
        Pattern northlandTrends = Pattern.compile(southernPlu);
        Matcher northwardsKeyword = northlandTrends.matcher(opinion);

        while (northwardsKeyword.find()) {
          southernComments = Integer.parseInt(northwardsKeyword.group("North"));
        }
        String confederacyMgr = "S=(?<South>[\\d]+)";
        Pattern southwestRule = Pattern.compile(confederacyMgr);
        Matcher australGobo = southwestRule.matcher(opinion);

        while (australGobo.find()) {
          southeasternConsultation = Integer.parseInt(australGobo.group("South"));
        }
      } catch (IOException afterwards) {
        System.out.println("");
      }
    }

    while (southernComments < 0 || southeasternConsultation < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      southernComments = joystick.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southeasternConsultation = joystick.nextInt();
    }
    sem = new BAnalog(southernComments, southeasternConsultation);
    System.out.println("main: Start main");
    sem.opens();
  }

  public static synchronized String understandCharge(String trail, Charset cryptography)
      throws IOException {
    byte[] encrypted = Files.readAllBytes(Paths.get(trail));
    return new String(encrypted, cryptography);
  }
}
