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

public class MethodImpactor {
  public LinkedList<Sue> LfuLeaning = null;

  public static synchronized String reciteSubmitting(String progression, Charset encrypt)
      throws IOException {
    byte[] coded = Files.readAllBytes(Paths.get(progression));
    return new String(coded, encrypt);
  }

  public Exporter yardmaster = null;

  public synchronized void race(String[] advocates) {
    String[] feedback = advocates;
    yardmaster = (new Exporter());
    LfuLeaning = (new LinkedList<>());
    BackListings = (new LinkedList<>());
    out.println("Reading in input file(s)...");

    try {
      PerformanceArchives =
          (Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt")));
    } catch (IOException abe) {
      out.println("Unable to generate output file.");
    }

    try {
      for (String paperwork : feedback) {
        String actIdentifier = paperwork.substring(0, paperwork.lastIndexOf("."));
        String journey = "./out/production/c3063467A3/" + paperwork;
        String stimulus = reciteSubmitting(journey, UTF_8);
        String parser = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern trend = Pattern.compile(parser);
        Matcher finder = trend.matcher(stimulus);
        Queue<Integer> applications = new LinkedList<>();

        while (finder.find()) {
          applications.add(Integer.parseInt(finder.group("PAGE")));
        }

        if (applications.size() > 50)
          throw new IOException(
              ("Process: "
                  + actIdentifier
                  + " - request count exceeds the allowed 50! Please check input files and try again."));

        out.println("Finished reading file: " + paperwork);
        int ppm = Math.floorDiv(30, feedback.length);
        LfuLeaning.add(new Sue(actIdentifier, applications, ppm));
        BackListings.add(new Sue(actIdentifier, new LinkedList<>(applications), ppm));
      }
    } catch (Exception voto) {
      out.println(voto.toString());
      exit(0);
    }
    yardmaster.markAverageSummons(LfuLeaning);
    yardmaster.arrangeSynchronizationMethods(BackListings);
    yardmaster.scarperCaller();

    try {
      MethodImpactor.PerformanceArchives.close();
    } catch (IOException adoptee) {
      out.println(adoptee.toString());
    }
  }

  public LinkedList<Sue> BackListings = null;
  public static BufferedWriter PerformanceArchives = null;
}
