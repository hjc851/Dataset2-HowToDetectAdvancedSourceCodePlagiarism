package analog;

import distributors.Caller;
import configuration.Outgrowth;
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

public class MechanismMockup {
  public distributors.Caller regulator = null;
  public static java.io.BufferedWriter ProducerSubmitted = null;

  public synchronized void endure(java.lang.String proponents) {
    this.SubmissionsDocument = (proponents);
    regulator = (new distributors.Caller());
    methodRanking = (new java.util.LinkedList<>());
    out.println("Reading in input file...");

    try {
      java.lang.String dismantledKey =
          SubmissionsDocument.substring(0, SubmissionsDocument.lastIndexOf("."));
      ProducerSubmitted =
          (new java.io.BufferedWriter(
              new java.io.FileWriter(
                  ("./out/production/c3063467A1/" + dismantledKey + "_output.txt"))));
    } catch (java.io.IOException voto) {
      out.println("Unable to generate output file.");
    }
    SubmissionsDocument = ("./out/production/c3063467A1/" + SubmissionsDocument);

    try {
      java.lang.String stimulant = studyPaperwork(SubmissionsDocument, UTF_8);
      java.lang.String explanatory = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern vig = compile(explanatory);
      java.util.regex.Matcher sm = vig.matcher(stimulant);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern c4 = compile(exp2);
      java.util.regex.Matcher f = c4.matcher(stimulant);

      while (sm.find()) {
        regulator.primedExpeditionPeriod(parseInt(sm.group("DISP")));
      }

      while (f.find()) {
        methodRanking.add(
            new configuration.Outgrowth(
                f.group("ID"), parseInt(f.group("Arrive")), parseInt(f.group("SIZE"))));
      }
      out.println("Finished reading input file...");
    } catch (java.lang.Exception adoptee) {
      out.println(adoptee.toString());
    }
    regulator.primedAppendage(methodRanking);
    regulator.leanExporter();
  }

  public static java.lang.String SubmissionsDocument = null;
  public java.util.LinkedList<Outgrowth> methodRanking = null;

  public static synchronized java.lang.String studyPaperwork(
      java.lang.String step, java.nio.charset.Charset codifying) throws IOException {
    byte[] stored = readAllBytes(get(step));
    return new java.lang.String(stored, codifying);
  }
}
