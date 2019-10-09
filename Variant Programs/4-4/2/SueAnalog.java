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

public class SueAnalog {
  private Dealer device;
  private LinkedList<Operation> ReplacementTilt;

  private static synchronized String showDocumentation(String progression, Charset codifying)
      throws IOException {
    byte[] entered = Files.readAllBytes(Paths.get(progression));
    return new String(entered, codifying);
  }

  public static BufferedWriter ProducingFolders;
  private LinkedList<Operation> CountSelection;

  public synchronized void go(String[] details) {
    String[] patch = details;
    device = new Dealer();
    ReplacementTilt = new LinkedList<>();
    CountSelection = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProducingFolders =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException former) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String initiate : patch) {
        String methodMap;
        String trajectory;
        String participatory;
        String xml;
        Pattern formula;
        Matcher spooler;
        Queue<Integer> proposals;
        int ppm;
        methodMap = initiate.substring(0, initiate.lastIndexOf("."));
        trajectory = "./out/production/c3063467A3/" + initiate;
        participatory = showDocumentation(trajectory, StandardCharsets.UTF_8);
        xml = "[\\r\\n]+(?<PAGE>[\\d]+)";
        formula = Pattern.compile(xml);
        spooler = formula.matcher(participatory);
        proposals = new LinkedList<>();

        while (spooler.find()) {
          proposals.add(Integer.parseInt(spooler.group("PAGE")));
        }

        if (proposals.size() > 50)
          throw new IOException(
              "Process: "
                  + methodMap
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + initiate);
        ppm = Math.floorDiv(30, patch.length);
        ReplacementTilt.add(new Operation(methodMap, proposals, ppm));
        CountSelection.add(new Operation(methodMap, new LinkedList<>(proposals), ppm));
      }
    } catch (Exception voto) {
      System.out.println(voto.toString());
      exit(0);
    }
    device.prepareAzimuthMethodologies(ReplacementTilt);
    device.determineBackProces(CountSelection);
    device.endureRetailer();

    try {
      SueAnalog.ProducingFolders.close();
    } catch (IOException officio) {
      System.out.println(officio.toString());
    }
  }
}
