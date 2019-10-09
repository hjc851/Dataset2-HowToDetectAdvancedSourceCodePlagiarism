package mockup;

import device.Distributor;
import initialization.Act;
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
  public static java.io.BufferedWriter IntensityReadme;
  public static java.lang.String GuidanceFilename;
  public device.Distributor dealer;
  public java.util.LinkedList<Act> serveNames;

  public synchronized void campaign(java.lang.String establishment) {
    this.GuidanceFilename = establishment;
    dealer = new device.Distributor();
    serveNames = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String forfeitedDescribe;
      forfeitedDescribe = GuidanceFilename.substring(0, GuidanceFilename.lastIndexOf("."));
      IntensityReadme =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + forfeitedDescribe + "_output.txt"));
    } catch (java.io.IOException abel) {
      System.out.println("Unable to generate output file.");
    }
    GuidanceFilename = "./out/production/c3063467A1/" + GuidanceFilename;

    try {
      java.lang.String information;
      java.lang.String mgr;
      java.util.regex.Pattern writes;
      java.util.regex.Matcher manuscript;
      java.lang.String exp2;
      java.util.regex.Pattern ribulose;
      java.util.regex.Matcher b2;
      information = studyPaperwork(GuidanceFilename, StandardCharsets.UTF_8);
      mgr = "DISP:[\\s]+(?<DISP>[\\d]+)";
      writes = java.util.regex.Pattern.compile(mgr);
      manuscript = writes.matcher(information);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      ribulose = java.util.regex.Pattern.compile(exp2);
      b2 = ribulose.matcher(information);

      while (manuscript.find()) {
        dealer.situatedDeploymentMinutes(java.lang.Integer.parseInt(manuscript.group("DISP")));
      }

      while (b2.find()) {
        serveNames.add(
            new initialization.Act(
                b2.group("ID"),
                java.lang.Integer.parseInt(b2.group("Arrive")),
                java.lang.Integer.parseInt(b2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception pro) {
      System.out.println(pro.toString());
    }
    dealer.markSummons(serveNames);
    dealer.ramRegulator();
  }

  public static synchronized java.lang.String studyPaperwork(
      java.lang.String track, java.nio.charset.Charset keying) throws IOException {
    byte[] decrypt = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(track));
    return new java.lang.String(decrypt, keying);
  }
}
