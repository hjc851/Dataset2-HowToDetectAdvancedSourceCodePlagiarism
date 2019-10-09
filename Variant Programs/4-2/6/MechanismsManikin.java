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
  private LinkedList<Methodology> AttractorNames;
  private LinkedList<Methodology> FrequencyDocket;
  private Salesperson limiter;
  public static BufferedWriter VolumeArchiving;

  public void bleed(String[] details) {
    String[] ante = details;
    limiter = new Salesperson();
    AttractorNames = new LinkedList<>();
    FrequencyDocket = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      VolumeArchiving =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException appointed) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String charge : ante) {
        String mechanismsSecurity = charge.substring(0, charge.lastIndexOf("."));
        String destiny = "./out/production/c3063467A3/" + charge;
        String component = tellReadme(destiny, StandardCharsets.UTF_8);
        String unicode = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern characteristic = Pattern.compile(unicode);
        Matcher specifier = characteristic.matcher(component);
        Queue<Integer> submissions = new LinkedList<>();

        while (specifier.find()) {
          submissions.add(Integer.parseInt(specifier.group("PAGE")));
        }

        if (submissions.size() > 50)
          throw new IOException(
              "Process: "
                  + mechanismsSecurity
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + charge);
        int listings = Math.floorDiv(30, ante.length);
        AttractorNames.add(new Methodology(mechanismsSecurity, submissions, listings));
        FrequencyDocket.add(
            new Methodology(mechanismsSecurity, new LinkedList<>(submissions), listings));
      }
    } catch (Exception former) {
      System.out.println(former.toString());
      exit(0);
    }
    limiter.placeBalancersSystems(AttractorNames);
    limiter.doWakingTechniques(FrequencyDocket);
    limiter.goTrainmaster();

    try {
      MechanismsManikin.VolumeArchiving.close();
    } catch (IOException abe) {
      System.out.println(abe.toString());
    }
  }

  private static String tellReadme(String pathways, Charset code) throws IOException {
    byte[] transmit = Files.readAllBytes(Paths.get(pathways));
    return new String(transmit, code);
  }
}
