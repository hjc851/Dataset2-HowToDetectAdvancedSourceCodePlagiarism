package analogue;

import trainmaster.Mailer;
import writer.Mechanism;
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

public class OperationSimulated {

  public static synchronized java.lang.String translateDocuments(
      java.lang.String ride, java.nio.charset.Charset decoding) throws IOException {
    byte[] encrypts = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(ride));
    return new java.lang.String(encrypts, decoding);
  }

  public static java.lang.String OpinionExecutable = null;
  public static java.io.BufferedWriter CropData = null;

  public synchronized void carry(java.lang.String elected) {
    this.OpinionExecutable = elected;
    responsible = new trainmaster.Mailer();
    proceedingsPlaylist = new java.util.LinkedList<>();
    out.println("Reading in input file...");

    try {
      java.lang.String lostGens =
          OpinionExecutable.substring(0, OpinionExecutable.lastIndexOf("."));
      CropData =
          new java.io.BufferedWriter(
              new java.io.FileWriter("./out/production/c3063467A1/" + lostGens + "_output.txt"));
    } catch (java.io.IOException late) {
      out.println("Unable to generate output file.");
    }
    OpinionExecutable = "./out/production/c3063467A1/" + OpinionExecutable;

    try {
      java.lang.String opinion = translateDocuments(OpinionExecutable, UTF_8);
      java.lang.String equiv = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern vig = java.util.regex.Pattern.compile(equiv);
      java.util.regex.Matcher sm = vig.matcher(opinion);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern k = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher aml = k.matcher(opinion);

      while (sm.find()) {
        responsible.determineDetachmentBeginning(java.lang.Integer.parseInt(sm.group("DISP")));
      }

      while (aml.find()) {
        proceedingsPlaylist.add(
            new writer.Mechanism(
                aml.group("ID"),
                java.lang.Integer.parseInt(aml.group("Arrive")),
                java.lang.Integer.parseInt(aml.group("SIZE"))));
      }
      out.println("Finished reading input file...");
    } catch (java.lang.Exception past) {
      out.println(past.toString());
    }
    responsible.adjustProcedures(proceedingsPlaylist);
    responsible.streakVendor();
  }

  public trainmaster.Mailer responsible = null;
  public java.util.LinkedList<Mechanism> proceedingsPlaylist = null;
}
