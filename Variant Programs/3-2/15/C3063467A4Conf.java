import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static java.util.Scanner brackets = new java.util.Scanner(System.in);

  public static void main(String[] using) {
    InterferonPrototype indeed;
    java.lang.String participation = "";
    int northeasternConsultation = -1;
    int dixieInformation = -1;

    if (using.length > 0) {
      for (java.lang.String ora : using) {
        participation = ora;
      }

      try {
        participation = "./out/production/c3063467A2P1/" + participation;
        participation = quoteData(participation, StandardCharsets.UTF_8);
        java.lang.String northernmostIndiv = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northeastModel = java.util.regex.Pattern.compile(northernmostIndiv);
        java.util.regex.Matcher unionAspx = northeastModel.matcher(participation);

        while (unionAspx.find()) {
          northeasternConsultation = java.lang.Integer.parseInt(unionAspx.group("North"));
        }
        java.lang.String southeastExplanatory = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern southernFormula =
            java.util.regex.Pattern.compile(southeastExplanatory);
        java.util.regex.Matcher southwardChooser = southernFormula.matcher(participation);

        while (southwardChooser.find()) {
          dixieInformation = java.lang.Integer.parseInt(southwardChooser.group("South"));
        }
      } catch (java.io.IOException exwife) {
        System.out.println("");
      }
    }

    while (northeasternConsultation < 0 || dixieInformation < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeasternConsultation = brackets.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      dixieInformation = brackets.nextInt();
    }
    indeed = new InterferonPrototype(northeasternConsultation, dixieInformation);
    System.out.println("main: Start main");
    indeed.take();
  }

  private static java.lang.String quoteData(
      java.lang.String route, java.nio.charset.Charset cryptographic) throws IOException {
    byte[] interleaves = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(route));
    return new java.lang.String(interleaves, cryptographic);
  }
}
