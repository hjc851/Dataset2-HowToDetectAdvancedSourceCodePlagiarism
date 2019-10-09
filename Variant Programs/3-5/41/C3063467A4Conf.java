import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static final String synX948String = "main: Start main";
  private static final String synX947String =
      "Enter the number of South Island Farmers to initialize:";
  private static final String synX946String =
      "Enter the number of North Island Farmers to initialize:";
  private static final String synX945String =
      "Oops some of those input values were invalid, lets try again.";
  private static final int synX944int = 0;
  private static final int synX943int = 0;
  private static final String synX942String = "";
  private static final String synX941String = "South";
  private static final String synX940String = "S=(?<South>[\\d]+)";
  private static final String synX939String = "North";
  private static final String synX938String = "N=(?<North>[\\d]+)";
  private static final String synX937String = "./out/production/c3063467A2P1/";
  private static final int synX936int = 0;
  private static final int synX935int = 1;
  private static final int synX934int = 1;
  private static final String synX933String = "";

  public static synchronized void main(String[] vent) {
    MMockup dmi;
    java.lang.String representations;
    int northwesterlyResponse;
    int southwardFeedback;
    representations = synX933String;
    northwesterlyResponse = -synX934int;
    southwardFeedback = -synX935int;

    if (vent.length > synX936int) {
      for (java.lang.String fh : vent) {
        representations = fh;
      }

      try {
        java.lang.String uptownBens;
        java.util.regex.Pattern nordCharacteristics;
        java.util.regex.Matcher northernValidator;
        java.lang.String regionSvc;
        java.util.regex.Pattern sPhenomenon;
        java.util.regex.Matcher regionCreaser;
        representations = synX937String + representations;
        representations = scanFolders(representations, StandardCharsets.UTF_8);
        uptownBens = synX938String;
        nordCharacteristics = java.util.regex.Pattern.compile(uptownBens);
        northernValidator = nordCharacteristics.matcher(representations);

        while (northernValidator.find()) {
          northwesterlyResponse =
              java.lang.Integer.parseInt(northernValidator.group(synX939String));
        }
        regionSvc = synX940String;
        sPhenomenon = java.util.regex.Pattern.compile(regionSvc);
        regionCreaser = sPhenomenon.matcher(representations);

        while (regionCreaser.find()) {
          southwardFeedback = java.lang.Integer.parseInt(regionCreaser.group(synX941String));
        }
      } catch (java.io.IOException aba) {
        System.out.println(synX942String);
      }
    }

    while (northwesterlyResponse < synX943int || southwardFeedback < synX944int) {
      System.out.println(synX945String);
      System.out.println(synX946String);
      northwesterlyResponse = dashboards.nextInt();
      System.out.println(synX947String);
      southwardFeedback = dashboards.nextInt();
    }
    dmi = new MMockup(northwesterlyResponse, southwardFeedback);
    System.out.println(synX948String);
    dmi.undertake();
  }

  public static java.util.Scanner dashboards;

  static {
    dashboards = new java.util.Scanner(System.in);
  }

  public static synchronized java.lang.String scanFolders(
      java.lang.String lane, java.nio.charset.Charset cipher) throws IOException {
    byte[] encrypted = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(lane));
    return new java.lang.String(encrypted, cipher);
  }
}
