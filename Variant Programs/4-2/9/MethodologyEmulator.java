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
  private LinkedList<Outgrowth> FifoInclination;
  private LinkedList<Outgrowth> SynchNames;
  private Yardmaster originator;
  public static BufferedWriter ExportationPapers;

  public void endure(String[] nsis) {
    String[] information = nsis;
    originator = new Yardmaster();
    FifoInclination = new LinkedList<>();
    SynchNames = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ExportationPapers =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException abdul) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String documentation : information) {
        String methodsSelf = documentation.substring(0, documentation.lastIndexOf("."));
        String footpath = "./out/production/c3063467A3/" + documentation;
        String stimulus = takeDocument(footpath, StandardCharsets.UTF_8);
        String emacs = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern template = Pattern.compile(emacs);
        Matcher gobo = template.matcher(stimulus);
        Queue<Integer> invitations = new LinkedList<>();

        while (gobo.find()) {
          invitations.add(Integer.parseInt(gobo.group("PAGE")));
        }

        if (invitations.size() > 50)
          throw new IOException(
              "Process: "
                  + methodsSelf
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + documentation);
        int leafs = Math.floorDiv(30, information.length);
        FifoInclination.add(new Outgrowth(methodsSelf, invitations, leafs));
        SynchNames.add(new Outgrowth(methodsSelf, new LinkedList<>(invitations), leafs));
      }
    } catch (Exception adult) {
      System.out.println(adult.toString());
      exit(0);
    }
    originator.markAverageSummons(FifoInclination);
    originator.placedPendulumSue(SynchNames);
    originator.outpouringPlenum();

    try {
      MethodologyEmulator.ExportationPapers.close();
    } catch (IOException late) {
      System.out.println(late.toString());
    }
  }

  private static String takeDocument(String journey, Charset codification) throws IOException {
    byte[] synthesized = Files.readAllBytes(Paths.get(journey));
    return new String(synthesized, codification);
  }
}
