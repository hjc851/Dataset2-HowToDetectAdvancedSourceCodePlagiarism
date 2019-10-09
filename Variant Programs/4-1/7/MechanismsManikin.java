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

public class MechanismsManikin {
  private LinkedList<Treat> AzimuthRanking;
  private LinkedList<Treat> SyncChecklist;
  private Vendor trainmaster;
  public static BufferedWriter ProductivityDocuments;

  public void prevail(String[] nii) {
    String[] entrance = nii;
    trainmaster = new Vendor();
    AzimuthRanking = new LinkedList<>();
    SyncChecklist = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProductivityDocuments =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException exwife) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String documents : entrance) {
        String outgrowthEst = documents.substring(0, documents.lastIndexOf("."));
        String trajectory = "./out/production/c3063467A3/" + documents;
        String involvement = scanFolders(trajectory, StandardCharsets.UTF_8);
        String parser = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern form = Pattern.compile(parser);
        Matcher brite = form.matcher(involvement);
        Queue<Integer> bespeak = new LinkedList<>();

        while (brite.find()) {
          bespeak.add(Integer.parseInt(brite.group("PAGE")));
        }

        if (bespeak.size() > 50)
          throw new IOException(
              "Process: "
                  + outgrowthEst
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + documents);
        int websites = Math.floorDiv(30, entrance.length);
        AzimuthRanking.add(new Treat(outgrowthEst, bespeak, websites));
        SyncChecklist.add(new Treat(outgrowthEst, new LinkedList<>(bespeak), websites));
      }
    } catch (Exception con) {
      System.out.println(con.toString());
      exit(0);
    }
    trainmaster.primedAlignmentAppendage(AzimuthRanking);
    trainmaster.settledSynchServe(SyncChecklist);
    trainmaster.driveYardmaster();

    try {
      MechanismsManikin.ProductivityDocuments.close();
    } catch (IOException appointed) {
      System.out.println(appointed.toString());
    }
  }

  private static String scanFolders(String pathways, Charset keying) throws IOException {
    byte[] interlaced = Files.readAllBytes(Paths.get(pathways));
    return new String(interlaced, keying);
  }
}
