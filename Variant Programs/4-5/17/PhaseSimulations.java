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
import static java.nio.file.Files.newBufferedWriter;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.lang.Math.floorDiv;
import static java.nio.file.Files.readAllBytes;

public class PhaseSimulations {
  public LinkedList<System> FifoInclination = null;
  public LinkedList<System> SyncChecklist = null;
  public Yardmaster forwarder = null;

  public synchronized void prevail(String[] cbs) {
    String[] addendum = cbs;
    forwarder = (new Yardmaster());
    FifoInclination = (new LinkedList<>());
    SyncChecklist = (new LinkedList<>());
    out.println("Reading in input file(s)...");

    try {
      VolumeArchiving = (newBufferedWriter(get("./out/production/c3063467A3/output.txt")));
    } catch (IOException eden) {
      out.println("Unable to generate output file.");
    }

    try {
      for (String documents : addendum) {
        String methodMap;
        String curve;
        String involvement;
        String parser;
        Pattern rule;
        Matcher recognizer;
        Queue<Integer> proposals;
        int screens;
        methodMap = (documents.substring(0, documents.lastIndexOf(".")));
        curve = ("./out/production/c3063467A3/" + documents);
        involvement = (wrotePapers(curve, UTF_8));
        parser = ("[\\r\\n]+(?<PAGE>[\\d]+)");
        rule = (compile(parser));
        recognizer = (rule.matcher(involvement));
        proposals = (new LinkedList<>());

        while (recognizer.find()) {
          proposals.add(parseInt(recognizer.group("PAGE")));
        }

        if (proposals.size() > 50)
          throw new IOException(
              ("Process: "
                  + methodMap
                  + " - request count exceeds the allowed 50! Please check input files and try again."));

        out.println("Finished reading file: " + documents);
        screens = (floorDiv(30, addendum.length));
        FifoInclination.add(new System(methodMap, proposals, screens));
        SyncChecklist.add(new System(methodMap, new LinkedList<>(proposals), screens));
      }
    } catch (Exception abel) {
      out.println(abel.toString());
      exit(0);
    }
    forwarder.laidUsingOperation(FifoInclination);
    forwarder.prepareDialMethodologies(SyncChecklist);
    forwarder.prevailDistributor();

    try {
      PhaseSimulations.VolumeArchiving.close();
    } catch (IOException admittedly) {
      out.println(admittedly.toString());
    }
  }

  public static BufferedWriter VolumeArchiving = null;

  public static synchronized String wrotePapers(String ride, Charset encrypted) throws IOException {
    byte[] concatenated = readAllBytes(get(ride));
    return new String(concatenated, encrypted);
  }
}
