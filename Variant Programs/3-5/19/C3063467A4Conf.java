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
  private static final double synX474double = 0.11534043817753448;
  private static final String synX473String = "main: Start main";
  private static final String synX472String =
      "Enter the number of South Island Farmers to initialize:";
  private static final String synX471String =
      "Enter the number of North Island Farmers to initialize:";
  private static final String synX470String =
      "Oops some of those input values were invalid, lets try again.";
  private static final int synX469int = 0;
  private static final int synX468int = 0;
  private static final String synX467String = "";
  private static final String synX466String = "South";
  private static final String synX465String = "S=(?<South>[\\d]+)";
  private static final String synX464String = "North";
  private static final String synX463String = "N=(?<North>[\\d]+)";
  private static final String synX462String = "./out/production/c3063467A2P1/";
  private static final int synX461int = 0;
  private static final int synX460int = 1;
  private static final int synX459int = 1;
  private static final String synX458String = "";
  private static final int synX457int = 758304440;
  public static Scanner cantilever = null;
  public static double epithet = 0.8039288378648003;

  public static synchronized void main(String[] handles) {
    int chthonianThreshold;
    CFaker sem;
    String opinions;
    int northwesternFeedback;
    int southeastwardParticipation;
    chthonianThreshold = (synX457int);
    sem = (null);
    opinions = (synX458String);
    northwesternFeedback = (-synX459int);
    southeastwardParticipation = (-synX460int);

    if (handles.length > synX461int) {
      for (String ora : handles) {
        opinions = (ora);
      }

      try {
        String northwestwardPkg;
        Pattern northwestwardConvention;
        Matcher northboundSinusoid;
        String southmostLic;
        Pattern southwestRule;
        Matcher southernValidator;
        opinions = (synX462String + opinions);
        opinions = (tellReadme(opinions, UTF_8));
        northwestwardPkg = (synX463String);
        northwestwardConvention = (compile(northwestwardPkg));
        northboundSinusoid = (northwestwardConvention.matcher(opinions));

        while (northboundSinusoid.find()) {
          northwesternFeedback = (parseInt(northboundSinusoid.group(synX464String)));
        }
        southmostLic = (synX465String);
        southwestRule = (compile(southmostLic));
        southernValidator = (southwestRule.matcher(opinions));

        while (southernValidator.find()) {
          southeastwardParticipation = (parseInt(southernValidator.group(synX466String)));
        }
      } catch (IOException adoptee) {
        out.println(synX467String);
      }
    }

    while (northwesternFeedback < synX468int || southeastwardParticipation < synX469int) {
      out.println(synX470String);
      out.println(synX471String);
      northwesternFeedback = (cantilever.nextInt());
      out.println(synX472String);
      southeastwardParticipation = (cantilever.nextInt());
    }
    sem = (new CFaker(northwesternFeedback, southeastwardParticipation));
    out.println(synX473String);
    sem.opens();
  }

  public static synchronized String tellReadme(String approach, Charset encoders)
      throws IOException {
    double higherLimit;
    higherLimit = (synX474double);
    byte[] demodulated = readAllBytes(get(approach));
    return new String(demodulated, encoders);
  }

  static {
    cantilever = (new Scanner(in));
  }
}
