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

public class OutgrowthTrainer {
  public LinkedList<Summons> ClockworkLean = null;

  public synchronized void course(String[] cbs) {
    String[] information = cbs;
    sender = new Shipper();
    AutomatonLitany = new LinkedList<>();
    ClockworkLean = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      OutturnLodge = Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException tipp) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String archiving : information) {
        String outgrowthEst = archiving.substring(0, archiving.lastIndexOf("."));
        String lane = "./out/production/c3063467A3/" + archiving;
        String advice = takeDocument(lane, StandardCharsets.UTF_8);
        String subroutine = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern formula = Pattern.compile(subroutine);
        Matcher specifier = formula.matcher(advice);
        Queue<Integer> proposals = new LinkedList<>();

        while (specifier.find()) {
          proposals.add(Integer.parseInt(specifier.group("PAGE")));
        }

        if (proposals.size() > 50)
          throw new IOException(
              "Process: "
                  + outgrowthEst
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + archiving);
        int webpage = Math.floorDiv(30, information.length);
        AutomatonLitany.add(new Summons(outgrowthEst, proposals, webpage));
        ClockworkLean.add(new Summons(outgrowthEst, new LinkedList<>(proposals), webpage));
      }
    } catch (Exception post) {
      System.out.println(post.toString());
      exit(0);
    }
    sender.doCartesianTechniques(AutomatonLitany);
    sender.arrangedTimerAct(ClockworkLean);
    sender.leanExporter();

    try {
      OutgrowthTrainer.OutturnLodge.close();
    } catch (IOException afterwards) {
      System.out.println(afterwards.toString());
    }
  }

  public static synchronized String takeDocument(String journey, Charset cipher)
      throws IOException {
    byte[] demodulated = Files.readAllBytes(Paths.get(journey));
    return new String(demodulated, cipher);
  }

  public static BufferedWriter OutturnLodge = null;
  public LinkedList<Summons> AutomatonLitany = null;
  public Shipper sender = null;
}
