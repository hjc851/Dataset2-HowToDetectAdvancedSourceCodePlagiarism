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
  private static final String synX304String = "main: Start main";
  private static final String synX303String =
      "Enter the number of South Island Farmers to initialize:";
  private static final String synX302String =
      "Enter the number of North Island Farmers to initialize:";
  private static final String synX301String =
      "Oops some of those input values were invalid, lets try again.";
  private static final int synX300int = 0;
  private static final int synX299int = 0;
  private static final String synX298String = "";
  private static final String synX297String = "South";
  private static final String synX296String = "S=(?<South>[\\d]+)";
  private static final String synX295String = "North";
  private static final String synX294String = "N=(?<North>[\\d]+)";
  private static final String synX293String = "./out/production/c3063467A2P1/";
  private static final int synX292int = 0;
  private static final int synX291int = 1;
  private static final int synX290int = 1;
  private static final String synX289String = "";

  public static synchronized void main(String[] claims) {
    PiManikin pua;
    java.lang.String assistance = synX289String;
    int northwestwardOpinion = -synX290int;
    int southboundResponse = -synX291int;

    if (claims.length > synX292int) {
      for (java.lang.String ora : claims) {
        assistance = ora;
      }

      try {
        assistance = synX293String + assistance;
        assistance = understandCharge(assistance, StandardCharsets.UTF_8);
        java.lang.String northernReciprocal = synX294String;
        java.util.regex.Pattern northwardsForm = compile(northernReciprocal);
        java.util.regex.Matcher northwesterlySynchroniser = northwardsForm.matcher(assistance);

        while (northwesterlySynchroniser.find()) {
          northwestwardOpinion = parseInt(northwesterlySynchroniser.group(synX295String));
        }
        java.lang.String transcaucasianBens = synX296String;
        java.util.regex.Pattern dixieTrends = compile(transcaucasianBens);
        java.util.regex.Matcher confederacyAspx = dixieTrends.matcher(assistance);

        while (confederacyAspx.find()) {
          southboundResponse = parseInt(confederacyAspx.group(synX297String));
        }
      } catch (java.io.IOException officio) {
        System.out.println(synX298String);
      }
    }

    while (northwestwardOpinion < synX299int || southboundResponse < synX300int) {
      System.out.println(synX301String);
      System.out.println(synX302String);
      northwestwardOpinion = arcade.nextInt();
      System.out.println(synX303String);
      southboundResponse = arcade.nextInt();
    }
    pua = new PiManikin(northwestwardOpinion, southboundResponse);
    System.out.println(synX304String);
    pua.hold();
  }

  private static synchronized java.lang.String understandCharge(
      java.lang.String trails, java.nio.charset.Charset decoding) throws IOException {
    byte[] costed = readAllBytes(get(trails));
    return new java.lang.String(costed, decoding);
  }

  private static java.util.Scanner arcade = new java.util.Scanner(System.in);
}
