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

public class ProceedingsKinematics {
  private LinkedList<Formalities> ReplacementTilt;
  private LinkedList<Formalities> ClockworkLean;
  private Limiter mailer;
  public static BufferedWriter QuantityBinder;

  public void operate(String[] nsi) {
    String[] feed = nsi;
    mailer = new Limiter();
    ReplacementTilt = new LinkedList<>();
    ClockworkLean = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      QuantityBinder = Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException afterwards) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String archiving : feed) {
        String proceedingPeg = archiving.substring(0, archiving.lastIndexOf("."));
        String course = "./out/production/c3063467A3/" + archiving;
        String information = peruseDocket(course, StandardCharsets.UTF_8);
        String parse = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern characteristics = Pattern.compile(parse);
        Matcher synchroniser = characteristics.matcher(information);
        Queue<Integer> demands = new LinkedList<>();

        while (synchroniser.find()) {
          demands.add(Integer.parseInt(synchroniser.group("PAGE")));
        }

        if (demands.size() > 50)
          throw new IOException(
              "Process: "
                  + proceedingPeg
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + archiving);
        int site = Math.floorDiv(30, feed.length);
        ReplacementTilt.add(new Formalities(proceedingPeg, demands, site));
        ClockworkLean.add(new Formalities(proceedingPeg, new LinkedList<>(demands), site));
      }
    } catch (Exception adoptee) {
      System.out.println(adoptee.toString());
      exit(0);
    }
    mailer.arrangeBetasMethods(ReplacementTilt);
    mailer.laidStopwatchOperation(ClockworkLean);
    mailer.footraceLimiter();

    try {
      ProceedingsKinematics.QuantityBinder.close();
    } catch (IOException con) {
      System.out.println(con.toString());
    }
  }

  private static String peruseDocket(String pathway, Charset encrypt) throws IOException {
    byte[] interleaves = Files.readAllBytes(Paths.get(pathway));
    return new String(interleaves, encrypt);
  }
}
