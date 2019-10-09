import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  public static java.util.Scanner hardware = new java.util.Scanner(System.in);

  public static synchronized void main(String[] vent) {
    P4Mock cis = null;
    java.lang.String information = "";
    int northwestwardOpinion = -1;
    int southwestStimulus = -1;

    if (vent.length > 0) {
      for (java.lang.String waffen : vent) {
        information = (waffen);
      }

      try {
        information = ("./out/production/c3063467A2P1/" + information);
        information = (wrotePapers(information, StandardCharsets.UTF_8));
        java.lang.String southOpe = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern nTriangle = java.util.regex.Pattern.compile(southOpe);
        java.util.regex.Matcher southBrite = nTriangle.matcher(information);

        while (southBrite.find()) {
          northwestwardOpinion = (java.lang.Integer.parseInt(southBrite.group("North")));
        }
        java.lang.String australCust = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern northChart = java.util.regex.Pattern.compile(australCust);
        java.util.regex.Matcher southlandSinusoid = northChart.matcher(information);

        while (southlandSinusoid.find()) {
          southwestStimulus = (java.lang.Integer.parseInt(southlandSinusoid.group("South")));
        }
      } catch (java.io.IOException adrian) {
        System.out.println("");
      }
    }

    while (northwestwardOpinion < 0 || southwestStimulus < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwestwardOpinion = (hardware.nextInt());
      System.out.println("Enter the number of South Island Farmers to initialize:");
      southwestStimulus = (hardware.nextInt());
    }
    cis = (new P4Mock(northwestwardOpinion, southwestStimulus));
    System.out.println("main: Start main");
    cis.take();
  }

  public static synchronized java.lang.String wrotePapers(
      java.lang.String course, java.nio.charset.Charset metadata) throws IOException {
    byte[] encrypts = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(course));
    return new java.lang.String(encrypts, metadata);
  }
}
