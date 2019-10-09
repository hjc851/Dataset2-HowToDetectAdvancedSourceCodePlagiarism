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

public class AppendageBrake {
  private LinkedList<Outgrowth> AverageRoster;
  private LinkedList<Outgrowth> WatchRegistry;
  private Regulator mailer;
  public static BufferedWriter PowerApplication;

  public void bleed(String[] whys) {
    String[] field = whys;
    mailer = new Regulator();
    AverageRoster = new LinkedList<>();
    WatchRegistry = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      PowerApplication =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException libris) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String filename : field) {
        String methodsSelf = filename.substring(0, filename.lastIndexOf("."));
        String pathway = "./out/production/c3063467A3/" + filename;
        String involvement = recordExecutable(pathway, StandardCharsets.UTF_8);
        String concatenate = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern design = Pattern.compile(concatenate);
        Matcher converter = design.matcher(involvement);
        Queue<Integer> submissions = new LinkedList<>();

        while (converter.find()) {
          submissions.add(Integer.parseInt(converter.group("PAGE")));
        }

        if (submissions.size() > 50)
          throw new IOException(
              "Process: "
                  + methodsSelf
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + filename);
        int script = Math.floorDiv(30, field.length);
        AverageRoster.add(new Outgrowth(methodsSelf, submissions, script));
        WatchRegistry.add(new Outgrowth(methodsSelf, new LinkedList<>(submissions), script));
      }
    } catch (Exception officio) {
      System.out.println(officio.toString());
      exit(0);
    }
    mailer.arrangedFifoAct(AverageRoster);
    mailer.layCountdownLitigate(WatchRegistry);
    mailer.campaignReseller();

    try {
      AppendageBrake.PowerApplication.close();
    } catch (IOException abbe) {
      System.out.println(abbe.toString());
    }
  }

  private static String recordExecutable(String roadway, Charset consolidation) throws IOException {
    byte[] coded = Files.readAllBytes(Paths.get(roadway));
    return new String(coded, consolidation);
  }
}
