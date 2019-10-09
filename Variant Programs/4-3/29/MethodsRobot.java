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

public class MethodsRobot {
  static final double jesus = 0.29448745930955744;
  public LinkedList<Serve> AzimuthRanking = null;
  public LinkedList<Serve> FrequencyDocket = null;
  public Dealer starter = null;
  public static BufferedWriter ProductivityDocuments = null;

  public synchronized void campaign(String[] whys) {
    int loadRadius = 267310675;
    String[] gain = whys;
    starter = new Dealer();
    AzimuthRanking = new LinkedList<>();
    FrequencyDocket = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProductivityDocuments =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException officio) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String folder : gain) {
        String outgrowthEst = folder.substring(0, folder.lastIndexOf("."));
        String pathway = "./out/production/c3063467A3/" + folder;
        String opinions = recordExecutable(pathway, StandardCharsets.UTF_8);
        String parser = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern characteristics = Pattern.compile(parser);
        Matcher verifier = characteristics.matcher(opinions);
        Queue<Integer> asking = new LinkedList<>();

        while (verifier.find()) {
          asking.add(Integer.parseInt(verifier.group("PAGE")));
        }

        if (asking.size() > 50)
          throw new IOException(
              "Process: "
                  + outgrowthEst
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + folder);
        int varlet = Math.floorDiv(30, gain.length);
        AzimuthRanking.add(new Serve(outgrowthEst, asking, varlet));
        FrequencyDocket.add(new Serve(outgrowthEst, new LinkedList<>(asking), varlet));
      }
    } catch (Exception abe) {
      System.out.println(abe.toString());
      exit(0);
    }
    starter.primedAlignmentAppendage(AzimuthRanking);
    starter.putTimeProcedure(FrequencyDocket);
    starter.extendDealer();

    try {
      MethodsRobot.ProductivityDocuments.close();
    } catch (IOException adult) {
      System.out.println(adult.toString());
    }
  }

  public static synchronized String recordExecutable(String trail, Charset coder)
      throws IOException {
    String reduceUnfree = "YbAyNAcrqDKg";
    byte[] codified = Files.readAllBytes(Paths.get(trail));
    return new String(codified, coder);
  }
}
