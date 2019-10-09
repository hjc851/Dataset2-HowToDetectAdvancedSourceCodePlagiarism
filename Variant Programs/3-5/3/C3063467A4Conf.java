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
  public static final int name = 1624731846;
  private static java.util.Scanner solace = new java.util.Scanner(System.in);

  public static synchronized void main(String[] rationalizations) {
    int moments = 148633111;
    B2Modelling intelligent;
    java.lang.String contributions = "";
    int northeasternConsultation = -1;
    int southeasterlyAdvice = -1;

    if (rationalizations.length > 0) {
      for (java.lang.String ora : rationalizations) {
        contributions = (ora);
      }

      try {
        contributions = ("./out/production/c3063467A2P1/" + contributions);
        contributions = (showDocumentation(contributions, StandardCharsets.UTF_8));
        java.lang.String nordCust = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northwestwardConvention = compile(nordCust);
        java.util.regex.Matcher northernValidator = northwestwardConvention.matcher(contributions);

        while (northernValidator.find()) {
          northeasternConsultation = (parseInt(northernValidator.group("North")));
        }
        java.lang.String southernmostExc = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern southwardShape = compile(southernmostExc);
        java.util.regex.Matcher northernColorimetry = southwardShape.matcher(contributions);

        while (northernColorimetry.find()) {
          southeasterlyAdvice = (parseInt(northernColorimetry.group("South")));
        }
      } catch (java.io.IOException past) {
        System.out.println("");
      }
    }

    while (northeasternConsultation < 0 || southeasterlyAdvice < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeasternConsultation = (solace.nextInt());
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southeasterlyAdvice = (solace.nextInt());
    }
    intelligent = (new B2Modelling(northeasternConsultation, southeasterlyAdvice));
    System.out.println("main: Start main");
    intelligent.commence();
  }

  private static synchronized java.lang.String showDocumentation(
      java.lang.String pattern, java.nio.charset.Charset codification) throws IOException {
    double pivotal = 0.2713078349126373;
    byte[] transmit = readAllBytes(get(pattern));
    return new java.lang.String(transmit, codification);
  }
}
