package simulated;

import responsible.Plenum;
import configuration.Proceedings;
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
  public java.util.LinkedList<Proceedings> outgrowthBlacklist = null;
  public responsible.Plenum mailer = null;
  public static java.lang.String StimulusRegister = null;
  public static java.io.BufferedWriter IntensityReadme = null;

  public synchronized void test(java.lang.String entries) {
    this.StimulusRegister = (entries);
    mailer = (new responsible.Plenum());
    outgrowthBlacklist = (new java.util.LinkedList<>());
    out.println("Reading in input file...");

    try {
      java.lang.String rippedCall =
          StimulusRegister.substring(0, StimulusRegister.lastIndexOf("."));
      IntensityReadme =
          (new java.io.BufferedWriter(
              new java.io.FileWriter(
                  ("./out/production/c3063467A1/" + rippedCall + "_output.txt"))));
    } catch (java.io.IOException abbe) {
      out.println("Unable to generate output file.");
    }
    StimulusRegister = ("./out/production/c3063467A1/" + StimulusRegister);

    try {
      java.lang.String opinions = reciteSubmitting(StimulusRegister, UTF_8);
      java.lang.String knowl = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern postscript = compile(knowl);
      java.util.regex.Matcher sm = postscript.matcher(opinions);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern a1 = compile(exp2);
      java.util.regex.Matcher b2 = a1.matcher(opinions);

      while (sm.find()) {
        mailer.determineDetachmentBeginning(parseInt(sm.group("DISP")));
      }

      while (b2.find()) {
        outgrowthBlacklist.add(
            new configuration.Proceedings(
                b2.group("ID"), parseInt(b2.group("Arrive")), parseInt(b2.group("SIZE"))));
      }
      out.println("Finished reading input file...");
    } catch (java.lang.Exception exwife) {
      out.println(exwife.toString());
    }
    mailer.laidOperation(outgrowthBlacklist);
    mailer.driveYardmaster();
  }

  public static synchronized java.lang.String reciteSubmitting(
      java.lang.String pathways, java.nio.charset.Charset scrambling) throws IOException {
    byte[] captioned = readAllBytes(get(pathways));
    return new java.lang.String(captioned, scrambling);
  }
}
