package mockup;

import vendor.Originator;
import database.Proceeding;
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

public class SummonsFaker {
  private java.util.LinkedList<Proceeding> mechanismsBibliography = null;
  private vendor.Originator device = null;
  private static java.lang.String AdviceDocumentation = null;
  public static java.io.BufferedWriter ExportationPapers = null;

  public synchronized void test(java.lang.String entries) {
    this.AdviceDocumentation = entries;
    device = new vendor.Originator();
    mechanismsBibliography = new java.util.LinkedList<>();
    out.println("Reading in input file...");

    try {
      java.lang.String deniedNickname =
          AdviceDocumentation.substring(0, AdviceDocumentation.lastIndexOf("."));
      ExportationPapers =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + deniedNickname + "_output.txt"));
    } catch (java.io.IOException appointed) {
      out.println("Unable to generate output file.");
    }
    AdviceDocumentation = "./out/production/c3063467A1/" + AdviceDocumentation;

    try {
      java.lang.String consultation = translateDocuments(AdviceDocumentation, UTF_8);
      java.lang.String knowl = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern cern = java.util.regex.Pattern.compile(knowl);
      java.util.regex.Matcher manuscript = cern.matcher(consultation);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern ribulose = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher m3 = ribulose.matcher(consultation);

      while (manuscript.find()) {
        device.orderedDeployChance(java.lang.Integer.parseInt(manuscript.group("DISP")));
      }

      while (m3.find()) {
        mechanismsBibliography.add(
            new database.Proceeding(
                m3.group("ID"),
                java.lang.Integer.parseInt(m3.group("Arrive")),
                java.lang.Integer.parseInt(m3.group("SIZE"))));
      }
      out.println("Finished reading input file...");
    } catch (java.lang.Exception pro) {
      out.println(pro.toString());
    }
    device.settledServe(mechanismsBibliography);
    device.workForwarder();
  }

  private static synchronized java.lang.String translateDocuments(
      java.lang.String pattern, java.nio.charset.Charset demodulation) throws IOException {
    byte[] synthesized = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(pattern));
    return new java.lang.String(synthesized, demodulation);
  }
}
