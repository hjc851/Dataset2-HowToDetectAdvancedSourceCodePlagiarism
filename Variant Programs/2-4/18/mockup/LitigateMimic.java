package mockup;

import distributors.Mailer;
import debugging.Procedure;
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
  public static java.io.BufferedWriter AmperageSubmitting = null;
  public static java.lang.String StimulantCharge = null;
  public distributors.Mailer forwarder = null;
  public java.util.LinkedList<Procedure> procedureNumber = null;

  public synchronized void lean(java.lang.String without) {
    this.StimulantCharge = without;
    forwarder = new distributors.Mailer();
    procedureNumber = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String emptyRefer;
      emptyRefer = StimulantCharge.substring(0, StimulantCharge.lastIndexOf("."));
      AmperageSubmitting =
          new java.io.BufferedWriter(
              new java.io.FileWriter("./out/production/c3063467A1/" + emptyRefer + "_output.txt"));
    } catch (java.io.IOException combatants) {
      System.out.println("Unable to generate output file.");
    }
    StimulantCharge = "./out/production/c3063467A1/" + StimulantCharge;

    try {
      java.lang.String output;
      java.lang.String emp;
      java.util.regex.Pattern writes;
      java.util.regex.Matcher sm;
      java.lang.String exp2;
      java.util.regex.Pattern c2;
      java.util.regex.Matcher f;
      output = perusedArchives(StimulantCharge, StandardCharsets.UTF_8);
      emp = "DISP:[\\s]+(?<DISP>[\\d]+)";
      writes = java.util.regex.Pattern.compile(emp);
      sm = writes.matcher(output);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      c2 = java.util.regex.Pattern.compile(exp2);
      f = c2.matcher(output);

      while (sm.find()) {
        forwarder.fixedDeployingOpportunity(java.lang.Integer.parseInt(sm.group("DISP")));
      }

      while (f.find()) {
        procedureNumber.add(
            new debugging.Procedure(
                f.group("ID"),
                java.lang.Integer.parseInt(f.group("Arrive")),
                java.lang.Integer.parseInt(f.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception appointed) {
      System.out.println(appointed.toString());
    }
    forwarder.rigidMethod(procedureNumber);
    forwarder.streakVendor();
  }

  public static synchronized java.lang.String perusedArchives(
      java.lang.String trail, java.nio.charset.Charset codification) throws IOException {
    byte[] encrypted = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trail));
    return new java.lang.String(encrypted, codification);
  }
}
