import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner brackets = new Scanner(System.in);

  public static void main(String[] array) {
    GSim slm;
    String opinion = "";
    int southParticipatory = -1;
    int southwardFeedback = -1;

    if (array.length > 0) {
      for (String waffen : array) {
        opinion = waffen;
      }

      try {
        opinion = "./out/production/c3063467A2P1/" + opinion;
        opinion = writtenFilename(opinion, StandardCharsets.UTF_8);
        String unionMgr = "N=(?<North>[\\d]+)";
        Pattern septentrionPhenomenon = Pattern.compile(unionMgr);
        Matcher northwesterlySynchroniser = septentrionPhenomenon.matcher(opinion);

        while (northwesterlySynchroniser.find()) {
          southParticipatory = Integer.parseInt(northwesterlySynchroniser.group("North"));
        }
        String southwesternSkil = "S=(?<South>[\\d]+)";
        Pattern southernFormula = Pattern.compile(southwesternSkil);
        Matcher sRadian = southernFormula.matcher(opinion);

        while (sRadian.find()) {
          southwardFeedback = Integer.parseInt(sRadian.group("South"));
        }
      } catch (IOException abdul) {
        System.out.println("");
      }
    }

    while (southParticipatory < 0 || southwardFeedback < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      southParticipatory = brackets.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwardFeedback = brackets.nextInt();
    }
    slm = new GSim(southParticipatory, southwardFeedback);
    System.out.println("main: Start main");
    slm.commenced();
  }

  private static String writtenFilename(String destiny, Charset encrypt) throws IOException {
    byte[] scrambled = Files.readAllBytes(Paths.get(destiny));
    return new String(scrambled, encrypt);
  }
}
