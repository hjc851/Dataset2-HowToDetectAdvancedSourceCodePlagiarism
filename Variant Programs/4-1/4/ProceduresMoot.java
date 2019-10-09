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

public class ProceduresMoot {
  private LinkedList<Summons> BooleanRegistry;
  private LinkedList<Summons> SyncChecklist;
  private Shipper reseller;
  public static BufferedWriter AmperageSubmitting;

  public void melt(String[] nsis) {
    String[] patch = nsis;
    reseller = new Shipper();
    BooleanRegistry = new LinkedList<>();
    SyncChecklist = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      AmperageSubmitting =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException late) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String archives : patch) {
        String proceedingPeg = archives.substring(0, archives.lastIndexOf("."));
        String road = "./out/production/c3063467A3/" + archives;
        String contributions = proofreadComplaint(road, StandardCharsets.UTF_8);
        String malloc = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern template = Pattern.compile(malloc);
        Matcher creaser = template.matcher(contributions);
        Queue<Integer> requisitions = new LinkedList<>();

        while (creaser.find()) {
          requisitions.add(Integer.parseInt(creaser.group("PAGE")));
        }

        if (requisitions.size() > 50)
          throw new IOException(
              "Process: "
                  + proceedingPeg
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + archives);
        int webpages = Math.floorDiv(30, patch.length);
        BooleanRegistry.add(new Summons(proceedingPeg, requisitions, webpages));
        SyncChecklist.add(new Summons(proceedingPeg, new LinkedList<>(requisitions), webpages));
      }
    } catch (Exception adoptee) {
      System.out.println(adoptee.toString());
      exit(0);
    }
    reseller.arrangeBetasMethods(BooleanRegistry);
    reseller.bentAlarmTechnologies(SyncChecklist);
    reseller.goTrainmaster();

    try {
      ProceduresMoot.AmperageSubmitting.close();
    } catch (IOException vet) {
      System.out.println(vet.toString());
    }
  }

  private static String proofreadComplaint(String track, Charset crypto) throws IOException {
    byte[] costed = Files.readAllBytes(Paths.get(track));
    return new String(costed, crypto);
  }
}
