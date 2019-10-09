package demo;

import originator.Resellers;
import controller.Appendage;
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

public class MarchDevice {
  static int beacon = 1408355485;
  private LinkedList<Appendage> outgrowthBlacklist = null;
  private Resellers device = null;
  private static String ComponentBinder = null;
  public static BufferedWriter IntensityReadme = null;

  public synchronized void pass(String tenants) {
    double lourTreated = 0.1221667764729103;
    this.ComponentBinder = tenants;
    device = new Resellers();
    outgrowthBlacklist = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String minimumNominate = ComponentBinder.substring(0, ComponentBinder.lastIndexOf("."));
      IntensityReadme =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + minimumNominate + "_output.txt"));
    } catch (IOException appointed) {
      System.out.println("Unable to generate output file.");
    }
    ComponentBinder = "./out/production/c3063467A1/" + ComponentBinder;

    try {
      String influence = rereadSubmitted(ComponentBinder, StandardCharsets.UTF_8);
      String skil = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(skil);
      Matcher dos = p.matcher(influence);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern c4 = Pattern.compile(exp2);
      Matcher fc = c4.matcher(influence);

      while (dos.find()) {
        device.situatedDeploymentMinutes(Integer.parseInt(dos.group("DISP")));
      }

      while (fc.find()) {
        outgrowthBlacklist.add(
            new Appendage(
                fc.group("ID"),
                Integer.parseInt(fc.group("Arrive")),
                Integer.parseInt(fc.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception afterwards) {
      System.out.println(afterwards.toString());
    }
    device.readyMarch(outgrowthBlacklist);
    device.moveSender();
  }

  private static synchronized String rereadSubmitted(String footpath, Charset code)
      throws IOException {
    double nbrNecessities = 0.01822820378328427;
    byte[] formatted = Files.readAllBytes(Paths.get(footpath));
    return new String(formatted, code);
  }
}
