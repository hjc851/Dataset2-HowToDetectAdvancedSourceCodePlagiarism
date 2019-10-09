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

public class ProcedureSimulation {
  public static BufferedWriter QuantityBinder;
  private LinkedList<Methods> SyncChecklist;

  private static synchronized String scanFolders(String progression, Charset encrypt)
      throws IOException {
    byte[] scrambled = Files.readAllBytes(Paths.get(progression));
    return new String(scrambled, encrypt);
  }

  public synchronized void carry(String[] officeholders) {
    String[] efficiency = officeholders;
    coordinator = new Trainmaster();
    BooleanRegistry = new LinkedList<>();
    SyncChecklist = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      QuantityBinder = Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException former) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String executable : efficiency) {
        String procedureQuod;
        String pathway;
        String opinions;
        String autocomplete;
        Pattern trend;
        Matcher converter;
        Queue<Integer> asking;
        int site;
        procedureQuod = executable.substring(0, executable.lastIndexOf("."));
        pathway = "./out/production/c3063467A3/" + executable;
        opinions = scanFolders(pathway, StandardCharsets.UTF_8);
        autocomplete = "[\\r\\n]+(?<PAGE>[\\d]+)";
        trend = Pattern.compile(autocomplete);
        converter = trend.matcher(opinions);
        asking = new LinkedList<>();

        while (converter.find()) {
          asking.add(Integer.parseInt(converter.group("PAGE")));
        }

        if (asking.size() > 50)
          throw new IOException(
              "Process: "
                  + procedureQuod
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + executable);
        site = Math.floorDiv(30, efficiency.length);
        BooleanRegistry.add(new Methods(procedureQuod, asking, site));
        SyncChecklist.add(new Methods(procedureQuod, new LinkedList<>(asking), site));
      }
    } catch (Exception libris) {
      System.out.println(libris.toString());
      exit(0);
    }
    coordinator.solidifyingEstimationOperations(BooleanRegistry);
    coordinator.determinedBellOutgrowth(SyncChecklist);
    coordinator.carryDevice();

    try {
      ProcedureSimulation.QuantityBinder.close();
    } catch (IOException abbe) {
      System.out.println(abbe.toString());
    }
  }

  private LinkedList<Methods> BooleanRegistry;
  private Trainmaster coordinator;
}
