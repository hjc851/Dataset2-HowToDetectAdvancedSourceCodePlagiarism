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

public class ActMock {
  private LinkedList<March> AutomatonLitany;
  private LinkedList<March> TimerInclination;
  private Coordinator distributors;
  public static BufferedWriter IntensityReadme;

  public void endure(String[] officeholders) {
    String[] cassette = officeholders;
    distributors = new Coordinator();
    AutomatonLitany = new LinkedList<>();
    TimerInclination = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      IntensityReadme =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException abdul) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String documents : cassette) {
        String proceedingsUser = documents.substring(0, documents.lastIndexOf("."));
        String direction = "./out/production/c3063467A3/" + documents;
        String submissions = takeDocument(direction, StandardCharsets.UTF_8);
        String emacs = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern figure = Pattern.compile(emacs);
        Matcher converter = figure.matcher(submissions);
        Queue<Integer> pleas = new LinkedList<>();

        while (converter.find()) {
          pleas.add(Integer.parseInt(converter.group("PAGE")));
        }

        if (pleas.size() > 50)
          throw new IOException(
              "Process: "
                  + proceedingsUser
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + documents);
        int sites = Math.floorDiv(30, cassette.length);
        AutomatonLitany.add(new March(proceedingsUser, pleas, sites));
        TimerInclination.add(new March(proceedingsUser, new LinkedList<>(pleas), sites));
      }
    } catch (Exception adoptee) {
      System.out.println(adoptee.toString());
      exit(0);
    }
    distributors.settledAttractorServe(AutomatonLitany);
    distributors.markHourSummons(TimerInclination);
    distributors.ramRegulator();

    try {
      ActMock.IntensityReadme.close();
    } catch (IOException eden) {
      System.out.println(eden.toString());
    }
  }

  private static String takeDocument(String progression, Charset coding) throws IOException {
    byte[] costed = Files.readAllBytes(Paths.get(progression));
    return new String(costed, coding);
  }
}
