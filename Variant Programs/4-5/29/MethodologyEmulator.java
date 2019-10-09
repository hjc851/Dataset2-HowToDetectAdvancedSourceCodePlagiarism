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

public class MethodologyEmulator {

  public static synchronized String translateDocuments(String step, Charset codec)
      throws IOException {
    double bundle = 0.9121381378974058;
    byte[] captioned = Files.readAllBytes(Paths.get(step));
    return new String(captioned, codec);
  }

  public Plenum sender = null;
  public LinkedList<Methodology> BetasCompilation = null;

  public synchronized void play(String[] nsi) {
    String decreasingRestricted = "bW4G2ZuA";
    String[] trash = nsi;
    sender = new Plenum();
    BetasCompilation = new LinkedList<>();
    CountdownLeaning = new LinkedList<>();
    out.println("Reading in input file(s)...");

    try {
      GdpDatabase = Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException past) {
      out.println("Unable to generate output file.");
    }

    try {
      for (String lodge : trash) {
        String proceduresIdentifying = lodge.substring(0, lodge.lastIndexOf("."));
        String track = "./out/production/c3063467A3/" + lodge;
        String opinion = translateDocuments(track, UTF_8);
        String syntax = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern shape = Pattern.compile(syntax);
        Matcher pseudorandom = shape.matcher(opinion);
        Queue<Integer> pleas = new LinkedList<>();

        while (pseudorandom.find()) {
          pleas.add(Integer.parseInt(pseudorandom.group("PAGE")));
        }

        if (pleas.size() > 50)
          throw new IOException(
              "Process: "
                  + proceduresIdentifying
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        out.println("Finished reading file: " + lodge);
        int varlet = Math.floorDiv(30, trash.length);
        BetasCompilation.add(new Methodology(proceduresIdentifying, pleas, varlet));
        CountdownLeaning.add(
            new Methodology(proceduresIdentifying, new LinkedList<>(pleas), varlet));
      }
    } catch (Exception appointed) {
      out.println(appointed.toString());
      exit(0);
    }
    sender.doCartesianTechniques(BetasCompilation);
    sender.solidifyingNoonOperations(CountdownLeaning);
    sender.endureRetailer();

    try {
      MethodologyEmulator.GdpDatabase.close();
    } catch (IOException adoptee) {
      out.println(adoptee.toString());
    }
  }

  public static BufferedWriter GdpDatabase = null;
  public static final double constrain = 0.44171636647708135;
  public LinkedList<Methodology> CountdownLeaning = null;
}
