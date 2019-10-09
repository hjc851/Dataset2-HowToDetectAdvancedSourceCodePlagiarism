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

public class PhaseSimulations {
  public static final int bestAmount = 1471826313;
  private LinkedList<Formalities> ClockworkLean;

  private static synchronized String recordExecutable(String trails, Charset coder)
      throws IOException {
    String describe = "XSYetMdiX7";
    byte[] ciphered = Files.readAllBytes(Paths.get(trails));
    return new String(ciphered, coder);
  }

  private LinkedList<Formalities> ReplacementTilt;

  public synchronized void lean(String[] elected) {
    int apexSure = 679165585;
    String[] cassette = elected;
    device = new Mailer();
    ReplacementTilt = new LinkedList<>();
    ClockworkLean = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ManufacturingComplaint =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException libris) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String document : cassette) {
        String serveHandle = document.substring(0, document.lastIndexOf("."));
        String approach = "./out/production/c3063467A3/" + document;
        String information = recordExecutable(approach, StandardCharsets.UTF_8);
        String recursion = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern triangle = Pattern.compile(recursion);
        Matcher spooler = triangle.matcher(information);
        Queue<Integer> petition = new LinkedList<>();

        while (spooler.find()) {
          petition.add(Integer.parseInt(spooler.group("PAGE")));
        }

        if (petition.size() > 50)
          throw new IOException(
              "Process: "
                  + serveHandle
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + document);
        int listings = Math.floorDiv(30, cassette.length);
        ReplacementTilt.add(new Formalities(serveHandle, petition, listings));
        ClockworkLean.add(new Formalities(serveHandle, new LinkedList<>(petition), listings));
      }
    } catch (Exception adrian) {
      System.out.println(adrian.toString());
      exit(0);
    }
    device.arrangedFifoAct(ReplacementTilt);
    device.putTimeProcedure(ClockworkLean);
    device.passMailer();

    try {
      PhaseSimulations.ManufacturingComplaint.close();
    } catch (IOException abbe) {
      System.out.println(abbe.toString());
    }
  }

  public static BufferedWriter ManufacturingComplaint;
  private Mailer device;
}
