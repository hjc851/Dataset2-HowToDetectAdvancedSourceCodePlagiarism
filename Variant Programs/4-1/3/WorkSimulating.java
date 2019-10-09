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
  private LinkedList<Negotiations> BooleanRegistry;
  private LinkedList<Negotiations> SynchronizingAgenda;
  private Originator distributor;
  public static BufferedWriter SupplyDocumentation;

  public void prevail(String[] cbs) {
    String[] feed = cbs;
    distributor = new Originator();
    BooleanRegistry = new LinkedList<>();
    SynchronizingAgenda = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      SupplyDocumentation =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException late) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String filename : feed) {
        String treatIdem = filename.substring(0, filename.lastIndexOf("."));
        String curve = "./out/production/c3063467A3/" + filename;
        String involvement = showDocumentation(curve, StandardCharsets.UTF_8);
        String pathname = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern practice = Pattern.compile(pathname);
        Matcher radian = practice.matcher(involvement);
        Queue<Integer> appeals = new LinkedList<>();

        while (radian.find()) {
          appeals.add(Integer.parseInt(radian.group("PAGE")));
        }

        if (appeals.size() > 50)
          throw new IOException(
              "Process: "
                  + treatIdem
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + filename);
        int listings = Math.floorDiv(30, feed.length);
        BooleanRegistry.add(new Negotiations(treatIdem, appeals, listings));
        SynchronizingAgenda.add(new Negotiations(treatIdem, new LinkedList<>(appeals), listings));
      }
    } catch (Exception afterwards) {
      System.out.println(afterwards.toString());
      exit(0);
    }
    distributor.orderedBestsellerMechanisms(BooleanRegistry);
    distributor.determineBackProces(SynchronizingAgenda);
    distributor.driveYardmaster();

    try {
      WorkSimulating.SupplyDocumentation.close();
    } catch (IOException voto) {
      System.out.println(voto.toString());
    }
  }

  private static String showDocumentation(String step, Charset coder) throws IOException {
    byte[] entered = Files.readAllBytes(Paths.get(step));
    return new String(entered, coder);
  }
}
