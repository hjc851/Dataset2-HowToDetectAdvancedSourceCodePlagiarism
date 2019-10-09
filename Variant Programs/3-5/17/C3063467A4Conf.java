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
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class C3063467A4Conf {
  private static final double synX359double = 0.8557828436916779;
  private static final String synX358String = "main: Start main";
  private static final String synX357String =
      "Enter the number of South Island Farmers to initialize:";
  private static final String synX356String =
      "Enter the number of North Island Farmers to initialize:";
  private static final String synX355String =
      "Oops some of those input values were invalid, lets try again.";
  private static final int synX354int = 0;
  private static final int synX353int = 0;
  private static final String synX352String = "";
  private static final String synX351String = "South";
  private static final String synX350String = "S=(?<South>[\\d]+)";
  private static final String synX349String = "North";
  private static final String synX348String = "N=(?<North>[\\d]+)";
  private static final String synX347String = "./out/production/c3063467A2P1/";
  private static final int synX346int = 0;
  private static final int synX345int = 1;
  private static final int synX344int = 1;
  private static final String synX343String = "";
  private static final int synX342int = 1100201927;
  private static java.util.Scanner arcade = new java.util.Scanner(in);
  public static double nickSpan = 0.3246452369709171;

  public static synchronized void main(String[] arguments) {
    int taiwaneseThickness;
    ConfSimulation favour;
    java.lang.String suggestions;
    int southParticipatory;
    int confederacyPerspective;
    taiwaneseThickness = (synX342int);
    favour = (null);
    suggestions = (synX343String);
    southParticipatory = (-synX344int);
    confederacyPerspective = (-synX345int);

    if (arguments.length > synX346int) {
      for (java.lang.String ora : arguments) {
        suggestions = (ora);
      }

      try {
        java.lang.String unionMgr;
        java.util.regex.Pattern northerTemplate;
        java.util.regex.Matcher northwesterlySynchroniser;
        java.lang.String southwestwardIndiv;
        java.util.regex.Pattern southwesternForm;
        java.util.regex.Matcher northBrite;
        suggestions = (synX347String + suggestions);
        suggestions = (wrotePapers(suggestions, UTF_8));
        unionMgr = (synX348String);
        northerTemplate = (compile(unionMgr));
        northwesterlySynchroniser = (northerTemplate.matcher(suggestions));

        while (northwesterlySynchroniser.find()) {
          southParticipatory = (parseInt(northwesterlySynchroniser.group(synX349String)));
        }
        southwestwardIndiv = (synX350String);
        southwesternForm = (compile(southwestwardIndiv));
        northBrite = (southwesternForm.matcher(suggestions));

        while (northBrite.find()) {
          confederacyPerspective = (parseInt(northBrite.group(synX351String)));
        }
      } catch (java.io.IOException con) {
        out.println(synX352String);
      }
    }

    while (southParticipatory < synX353int || confederacyPerspective < synX354int) {
      out.println(synX355String);
      out.println(synX356String);
      southParticipatory = (arcade.nextInt());
      out.println(synX357String);
      confederacyPerspective = (arcade.nextInt());
    }
    favour = (new ConfSimulation(southParticipatory, confederacyPerspective));
    out.println(synX358String);
    favour.come();
  }

  private static synchronized java.lang.String wrotePapers(
      java.lang.String approach, java.nio.charset.Charset decoding) throws IOException {
    double maximalLength;
    maximalLength = (synX359double);
    byte[] cryptographic = readAllBytes(get(approach));
    return new java.lang.String(cryptographic, decoding);
  }
}
