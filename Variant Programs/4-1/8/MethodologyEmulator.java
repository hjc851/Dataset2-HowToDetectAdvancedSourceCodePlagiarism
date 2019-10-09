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

public class MethodologyEmulator {
  private LinkedList<Summons> LfuLeaning;
  private LinkedList<Summons> BackListings;
  private Starter dealer;
  public static BufferedWriter ProducePaperwork;

  public void move(String[] proponents) {
    String[] addendum = proponents;
    dealer = new Starter();
    LfuLeaning = new LinkedList<>();
    BackListings = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProducePaperwork =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException abel) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String submitted : addendum) {
        String summonsIdentification = submitted.substring(0, submitted.lastIndexOf("."));
        String curve = "./out/production/c3063467A3/" + submitted;
        String guidance = studyPaperwork(curve, StandardCharsets.UTF_8);
        String xsl = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern convention = Pattern.compile(xsl);
        Matcher finder = convention.matcher(guidance);
        Queue<Integer> requirements = new LinkedList<>();

        while (finder.find()) {
          requirements.add(Integer.parseInt(finder.group("PAGE")));
        }

        if (requirements.size() > 50)
          throw new IOException(
              "Process: "
                  + summonsIdentification
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + submitted);
        int leafs = Math.floorDiv(30, addendum.length);
        LfuLeaning.add(new Summons(summonsIdentification, requirements, leafs));
        BackListings.add(new Summons(summonsIdentification, new LinkedList<>(requirements), leafs));
      }
    } catch (Exception combatants) {
      System.out.println(combatants.toString());
      exit(0);
    }
    dealer.placeBalancersSystems(LfuLeaning);
    dealer.rigidDayMethod(BackListings);
    dealer.extendDealer();

    try {
      MethodologyEmulator.ProducePaperwork.close();
    } catch (IOException post) {
      System.out.println(post.toString());
    }
  }

  private static String studyPaperwork(String track, Charset codified) throws IOException {
    byte[] instantiated = Files.readAllBytes(Paths.get(track));
    return new String(instantiated, codified);
  }
}
