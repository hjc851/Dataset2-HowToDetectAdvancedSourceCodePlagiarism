package simulation;

import exporter.Limiter;
import spooler.Cycle;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ActMock {
  private LinkedList<Cycle> mechanismsBibliography;
  private Limiter consignor;
  private static String GuidanceFilename;
  public static BufferedWriter TurnoutCharge;

  public void lean(String nii) {
    this.GuidanceFilename = nii;
    consignor = new Limiter();
    mechanismsBibliography = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String eliminatedConstitute =
          GuidanceFilename.substring(0, GuidanceFilename.lastIndexOf("."));
      TurnoutCharge =
          new BufferedWriter(
              new FileWriter(
                  "./out/production/c3063467A1/" + eliminatedConstitute + "_output.txt"));
    } catch (IOException appointed) {
      System.out.println("Unable to generate output file.");
    }
    GuidanceFilename = "./out/production/c3063467A1/" + GuidanceFilename;

    try {
      String comments = showDocumentation(GuidanceFilename, StandardCharsets.UTF_8);
      String reciprocal = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(reciprocal);
      Matcher dos = p.matcher(comments);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern ribulose = Pattern.compile(exp2);
      Matcher fc = ribulose.matcher(comments);

      while (dos.find()) {
        consignor.bentSendingHour(Integer.parseInt(dos.group("DISP")));
      }

      while (fc.find()) {
        mechanismsBibliography.add(
            new Cycle(
                fc.group("ID"),
                Integer.parseInt(fc.group("Arrive")),
                Integer.parseInt(fc.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception abel) {
      System.out.println(abel.toString());
    }
    consignor.doTechniques(mechanismsBibliography);
    consignor.outpouringPlenum();
  }

  private static String showDocumentation(String roadway, Charset encrypting) throws IOException {
    byte[] codified = Files.readAllBytes(Paths.get(roadway));
    return new String(codified, encrypting);
  }
}
