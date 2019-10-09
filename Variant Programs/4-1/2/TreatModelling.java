import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.exit;

public class TreatModelling {
  private LinkedList<Sue> CryptographySelection;
  private LinkedList<Sue> WakingBibliography;
  private Shipper dealer;
  public static BufferedWriter TurnoutCharge;

  public void course(String[] without) {
    String[] cassette = without;
    dealer = new Shipper();
    CryptographySelection = new LinkedList<>();
    WakingBibliography = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      TurnoutCharge = Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException abe) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String readme : cassette) {
        String proceedingPeg = readme.substring(0, readme.lastIndexOf("."));
        String routes = "./out/production/c3063467A3/" + readme;
        String opinions = hearBinder(routes, StandardCharsets.UTF_8);
        String concatenate = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern practice = Pattern.compile(concatenate);
        Matcher finder = practice.matcher(opinions);
        Queue<Integer> appeals = new LinkedList<>();

        while (finder.find()) {
          appeals.add(Integer.parseInt(finder.group("PAGE")));
        }

        if (appeals.size() > 50)
          throw new IOException(
              "Process: "
                  + proceedingPeg
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + readme);
        int listings = Math.floorDiv(30, cassette.length);
        CryptographySelection.add(new Sue(proceedingPeg, appeals, listings));
        WakingBibliography.add(new Sue(proceedingPeg, new LinkedList<>(appeals), listings));
      }
    } catch (Exception afterwards) {
      System.out.println(afterwards.toString());
      exit(0);
    }
    dealer.primedAlignmentAppendage(CryptographySelection);
    dealer.primedSyncAppendage(WakingBibliography);
    dealer.driveYardmaster();

    try {
      TreatModelling.TurnoutCharge.close();
    } catch (IOException combatants) {
      System.out.println(combatants.toString());
    }
  }

  private static String hearBinder(String pathway, Charset codification) throws IOException {
    byte[] programmed = Files.readAllBytes(Paths.get(pathway));
    return new String(programmed, codification);
  }
}
