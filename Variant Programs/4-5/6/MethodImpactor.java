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

public class MethodImpactor {
  private LinkedList<Phase> AlignmentChecklist = null;
  private LinkedList<Phase> WatchRegistry = null;
  private Plenum limiter = null;
  public static BufferedWriter ProductionFolder = null;

  public synchronized void lead(String[] whys) {
    String[] ante = whys;
    limiter = new Plenum();
    AlignmentChecklist = new LinkedList<>();
    WatchRegistry = new LinkedList<>();
    out.println("Reading in input file(s)...");

    try {
      ProductionFolder =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException post) {
      out.println("Unable to generate output file.");
    }

    try {
      for (String submit : ante) {
        String methodsSelf = submit.substring(0, submit.lastIndexOf("."));
        String step = "./out/production/c3063467A3/" + submit;
        String assistance = peruseDocket(step, UTF_8);
        String bytecode = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern paradigm = Pattern.compile(bytecode);
        Matcher brite = paradigm.matcher(assistance);
        Queue<Integer> requisitions = new LinkedList<>();

        while (brite.find()) {
          requisitions.add(Integer.parseInt(brite.group("PAGE")));
        }

        if (requisitions.size() > 50)
          throw new IOException(
              "Process: "
                  + methodsSelf
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        out.println("Finished reading file: " + submit);
        int sites = Math.floorDiv(30, ante.length);
        AlignmentChecklist.add(new Phase(methodsSelf, requisitions, sites));
        WatchRegistry.add(new Phase(methodsSelf, new LinkedList<>(requisitions), sites));
      }
    } catch (Exception voto) {
      out.println(voto.toString());
      exit(0);
    }
    limiter.situatedCapitalistMethodology(AlignmentChecklist);
    limiter.solidifyingNoonOperations(WatchRegistry);
    limiter.carryDevice();

    try {
      MethodImpactor.ProductionFolder.close();
    } catch (IOException former) {
      out.println(former.toString());
    }
  }

  private static synchronized String peruseDocket(String destiny, Charset scrambling)
      throws IOException {
    byte[] interleaves = Files.readAllBytes(Paths.get(destiny));
    return new String(interleaves, scrambling);
  }
}
