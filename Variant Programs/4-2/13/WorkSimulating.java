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

public class WorkSimulating {
  private LinkedList<March> ReplacementTilt;
  private LinkedList<March> SynchronizingAgenda;
  private Mailer device;
  public static BufferedWriter ProducerSubmitted;

  public void drive(String[] nsis) {
    String[] entry = nsis;
    device = new Mailer();
    ReplacementTilt = new LinkedList<>();
    SynchronizingAgenda = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProducerSubmitted =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException libris) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String filename : entry) {
        String summonsIdentification = filename.substring(0, filename.lastIndexOf("."));
        String road = "./out/production/c3063467A3/" + filename;
        String stimulus = scanFolders(road, StandardCharsets.UTF_8);
        String pathname = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern motif = Pattern.compile(pathname);
        Matcher selectable = motif.matcher(stimulus);
        Queue<Integer> entreaties = new LinkedList<>();

        while (selectable.find()) {
          entreaties.add(Integer.parseInt(selectable.group("PAGE")));
        }

        if (entreaties.size() > 50)
          throw new IOException(
              "Process: "
                  + summonsIdentification
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + filename);
        int sites = Math.floorDiv(30, entry.length);
        ReplacementTilt.add(new March(summonsIdentification, entreaties, sites));
        SynchronizingAgenda.add(
            new March(summonsIdentification, new LinkedList<>(entreaties), sites));
      }
    } catch (Exception aba) {
      System.out.println(aba.toString());
      exit(0);
    }
    device.bentBlockbusterTechnologies(ReplacementTilt);
    device.fixCountMechanism(SynchronizingAgenda);
    device.passMailer();

    try {
      WorkSimulating.ProducerSubmitted.close();
    } catch (IOException former) {
      System.out.println(former.toString());
    }
  }

  private static String scanFolders(String lane, Charset codification) throws IOException {
    byte[] interlaced = Files.readAllBytes(Paths.get(lane));
    return new String(interlaced, codification);
  }
}
