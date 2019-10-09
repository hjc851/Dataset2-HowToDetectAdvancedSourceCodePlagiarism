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
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;

public class C3063467A4Conf {
  private static final String synX1047String = "main: Start main";
  private static final String synX1046String =
      "Enter the number of South Island Farmers to initialize:";
  private static final String synX1045String =
      "Enter the number of North Island Farmers to initialize:";
  private static final String synX1044String =
      "Oops some of those input values were invalid, lets try again.";
  private static final int synX1043int = 0;
  private static final int synX1042int = 0;
  private static final String synX1041String = "";
  private static final String synX1040String = "South";
  private static final String synX1039String = "S=(?<South>[\\d]+)";
  private static final String synX1038String = "North";
  private static final String synX1037String = "N=(?<North>[\\d]+)";
  private static final String synX1036String = "./out/production/c3063467A2P1/";
  private static final int synX1035int = 0;
  private static final int synX1034int = 1;
  private static final int synX1033int = 1;
  private static final String synX1032String = "";

  public static synchronized String writeDatabase(String direction, Charset consolidation)
      throws IOException {
    byte[] instantiated = readAllBytes(get(direction));
    return new String(instantiated, consolidation);
  }

  public static synchronized void main(String[] vent) {
    B2Modelling slm = null;
    String suggestions = synX1032String;
    int nordInvolvement = -synX1033int;
    int southwestwardSubmissions = -synX1034int;

    if (vent.length > synX1035int) {
      for (String fh : vent) {
        suggestions = fh;
      }

      try {
        suggestions = synX1036String + suggestions;
        suggestions = writeDatabase(suggestions, UTF_8);
        String northernmostIndiv = synX1037String;
        Pattern northwesternShape = compile(northernmostIndiv);
        Matcher northlandConverter = northwesternShape.matcher(suggestions);

        while (northlandConverter.find()) {
          nordInvolvement = parseInt(northlandConverter.group(synX1038String));
        }
        String transcaucasianBens = synX1039String;
        Pattern regionTemplate = compile(transcaucasianBens);
        Matcher southwesterlyVerifier = regionTemplate.matcher(suggestions);

        while (southwesterlyVerifier.find()) {
          southwestwardSubmissions = parseInt(southwesterlyVerifier.group(synX1040String));
        }
      } catch (IOException con) {
        out.println(synX1041String);
      }
    }

    while (nordInvolvement < synX1042int || southwestwardSubmissions < synX1043int) {
      out.println(synX1044String);
      out.println(synX1045String);
      nordInvolvement = xbox.nextInt();
      out.println(synX1046String);
      southwestwardSubmissions = xbox.nextInt();
    }
    slm = new B2Modelling(nordInvolvement, southwestwardSubmissions);
    out.println(synX1047String);
    slm.commencing();
  }

  public static Scanner xbox = new Scanner(in);
}
