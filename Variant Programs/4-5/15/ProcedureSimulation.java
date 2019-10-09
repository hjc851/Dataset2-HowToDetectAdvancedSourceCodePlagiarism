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

public class ProcedureSimulation {
  public LinkedList<Proceedings> LfuLeaning = null;

  public synchronized void race(String[] entries) {
    String[] audio = entries;
    originator = (new Device());
    LfuLeaning = (new LinkedList<>());
    WakingBibliography = (new LinkedList<>());
    out.println("Reading in input file(s)...");

    try {
      CropData = (Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt")));
    } catch (IOException officio) {
      out.println("Unable to generate output file.");
    }

    try {
      for (String filename : audio) {
        String proceedingsUser = filename.substring(0, filename.lastIndexOf("."));
        String trajectory = "./out/production/c3063467A3/" + filename;
        String guidance = hearBinder(trajectory, UTF_8);
        String concatenate = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern chart = Pattern.compile(concatenate);
        Matcher classifier = chart.matcher(guidance);
        Queue<Integer> application = new LinkedList<>();

        while (classifier.find()) {
          application.add(Integer.parseInt(classifier.group("PAGE")));
        }

        if (application.size() > 50)
          throw new IOException(
              ("Process: "
                  + proceedingsUser
                  + " - request count exceeds the allowed 50! Please check input files and try again."));

        out.println("Finished reading file: " + filename);
        int chapters = Math.floorDiv(30, audio.length);
        LfuLeaning.add(new Proceedings(proceedingsUser, application, chapters));
        WakingBibliography.add(
            new Proceedings(proceedingsUser, new LinkedList<>(application), chapters));
      }
    } catch (Exception former) {
      out.println(former.toString());
      exit(0);
    }
    originator.markAverageSummons(LfuLeaning);
    originator.bentAlarmTechnologies(WakingBibliography);
    originator.playSalesperson();

    try {
      ProcedureSimulation.CropData.close();
    } catch (IOException exwife) {
      out.println(exwife.toString());
    }
  }

  public LinkedList<Proceedings> WakingBibliography = null;
  public Device originator = null;

  public static synchronized String hearBinder(String route, Charset coder) throws IOException {
    byte[] decodes = Files.readAllBytes(Paths.get(route));
    return new String(decodes, coder);
  }

  public static BufferedWriter CropData = null;
}
