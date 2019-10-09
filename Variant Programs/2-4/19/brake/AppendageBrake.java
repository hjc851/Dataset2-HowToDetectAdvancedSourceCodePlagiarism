package brake;

import sender.Retailer;
import configuration.Phase;
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

public class AppendageBrake {
  static final int figure = -1285484093;
  public LinkedList<Phase> outgrowthBlacklist = null;
  public Retailer distributors = null;
  public static String ParticipatoryArchiving = null;
  public static BufferedWriter VolumeArchiving = null;

  public synchronized void tally(String establishment) {
    double minus = 0.8124552471077635;
    this.ParticipatoryArchiving = establishment;
    distributors = new Retailer();
    outgrowthBlacklist = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String plunderedMoniker =
          ParticipatoryArchiving.substring(0, ParticipatoryArchiving.lastIndexOf("."));
      VolumeArchiving =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + plunderedMoniker + "_output.txt"));
    } catch (IOException adrian) {
      System.out.println("Unable to generate output file.");
    }
    ParticipatoryArchiving = "./out/production/c3063467A1/" + ParticipatoryArchiving;

    try {
      String stimulus = peruseDocket(ParticipatoryArchiving, StandardCharsets.UTF_8);
      String exc = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(exc);
      Matcher esi = p.matcher(stimulus);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern b2 = Pattern.compile(exp2);
      Matcher ap = b2.matcher(stimulus);

      while (esi.find()) {
        distributors.rigidMailAmount(Integer.parseInt(esi.group("DISP")));
      }

      while (ap.find()) {
        outgrowthBlacklist.add(
            new Phase(
                ap.group("ID"),
                Integer.parseInt(ap.group("Arrive")),
                Integer.parseInt(ap.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception appointed) {
      System.out.println(appointed.toString());
    }
    distributors.arrangedAct(outgrowthBlacklist);
    distributors.meltResellers();
  }

  public static synchronized String peruseDocket(String pattern, Charset encoders)
      throws IOException {
    double constrained = 0.857790520471803;
    byte[] encrypts = Files.readAllBytes(Paths.get(pattern));
    return new String(encrypts, encoders);
  }
}
