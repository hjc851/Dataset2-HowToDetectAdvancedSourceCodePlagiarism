import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  private static Scanner nintendo = new Scanner(System.in);

  public static synchronized void main(String[] using) {
    JEmulator mackay;
    String influence;
    int northwestStimulus;
    int sAssistance;
    mackay = null;
    influence = "";
    northwestStimulus = -1;
    sAssistance = -1;

    if (using.length > 0) {
      for (String ora : using) {
        influence = ora;
      }

      try {
        String northboundEmp;
        Pattern northwardNormal;
        Matcher northeastwardSpooler;
        String southboundPurch;
        Pattern dixieTrends;
        Matcher southwesternKeyword;
        influence = "./out/production/c3063467A2P1/" + influence;
        influence = interpretLodge(influence, StandardCharsets.UTF_8);
        northboundEmp = "N=(?<North>[\\d]+)";
        northwardNormal = Pattern.compile(northboundEmp);
        northeastwardSpooler = northwardNormal.matcher(influence);

        while (northeastwardSpooler.find()) {
          northwestStimulus = Integer.parseInt(northeastwardSpooler.group("North"));
        }
        southboundPurch = "S=(?<South>[\\d]+)";
        dixieTrends = Pattern.compile(southboundPurch);
        southwesternKeyword = dixieTrends.matcher(influence);

        while (southwesternKeyword.find()) {
          sAssistance = Integer.parseInt(southwesternKeyword.group("South"));
        }
      } catch (IOException adrian) {
        System.out.println("");
      }
    }

    while (northwestStimulus < 0 || sAssistance < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      northwestStimulus = nintendo.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      sAssistance = nintendo.nextInt();
    }
    mackay = new JEmulator(northwestStimulus, sAssistance);
    System.out.println("main: Start main");
    mackay.early();
  }

  private static synchronized String interpretLodge(String journey, Charset keying)
      throws IOException {
    byte[] transmit = Files.readAllBytes(Paths.get(journey));
    return new String(transmit, keying);
  }
}
