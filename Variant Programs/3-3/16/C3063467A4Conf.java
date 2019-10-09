import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {

  public static synchronized void main(String[] constructor) {
    MMockup shim = null;
    java.lang.String component = "";
    int northwestwardOpinion = -1;
    int northParticipatory = -1;

    if (constructor.length > 0) {
      for (java.lang.String waffen : constructor) {
        component = waffen;
      }

      try {
        component = "./out/production/c3063467A2P1/" + component;
        component = recordExecutable(component, StandardCharsets.UTF_8);
        java.lang.String northboundEmp = "N=(?<North>[\\d]+)";
        java.util.regex.Pattern northwestwardConvention =
            java.util.regex.Pattern.compile(northboundEmp);
        java.util.regex.Matcher nordGobo = northwestwardConvention.matcher(component);

        while (nordGobo.find()) {
          northwestwardOpinion = java.lang.Integer.parseInt(nordGobo.group("North"));
        }
        java.lang.String sKnowl = "S=(?<South>[\\d]+)";
        java.util.regex.Pattern southlandMotif = java.util.regex.Pattern.compile(sKnowl);
        java.util.regex.Matcher southwestVariable = southlandMotif.matcher(component);

        while (southwestVariable.find()) {
          northParticipatory = java.lang.Integer.parseInt(southwestVariable.group("South"));
        }
      } catch (java.io.IOException adult) {
        System.out.println("");
      }
    }

    while (northwestwardOpinion < 0 || northParticipatory < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwestwardOpinion = desk.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      northParticipatory = desk.nextInt();
    }
    shim = new MMockup(northwestwardOpinion, northParticipatory);
    System.out.println("main: Start main");
    shim.opens();
  }

  static {
    desk = new java.util.Scanner(System.in);
  }

  private static java.util.Scanner desk = null;

  private static synchronized java.lang.String recordExecutable(
      java.lang.String roadway, java.nio.charset.Charset code) throws IOException {
    byte[] transmit = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(roadway));
    return new java.lang.String(transmit, code);
  }
}
