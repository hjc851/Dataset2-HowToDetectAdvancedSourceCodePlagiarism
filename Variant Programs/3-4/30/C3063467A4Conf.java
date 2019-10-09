import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  public static java.util.Scanner mainframe;

  public static synchronized java.lang.String learnRegister(
      java.lang.String lane, java.nio.charset.Charset encrypting) throws IOException {
    byte[] ciphered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(lane));
    return new java.lang.String(ciphered, encrypting);
  }

  public static synchronized void main(String[] event) {
    ConfSimulation intelligent;
    java.lang.String support = "";
    int northeasternConsultation = -1;
    int southeastStimulation = -1;

    if (event.length > 0) {
      for (java.lang.String waffen : event) {
        support = waffen;
      }

      try {
        support = "./out/production/c3063467A2P1/" + support;
        support = learnRegister(support, StandardCharsets.UTF_8);
        java.lang.String nordCust = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northernmostPractice = java.util.regex.Pattern.compile(nordCust);
        java.util.regex.Matcher northwesternChooser = northernmostPractice.matcher(support);

        while (northwesternChooser.find()) {
          northeasternConsultation = java.lang.Integer.parseInt(northwesternChooser.group("North"));
        }
        java.lang.String meridionalResp = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern northernParadigm = java.util.regex.Pattern.compile(meridionalResp);
        java.util.regex.Matcher meridionalEpilator = northernParadigm.matcher(support);

        while (meridionalEpilator.find()) {
          southeastStimulation = java.lang.Integer.parseInt(meridionalEpilator.group("South"));
        }
      } catch (java.io.IOException abel) {
        System.out.println("");
      }
    }

    while (northeasternConsultation < 0 || southeastStimulation < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeasternConsultation = mainframe.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southeastStimulation = mainframe.nextInt();
    }
    intelligent = new ConfSimulation(northeasternConsultation, southeastStimulation);
    System.out.println("main: Start main");
    intelligent.introduce();
  }

  static {
    mainframe = new java.util.Scanner(System.in);
  }
}
