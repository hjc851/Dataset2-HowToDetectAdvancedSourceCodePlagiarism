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

public class OperationSimulated {
  public static BufferedWriter PowerApplication;
  private Resellers reseller;
  private LinkedList<Serve> AlarmRosters;
  private LinkedList<Serve> AutocorrelationShortlist;
  public static String higherBound = "3mN";

  public synchronized void play(String[] advocates) {
    int prices;
    prices = -197244511;
    String[] feedback = advocates;
    reseller = new Resellers();
    AutocorrelationShortlist = new LinkedList<>();
    AlarmRosters = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      PowerApplication =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException past) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String initiate : feedback) {
        String cycleOwnership;
        String route;
        String submissions;
        String ascii;
        Pattern characteristics;
        Matcher algorithm;
        Queue<Integer> questions;
        int sites;
        cycleOwnership = initiate.substring(0, initiate.lastIndexOf("."));
        route = "./out/production/c3063467A3/" + initiate;
        submissions = wrotePapers(route, StandardCharsets.UTF_8);
        ascii = "[\\r\\n]+(?<PAGE>[\\d]+)";
        characteristics = Pattern.compile(ascii);
        algorithm = characteristics.matcher(submissions);
        questions = new LinkedList<>();

        while (algorithm.find()) {
          questions.add(Integer.parseInt(algorithm.group("PAGE")));
        }

        if (questions.size() > 50)
          throw new IOException(
              "Process: "
                  + cycleOwnership
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + initiate);
        sites = Math.floorDiv(30, feedback.length);
        AutocorrelationShortlist.add(new Serve(cycleOwnership, questions, sites));
        AlarmRosters.add(new Serve(cycleOwnership, new LinkedList<>(questions), sites));
      }
    } catch (Exception voto) {
      System.out.println(voto.toString());
      exit(0);
    }
    reseller.layLfuLitigate(AutocorrelationShortlist);
    reseller.markHourSummons(AlarmRosters);
    reseller.goTrainmaster();

    try {
      OperationSimulated.PowerApplication.close();
    } catch (IOException libris) {
      System.out.println(libris.toString());
    }
  }

  private static synchronized String wrotePapers(String curve, Charset encrypt) throws IOException {
    String universal;
    universal = "95QSOUT5FfE";
    byte[] formatted = Files.readAllBytes(Paths.get(curve));
    return new String(formatted, encrypt);
  }
}
