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

public class ProceedingPrototype {
  public static BufferedWriter ManufacturingComplaint = null;
  public Retailer trainmaster = null;
  public LinkedList<Phase> WakingBibliography = null;
  public LinkedList<Phase> AlbedoBlacklist = null;

  public synchronized void footrace(String[] nih) {
    String[] cassette = nih;
    trainmaster = (new Retailer());
    AlbedoBlacklist = (new LinkedList<>());
    WakingBibliography = (new LinkedList<>());
    out.println("Reading in input file(s)...");

    try {
      ManufacturingComplaint = (newBufferedWriter(get("./out/production/c3063467A3/output.txt")));
    } catch (IOException past) {
      out.println("Unable to generate output file.");
    }

    try {
      for (String register : cassette) {
        String methodMap;
        String ride;
        String response;
        String namespace;
        Pattern normal;
        Matcher creaser;
        Queue<Integer> petitions;
        int leafs;
        methodMap = (register.substring(0, register.lastIndexOf(".")));
        ride = ("./out/production/c3063467A3/" + register);
        response = (understandCharge(ride, UTF_8));
        namespace = ("[\\r\\n]+(?<PAGE>[\\d]+)");
        normal = (compile(namespace));
        creaser = (normal.matcher(response));
        petitions = (new LinkedList<>());

        while (creaser.find()) {
          petitions.add(parseInt(creaser.group("PAGE")));
        }

        if (petitions.size() > 50)
          throw new IOException(
              ("Process: "
                  + methodMap
                  + " - request count exceeds the allowed 50! Please check input files and try again."));

        out.println("Finished reading file: " + register);
        leafs = (floorDiv(30, cassette.length));
        AlbedoBlacklist.add(new Phase(methodMap, petitions, leafs));
        WakingBibliography.add(new Phase(methodMap, new LinkedList<>(petitions), leafs));
      }
    } catch (Exception officio) {
      out.println(officio.toString());
      exit(0);
    }
    trainmaster.dictatedAssociatedWork(AlbedoBlacklist);
    trainmaster.rigidDayMethod(WakingBibliography);
    trainmaster.goTrainmaster();

    try {
      ProceedingPrototype.ManufacturingComplaint.close();
    } catch (IOException pro) {
      out.println(pro.toString());
    }
  }

  public static synchronized String understandCharge(String approach, Charset codifying)
      throws IOException {
    byte[] consolidated = readAllBytes(get(approach));
    return new String(consolidated, codifying);
  }
}
