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

public class CycleJoystick {
  private LinkedList<Mechanisms> AverageRoster;
  private LinkedList<Mechanisms> TimerInclination;
  private Distributors reseller;
  public static BufferedWriter IntensityReadme;

  public void operate(String[] establishment) {
    String[] entry = establishment;
    reseller = new Distributors();
    AverageRoster = new LinkedList<>();
    TimerInclination = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      IntensityReadme =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException pro) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String complaint : entry) {
        String proceedingsUser = complaint.substring(0, complaint.lastIndexOf("."));
        String journey = "./out/production/c3063467A3/" + complaint;
        String opinion = recordExecutable(journey, StandardCharsets.UTF_8);
        String namespace = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern trend = Pattern.compile(namespace);
        Matcher brite = trend.matcher(opinion);
        Queue<Integer> invitations = new LinkedList<>();

        while (brite.find()) {
          invitations.add(Integer.parseInt(brite.group("PAGE")));
        }

        if (invitations.size() > 50)
          throw new IOException(
              "Process: "
                  + proceedingsUser
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + complaint);
        int homepage = Math.floorDiv(30, entry.length);
        AverageRoster.add(new Mechanisms(proceedingsUser, invitations, homepage));
        TimerInclination.add(
            new Mechanisms(proceedingsUser, new LinkedList<>(invitations), homepage));
      }
    } catch (Exception adult) {
      System.out.println(adult.toString());
      exit(0);
    }
    reseller.fixCryptographyMechanism(AverageRoster);
    reseller.doWakingTechniques(TimerInclination);
    reseller.endureRetailer();

    try {
      CycleJoystick.IntensityReadme.close();
    } catch (IOException abdul) {
      System.out.println(abdul.toString());
    }
  }

  private static String recordExecutable(String curve, Charset codify) throws IOException {
    byte[] synthesized = Files.readAllBytes(Paths.get(curve));
    return new String(synthesized, codify);
  }
}
