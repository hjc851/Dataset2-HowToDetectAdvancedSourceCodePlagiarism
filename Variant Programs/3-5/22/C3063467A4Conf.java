import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;

public class C3063467A4Conf {
  private static final String synX587String = "main: Start main";
  private static final String synX586String =
      "Enter the number of South Island Farmers to initialize:";
  private static final String synX585String =
      "Enter the number of North Island Farmers to initialize:";
  private static final String synX584String =
      "Oops some of those input values were invalid, lets try again.";
  private static final int synX583int = 0;
  private static final int synX582int = 0;
  private static final String synX581String = "";
  private static final String synX580String = "South";
  private static final String synX579String = "S=(?<South>[\\d]+)";
  private static final String synX578String = "North";
  private static final String synX577String = "N=(?<North>[\\d]+)";
  private static final String synX576String = "./out/production/c3063467A2P1/";
  private static final int synX575int = 0;
  private static final int synX574int = 1;
  private static final int synX573int = 1;
  private static final String synX572String = "";
  private static final String synX571String = "fM7acDeslVHO9c";
  private static final String synX570String = "wUkRntWsgg4jJUX1PT";
  private static java.util.Scanner soothe = new java.util.Scanner(System.in);

  private static synchronized java.lang.String quoteData(
      java.lang.String destiny, java.nio.charset.Charset cryptography) throws IOException {
    String enchained = synX570String;
    byte[] interlaced = readAllBytes(get(destiny));
    return new java.lang.String(interlaced, cryptography);
  }

  static double beacon = 0.8087229568216932;

  public static synchronized void main(String[] param) {
    String flag = synX571String;
    P6Device indeed = null;
    java.lang.String submissions = synX572String;
    int uptownComponent = -synX573int;
    int southwestwardSubmissions = -synX574int;

    if (param.length > synX575int) {
      for (java.lang.String waffen : param) {
        submissions = (waffen);
      }

      try {
        submissions = (synX576String + submissions);
        submissions = (quoteData(submissions, StandardCharsets.UTF_8));
        java.lang.String northernmostIndiv = synX577String;
        java.util.regex.Pattern southChart = compile(northernmostIndiv);
        java.util.regex.Matcher northboundSinusoid = southChart.matcher(submissions);

        while (northboundSinusoid.find()) {
          uptownComponent = (parseInt(northboundSinusoid.group(synX578String)));
        }
        java.lang.String southernmostExc = synX579String;
        java.util.regex.Pattern southeasternBlueprint = compile(southernmostExc);
        java.util.regex.Matcher southlandSinusoid = southeasternBlueprint.matcher(submissions);

        while (southlandSinusoid.find()) {
          southwestwardSubmissions = (parseInt(southlandSinusoid.group(synX580String)));
        }
      } catch (java.io.IOException abe) {
        System.out.println(synX581String);
      }
    }

    while (uptownComponent < synX582int || southwestwardSubmissions < synX583int) {
      System.out.println(synX584String);
      System.out.println(synX585String);
      uptownComponent = (soothe.nextInt());
      System.out.println(synX586String);
      southwestwardSubmissions = (soothe.nextInt());
    }
    indeed = (new P6Device(uptownComponent, southwestwardSubmissions));
    System.out.println(synX587String);
    indeed.opens();
  }
}
