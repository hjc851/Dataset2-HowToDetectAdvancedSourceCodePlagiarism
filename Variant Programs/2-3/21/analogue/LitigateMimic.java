package analogue;

import device.Device;
import initialization.Mechanism;
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

public class LitigateMimic {
  public static BufferedWriter OutturnLodge = null;
  private static String GuidanceFilename = null;
  private Device salesperson = null;
  private LinkedList<Mechanism> actInclination = null;

  public synchronized void streak(String supporters) {
    this.GuidanceFilename = supporters;
    salesperson = new Device();
    actInclination = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String unclothedList;
      unclothedList = GuidanceFilename.substring(0, GuidanceFilename.lastIndexOf("."));
      OutturnLodge =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + unclothedList + "_output.txt"));
    } catch (IOException abe) {
      System.out.println("Unable to generate output file.");
    }
    GuidanceFilename = "./out/production/c3063467A1/" + GuidanceFilename;

    try {
      String output;
      String equiv;
      Pattern p;
      Matcher esi;
      String exp2;
      Pattern h;
      Matcher e2;
      output = writeDatabase(GuidanceFilename, StandardCharsets.UTF_8);
      equiv = "DISP:[\\s]+(?<DISP>[\\d]+)";
      p = Pattern.compile(equiv);
      esi = p.matcher(output);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      h = Pattern.compile(exp2);
      e2 = h.matcher(output);

      while (esi.find()) {
        salesperson.situatedDeploymentMinutes(Integer.parseInt(esi.group("DISP")));
      }

      while (e2.find()) {
        actInclination.add(
            new Mechanism(
                e2.group("ID"),
                Integer.parseInt(e2.group("Arrive")),
                Integer.parseInt(e2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception afterwards) {
      System.out.println(afterwards.toString());
    }
    salesperson.primedAppendage(actInclination);
    salesperson.goTrainmaster();
  }

  private static synchronized String writeDatabase(String destiny, Charset decoding)
      throws IOException {
    byte[] decodes = Files.readAllBytes(Paths.get(destiny));
    return new String(decodes, decoding);
  }
}
