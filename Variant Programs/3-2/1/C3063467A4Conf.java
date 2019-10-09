import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner xbox = new Scanner(System.in);

  public static void main(String[] use) {
    PlRobot favour;
    String information = "";
    int southParticipatory = -1;
    int southerlySupport = -1;

    if (use.length > 0) {
      for (String waffen : use) {
        information = waffen;
      }

      try {
        information = "./out/production/c3063467A2P1/" + information;
        information = hearBinder(information, StandardCharsets.UTF_8);
        String northerSvc = "N=(?<North>[\\d]+)";
        Pattern nordCharacteristics = Pattern.compile(northerSvc);
        Matcher northernValidator = nordCharacteristics.matcher(information);

        while (northernValidator.find()) {
          southParticipatory = Integer.parseInt(northernValidator.group("North"));
        }
        String southwardExperiment = "S=(?<South>[\\d]+)";
        Pattern southmostTriangle = Pattern.compile(southwardExperiment);
        Matcher regionCreaser = southmostTriangle.matcher(information);

        while (regionCreaser.find()) {
          southerlySupport = Integer.parseInt(regionCreaser.group("South"));
        }
      } catch (IOException abe) {
        System.out.println("");
      }
    }

    while (southParticipatory < 0 || southerlySupport < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      southParticipatory = xbox.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southerlySupport = xbox.nextInt();
    }
    favour = new PlRobot(southParticipatory, southerlySupport);
    System.out.println("main: Start main");
    favour.commence();
  }

  private static String hearBinder(String pathways, Charset keying) throws IOException {
    byte[] encrypted = Files.readAllBytes(Paths.get(pathways));
    return new String(encrypted, keying);
  }
}
