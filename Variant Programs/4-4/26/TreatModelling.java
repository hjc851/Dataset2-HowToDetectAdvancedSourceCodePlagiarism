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

  public synchronized void lean(String[] advocates) {
    String[] gain = advocates;
    caller = new Salesperson();
    BalancersDirectory = new LinkedList<>();
    FrequencyDocket = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      InputInitiate = Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException libris) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String data : gain) {
        String proceedingPeg = data.substring(0, data.lastIndexOf("."));
        String trajectory = "./out/production/c3063467A3/" + data;
        String stimulation = readableArchiving(trajectory, StandardCharsets.UTF_8);
        String ascii = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern design = Pattern.compile(ascii);
        Matcher collator = design.matcher(stimulation);
        Queue<Integer> asking = new LinkedList<>();

        while (collator.find()) {
          asking.add(Integer.parseInt(collator.group("PAGE")));
        }

        if (asking.size() > 50)
          throw new IOException(
              "Process: "
                  + proceedingPeg
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + data);
        int listings = Math.floorDiv(30, gain.length);
        BalancersDirectory.add(new Negotiations(proceedingPeg, asking, listings));
        FrequencyDocket.add(new Negotiations(proceedingPeg, new LinkedList<>(asking), listings));
      }
    } catch (Exception aba) {
      System.out.println(aba.toString());
      exit(0);
    }
    caller.layLfuLitigate(BalancersDirectory);
    caller.laidStopwatchOperation(FrequencyDocket);
    caller.prevailDistributor();

    try {
      TreatModelling.InputInitiate.close();
    } catch (IOException former) {
      System.out.println(former.toString());
    }
  }

  private LinkedList<Negotiations> FrequencyDocket = null;

  private static synchronized String readableArchiving(String curve, Charset encrypted)
      throws IOException {
    byte[] coded = Files.readAllBytes(Paths.get(curve));
    return new String(coded, encrypted);
  }

  private Salesperson caller = null;
  private LinkedList<Negotiations> BalancersDirectory = null;
  public static BufferedWriter InputInitiate = null;
}
