package simulated;

import salesperson.Distributor;
import programmer.Mechanisms;
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

public class PhaseSimulations {

  public static synchronized java.lang.String translateDocuments(
      java.lang.String approach, java.nio.charset.Charset codified) throws IOException {
    byte[] costed = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(approach));
    return new java.lang.String(costed, codified);
  }

  public synchronized void bleed(java.lang.String nsis) {
    this.SupportPaperwork = nsis;
    mailer = new salesperson.Distributor();
    serveNames = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String eliminatedConstitute =
          SupportPaperwork.substring(0, SupportPaperwork.lastIndexOf("."));
      IntensityReadme =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + eliminatedConstitute + "_output.txt"));
    } catch (java.io.IOException voto) {
      System.out.println("Unable to generate output file.");
    }
    SupportPaperwork = "./out/production/c3063467A1/" + SupportPaperwork;

    try {
      java.lang.String component = translateDocuments(SupportPaperwork, StandardCharsets.UTF_8);
      java.lang.String yrs = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern postscript = java.util.regex.Pattern.compile(yrs);
      java.util.regex.Matcher dos = postscript.matcher(component);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern h = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher a2 = h.matcher(component);

      while (dos.find()) {
        mailer.fitExpeditiousnessYear(java.lang.Integer.parseInt(dos.group("DISP")));
      }

      while (a2.find()) {
        serveNames.add(
            new programmer.Mechanisms(
                a2.group("ID"),
                java.lang.Integer.parseInt(a2.group("Arrive")),
                java.lang.Integer.parseInt(a2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception libris) {
      System.out.println(libris.toString());
    }
    mailer.determinedOutgrowth(serveNames);
    mailer.tallyConsignor();
  }

  public salesperson.Distributor mailer;
  public static java.io.BufferedWriter IntensityReadme;
  public java.util.LinkedList<Mechanisms> serveNames;
  public static java.lang.String SupportPaperwork;
}
