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

public class OutgrowthTrainer {
  public static BufferedWriter ThroughputDocument = null;

  public synchronized void tally(String[] incumbents) {
    String[] cassette = incumbents;
    caller = new Consignor();
    AutocorrelationShortlist = new LinkedList<>();
    DialRanking = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ThroughputDocument =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException officio) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String database : cassette) {
        String proceduresIdentifying;
        String way;
        String perspective;
        String awk;
        Pattern practice;
        Matcher synchroniser;
        Queue<Integer> requisitions;
        int site;
        proceduresIdentifying = database.substring(0, database.lastIndexOf("."));
        way = "./out/production/c3063467A3/" + database;
        perspective = perusedArchives(way, StandardCharsets.UTF_8);
        awk = "[\\r\\n]+(?<PAGE>[\\d]+)";
        practice = Pattern.compile(awk);
        synchroniser = practice.matcher(perspective);
        requisitions = new LinkedList<>();

        while (synchroniser.find()) {
          requisitions.add(Integer.parseInt(synchroniser.group("PAGE")));
        }

        if (requisitions.size() > 50)
          throw new IOException(
              "Process: "
                  + proceduresIdentifying
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + database);
        site = Math.floorDiv(30, cassette.length);
        AutocorrelationShortlist.add(new Operation(proceduresIdentifying, requisitions, site));
        DialRanking.add(new Operation(proceduresIdentifying, new LinkedList<>(requisitions), site));
      }
    } catch (Exception eden) {
      System.out.println(eden.toString());
      exit(0);
    }
    caller.arrangeBetasMethods(AutocorrelationShortlist);
    caller.prepareDialMethodologies(DialRanking);
    caller.playSalesperson();

    try {
      OutgrowthTrainer.ThroughputDocument.close();
    } catch (IOException adrian) {
      System.out.println(adrian.toString());
    }
  }

  public LinkedList<Operation> DialRanking = null;
  public LinkedList<Operation> AutocorrelationShortlist = null;
  public Consignor caller = null;

  public static synchronized String perusedArchives(String roadway, Charset coding)
      throws IOException {
    byte[] decodes = Files.readAllBytes(Paths.get(roadway));
    return new String(decodes, coding);
  }
}
