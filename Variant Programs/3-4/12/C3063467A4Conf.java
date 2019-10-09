import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {

  public static synchronized void main(String[] param) {
    HJoystick shen;
    java.lang.String feedback = "";
    int nordInvolvement = -1;
    int southboundResponse = -1;

    if (param.length > 0) {
      for (java.lang.String fh : param) {
        feedback = fh;
      }

      try {
        feedback = "./out/production/c3063467A2P1/" + feedback;
        feedback = understandCharge(feedback, StandardCharsets.UTF_8);
        java.lang.String nLic = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northwestRule = java.util.regex.Pattern.compile(nLic);
        java.util.regex.Matcher northerlyRecognizer = northwestRule.matcher(feedback);

        while (northerlyRecognizer.find()) {
          nordInvolvement = java.lang.Integer.parseInt(northerlyRecognizer.group("North"));
        }
        java.lang.String meridionalResp = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern southwestwardPractice =
            java.util.regex.Pattern.compile(meridionalResp);
        java.util.regex.Matcher southwesternKeyword = southwestwardPractice.matcher(feedback);

        while (southwesternKeyword.find()) {
          southboundResponse = java.lang.Integer.parseInt(southwesternKeyword.group("South"));
        }
      } catch (java.io.IOException admittedly) {
        System.out.println("");
      }
    }

    while (nordInvolvement < 0 || southboundResponse < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      nordInvolvement = hardware.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southboundResponse = hardware.nextInt();
    }
    shen = new HJoystick(nordInvolvement, southboundResponse);
    System.out.println("main: Start main");
    shen.commence();
  }

  public static java.util.Scanner hardware = new java.util.Scanner(System.in);

  public static synchronized java.lang.String understandCharge(
      java.lang.String lane, java.nio.charset.Charset encrypting) throws IOException {
    byte[] ciphered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(lane));
    return new java.lang.String(ciphered, encrypting);
  }
}
