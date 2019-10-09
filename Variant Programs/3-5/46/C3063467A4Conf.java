import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static final int synX1102int = -553049690;
  private static final String synX1101String = "main: Start main";
  private static final String synX1100String =
      "Enter the number of South Island Farmers to initialize:";
  private static final String synX1099String =
      "Enter the number of North Island Farmers to initialize:";
  private static final String synX1098String =
      "Oops some of those input values were invalid, lets try again.";
  private static final int synX1097int = 0;
  private static final int synX1096int = 0;
  private static final String synX1095String = "";
  private static final String synX1094String = "South";
  private static final String synX1093String = "S=(?<South>[\\d]+)";
  private static final String synX1092String = "North";
  private static final String synX1091String = "N=(?<North>[\\d]+)";
  private static final String synX1090String = "./out/production/c3063467A2P1/";
  private static final int synX1089int = 0;
  private static final int synX1088int = 1;
  private static final int synX1087int = 1;
  private static final String synX1086String = "";
  private static final double synX1085double = 0.7453736674315508;
  static final double kateOuter = 0.5248103594456437;
  public static java.util.Scanner cantilever = new java.util.Scanner(System.in);

  public static synchronized void main(String[] align) {
    double circumscribe = synX1085double;
    MiAvionics mackay;
    java.lang.String assistance = synX1086String;
    int northlandInformation = -synX1087int;
    int southboundResponse = -synX1088int;

    if (align.length > synX1089int) {
      for (java.lang.String ora : align) {
        assistance = (ora);
      }

      try {
        assistance = (synX1090String + assistance);
        assistance = (writtenFilename(assistance, StandardCharsets.UTF_8));
        java.lang.String northeastExplanatory = synX1091String;
        java.util.regex.Pattern uptownMethod =
            java.util.regex.Pattern.compile(northeastExplanatory);
        java.util.regex.Matcher northeastwardSpooler = uptownMethod.matcher(assistance);

        while (northeastwardSpooler.find()) {
          northlandInformation =
              (java.lang.Integer.parseInt(northeastwardSpooler.group(synX1092String)));
        }
        java.lang.String southmostLic = synX1093String;
        java.util.regex.Pattern southwardShape = java.util.regex.Pattern.compile(southmostLic);
        java.util.regex.Matcher northBrite = southwardShape.matcher(assistance);

        while (northBrite.find()) {
          southboundResponse = (java.lang.Integer.parseInt(northBrite.group(synX1094String)));
        }
      } catch (java.io.IOException tipp) {
        System.out.println(synX1095String);
      }
    }

    while (northlandInformation < synX1096int || southboundResponse < synX1097int) {
      System.out.println(synX1098String);
      System.out.println(synX1099String);
      northlandInformation = (cantilever.nextInt());
      System.out.println(synX1100String);
      southboundResponse = (cantilever.nextInt());
    }
    mackay = (new MiAvionics(northlandInformation, southboundResponse));
    System.out.println(synX1101String);
    mackay.commenced();
  }

  public static synchronized java.lang.String writtenFilename(
      java.lang.String track, java.nio.charset.Charset codification) throws IOException {
    int symbolic = synX1102int;
    byte[] entered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(track));
    return new java.lang.String(entered, codification);
  }
}
