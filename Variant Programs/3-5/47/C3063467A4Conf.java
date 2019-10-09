import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  static {
    xbox = (new java.util.Scanner(System.in));
  }

  public static synchronized java.lang.String quoteData(
      java.lang.String progression, java.nio.charset.Charset cryptographic) throws IOException {
    byte[] formatted = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(progression));
    return new java.lang.String(formatted, cryptographic);
  }

  public static java.util.Scanner xbox;

  public static synchronized void main(String[] handles) {
    ConfSimulation mackay;
    java.lang.String output;
    int northernStimulant;
    int dixieInformation;
    output = ("");
    northernStimulant = (-1);
    dixieInformation = (-1);

    if (handles.length > 0) {
      for (java.lang.String ora : handles) {
        output = (ora);
      }

      try {
        java.lang.String northwestInteractive;
        java.util.regex.Pattern northeastwardTrend;
        java.util.regex.Matcher regionEpilator;
        java.lang.String australCust;
        java.util.regex.Pattern southwardShape;
        java.util.regex.Matcher southernValidator;
        output = ("./out/production/c3063467A2P1/" + output);
        output = (quoteData(output, StandardCharsets.UTF_8));
        northwestInteractive = ("N=(?<North>[\\d]+)");
        northeastwardTrend = (java.util.regex.Pattern.compile(northwestInteractive));
        regionEpilator = (northeastwardTrend.matcher(output));

        while (regionEpilator.find()) {
          northernStimulant = (java.lang.Integer.parseInt(regionEpilator.group("North")));
        }
        australCust = ("S=(?<South>[\\d]+)");
        southwardShape = (java.util.regex.Pattern.compile(australCust));
        southernValidator = (southwardShape.matcher(output));

        while (southernValidator.find()) {
          dixieInformation = (java.lang.Integer.parseInt(southernValidator.group("South")));
        }
      } catch (java.io.IOException tipp) {
        System.out.println("");
      }
    }

    while (northernStimulant < 0 || dixieInformation < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northernStimulant = (xbox.nextInt());
      System.out.println("Enter the number of South Island Farmers to initialize:");
      dixieInformation = (xbox.nextInt());
    }
    mackay = (new ConfSimulation(northernStimulant, dixieInformation));
    System.out.println("main: Start main");
    mackay.proceed();
  }
}
