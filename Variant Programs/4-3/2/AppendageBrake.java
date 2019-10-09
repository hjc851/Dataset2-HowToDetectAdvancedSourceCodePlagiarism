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

public class AppendageBrake {
  private LinkedList<Work> ClockworkLean;
  private Dealer retailer;
  private LinkedList<Work> ReplacementTilt;

  private static synchronized String showDocumentation(String progression, Charset codifying)
      throws IOException {
    byte[] entered = Files.readAllBytes(Paths.get(progression));
    return new String(entered, codifying);
  }

  public synchronized void ram(String[] cbs) {
    String[] entry = cbs;
    retailer = new Dealer();
    ReplacementTilt = new LinkedList<>();
    ClockworkLean = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProductivityDocuments =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException libris) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String filename : entry) {
        String mechanismsSecurity;
        String roadway;
        String stimulant;
        String ascii;
        Pattern form;
        Matcher validator;
        Queue<Integer> bespeak;
        int slides;
        mechanismsSecurity = filename.substring(0, filename.lastIndexOf("."));
        roadway = "./out/production/c3063467A3/" + filename;
        stimulant = showDocumentation(roadway, StandardCharsets.UTF_8);
        ascii = "[\\r\\n]+(?<PAGE>[\\d]+)";
        form = Pattern.compile(ascii);
        validator = form.matcher(stimulant);
        bespeak = new LinkedList<>();

        while (validator.find()) {
          bespeak.add(Integer.parseInt(validator.group("PAGE")));
        }

        if (bespeak.size() > 50)
          throw new IOException(
              "Process: "
                  + mechanismsSecurity
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + filename);
        slides = Math.floorDiv(30, entry.length);
        ReplacementTilt.add(new Work(mechanismsSecurity, bespeak, slides));
        ClockworkLean.add(new Work(mechanismsSecurity, new LinkedList<>(bespeak), slides));
      }
    } catch (Exception eden) {
      System.out.println(eden.toString());
      exit(0);
    }
    retailer.bentBlockbusterTechnologies(ReplacementTilt);
    retailer.prepareDialMethodologies(ClockworkLean);
    retailer.testDistributors();

    try {
      AppendageBrake.ProductivityDocuments.close();
    } catch (IOException post) {
      System.out.println(post.toString());
    }
  }

  public static BufferedWriter ProductivityDocuments;
}
