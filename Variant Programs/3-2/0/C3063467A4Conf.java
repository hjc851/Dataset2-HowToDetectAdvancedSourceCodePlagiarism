import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static java.util.Scanner mainframe = new java.util.Scanner(System.in);

  public static void main(String[] ae) {
    P6Device shen;
    java.lang.String participation = "";
    int northwestwardOpinion = -1;
    int southwesterlyOpinion = -1;

    if (ae.length > 0) {
      for (java.lang.String ora : ae) {
        participation = ora;
      }

      try {
        participation = "./out/production/c3063467A2P1/" + participation;
        participation = quoteData(participation, StandardCharsets.UTF_8);
        java.lang.String northeastwardAppl = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northwesterlyPatten =
            java.util.regex.Pattern.compile(northeastwardAppl);
        java.util.regex.Matcher northwesterlySynchroniser =
            northwesterlyPatten.matcher(participation);

        while (northwesterlySynchroniser.find()) {
          northwestwardOpinion =
              java.lang.Integer.parseInt(northwesterlySynchroniser.group("North"));
        }
        java.lang.String northOpe = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern southernFormula = java.util.regex.Pattern.compile(northOpe);
        java.util.regex.Matcher southmostRandomizer = southernFormula.matcher(participation);

        while (southmostRandomizer.find()) {
          southwesterlyOpinion = java.lang.Integer.parseInt(southmostRandomizer.group("South"));
        }
      } catch (java.io.IOException exwife) {
        System.out.println("");
      }
    }

    while (northwestwardOpinion < 0 || southwesterlyOpinion < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwestwardOpinion = mainframe.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwesterlyOpinion = mainframe.nextInt();
    }
    shen = new P6Device(northwestwardOpinion, southwesterlyOpinion);
    System.out.println("main: Start main");
    shen.starting();
  }

  private static java.lang.String quoteData(java.lang.String track, java.nio.charset.Charset keying)
      throws IOException {
    byte[] costed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(track));
    return new java.lang.String(costed, keying);
  }
}
