import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  public static java.util.Scanner xbox = new java.util.Scanner(System.in);

  public static synchronized void main(String[] variable) {
    HJoystick nokia;
    java.lang.String opinions;
    int septentrionAssistance;
    int southwesterlyOpinion;
    nokia = null;
    opinions = "";
    septentrionAssistance = -1;
    southwesterlyOpinion = -1;

    if (variable.length > 0) {
      for (java.lang.String fh : variable) {
        opinions = fh;
      }

      try {
        java.lang.String northwesterlyPurch;
        java.util.regex.Pattern northwardNormal;
        java.util.regex.Matcher northwestwardVerifier;
        java.lang.String southwardExperiment;
        java.util.regex.Pattern southwesterlyConvention;
        java.util.regex.Matcher southwestVariable;
        opinions = "./out/production/c3063467A2P1/" + opinions;
        opinions = readerInitiate(opinions, StandardCharsets.UTF_8);
        northwesterlyPurch = "N=(?<North>[\\d]+)";
        northwardNormal = java.util.regex.Pattern.compile(northwesterlyPurch);
        northwestwardVerifier = northwardNormal.matcher(opinions);

        while (northwestwardVerifier.find()) {
          septentrionAssistance = java.lang.Integer.parseInt(northwestwardVerifier.group("North"));
        }
        southwardExperiment = "S=(?<South>[\\d]+)";
        southwesterlyConvention = java.util.regex.Pattern.compile(southwardExperiment);
        southwestVariable = southwesterlyConvention.matcher(opinions);

        while (southwestVariable.find()) {
          southwesterlyOpinion = java.lang.Integer.parseInt(southwestVariable.group("South"));
        }
      } catch (java.io.IOException appointed) {
        System.out.println("");
      }
    }

    while (septentrionAssistance < 0 || southwesterlyOpinion < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      septentrionAssistance = xbox.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwesterlyOpinion = xbox.nextInt();
    }
    nokia = new HJoystick(septentrionAssistance, southwesterlyOpinion);
    System.out.println("main: Start main");
    nokia.commencing();
  }

  public static synchronized java.lang.String readerInitiate(
      java.lang.String routes, java.nio.charset.Charset crypto) throws IOException {
    byte[] interlaced = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(routes));
    return new java.lang.String(interlaced, crypto);
  }
}
