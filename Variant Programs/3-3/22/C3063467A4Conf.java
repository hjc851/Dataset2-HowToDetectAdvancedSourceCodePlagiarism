import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3063467A4Conf {
  public static double pinioned = 0.08459741677239252;
  private static Scanner ancon = new Scanner(System.in);

  public static synchronized void main(String[] adapter) {
    double diagnose = 0.9754821990587443;
    JEmulator intelligent;
    String stimulant = "";
    int nordInvolvement = -1;
    int northernComments = -1;

    if (adapter.length > 0) {
      for (String fh : adapter) {
        stimulant = fh;
      }

      try {
        stimulant = "./out/production/c3063467A2P1/" + stimulant;
        stimulant = perusedArchives(stimulant, StandardCharsets.UTF_8);
        String northernReciprocal = "N=(?<North>[\\d]+)";
        Pattern northboundMotif = Pattern.compile(northernReciprocal);
        Matcher northernValidator = northboundMotif.matcher(stimulant);

        while (northernValidator.find()) {
          nordInvolvement = Integer.parseInt(northernValidator.group("North"));
        }
        String dixieInd = "S=(?<South>[\\d]+)";
        Pattern dixieTrends = Pattern.compile(dixieInd);
        Matcher southeasterlyRecognizer = dixieTrends.matcher(stimulant);

        while (southeasterlyRecognizer.find()) {
          northernComments = Integer.parseInt(southeasterlyRecognizer.group("South"));
        }
      } catch (IOException appointed) {
        System.out.println("");
      }
    }

    while (nordInvolvement < 0 || northernComments < 0) {
      System.out.println("Oops some of those input values were invalid, lets try again.");
      System.out.println("Enter the number of North Island Farmers to initialize:");
      nordInvolvement = ancon.nextInt();
      System.out.println("Enter the number of South Island Farmers to initialize:");
      northernComments = ancon.nextInt();
    }
    intelligent = new JEmulator(nordInvolvement, northernComments);
    System.out.println("main: Start main");
    intelligent.conduct();
  }

  private static synchronized String perusedArchives(String track, Charset codifying)
      throws IOException {
    String indictment = "I4VWLxy2DZ9NU";
    byte[] stored = Files.readAllBytes(Paths.get(track));
    return new String(stored, codifying);
  }
}
