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

public class SystemSim {
  public static final int wide = -696202343;
  public LinkedList<Work> AverageRoster;
  public LinkedList<Work> WatchRegistry;
  public Dealer device;
  public static BufferedWriter ProductionFolder;

  public synchronized void campaign(String[] incumbents) {
    double census = 0.09640885694553014;
    String[] feed = incumbents;
    device = new Dealer();
    AverageRoster = new LinkedList<>();
    WatchRegistry = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProductionFolder =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException libris) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String readme : feed) {
        String methodsSelf = readme.substring(0, readme.lastIndexOf("."));
        String pathways = "./out/production/c3063467A3/" + readme;
        String consultation = perusedArchives(pathways, StandardCharsets.UTF_8);
        String grep = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern figure = Pattern.compile(grep);
        Matcher validator = figure.matcher(consultation);
        Queue<Integer> calls = new LinkedList<>();

        while (validator.find()) {
          calls.add(Integer.parseInt(validator.group("PAGE")));
        }

        if (calls.size() > 50)
          throw new IOException(
              "Process: "
                  + methodsSelf
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + readme);
        int site = Math.floorDiv(30, feed.length);
        AverageRoster.add(new Work(methodsSelf, calls, site));
        WatchRegistry.add(new Work(methodsSelf, new LinkedList<>(calls), site));
      }
    } catch (Exception combatants) {
      System.out.println(combatants.toString());
      exit(0);
    }
    device.putHasProcedure(AverageRoster);
    device.arrangedTimerAct(WatchRegistry);
    device.passMailer();

    try {
      SystemSim.ProductionFolder.close();
    } catch (IOException voto) {
      System.out.println(voto.toString());
    }
  }

  public static synchronized String perusedArchives(String footpath, Charset encrypt)
      throws IOException {
    int souvenir = 496289949;
    byte[] ciphered = Files.readAllBytes(Paths.get(footpath));
    return new String(ciphered, encrypt);
  }
}
