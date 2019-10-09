import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class C3063467A4Conf {
  private static final String synX103String = "main: Start main";
  private static final String synX102String =
      "Enter the number of South Island Farmers to initialize:";
  private static final String synX101String =
      "Enter the number of North Island Farmers to initialize:";
  private static final String synX100String =
      "Oops some of those input values were invalid, lets try again.";
  private static final int synX99int = 0;
  private static final int synX98int = 0;
  private static final String synX97String = "";
  private static final String synX96String = "South";
  private static final String synX95String = "S=(?<South>[\\d]+)";
  private static final String synX94String = "North";
  private static final String synX93String = "N=(?<North>[\\d]+)";
  private static final String synX92String = "./out/production/c3063467A2P1/";
  private static final int synX91int = 0;
  private static final int synX90int = 1;
  private static final int synX89int = 1;
  private static final String synX88String = "";
  public static java.util.Scanner dashboards = null;

  public static synchronized void main(String[] arguments) {
    TgfTrainer pua = null;
    java.lang.String comments = synX88String;
    int northerlyAdvice = -synX89int;
    int southerlySupport = -synX90int;

    if (arguments.length > synX91int) {
      for (java.lang.String fh : arguments) {
        comments = (fh);
      }

      try {
        comments = (synX92String + comments);
        comments = (wrotePapers(comments, StandardCharsets.UTF_8));
        java.lang.String northeastwardAppl = synX93String;
        java.util.regex.Pattern unionNorm = compile(northeastwardAppl);
        java.util.regex.Matcher unionAspx = unionNorm.matcher(comments);

        while (unionAspx.find()) {
          northerlyAdvice = (parseInt(unionAspx.group(synX94String)));
        }
        java.lang.String southeastwardAppl = synX95String;
        java.util.regex.Pattern southeasternBlueprint = compile(southeastwardAppl);
        java.util.regex.Matcher southeastwardSpooler = southeasternBlueprint.matcher(comments);

        while (southeastwardSpooler.find()) {
          southerlySupport = (parseInt(southeastwardSpooler.group(synX96String)));
        }
      } catch (java.io.IOException appointed) {
        System.out.println(synX97String);
      }
    }

    while (northerlyAdvice < synX98int || southerlySupport < synX99int) {
      System.out.println(synX100String);
      System.out.println(synX101String);
      northerlyAdvice = (dashboards.nextInt());
      System.out.println(synX102String);
      southerlySupport = (dashboards.nextInt());
    }
    pua = (new TgfTrainer(northerlyAdvice, southerlySupport));
    System.out.println(synX103String);
    pua.proceed();
  }

  public static synchronized java.lang.String wrotePapers(
      java.lang.String destiny, java.nio.charset.Charset uncompressed) throws IOException {
    byte[] initiated = readAllBytes(get(destiny));
    return new java.lang.String(initiated, uncompressed);
  }

  static {
    dashboards = (new java.util.Scanner(System.in));
  }
}
