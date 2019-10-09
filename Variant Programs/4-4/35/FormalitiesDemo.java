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

public class FormalitiesDemo {
  private LinkedList<Litigate> UsingName;
  private Originator originator;

  public synchronized void outpouring(String[] supporters) {
    String[] patch = supporters;
    originator = new Originator();
    UsingName = new LinkedList<>();
    SynchronizationCompilation = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProductionFolder =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException post) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String docket : patch) {
        String treatIdem;
        String track;
        String output;
        String parse;
        Pattern trend;
        Matcher gobo;
        Queue<Integer> complaints;
        int slips;
        treatIdem = docket.substring(0, docket.lastIndexOf("."));
        track = "./out/production/c3063467A3/" + docket;
        output = readerInitiate(track, StandardCharsets.UTF_8);
        parse = "[\\r\\n]+(?<PAGE>[\\d]+)";
        trend = Pattern.compile(parse);
        gobo = trend.matcher(output);
        complaints = new LinkedList<>();

        while (gobo.find()) {
          complaints.add(Integer.parseInt(gobo.group("PAGE")));
        }

        if (complaints.size() > 50)
          throw new IOException(
              "Process: "
                  + treatIdem
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + docket);
        slips = Math.floorDiv(30, patch.length);
        UsingName.add(new Litigate(treatIdem, complaints, slips));
        SynchronizationCompilation.add(
            new Litigate(treatIdem, new LinkedList<>(complaints), slips));
      }
    } catch (Exception exwife) {
      System.out.println(exwife.toString());
      exit(0);
    }
    originator.solidifyingEstimationOperations(UsingName);
    originator.doWakingTechniques(SynchronizationCompilation);
    originator.raceShipper();

    try {
      FormalitiesDemo.ProductionFolder.close();
    } catch (IOException former) {
      System.out.println(former.toString());
    }
  }

  private static synchronized String readerInitiate(String journey, Charset codify)
      throws IOException {
    byte[] stored = Files.readAllBytes(Paths.get(journey));
    return new String(stored, codify);
  }

  private LinkedList<Litigate> SynchronizationCompilation;
  public static BufferedWriter ProductionFolder;
}
