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

public class LitigateMimic {
  private LinkedList<Summons> EstimationPlaylist;
  private LinkedList<Summons> SynchronizingAgenda;
  private Device coordinator;
  public static BufferedWriter VolumeArchiving;

  public void tally(String[] details) {
    String[] field = details;
    coordinator = new Device();
    EstimationPlaylist = new LinkedList<>();
    SynchronizingAgenda = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      VolumeArchiving =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException aba) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String application : field) {
        String actIdentifier = application.substring(0, application.lastIndexOf("."));
        String way = "./out/production/c3063467A3/" + application;
        String opinion = scanFolders(way, StandardCharsets.UTF_8);
        String grep = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern normal = Pattern.compile(grep);
        Matcher validator = normal.matcher(opinion);
        Queue<Integer> orders = new LinkedList<>();

        while (validator.find()) {
          orders.add(Integer.parseInt(validator.group("PAGE")));
        }

        if (orders.size() > 50)
          throw new IOException(
              "Process: "
                  + actIdentifier
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + application);
        int aspects = Math.floorDiv(30, field.length);
        EstimationPlaylist.add(new Summons(actIdentifier, orders, aspects));
        SynchronizingAgenda.add(new Summons(actIdentifier, new LinkedList<>(orders), aspects));
      }
    } catch (Exception abel) {
      System.out.println(abel.toString());
      exit(0);
    }
    coordinator.determineCartelProces(EstimationPlaylist);
    coordinator.dictatedClockworkWork(SynchronizingAgenda);
    coordinator.endureRetailer();

    try {
      LitigateMimic.VolumeArchiving.close();
    } catch (IOException con) {
      System.out.println(con.toString());
    }
  }

  private static String scanFolders(String avenue, Charset coded) throws IOException {
    byte[] concatenated = Files.readAllBytes(Paths.get(avenue));
    return new String(concatenated, coded);
  }
}
