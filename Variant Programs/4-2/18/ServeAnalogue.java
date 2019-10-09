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

public class ServeAnalogue {
  private LinkedList<Procedure> CartelListings;
  private LinkedList<Procedure> CountSelection;
  private Starter salesperson;
  public static BufferedWriter ProducingFolders;

  public void extend(String[] nsi) {
    String[] patch = nsi;
    salesperson = new Starter();
    CartelListings = new LinkedList<>();
    CountSelection = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      ProducingFolders =
          Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException adrian) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String docket : patch) {
        String methodologyPhoto = docket.substring(0, docket.lastIndexOf("."));
        String trail = "./out/production/c3063467A3/" + docket;
        String stimulation = writtenFilename(trail, StandardCharsets.UTF_8);
        String emacs = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern trend = Pattern.compile(emacs);
        Matcher radian = trend.matcher(stimulation);
        Queue<Integer> appeals = new LinkedList<>();

        while (radian.find()) {
          appeals.add(Integer.parseInt(radian.group("PAGE")));
        }

        if (appeals.size() > 50)
          throw new IOException(
              "Process: "
                  + methodologyPhoto
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + docket);
        int script = Math.floorDiv(30, patch.length);
        CartelListings.add(new Procedure(methodologyPhoto, appeals, script));
        CountSelection.add(new Procedure(methodologyPhoto, new LinkedList<>(appeals), script));
      }
    } catch (Exception tipp) {
      System.out.println(tipp.toString());
      exit(0);
    }
    salesperson.fixedBooleanPractices(CartelListings);
    salesperson.fixedWatchPractices(CountSelection);
    salesperson.outpouringPlenum();

    try {
      ServeAnalogue.ProducingFolders.close();
    } catch (IOException voto) {
      System.out.println(voto.toString());
    }
  }

  private static String writtenFilename(String destiny, Charset cipher) throws IOException {
    byte[] coded = Files.readAllBytes(Paths.get(destiny));
    return new String(coded, cipher);
  }
}
