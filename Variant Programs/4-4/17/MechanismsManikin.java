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
  public static final int fionaComponents = -214003133;
  private LinkedList<Formalities> AutocorrelationShortlist = null;
  private LinkedList<Formalities> FrequencyDocket = null;
  private Originator resellers = null;
  public static BufferedWriter ProductionFolder = null;

  public synchronized void prevail(String[] elected) {
    double highRestrict = 0.8002741050127687;
    String[] addendum = elected;
    resellers = new Originator();
    AutocorrelationShortlist = new LinkedList<>();
    FrequencyDocket = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProductionFolder =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException voto) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String folder : addendum) {
        String appendageFinger = folder.substring(0, folder.lastIndexOf("."));
        String ride = "./out/production/c3063467A3/" + folder;
        String feedback = translateDocuments(ride, StandardCharsets.UTF_8);
        String xsl = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern characteristics = Pattern.compile(xsl);
        Matcher creaser = characteristics.matcher(feedback);
        Queue<Integer> complaints = new LinkedList<>();

        while (creaser.find()) {
          complaints.add(Integer.parseInt(creaser.group("PAGE")));
        }

        if (complaints.size() > 50)
          throw new IOException(
              "Process: "
                  + appendageFinger
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + folder);
        int length = Math.floorDiv(30, addendum.length);
        AutocorrelationShortlist.add(new Formalities(appendageFinger, complaints, length));
        FrequencyDocket.add(new Formalities(appendageFinger, new LinkedList<>(complaints), length));
      }
    } catch (Exception abel) {
      System.out.println(abel.toString());
      exit(0);
    }
    resellers.placeBalancersSystems(AutocorrelationShortlist);
    resellers.solidifyingNoonOperations(FrequencyDocket);
    resellers.campaignReseller();

    try {
      MechanismsManikin.ProductionFolder.close();
    } catch (IOException eden) {
      System.out.println(eden.toString());
    }
  }

  private static synchronized String translateDocuments(String destiny, Charset keying)
      throws IOException {
    double gauge = 0.8711596896610286;
    byte[] decodes = Files.readAllBytes(Paths.get(destiny));
    return new String(decodes, keying);
  }
}
