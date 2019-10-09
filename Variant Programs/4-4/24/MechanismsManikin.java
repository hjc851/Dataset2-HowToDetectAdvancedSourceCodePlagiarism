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
  public LinkedList<Litigate> UsingName;

  public synchronized void footrace(String[] nii) {
    String[] basis = nii;
    distributors = new Regulator();
    UsingName = new LinkedList<>();
    CountingLitany = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProducerSubmitted =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException adrian) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String executable : basis) {
        String mechanismsSecurity = executable.substring(0, executable.lastIndexOf("."));
        String lane = "./out/production/c3063467A3/" + executable;
        String opinions = readableArchiving(lane, StandardCharsets.UTF_8);
        String ascii = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern trends = Pattern.compile(ascii);
        Matcher collator = trends.matcher(opinions);
        Queue<Integer> calls = new LinkedList<>();

        while (collator.find()) {
          calls.add(Integer.parseInt(collator.group("PAGE")));
        }

        if (calls.size() > 50)
          throw new IOException(
              "Process: "
                  + mechanismsSecurity
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + executable);
        int site = Math.floorDiv(30, basis.length);
        UsingName.add(new Litigate(mechanismsSecurity, calls, site));
        CountingLitany.add(new Litigate(mechanismsSecurity, new LinkedList<>(calls), site));
      }
    } catch (Exception admittedly) {
      System.out.println(admittedly.toString());
      exit(0);
    }
    distributors.arrangeBetasMethods(UsingName);
    distributors.bentAlarmTechnologies(CountingLitany);
    distributors.playSalesperson();

    try {
      MechanismsManikin.ProducerSubmitted.close();
    } catch (IOException officio) {
      System.out.println(officio.toString());
    }
  }

  public Regulator distributors;

  public static synchronized String readableArchiving(String journey, Charset codification)
      throws IOException {
    byte[] interlaced = Files.readAllBytes(Paths.get(journey));
    return new String(interlaced, codification);
  }

  public static BufferedWriter ProducerSubmitted;
  public LinkedList<Litigate> CountingLitany;
}
