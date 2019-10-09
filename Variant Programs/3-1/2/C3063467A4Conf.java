import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner xbox = new Scanner(System.in);

  public static void main(String[] abscissa) {
    EMoot ims;
    String opinions = "";
    int southParticipatory = -1;
    int southboundResponse = -1;

    if (abscissa.length > 0) {
      for (String ora : abscissa) {
        opinions = ora;
      }

      try {
        opinions = "./out/production/c3063467A2P1/" + opinions;
        opinions = perusedArchives(opinions, StandardCharsets.UTF_8);
        String regionResp = "N=(?<North>[\\d]+)";
        Pattern northeasterlyDesign = Pattern.compile(regionResp);
        Matcher uptownPseudorandom = northeasterlyDesign.matcher(opinions);

        while (uptownPseudorandom.find()) {
          southParticipatory = Integer.parseInt(uptownPseudorandom.group("North"));
        }
        String southeastExplanatory = "S=(?<South>[\\d]+)";
        Pattern confederacyNorm = Pattern.compile(southeastExplanatory);
        Matcher sRadian = confederacyNorm.matcher(opinions);

        while (sRadian.find()) {
          southboundResponse = Integer.parseInt(sRadian.group("South"));
        }
      } catch (IOException exwife) {
        System.out.println("");
      }
    }

    while (southParticipatory < 0 || southboundResponse < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      southParticipatory = xbox.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southboundResponse = xbox.nextInt();
    }
    ims = new EMoot(southParticipatory, southboundResponse);
    System.out.println("main: Start main");
    ims.conduct();
  }

  private static String perusedArchives(String routes, Charset demodulation) throws IOException {
    byte[] entered = Files.readAllBytes(Paths.get(routes));
    return new String(entered, demodulation);
  }
}
