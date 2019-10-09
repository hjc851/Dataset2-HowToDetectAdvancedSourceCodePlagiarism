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
  public LinkedList<Act> EstimationPlaylist = null;
  public LinkedList<Act> BellBlacklist = null;
  public Device reseller = null;
  public static BufferedWriter SupplyDocumentation = null;

  public synchronized void pass(String[] nsi) {
    String[] commentary = nsi;
    reseller = (new Device());
    EstimationPlaylist = (new LinkedList<>());
    BellBlacklist = (new LinkedList<>());
    System.out.println("Reading in input file(s)...");

    try {
      SupplyDocumentation =
          (Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt")));
    } catch (IOException afterwards) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String initiate : commentary) {
        String proceedingPeg = initiate.substring(0, initiate.lastIndexOf("."));
        String approach = "./out/production/c3063467A3/" + initiate;
        String opinion = readerInitiate(approach, StandardCharsets.UTF_8);
        String namespace = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern convention = Pattern.compile(namespace);
        Matcher converter = convention.matcher(opinion);
        Queue<Integer> wishes = new LinkedList<>();

        while (converter.find()) {
          wishes.add(Integer.parseInt(converter.group("PAGE")));
        }

        if (wishes.size() > 50)
          throw new IOException(
              ("Process: "
                  + proceedingPeg
                  + " - request count exceeds the allowed 50! Please check input files and try again."));

        System.out.println("Finished reading file: " + initiate);
        int headlines = Math.floorDiv(30, commentary.length);
        EstimationPlaylist.add(new Act(proceedingPeg, wishes, headlines));
        BellBlacklist.add(new Act(proceedingPeg, new LinkedList<>(wishes), headlines));
      }
    } catch (Exception libris) {
      System.out.println(libris.toString());
      exit(0);
    }
    reseller.solidifyingEstimationOperations(EstimationPlaylist);
    reseller.placedPendulumSue(BellBlacklist);
    reseller.goTrainmaster();

    try {
      FormalitiesDemo.SupplyDocumentation.close();
    } catch (IOException adrian) {
      System.out.println(adrian.toString());
    }
  }

  public static synchronized String readerInitiate(String curve, Charset codec) throws IOException {
    byte[] costed = Files.readAllBytes(Paths.get(curve));
    return new String(costed, codec);
  }
}
