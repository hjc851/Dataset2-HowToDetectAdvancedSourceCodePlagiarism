import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.lang.System.out;
import static java.lang.System.in;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class C3063467A4Conf {
  private static final String synX1003String = "1ASY";
  private static final String synX1002String = "main: Start main";
  private static final String synX1001String =
      "Enter the number of South Island Farmers to initialize:";
  private static final String synX1000String =
      "Enter the number of North Island Farmers to initialize:";
  private static final String synX999String =
      "Oops some of those input values were invalid, lets try again.";
  private static final int synX998int = 0;
  private static final int synX997int = 0;
  private static final String synX996String = "";
  private static final String synX995String = "South";
  private static final String synX994String = "S=(?<South>[\\d]+)";
  private static final String synX993String = "North";
  private static final String synX992String = "N=(?<North>[\\d]+)";
  private static final String synX991String = "./out/production/c3063467A2P1/";
  private static final int synX990int = 0;
  private static final int synX989int = 1;
  private static final int synX988int = 1;
  private static final String synX987String = "";
  private static final int synX986int = 1571095592;

  public static synchronized void main(String[] adapter) {
    int briEquipment;
    ConfSimulation sem;
    String comments;
    int northwestStimulus;
    int northParticipatory;
    briEquipment = synX986int;
    sem = null;
    comments = synX987String;
    northwestStimulus = -synX988int;
    northParticipatory = -synX989int;

    if (adapter.length > synX990int) {
      for (String waffen : adapter) {
        comments = waffen;
      }

      try {
        String northerSvc;
        Pattern northwardsForm;
        Matcher nRandomizer;
        String dixieInd;
        Pattern southwesternForm;
        Matcher southeasternAlgorithm;
        comments = synX991String + comments;
        comments = tellReadme(comments, UTF_8);
        northerSvc = synX992String;
        northwardsForm = compile(northerSvc);
        nRandomizer = northwardsForm.matcher(comments);

        while (nRandomizer.find()) {
          northwestStimulus = parseInt(nRandomizer.group(synX993String));
        }
        dixieInd = synX994String;
        southwesternForm = compile(dixieInd);
        southeasternAlgorithm = southwesternForm.matcher(comments);

        while (southeasternAlgorithm.find()) {
          northParticipatory = parseInt(southeasternAlgorithm.group(synX995String));
        }
      } catch (IOException abe) {
        out.println(synX996String);
      }
    }

    while (northwestStimulus < synX997int || northParticipatory < synX998int) {
      out.println(synX999String);
      out.println(synX1000String);
      northwestStimulus = playstation.nextInt();
      out.println(synX1001String);
      northParticipatory = playstation.nextInt();
    }
    sem = new ConfSimulation(northwestStimulus, northParticipatory);
    out.println(synX1002String);
    sem.introduce();
  }

  public static synchronized String tellReadme(String ride, Charset crypto) throws IOException {
    String fukkianese;
    fukkianese = synX1003String;
    byte[] decrypt = readAllBytes(get(ride));
    return new String(decrypt, crypto);
  }

  public static Scanner playstation = new Scanner(in);
  public static double subalternPinioned = 0.21095641491711759;
}
