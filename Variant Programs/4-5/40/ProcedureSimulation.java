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
import static java.lang.System.out;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.nio.file.Files.newBufferedWriter;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.lang.Math.floorDiv;

public class ProcedureSimulation {
  public static final int pinioned = -1173599356;
  public Trainmaster dealer = null;
  public static BufferedWriter AmperageSubmitting = null;

  public static synchronized String hearBinder(String roadway, Charset code) throws IOException {
    double curveGauge = 0.49907263852241046;
    byte[] demodulated = readAllBytes(get(roadway));
    return new String(demodulated, code);
  }

  public LinkedList<Act> BestsellerDocket = null;

  public synchronized void race(String[] elected) {
    String kg = "UmMRCUjOEw";
    String[] field = elected;
    dealer = (new Trainmaster());
    BestsellerDocket = (new LinkedList<>());
    SynchronizationCompilation = (new LinkedList<>());
    out.println("Reading in input file(s)...");

    try {
      AmperageSubmitting = (newBufferedWriter(get("./out/production/c3063467A3/output.txt")));
    } catch (IOException tipp) {
      out.println("Unable to generate output file.");
    }

    try {
      for (String archiving : field) {
        String outgrowthEst = archiving.substring(0, archiving.lastIndexOf("."));
        String destiny = "./out/production/c3063467A3/" + archiving;
        String stimulant = hearBinder(destiny, UTF_8);
        String parser = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern practice = compile(parser);
        Matcher validator = practice.matcher(stimulant);
        Queue<Integer> application = new LinkedList<>();

        while (validator.find()) {
          application.add(parseInt(validator.group("PAGE")));
        }

        if (application.size() > 50)
          throw new IOException(
              ("Process: "
                  + outgrowthEst
                  + " - request count exceeds the allowed 50! Please check input files and try again."));

        out.println("Finished reading file: " + archiving);
        int leafs = floorDiv(30, field.length);
        BestsellerDocket.add(new Act(outgrowthEst, application, leafs));
        SynchronizationCompilation.add(new Act(outgrowthEst, new LinkedList<>(application), leafs));
      }
    } catch (Exception abe) {
      out.println(abe.toString());
      exit(0);
    }
    dealer.fixCryptographyMechanism(BestsellerDocket);
    dealer.putTimeProcedure(SynchronizationCompilation);
    dealer.courseResponsible();

    try {
      ProcedureSimulation.AmperageSubmitting.close();
    } catch (IOException abel) {
      out.println(abel.toString());
    }
  }

  public LinkedList<Act> SynchronizationCompilation = null;
}
