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
  public static BufferedWriter ProducingFolders = null;
  private Reseller trainmaster = null;
  private LinkedList<Negotiations> TachTilt = null;
  private LinkedList<Negotiations> CartelListings = null;

  public synchronized void outpouring(String[] proponents) {
    String[] assistance = proponents;
    trainmaster = new Reseller();
    CartelListings = new LinkedList<>();
    TachTilt = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProducingFolders =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException voto) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String charge : assistance) {
        String workCaller;
        String lane;
        String comments;
        String subroutine;
        Pattern template;
        Matcher verifier;
        Queue<Integer> inquiries;
        int listings;
        workCaller = charge.substring(0, charge.lastIndexOf("."));
        lane = "./out/production/c3063467A3/" + charge;
        comments = showDocumentation(lane, StandardCharsets.UTF_8);
        subroutine = "[\\r\\n]+(?<PAGE>[\\d]+)";
        template = Pattern.compile(subroutine);
        verifier = template.matcher(comments);
        inquiries = new LinkedList<>();

        while (verifier.find()) {
          inquiries.add(Integer.parseInt(verifier.group("PAGE")));
        }

        if (inquiries.size() > 50)
          throw new IOException(
              "Process: "
                  + workCaller
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + charge);
        listings = Math.floorDiv(30, assistance.length);
        CartelListings.add(new Negotiations(workCaller, inquiries, listings));
        TachTilt.add(new Negotiations(workCaller, new LinkedList<>(inquiries), listings));
      }
    } catch (Exception exwife) {
      System.out.println(exwife.toString());
      exit(0);
    }
    trainmaster.situatedCapitalistMethodology(CartelListings);
    trainmaster.primedSyncAppendage(TachTilt);
    trainmaster.courseResponsible();

    try {
      TreatModelling.ProducingFolders.close();
    } catch (IOException afterwards) {
      System.out.println(afterwards.toString());
    }
  }

  private static synchronized String showDocumentation(String curve, Charset demodulation)
      throws IOException {
    byte[] scrambled = Files.readAllBytes(Paths.get(curve));
    return new String(scrambled, demodulation);
  }
}
