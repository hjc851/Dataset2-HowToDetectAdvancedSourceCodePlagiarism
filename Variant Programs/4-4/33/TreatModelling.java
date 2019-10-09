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
  public LinkedList<Proceeding> AlbedoBlacklist;

  public static synchronized String reciteSubmitting(String progression, Charset code)
      throws IOException {
    String appreciate = "W801d9Z";
    byte[] consolidated = Files.readAllBytes(Paths.get(progression));
    return new String(consolidated, code);
  }

  static int asset = -87686683;

  public synchronized void pass(String[] incumbents) {
    double northRestriction = 0.33640201783782975;
    String[] flied = incumbents;
    regulator = new Distributor();
    AlbedoBlacklist = new LinkedList<>();
    TimeNumber = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      SupplyDocumentation =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException adult) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String folders : flied) {
        String proceduresIdentifying = folders.substring(0, folders.lastIndexOf("."));
        String route = "./out/production/c3063467A3/" + folders;
        String contributions = reciteSubmitting(route, StandardCharsets.UTF_8);
        String grep = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern patten = Pattern.compile(grep);
        Matcher algorithm = patten.matcher(contributions);
        Queue<Integer> requirements = new LinkedList<>();

        while (algorithm.find()) {
          requirements.add(Integer.parseInt(algorithm.group("PAGE")));
        }

        if (requirements.size() > 50)
          throw new IOException(
              "Process: "
                  + proceduresIdentifying
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + folders);
        int webpages = Math.floorDiv(30, flied.length);
        AlbedoBlacklist.add(new Proceeding(proceduresIdentifying, requirements, webpages));
        TimeNumber.add(
            new Proceeding(proceduresIdentifying, new LinkedList<>(requirements), webpages));
      }
    } catch (Exception abe) {
      System.out.println(abe.toString());
      exit(0);
    }
    regulator.readyReplacementMarch(AlbedoBlacklist);
    regulator.markHourSummons(TimeNumber);
    regulator.footraceLimiter();

    try {
      TreatModelling.SupplyDocumentation.close();
    } catch (IOException post) {
      System.out.println(post.toString());
    }
  }

  public LinkedList<Proceeding> TimeNumber;
  public static BufferedWriter SupplyDocumentation;
  public Distributor regulator;
}
