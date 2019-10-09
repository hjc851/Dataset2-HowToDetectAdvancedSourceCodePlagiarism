import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static java.util.Scanner dashboard = null;

  public static synchronized void main(String[] ae) {
    MMockup sem = null;
    java.lang.String stimulation = "";
    int northwestStimulus = -1;
    int southwesterlyOpinion = -1;

    if (ae.length > 0) {
      for (java.lang.String fh : ae) {
        stimulation = fh;
      }

      try {
        stimulation = "./out/production/c3063467A2P1/" + stimulation;
        stimulation = writeDatabase(stimulation, StandardCharsets.UTF_8);
        java.lang.String northeastwardAppl = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northerlyFigure =
            java.util.regex.Pattern.compile(northeastwardAppl);
        java.util.regex.Matcher northwardsKeyword = northerlyFigure.matcher(stimulation);

        while (northwardsKeyword.find()) {
          northwestStimulus = java.lang.Integer.parseInt(northwardsKeyword.group("North"));
        }
        java.lang.String southlandEmp = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern transcaucasianMethod =
            java.util.regex.Pattern.compile(southlandEmp);
        java.util.regex.Matcher southeasterlyRecognizer = transcaucasianMethod.matcher(stimulation);

        while (southeasterlyRecognizer.find()) {
          southwesterlyOpinion = java.lang.Integer.parseInt(southeasterlyRecognizer.group("South"));
        }
      } catch (java.io.IOException afterwards) {
        System.out.println("");
      }
    }

    while (northwestStimulus < 0 || southwesterlyOpinion < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwestStimulus = dashboard.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwesterlyOpinion = dashboard.nextInt();
    }
    sem = new MMockup(northwestStimulus, southwesterlyOpinion);
    System.out.println("main: Start main");
    sem.commencement();
  }

  private static synchronized java.lang.String writeDatabase(
      java.lang.String pathway, java.nio.charset.Charset cipher) throws IOException {
    byte[] encrypts = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(pathway));
    return new java.lang.String(encrypts, cipher);
  }

  static {
    dashboard = new java.util.Scanner(System.in);
  }
}
