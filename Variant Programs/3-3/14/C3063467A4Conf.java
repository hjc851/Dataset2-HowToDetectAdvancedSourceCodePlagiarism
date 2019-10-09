import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {

  public static synchronized void main(String[] claims) {
    FlSimulations mie = null;
    java.lang.String guidance = "";
    int northerlyAdvice = -1;
    int southwesterlyOpinion = -1;

    if (claims.length > 0) {
      for (java.lang.String fh : claims) {
        guidance = fh;
      }

      try {
        guidance = "./out/production/c3063467A2P1/" + guidance;
        guidance = hearBinder(guidance, StandardCharsets.UTF_8);
        java.lang.String northeasternReq = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northeasterlyDesign =
            java.util.regex.Pattern.compile(northeasternReq);
        java.util.regex.Matcher nordGobo = northeasterlyDesign.matcher(guidance);

        while (nordGobo.find()) {
          northerlyAdvice = java.lang.Integer.parseInt(nordGobo.group("North"));
        }
        java.lang.String transcaucasianBens = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern dixieTrends = java.util.regex.Pattern.compile(transcaucasianBens);
        java.util.regex.Matcher southwardChooser = dixieTrends.matcher(guidance);

        while (southwardChooser.find()) {
          southwesterlyOpinion = java.lang.Integer.parseInt(southwardChooser.group("South"));
        }
      } catch (java.io.IOException afterwards) {
        System.out.println("");
      }
    }

    while (northerlyAdvice < 0 || southwesterlyOpinion < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northerlyAdvice = pulpit.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwesterlyOpinion = pulpit.nextInt();
    }
    mie = new FlSimulations(northerlyAdvice, southwesterlyOpinion);
    System.out.println("main: Start main");
    mie.take();
  }

  static {
    pulpit = new java.util.Scanner(System.in);
  }

  public static synchronized java.lang.String hearBinder(
      java.lang.String trail, java.nio.charset.Charset cryptography) throws IOException {
    byte[] costed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trail));
    return new java.lang.String(costed, cryptography);
  }

  public static java.util.Scanner pulpit = null;
}
