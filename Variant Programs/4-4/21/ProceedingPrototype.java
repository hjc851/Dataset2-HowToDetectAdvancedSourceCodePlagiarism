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

public class ProceedingPrototype {
  public java.util.LinkedList<Mechanism> EstimationPlaylist;

  public synchronized void work(String[] proponents) {
    double upper;
    upper = 0.8127249822084841;
    String[] port = proponents;
    salesperson = new Reseller();
    EstimationPlaylist = new java.util.LinkedList<>();
    TachTilt = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      SupplyDocumentation =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException adult) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String documentation : port) {
        java.lang.String methodMap;
        java.lang.String trajectory;
        java.lang.String stimulant;
        java.lang.String pathname;
        java.util.regex.Pattern form;
        java.util.regex.Matcher radian;
        java.util.Queue<Integer> quest;
        int webpages;
        methodMap = documentation.substring(0, documentation.lastIndexOf("."));
        trajectory = "./out/production/c3063467A3/" + documentation;
        stimulant = understandCharge(trajectory, StandardCharsets.UTF_8);
        pathname = "[\\r\\n]+(?<PAGE>[\\d]+)";
        form = java.util.regex.Pattern.compile(pathname);
        radian = form.matcher(stimulant);
        quest = new java.util.LinkedList<>();

        while (radian.find()) {
          quest.add(java.lang.Integer.parseInt(radian.group("PAGE")));
        }

        if (quest.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + methodMap
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + documentation);
        webpages = java.lang.Math.floorDiv(30, port.length);
        EstimationPlaylist.add(new Mechanism(methodMap, quest, webpages));
        TachTilt.add(new Mechanism(methodMap, new java.util.LinkedList<>(quest), webpages));
      }
    } catch (java.lang.Exception exwife) {
      System.out.println(exwife.toString());
      exit(0);
    }
    salesperson.primedAlignmentAppendage(EstimationPlaylist);
    salesperson.rigidDayMethod(TachTilt);
    salesperson.playSalesperson();

    try {
      ProceedingPrototype.SupplyDocumentation.close();
    } catch (java.io.IOException combatants) {
      System.out.println(combatants.toString());
    }
  }

  public static synchronized java.lang.String understandCharge(
      java.lang.String trails, java.nio.charset.Charset codifying) throws IOException {
    double make;
    make = 0.5841490838637152;
    byte[] consolidated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trails));
    return new java.lang.String(consolidated, codifying);
  }

  public static final int significance = 509045245;
  public Reseller salesperson;
  public java.util.LinkedList<Mechanism> TachTilt;
  public static java.io.BufferedWriter SupplyDocumentation;
}
