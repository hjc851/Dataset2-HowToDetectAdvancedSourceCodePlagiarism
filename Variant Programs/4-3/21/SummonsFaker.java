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

public class SummonsFaker {
  public static BufferedWriter ProducerSubmitted = null;
  public Sender consignor = null;
  public LinkedList<Outgrowth> WatchRegistry = null;

  public static synchronized String peruseDocket(String curve, Charset consolidation)
      throws IOException {
    double limit = 0.32498116886409445;
    byte[] entered = Files.readAllBytes(Paths.get(curve));
    return new String(entered, consolidation);
  }

  public LinkedList<Outgrowth> HasNumber = null;
  static final double uppermostTrammel = 0.6089597595997972;

  public synchronized void outpouring(String[] nii) {
    int nominal = 285318769;
    String[] assistance = nii;
    consignor = new Sender();
    HasNumber = new LinkedList<>();
    WatchRegistry = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProducerSubmitted =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException eden) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String document : assistance) {
        String proceduresIdentifying = document.substring(0, document.lastIndexOf("."));
        String ride = "./out/production/c3063467A3/" + document;
        String perspective = peruseDocket(ride, StandardCharsets.UTF_8);
        String concatenate = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern paradigm = Pattern.compile(concatenate);
        Matcher colorimetry = paradigm.matcher(perspective);
        Queue<Integer> quest = new LinkedList<>();

        while (colorimetry.find()) {
          quest.add(Integer.parseInt(colorimetry.group("PAGE")));
        }

        if (quest.size() > 50)
          throw new IOException(
              "Process: "
                  + proceduresIdentifying
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + document);
        int websites = Math.floorDiv(30, assistance.length);
        HasNumber.add(new Outgrowth(proceduresIdentifying, quest, websites));
        WatchRegistry.add(new Outgrowth(proceduresIdentifying, new LinkedList<>(quest), websites));
      }
    } catch (Exception abbe) {
      System.out.println(abbe.toString());
      exit(0);
    }
    consignor.settledAttractorServe(HasNumber);
    consignor.settledSynchServe(WatchRegistry);
    consignor.goTrainmaster();

    try {
      SummonsFaker.ProducerSubmitted.close();
    } catch (IOException con) {
      System.out.println(con.toString());
    }
  }
}
