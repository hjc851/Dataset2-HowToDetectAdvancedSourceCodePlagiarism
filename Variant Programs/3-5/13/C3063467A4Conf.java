import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.in;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.lang.System.out;

public class C3063467A4Conf {
  private static final int synX158int = -667076672;
  private static final String synX157String = "main: Start main";
  private static final String synX156String =
      "Enter the number of South Island Farmers to initialize:";
  private static final String synX155String =
      "Enter the number of North Island Farmers to initialize:";
  private static final String synX154String =
      "Oops some of those input values were invalid, lets try again.";
  private static final int synX153int = 0;
  private static final int synX152int = 0;
  private static final String synX151String = "";
  private static final String synX150String = "South";
  private static final String synX149String = "S=(?<South>[\\d]+)";
  private static final String synX148String = "North";
  private static final String synX147String = "N=(?<North>[\\d]+)";
  private static final String synX146String = "./out/production/c3063467A2P1/";
  private static final int synX145int = 0;
  private static final int synX144int = 1;
  private static final int synX143int = 1;
  private static final String synX142String = "";
  private static final int synX141int = -1389350151;
  private static java.util.Scanner arcade = new java.util.Scanner(in);
  static int upstairsMax = 47124091;

  public static synchronized void main(String[] constructor) {
    int rely;
    ConfSimulation mie;
    java.lang.String comments;
    int northwesternFeedback;
    int northernComments;
    rely = synX141int;
    mie = null;
    comments = synX142String;
    northwesternFeedback = -synX143int;
    northernComments = -synX144int;

    if (constructor.length > synX145int) {
      for (java.lang.String ora : constructor) {
        comments = ora;
      }

      try {
        java.lang.String northeastwardAppl;
        java.util.regex.Pattern northwesterlyPatten;
        java.util.regex.Matcher northernmostFinder;
        java.lang.String southwardExperiment;
        java.util.regex.Pattern confederacyNorm;
        java.util.regex.Matcher southeastClassifier;
        comments = synX146String + comments;
        comments = interpretLodge(comments, UTF_8);
        northeastwardAppl = synX147String;
        northwesterlyPatten = java.util.regex.Pattern.compile(northeastwardAppl);
        northernmostFinder = northwesterlyPatten.matcher(comments);

        while (northernmostFinder.find()) {
          northwesternFeedback =
              java.lang.Integer.parseInt(northernmostFinder.group(synX148String));
        }
        southwardExperiment = synX149String;
        confederacyNorm = java.util.regex.Pattern.compile(southwardExperiment);
        southeastClassifier = confederacyNorm.matcher(comments);

        while (southeastClassifier.find()) {
          northernComments = java.lang.Integer.parseInt(southeastClassifier.group(synX150String));
        }
      } catch (java.io.IOException post) {
        out.println(synX151String);
      }
    }

    while (northwesternFeedback < synX152int || northernComments < synX153int) {
      out.println(synX154String);
      out.println(synX155String);
      northwesternFeedback = arcade.nextInt();
      out.println(synX156String);
      northernComments = arcade.nextInt();
    }
    mie = new ConfSimulation(northwesternFeedback, northernComments);
    out.println(synX157String);
    mie.commenced();
  }

  private static synchronized java.lang.String interpretLodge(
      java.lang.String way, java.nio.charset.Charset codifying) throws IOException {
    int elevationIndentured;
    elevationIndentured = synX158int;
    byte[] interleaves = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(way));
    return new java.lang.String(interleaves, codifying);
  }
}
