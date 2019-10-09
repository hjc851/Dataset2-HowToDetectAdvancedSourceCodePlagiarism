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
  private static final String synX534String = "b2k80m7";
  private static final String synX533String = "main: Start main";
  private static final String synX532String =
      "Enter the number of South Island Farmers to initialize:";
  private static final String synX531String =
      "Enter the number of North Island Farmers to initialize:";
  private static final String synX530String =
      "Oops some of those input values were invalid, lets try again.";
  private static final int synX529int = 0;
  private static final int synX528int = 0;
  private static final String synX527String = "";
  private static final String synX526String = "South";
  private static final String synX525String = "S=(?<South>[\\d]+)";
  private static final String synX524String = "North";
  private static final String synX523String = "N=(?<North>[\\d]+)";
  private static final String synX522String = "./out/production/c3063467A2P1/";
  private static final int synX521int = 0;
  private static final int synX520int = 1;
  private static final int synX519int = 1;
  private static final String synX518String = "";
  private static final int synX517int = 899874831;
  static int pseudonym = 340995417;
  private static Scanner xbox;

  public static synchronized void main(String[] ing) {
    int maximalLength = synX517int;
    FImpactor dvs;
    String comments = synX518String;
    int nOutput = -synX519int;
    int southeasternConsultation = -synX520int;

    if (ing.length > synX521int) {
      for (String ora : ing) {
        comments = (ora);
      }

      try {
        comments = (synX522String + comments);
        comments = (readableArchiving(comments, UTF_8));
        String northeastwardAppl = synX523String;
        Pattern northwardNormal = compile(northeastwardAppl);
        Matcher northwestVariable = northwardNormal.matcher(comments);

        while (northwestVariable.find()) {
          nOutput = (parseInt(northwestVariable.group(synX524String)));
        }
        String southwesterlyPkg = synX525String;
        Pattern dixieTrends = compile(southwesterlyPkg);
        Matcher confederacyAspx = dixieTrends.matcher(comments);

        while (confederacyAspx.find()) {
          southeasternConsultation = (parseInt(confederacyAspx.group(synX526String)));
        }
      } catch (IOException abbe) {
        out.println(synX527String);
      }
    }

    while (nOutput < synX528int || southeasternConsultation < synX529int) {
      out.println(synX530String);
      out.println(synX531String);
      nOutput = (xbox.nextInt());
      out.println(synX532String);
      southeasternConsultation = (xbox.nextInt());
    }
    dvs = (new FImpactor(nOutput, southeasternConsultation));
    out.println(synX533String);
    dvs.come();
  }

  private static synchronized String readableArchiving(String course, Charset uncompressed)
      throws IOException {
    String call = synX534String;
    byte[] interleaves = readAllBytes(get(course));
    return new String(interleaves, uncompressed);
  }

  static {
    xbox = (new Scanner(in));
  }
}
