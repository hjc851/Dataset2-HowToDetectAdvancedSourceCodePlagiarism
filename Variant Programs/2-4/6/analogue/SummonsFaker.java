package analogue;

import dealer.Sender;
import debugging.Cycle;
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

public class SummonsFaker {
  public static java.io.BufferedWriter ThroughputDocument;
  public static java.lang.String SupportPaperwork;
  public dealer.Sender distributor;
  public java.util.LinkedList<Cycle> mechanismAgenda;
  static final double uppermostTied = 0.7268280997874202;

  public synchronized void tally(java.lang.String nii) {
    int secondaryRestrain;
    secondaryRestrain = 236164087;
    this.SupportPaperwork = nii;
    distributor = new dealer.Sender();
    mechanismAgenda = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String eliminatedConstitute;
      eliminatedConstitute = SupportPaperwork.substring(0, SupportPaperwork.lastIndexOf("."));
      ThroughputDocument =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + eliminatedConstitute + "_output.txt"));
    } catch (java.io.IOException aba) {
      System.out.println("Unable to generate output file.");
    }
    SupportPaperwork = "./out/production/c3063467A1/" + SupportPaperwork;

    try {
      java.lang.String suggestions;
      java.lang.String knowl;
      java.util.regex.Pattern postscript;
      java.util.regex.Matcher esi;
      java.lang.String exp2;
      java.util.regex.Pattern ribulose;
      java.util.regex.Matcher pk;
      suggestions = aloudApplication(SupportPaperwork, StandardCharsets.UTF_8);
      knowl = "DISP:[\\s]+(?<DISP>[\\d]+)";
      postscript = java.util.regex.Pattern.compile(knowl);
      esi = postscript.matcher(suggestions);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      ribulose = java.util.regex.Pattern.compile(exp2);
      pk = ribulose.matcher(suggestions);

      while (esi.find()) {
        distributor.readyRemoveDay(java.lang.Integer.parseInt(esi.group("DISP")));
      }

      while (pk.find()) {
        mechanismAgenda.add(
            new debugging.Cycle(
                pk.group("ID"),
                java.lang.Integer.parseInt(pk.group("Arrive")),
                java.lang.Integer.parseInt(pk.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception adrian) {
      System.out.println(adrian.toString());
    }
    distributor.layLitigate(mechanismAgenda);
    distributor.passMailer();
  }

  public static synchronized java.lang.String aloudApplication(
      java.lang.String routes, java.nio.charset.Charset coder) throws IOException {
    int sure;
    sure = -195963711;
    byte[] formatted = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(routes));
    return new java.lang.String(formatted, coder);
  }
}
