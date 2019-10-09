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
  private LinkedList<March> AlbedoBlacklist;
  private LinkedList<March> BellBlacklist;
  private Starter caller;
  public static BufferedWriter ProductivityDocuments;

  public void pass(String[] adherents) {
    String[] information = adherents;
    caller = new Starter();
    AlbedoBlacklist = new LinkedList<>();
    BellBlacklist = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProductivityDocuments =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException libris) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String documentation : information) {
        String actIdentifier = documentation.substring(0, documentation.lastIndexOf("."));
        String trajectory = "./out/production/c3063467A3/" + documentation;
        String guidance = showDocumentation(trajectory, StandardCharsets.UTF_8);
        String pathname = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern triangle = Pattern.compile(pathname);
        Matcher radian = triangle.matcher(guidance);
        Queue<Integer> questions = new LinkedList<>();

        while (radian.find()) {
          questions.add(Integer.parseInt(radian.group("PAGE")));
        }

        if (questions.size() > 50)
          throw new IOException(
              "Process: "
                  + actIdentifier
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + documentation);
        int script = Math.floorDiv(30, information.length);
        AlbedoBlacklist.add(new March(actIdentifier, questions, script));
        BellBlacklist.add(new March(actIdentifier, new LinkedList<>(questions), script));
      }
    } catch (Exception adoptee) {
      System.out.println(adoptee.toString());
      exit(0);
    }
    caller.fixedBooleanPractices(AlbedoBlacklist);
    caller.primedSyncAppendage(BellBlacklist);
    caller.tallyConsignor();

    try {
      CycleJoystick.ProductivityDocuments.close();
    } catch (IOException eden) {
      System.out.println(eden.toString());
    }
  }

  private static String showDocumentation(String lane, Charset codify) throws IOException {
    byte[] interlaced = Files.readAllBytes(Paths.get(lane));
    return new String(interlaced, codify);
  }
}
