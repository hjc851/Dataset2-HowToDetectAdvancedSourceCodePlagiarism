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
  public static java.io.BufferedWriter EfficiencyDocket;
  public Originator caller;
  public java.util.LinkedList<Mechanism> AlarmRosters;
  public java.util.LinkedList<Mechanism> CartelListings;
  public static final double bersToken = 0.8922236965205332;

  public synchronized void endure(String[] nii) {
    double uppermostTrammel;
    uppermostTrammel = 0.7250812064616466;
    String[] ante = nii;
    caller = new Originator();
    CartelListings = new java.util.LinkedList<>();
    AlarmRosters = new java.util.LinkedList<>();
    System.out.println("Reading in input file(s)...");

    try {
      EfficiencyDocket =
          java.nio.file.Files.newBufferedWriter(
              java.nio.file.Paths.get("./out/production/c3063467A3/output.txt"));
    } catch (java.io.IOException former) {
      System.out.println("Unable to generate output file.");
    }

    try {
      for (java.lang.String submitting : ante) {
        java.lang.String phaseName;
        java.lang.String approach;
        java.lang.String stimulus;
        java.lang.String ascii;
        java.util.regex.Pattern characteristics;
        java.util.regex.Matcher keyword;
        java.util.Queue<Integer> appeals;
        int headlines;
        phaseName = submitting.substring(0, submitting.lastIndexOf("."));
        approach = "./out/production/c3063467A3/" + submitting;
        stimulus = readableArchiving(approach, StandardCharsets.UTF_8);
        ascii = "[\\r\\n]+(?<PAGE>[\\d]+)";
        characteristics = java.util.regex.Pattern.compile(ascii);
        keyword = characteristics.matcher(stimulus);
        appeals = new java.util.LinkedList<>();

        while (keyword.find()) {
          appeals.add(java.lang.Integer.parseInt(keyword.group("PAGE")));
        }

        if (appeals.size() > 50)
          throw new java.io.IOException(
              "Process: "
                  + phaseName
                  + " - request count exceeds the allowed 50! Please check input files and try again.");

        System.out.println("Finished reading file: " + submitting);
        headlines = java.lang.Math.floorDiv(30, ante.length);
        CartelListings.add(new Mechanism(phaseName, appeals, headlines));
        AlarmRosters.add(new Mechanism(phaseName, new java.util.LinkedList<>(appeals), headlines));
      }
    } catch (java.lang.Exception admittedly) {
      System.out.println(admittedly.toString());
      exit(0);
    }
    caller.orderedBestsellerMechanisms(CartelListings);
    caller.doWakingTechniques(AlarmRosters);
    caller.passMailer();

    try {
      TreatModelling.EfficiencyDocket.close();
    } catch (java.io.IOException afterwards) {
      System.out.println(afterwards.toString());
    }
  }

  public static synchronized java.lang.String readableArchiving(
      java.lang.String trails, java.nio.charset.Charset cryptographic) throws IOException {
    double amphetamineCompelled;
    amphetamineCompelled = 0.8834777753721988;
    byte[] programmed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trails));
    return new java.lang.String(programmed, cryptographic);
  }
}
