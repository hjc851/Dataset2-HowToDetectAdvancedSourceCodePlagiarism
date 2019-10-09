package robot;

import exporter.Retailer;
import multitasking.Procedures;
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

public class MechanismsManikin {
  private static final String synX2327String = "Finished reading input file...";
  private static final String synX2326String = "SIZE";
  private static final String synX2325String = "Arrive";
  private static final String synX2324String = "ID";
  private static final String synX2323String = "DISP";
  private static final String synX2322String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX2321String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX2320String = "./out/production/c3063467A1/";
  private static final String synX2319String = "Unable to generate output file.";
  private static final String synX2318String = "_output.txt";
  private static final String synX2317String = "./out/production/c3063467A1/";
  private static final String synX2316String = ".";
  private static final int synX2315int = 0;
  private static final String synX2314String = "Reading in input file...";
  private java.util.LinkedList<Procedures> negotiationsListings;
  private exporter.Retailer responsible;
  private static java.lang.String ConsultationSubmit;
  public static java.io.BufferedWriter ProducesFilename;

  public synchronized void tally(java.lang.String nii) {
    this.ConsultationSubmit = (nii);
    responsible = (new exporter.Retailer());
    negotiationsListings = (new java.util.LinkedList<>());
    System.out.println(synX2314String);

    try {
      java.lang.String revokedAdvert =
          ConsultationSubmit.substring(synX2315int, ConsultationSubmit.lastIndexOf(synX2316String));
      ProducesFilename =
          (new java.io.BufferedWriter(
              new java.io.FileWriter((synX2317String + revokedAdvert + synX2318String))));
    } catch (java.io.IOException exwife) {
      System.out.println(synX2319String);
    }
    ConsultationSubmit = (synX2320String + ConsultationSubmit);

    try {
      java.lang.String response = writtenFilename(ConsultationSubmit, StandardCharsets.UTF_8);
      java.lang.String knowl = synX2321String;
      java.util.regex.Pattern cern = java.util.regex.Pattern.compile(knowl);
      java.util.regex.Matcher esi = cern.matcher(response);
      java.lang.String exp2 = synX2322String;
      java.util.regex.Pattern aj = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher e = aj.matcher(response);

      while (esi.find()) {
        responsible.bentSendingHour(java.lang.Integer.parseInt(esi.group(synX2323String)));
      }

      while (e.find()) {
        negotiationsListings.add(
            new multitasking.Procedures(
                e.group(synX2324String),
                java.lang.Integer.parseInt(e.group(synX2325String)),
                java.lang.Integer.parseInt(e.group(synX2326String))));
      }
      System.out.println(synX2327String);
    } catch (java.lang.Exception aba) {
      System.out.println(aba.toString());
    }
    responsible.fixedPractices(negotiationsListings);
    responsible.meltResellers();
  }

  private static synchronized java.lang.String writtenFilename(
      java.lang.String routes, java.nio.charset.Charset decoding) throws IOException {
    byte[] concatenated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(routes));
    return new java.lang.String(concatenated, decoding);
  }
}
