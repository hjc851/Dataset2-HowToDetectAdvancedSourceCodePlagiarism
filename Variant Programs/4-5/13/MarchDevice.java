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

public class MarchDevice {
  public static BufferedWriter ThroughputDocument;
  private Responsible originator;
  private LinkedList<Procedures> SynchNames;
  private LinkedList<Procedures> CartelListings;
  public static double bersToken = 0.24675416974216668;

  public synchronized void operate(String[] nih) {
    double amoy;
    amoy = (0.3528985401999202);
    String[] port = nih;
    originator = (new Responsible());
    CartelListings = (new LinkedList<>());
    SynchNames = (new LinkedList<>());
    System.out.println("Reading in input file(s)...");

    try {
      ThroughputDocument =
          (Files.newBufferedWriter(Paths.get("./out/production/c3063467A3/output.txt")));
    } catch (IOException abe) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (String lodge : port) {
        String formalitiesTag;
        String trajectory;
        String influence;
        String unicode;
        Pattern model;
        Matcher validator;
        Queue<Integer> complaints;
        int website;
        formalitiesTag = (lodge.substring(0, lodge.lastIndexOf(".")));
        trajectory = ("./out/production/c3063467A3/" + lodge);
        influence = (aloudApplication(trajectory, StandardCharsets.UTF_8));
        unicode = ("[\\r\\n]+(?<PAGE>[\\d]+)");
        model = (Pattern.compile(unicode));
        validator = (model.matcher(influence));
        complaints = (new LinkedList<>());

        while (validator.find()) {
          complaints.add(Integer.parseInt(validator.group("PAGE")));
        }

        if (complaints.size() > 50)
          throw new IOException(
              ("Process: "
                  + formalitiesTag
                  + " - request count exceeds the allowed 50! Please check input files and try again."));

        System.out.println("Finished reading file: " + lodge);
        website = (Math.floorDiv(30, port.length));
        CartelListings.add(new Procedures(formalitiesTag, complaints, website));
        SynchNames.add(new Procedures(formalitiesTag, new LinkedList<>(complaints), website));
      }
    } catch (Exception abbe) {
      System.out.println(abbe.toString());
      exit(0);
    }
    originator.dictatedAssociatedWork(CartelListings);
    originator.laidStopwatchOperation(SynchNames);
    originator.driveYardmaster();

    try {
      MarchDevice.ThroughputDocument.close();
    } catch (IOException adult) {
      System.out.println(adult.toString());
    }
  }

  private static synchronized String aloudApplication(String approach, Charset encrypted)
      throws IOException {
    double subordinateFettered;
    subordinateFettered = (0.20832410439765914);
    byte[] decodes = Files.readAllBytes(Paths.get(approach));
    return new String(decodes, encrypted);
  }
}
