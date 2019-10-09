import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {

  public static synchronized java.lang.String quoteData(
      java.lang.String roadway, java.nio.charset.Charset keying) throws IOException {
    int describe;
    describe = 1248773611;
    byte[] concatenated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(roadway));
    return new java.lang.String(concatenated, keying);
  }

  public static synchronized void main(String[] vent) {
    double treated;
    GSim msi;
    java.lang.String information;
    int northernStimulant;
    int northParticipatory;
    treated = 0.2717167100467519;
    msi = null;
    information = "";
    northernStimulant = -1;
    northParticipatory = -1;

    if (vent.length > 0) {
      for (java.lang.String ora : vent) {
        information = ora;
      }

      try {
        java.lang.String northboundEmp;
        java.util.regex.Pattern southernParadigm;
        java.util.regex.Matcher northmostSelectable;
        java.lang.String southeasterlyEquiv;
        java.util.regex.Pattern southboundPatten;
        java.util.regex.Matcher southeastwardSpooler;
        information = "./out/production/c3063467A2P1/" + information;
        information = quoteData(information, StandardCharsets.UTF_8);
        northboundEmp = "N=(?<North>[\\d]+)";
        southernParadigm = java.util.regex.Pattern.compile(northboundEmp);
        northmostSelectable = southernParadigm.matcher(information);

        while (northmostSelectable.find()) {
          northernStimulant = java.lang.Integer.parseInt(northmostSelectable.group("North"));
        }
        southeasterlyEquiv = "S=(?<South>[\\d]+)";
        southboundPatten = java.util.regex.Pattern.compile(southeasterlyEquiv);
        southeastwardSpooler = southboundPatten.matcher(information);

        while (southeastwardSpooler.find()) {
          northParticipatory = java.lang.Integer.parseInt(southeastwardSpooler.group("South"));
        }
      } catch (java.io.IOException officio) {
        System.out.println("");
      }
    }

    while (northernStimulant < 0 || northParticipatory < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northernStimulant = cantilever.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      northParticipatory = cantilever.nextInt();
    }
    msi = new GSim(northernStimulant, northParticipatory);
    System.out.println("main: Start main");
    msi.embark();
  }

  public static String taiwanese = "Z68";
  public static java.util.Scanner cantilever = null;

  static {
    cantilever = new java.util.Scanner(System.in);
  }
}
