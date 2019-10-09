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

  public static synchronized void main(String[] number) {
    FlSimulations shim;
    java.lang.String contributions;
    int northeastwardParticipation;
    int regionRepresentations;
    contributions = ("");
    northeastwardParticipation = (-1);
    regionRepresentations = (-1);

    if (number.length > 0) {
      for (java.lang.String ora : number) {
        contributions = (ora);
      }

      try {
        java.lang.String northernmostIndiv;
        java.util.regex.Pattern northeastwardTrend;
        java.util.regex.Matcher regionEpilator;
        java.lang.String sKnowl;
        java.util.regex.Pattern southwestwardPractice;
        java.util.regex.Matcher southwestwardFinder;
        contributions = ("./out/production/c3063467A2P1/" + contributions);
        contributions = (recordExecutable(contributions, StandardCharsets.UTF_8));
        northernmostIndiv = ("N=(?<North>[\\d]+)");
        northeastwardTrend = (java.util.regex.Pattern.compile(northernmostIndiv));
        regionEpilator = (northeastwardTrend.matcher(contributions));

        while (regionEpilator.find()) {
          northeastwardParticipation = (java.lang.Integer.parseInt(regionEpilator.group("North")));
        }
        sKnowl = ("S=(?<South>[\\d]+)");
        southwestwardPractice = (java.util.regex.Pattern.compile(sKnowl));
        southwestwardFinder = (southwestwardPractice.matcher(contributions));

        while (southwestwardFinder.find()) {
          regionRepresentations = (java.lang.Integer.parseInt(southwestwardFinder.group("South")));
        }
      } catch (java.io.IOException past) {
        System.out.println("");
      }
    }

    while (northeastwardParticipation < 0 || regionRepresentations < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northeastwardParticipation = (mainframe.nextInt());
      System.out.println("Enter the number of South Island Farmers to initialize:");
      regionRepresentations = (mainframe.nextInt());
    }
    shim = (new FlSimulations(northeastwardParticipation, regionRepresentations));
    System.out.println("main: Start main");
    shim.starts();
  }

  public static synchronized java.lang.String recordExecutable(
      java.lang.String trail, java.nio.charset.Charset coded) throws IOException {
    byte[] consolidated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trail));
    return new java.lang.String(consolidated, coded);
  }

  static {
    mainframe = (new java.util.Scanner(System.in));
  }
}
