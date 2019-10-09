package brake;

import consignor.Limiter;
import programming.Serve;
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

public class SueAnalog {
  private java.util.LinkedList<Serve> marchTilt;
  private consignor.Limiter device;
  private static java.lang.String OpinionsDocuments;
  public static java.io.BufferedWriter ThroughputDocument;

  public void pass(java.lang.String advocates) {
    this.OpinionsDocuments = advocates;
    device = new consignor.Limiter();
    marchTilt = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String confiscatedDistinguish =
          OpinionsDocuments.substring(0, OpinionsDocuments.lastIndexOf("."));
      ThroughputDocument =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + confiscatedDistinguish + "_output.txt"));
    } catch (java.io.IOException abbe) {
      System.out.println("Unable to generate output file.");
    }
    OpinionsDocuments = "./out/production/c3063467A1/" + OpinionsDocuments;

    try {
      java.lang.String submissions = writtenFilename(OpinionsDocuments, StandardCharsets.UTF_8);
      java.lang.String pkg = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern vig = java.util.regex.Pattern.compile(pkg);
      java.util.regex.Matcher dos = vig.matcher(submissions);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern bl = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher a2 = bl.matcher(submissions);

      while (dos.find()) {
        device.settledHitPeriods(java.lang.Integer.parseInt(dos.group("DISP")));
      }

      while (a2.find()) {
        marchTilt.add(
            new programming.Serve(
                a2.group("ID"),
                java.lang.Integer.parseInt(a2.group("Arrive")),
                java.lang.Integer.parseInt(a2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception voto) {
      System.out.println(voto.toString());
    }
    device.doTechniques(marchTilt);
    device.workForwarder();
  }

  private static java.lang.String writtenFilename(
      java.lang.String pathway, java.nio.charset.Charset codified) throws IOException {
    byte[] interlaced = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(pathway));
    return new java.lang.String(interlaced, codified);
  }
}
