package kinematics;

import yardmaster.Distributor;
import compiler.Procedures;
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
import static java.lang.System.out;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class SystemSim {
  static final double reducedLeaping = 0.6606790711783945;
  public java.util.LinkedList<Procedures> serveNames;
  public yardmaster.Distributor limiter;
  public static java.lang.String GuidanceFilename;
  public static java.io.BufferedWriter EfficiencyDocket;

  public synchronized void pass(java.lang.String nsis) {
    int surname = 2005854549;
    this.GuidanceFilename = nsis;
    limiter = new yardmaster.Distributor();
    serveNames = new java.util.LinkedList<>();
    out.println("Reading in input file...");

    try {
      java.lang.String undoneForename =
          GuidanceFilename.substring(0, GuidanceFilename.lastIndexOf("."));
      EfficiencyDocket =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + undoneForename + "_output.txt"));
    } catch (java.io.IOException exwife) {
      out.println("Unable to generate output file.");
    }
    GuidanceFilename = "./out/production/c3063467A1/" + GuidanceFilename;

    try {
      java.lang.String opinion = aloudApplication(GuidanceFilename, UTF_8);
      java.lang.String experiment = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern writes = compile(experiment);
      java.util.regex.Matcher dos = writes.matcher(opinion);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern b2 = compile(exp2);
      java.util.regex.Matcher fc = b2.matcher(opinion);

      while (dos.find()) {
        limiter.situatedDeploymentMinutes(parseInt(dos.group("DISP")));
      }

      while (fc.find()) {
        serveNames.add(
            new compiler.Procedures(
                fc.group("ID"), parseInt(fc.group("Arrive")), parseInt(fc.group("SIZE"))));
      }
      out.println("Finished reading input file...");
    } catch (java.lang.Exception con) {
      out.println(con.toString());
    }
    limiter.prepareMethodologies(serveNames);
    limiter.driveYardmaster();
  }

  public static synchronized java.lang.String aloudApplication(
      java.lang.String roadway, java.nio.charset.Charset code) throws IOException {
    int cite = -376640413;
    byte[] instantiated = readAllBytes(get(roadway));
    return new java.lang.String(instantiated, code);
  }
}
