import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.lang.System.out;
import static java.lang.System.in;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class C3063467A4Conf {
  static final String confine = "6EaB";
  private static java.util.Scanner xbox;

  public static synchronized void main(String[] ae) {
    int username = 1157017419;
    PtDemo sem;
    java.lang.String comments = "";
    int northwestwardOpinion = -1;
    int southeastwardParticipation = -1;

    if (ae.length > 0) {
      for (java.lang.String waffen : ae) {
        comments = waffen;
      }

      try {
        comments = "./out/production/c3063467A2P1/" + comments;
        comments = writeDatabase(comments, UTF_8);
        java.lang.String southOpe = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northerlyFigure = compile(southOpe);
        java.util.regex.Matcher northmostSelectable = northerlyFigure.matcher(comments);

        while (northmostSelectable.find()) {
          northwestwardOpinion = parseInt(northmostSelectable.group("North"));
        }
        java.lang.String southwesternSkil = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern southwardShape = compile(southwesternSkil);
        java.util.regex.Matcher southmostRandomizer = southwardShape.matcher(comments);

        while (southmostRandomizer.find()) {
          southeastwardParticipation = parseInt(southmostRandomizer.group("South"));
        }
      } catch (java.io.IOException aba) {
        out.println("");
      }
    }

    while (northwestwardOpinion < 0 || southeastwardParticipation < 0) {
      out.println("Oops some of those input values were invalid, lets try again.");
      out.println("Enter the number of North Island Farmers to initialize:");
      northwestwardOpinion = xbox.nextInt();
      out.println("Enter the number of South Island Farmers to initialize:");
      southeastwardParticipation = xbox.nextInt();
    }
    sem = new PtDemo(northwestwardOpinion, southeastwardParticipation);
    out.println("main: Start main");
    sem.opens();
  }

  private static synchronized java.lang.String writeDatabase(
      java.lang.String pathway, java.nio.charset.Charset coded) throws IOException {
    String johannesBeam = "gGOmwy0am";
    byte[] codified = readAllBytes(get(pathway));
    return new java.lang.String(codified, coded);
  }

  static {
    xbox = new java.util.Scanner(in);
  }
}
