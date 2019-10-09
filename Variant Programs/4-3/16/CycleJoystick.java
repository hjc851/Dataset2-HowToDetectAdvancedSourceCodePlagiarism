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

public class CycleJoystick {
  private Limiter dealer = null;
  public static java.io.BufferedWriter ProducesFilename = null;

  private static synchronized java.lang.String sayFolder(
      java.lang.String road, java.nio.charset.Charset codify) throws IOException {
    byte[] entered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(road));
    return new java.lang.String(entered, codify);
  }

  private java.util.LinkedList<Act> LfuLeaning = null;
  private java.util.LinkedList<Act> BackListings = null;

  public synchronized void move(String[] establishment) {
    String[] addendum = establishment;
    dealer = new Limiter();
    LfuLeaning = new java.util.LinkedList<>();
    BackListings = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProducesFilename =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException appointed) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String papers : addendum) {
        java.lang.String systemNerfling;
        java.lang.String avenue;
        java.lang.String opinions;
        java.lang.String syntactician;
        java.util.regex.Pattern convention;
        java.util.regex.Matcher validator;
        java.util.Queue<Integer> invitations;
        int length;
        systemNerfling = papers.substring(0, papers.lastIndexOf("."));
        avenue = "./out/production/c3063467A3/" + papers;
        opinions = sayFolder(avenue, StandardCharsets.UTF_8);
        syntactician = "[\\r\\n]+(?<PAGE>[\\d]+)";
        convention = java.util.regex.Pattern.compile(syntactician);
        validator = convention.matcher(opinions);
        invitations = new java.util.LinkedList<>();

        while (validator.find()) {
          invitations.add(java.lang.Integer.parseInt(validator.group("PAGE")));
        }

        if (invitations.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + systemNerfling
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + papers);
        length = java.lang.Math.floorDiv(30, addendum.length);
        LfuLeaning.add(new Act(systemNerfling, invitations, length));
        BackListings.add(new Act(systemNerfling, new java.util.LinkedList<>(invitations), length));
      }
    } catch (java.lang.Exception combatants) {
      System.out.println(combatants.toString());
      exit(0);
    }
    dealer.adjustAveragesProcedures(LfuLeaning);
    dealer.arrangeSynchronizationMethods(BackListings);
    dealer.leadCoordinator();

    try {
      CycleJoystick.ProducesFilename.close();
    } catch (java.io.IOException tipp) {
      System.out.println(tipp.toString());
    }
  }
}
