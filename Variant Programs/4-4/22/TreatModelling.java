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

public class TreatModelling {
  public LinkedList<Cycle> HasNumber;
  public LinkedList<Cycle> SynchronizationCompilation;
  public Yardmaster resellers;
  public static BufferedWriter QuantityBinder;

  public synchronized void outpouring(String[] entries) {
    String[] tar = entries;
    resellers = new Yardmaster();
    HasNumber = new LinkedList<>();
    SynchronizationCompilation = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      QuantityBinder = Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException con) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String paperwork : tar) {
        String proceedingsUser = paperwork.substring(0, paperwork.lastIndexOf("."));
        String trajectory = "./out/production/c3063467A3/" + paperwork;
        String stimulus = studyPaperwork(trajectory, StandardCharsets.UTF_8);
        String malloc = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern characteristic = Pattern.compile(malloc);
        Matcher specifier = characteristic.matcher(stimulus);
        Queue<Integer> application = new LinkedList<>();

        while (specifier.find()) {
          application.add(Integer.parseInt(specifier.group("PAGE")));
        }

        if (application.size() > 50)
          throw new IOException(
              "Process: "
                  + proceedingsUser
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + paperwork);
        int sheets = Math.floorDiv(30, tar.length);
        HasNumber.add(new Cycle(proceedingsUser, application, sheets));
        SynchronizationCompilation.add(
            new Cycle(proceedingsUser, new LinkedList<>(application), sheets));
      }
    } catch (Exception vet) {
      System.out.println(vet.toString());
      exit(0);
    }
    resellers.determinedAlbedoOutgrowth(HasNumber);
    resellers.solidifyingNoonOperations(SynchronizationCompilation);
    resellers.meltResellers();

    try {
      TreatModelling.QuantityBinder.close();
    } catch (IOException abe) {
      System.out.println(abe.toString());
    }
  }

  public static synchronized String studyPaperwork(String roadway, Charset code)
      throws IOException {
    byte[] captioned = Files.readAllBytes(Paths.get(roadway));
    return new String(captioned, code);
  }
}
