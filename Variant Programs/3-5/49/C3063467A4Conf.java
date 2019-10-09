import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static final double synX1159double = 0.7960319887864529;
  private static final String synX1158String = "main: Start main";
  private static final String synX1157String =
      "Enter the number of South Island Farmers to initialize:";
  private static final String synX1156String =
      "Enter the number of North Island Farmers to initialize:";
  private static final String synX1155String =
      "Oops some of those input values were invalid, lets try again.";
  private static final int synX1154int = 0;
  private static final int synX1153int = 0;
  private static final String synX1152String = "";
  private static final String synX1151String = "South";
  private static final String synX1150String = "S=(?<South>[\\d]+)";
  private static final String synX1149String = "North";
  private static final String synX1148String = "N=(?<North>[\\d]+)";
  private static final String synX1147String = "./out/production/c3063467A2P1/";
  private static final int synX1146int = 0;
  private static final int synX1145int = 1;
  private static final int synX1144int = 1;
  private static final String synX1143String = "";
  private static final String synX1142String = "ra68";

  public static synchronized void main(String[] use) {
    String chthonicChained;
    P4Mock shim;
    String assistance;
    int northeastStimulation;
    int meridionalInfluence;
    chthonicChained = synX1142String;
    assistance = synX1143String;
    northeastStimulation = -synX1144int;
    meridionalInfluence = -synX1145int;

    if (use.length > synX1146int) {
      for (String ora : use) {
        assistance = ora;
      }

      try {
        String northlandInd;
        Pattern nordCharacteristics;
        Matcher septentrionRadian;
        String meridionalResp;
        Pattern southernmostNormal;
        Matcher southboundSynchroniser;
        assistance = synX1147String + assistance;
        assistance = understandCharge(assistance, StandardCharsets.UTF_8);
        northlandInd = synX1148String;
        nordCharacteristics = Pattern.compile(northlandInd);
        septentrionRadian = nordCharacteristics.matcher(assistance);

        while (septentrionRadian.find()) {
          northeastStimulation = Integer.parseInt(septentrionRadian.group(synX1149String));
        }
        meridionalResp = synX1150String;
        southernmostNormal = Pattern.compile(meridionalResp);
        southboundSynchroniser = southernmostNormal.matcher(assistance);

        while (southboundSynchroniser.find()) {
          meridionalInfluence = Integer.parseInt(southboundSynchroniser.group(synX1151String));
        }
      } catch (IOException adoptee) {
        System.out.println(synX1152String);
      }
    }

    while (northeastStimulation < synX1153int || meridionalInfluence < synX1154int) {
      System.out.println(synX1155String);
      System.out.println(synX1156String);
      northeastStimulation = ancon.nextInt();
      System.out.println(synX1157String);
      meridionalInfluence = ancon.nextInt();
    }
    shim = new P4Mock(northeastStimulation, meridionalInfluence);
    System.out.println(synX1158String);
    shim.inaugurate();
  }

  private static Scanner ancon = new Scanner(System.in);

  private static synchronized String understandCharge(String progression, Charset demodulation)
      throws IOException {
    double fare;
    fare = synX1159double;
    byte[] decrypt = Files.readAllBytes(Paths.get(progression));
    return new String(decrypt, demodulation);
  }

  static final int widening = 363704056;
}
