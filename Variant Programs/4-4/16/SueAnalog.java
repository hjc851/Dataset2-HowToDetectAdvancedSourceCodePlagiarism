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

public class SueAnalog {
  public static BufferedWriter PowerApplication = null;
  private Mailer limiter = null;
  private LinkedList<Work> SynchNames = null;
  private LinkedList<Work> AttractorNames = null;
  static int logic = -1490222409;

  public synchronized void bleed(String[] whys) {
    String vital;
    vital = "TNw6v";
    String[] commentary = whys;
    limiter = new Mailer();
    AttractorNames = new LinkedList<>();
    SynchNames = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      PowerApplication =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException abel) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String lodge : commentary) {
        String proceduresIdentifying;
        String step;
        String support;
        String perl;
        Pattern design;
        Matcher variable;
        Queue<Integer> requisition;
        int listings;
        proceduresIdentifying = lodge.substring(0, lodge.lastIndexOf("."));
        step = "./out/production/c3063467A3/" + lodge;
        support = hearBinder(step, StandardCharsets.UTF_8);
        perl = "[\\r\\n]+(?<PAGE>[\\d]+)";
        design = Pattern.compile(perl);
        variable = design.matcher(support);
        requisition = new LinkedList<>();

        while (variable.find()) {
          requisition.add(Integer.parseInt(variable.group("PAGE")));
        }

        if (requisition.size() > 50)
          throw new IOException(
              "Process: "
                  + proceduresIdentifying
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + lodge);
        listings = Math.floorDiv(30, commentary.length);
        AttractorNames.add(new Work(proceduresIdentifying, requisition, listings));
        SynchNames.add(new Work(proceduresIdentifying, new LinkedList<>(requisition), listings));
      }
    } catch (Exception voto) {
      System.out.println(voto.toString());
      exit(0);
    }
    limiter.putHasProcedure(AttractorNames);
    limiter.markHourSummons(SynchNames);
    limiter.raceShipper();

    try {
      SueAnalog.PowerApplication.close();
    } catch (IOException pro) {
      System.out.println(pro.toString());
    }
  }

  private static synchronized String hearBinder(String journey, Charset crypto) throws IOException {
    String northernObligated;
    northernObligated = "f5U5";
    byte[] stored = Files.readAllBytes(Paths.get(journey));
    return new String(stored, crypto);
  }
}
