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

public class PhaseSimulations {
  private LinkedList<Procedures> CartesianBibliography;
  private LinkedList<Procedures> SynchNames;
  private Vendor retailer;
  public static BufferedWriter YieldRegister;

  public void drive(String[] incumbents) {
    String[] gain = incumbents;
    retailer = new Vendor();
    CartesianBibliography = new LinkedList<>();
    SynchNames = new LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      YieldRegister = Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (IOException abbe) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String readme : gain) {
        String workCaller = readme.substring(0, readme.lastIndexOf("."));
        String roadway = "./out/production/c3063467A3/" + readme;
        String contributions = recordExecutable(roadway, StandardCharsets.UTF_8);
        String subroutine = "[\\r\\n]+(?<PAGE>[\\d]+)";
        Pattern convention = Pattern.compile(subroutine);
        Matcher brite = convention.matcher(contributions);
        Queue<Integer> inquires = new LinkedList<>();

        while (brite.find()) {
          inquires.add(Integer.parseInt(brite.group("PAGE")));
        }

        if (inquires.size() > 50)
          throw new IOException(
              "Process: "
                  + workCaller
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + readme);
        int aspects = Math.floorDiv(30, gain.length);
        CartesianBibliography.add(new Procedures(workCaller, inquires, aspects));
        SynchNames.add(new Procedures(workCaller, new LinkedList<>(inquires), aspects));
      }
    } catch (Exception past) {
      System.out.println(past.toString());
      exit(0);
    }
    retailer.markAverageSummons(CartesianBibliography);
    retailer.settledSynchServe(SynchNames);
    retailer.prevailDistributor();

    try {
      PhaseSimulations.YieldRegister.close();
    } catch (IOException late) {
      System.out.println(late.toString());
    }
  }

  private static String recordExecutable(String routes, Charset codifying) throws IOException {
    byte[] interleaves = Files.readAllBytes(Paths.get(routes));
    return new String(interleaves, codifying);
  }
}
