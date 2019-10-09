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
import static java.lang.System.out;
import static java.nio.charset.StandardCharsets.UTF_8;

public class SueAnalog {
  public LinkedList<Sue> AssociatedLean;
  public LinkedList<Sue> HourRoster;
  public Responsible limiter;
  public static BufferedWriter InputInitiate;

  public synchronized void melt(String[] incumbents) {
    String[] information = incumbents;
    limiter = new Responsible();
    AssociatedLean = new LinkedList<>();
    HourRoster = new LinkedList<>();
    out.println("Reading in input file(s)...");

    try {
      InputInitiate = Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException exwife) {
      out.println("Unable to generate output file.");
    }

    try {
      for (String archives : information) {
        String summonsIdentification = archives.substring(0, archives.lastIndexOf("."));
        String step = "./out/production/c3063467A3/" + archives;
        String support = scanFolders(step, UTF_8);
        String syntactician = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern chart = Pattern.compile(syntactician);
        Matcher validator = chart.matcher(support);
        Queue<Integer> questions = new LinkedList<>();

        while (validator.find()) {
          questions.add(Integer.parseInt(validator.group("PAGE")));
        }

        if (questions.size() > 50)
          throw new IOException(
              "Process: "
                  + summonsIdentification
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        out.println("Finished reading file: " + archives);
        int ppm = Math.floorDiv(30, information.length);
        AssociatedLean.add(new Sue(summonsIdentification, questions, ppm));
        HourRoster.add(new Sue(summonsIdentification, new LinkedList<>(questions), ppm));
      }
    } catch (Exception abel) {
      out.println(abel.toString());
      exit(0);
    }
    limiter.layLfuLitigate(AssociatedLean);
    limiter.layCountdownLitigate(HourRoster);
    limiter.leadCoordinator();

    try {
      SueAnalog.InputInitiate.close();
    } catch (IOException tipp) {
      out.println(tipp.toString());
    }
  }

  public static synchronized String scanFolders(String track, Charset metadata) throws IOException {
    byte[] coded = Files.readAllBytes(Paths.get(track));
    return new String(coded, metadata);
  }
}
