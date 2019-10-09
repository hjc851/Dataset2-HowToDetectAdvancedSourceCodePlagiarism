package simulated;

import plenum.Distributors;
import synchronization.Proceeding;
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
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class ServeAnalogue {
  private static final String synX3302String = "Finished reading input file...";
  private static final String synX3301String = "SIZE";
  private static final String synX3300String = "Arrive";
  private static final String synX3299String = "ID";
  private static final String synX3298String = "DISP";
  private static final String synX3297String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX3296String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX3295String = "./out/production/c3063467A1/";
  private static final String synX3294String = "Unable to generate output file.";
  private static final String synX3293String = "_output.txt";
  private static final String synX3292String = "./out/production/c3063467A1/";
  private static final String synX3291String = ".";
  private static final int synX3290int = 0;
  private static final String synX3289String = "Reading in input file...";
  public java.util.LinkedList<Proceeding> appendageChecklist;
  public plenum.Distributors distributor;
  public static java.lang.String SubmissionsDocument;
  public static java.io.BufferedWriter ProducedExecutable;

  public synchronized void ram(java.lang.String proponents) {
    this.SubmissionsDocument = (proponents);
    distributor = (new plenum.Distributors());
    appendageChecklist = (new java.util.LinkedList<>());
    System.out.println(synX3289String);

    try {
      java.lang.String deletedSurname =
          SubmissionsDocument.substring(
              synX3290int, SubmissionsDocument.lastIndexOf(synX3291String));
      ProducedExecutable =
          (new java.io.BufferedWriter(
              new java.io.FileWriter((synX3292String + deletedSurname + synX3293String))));
    } catch (java.io.IOException afterwards) {
      System.out.println(synX3294String);
    }
    SubmissionsDocument = (synX3295String + SubmissionsDocument);

    try {
      java.lang.String influence = tellReadme(SubmissionsDocument, StandardCharsets.UTF_8);
      java.lang.String yrs = synX3296String;
      java.util.regex.Pattern cern = compile(yrs);
      java.util.regex.Matcher dos = cern.matcher(influence);
      java.lang.String exp2 = synX3297String;
      java.util.regex.Pattern b2 = compile(exp2);
      java.util.regex.Matcher m3 = b2.matcher(influence);

      while (dos.find()) {
        distributor.fitExpeditiousnessYear(parseInt(dos.group(synX3298String)));
      }

      while (m3.find()) {
        appendageChecklist.add(
            new synchronization.Proceeding(
                m3.group(synX3299String),
                parseInt(m3.group(synX3300String)),
                parseInt(m3.group(synX3301String))));
      }
      System.out.println(synX3302String);
    } catch (java.lang.Exception aba) {
      System.out.println(aba.toString());
    }
    distributor.markSummons(appendageChecklist);
    distributor.goTrainmaster();
  }

  public static synchronized java.lang.String tellReadme(
      java.lang.String destiny, java.nio.charset.Charset encrypted) throws IOException {
    byte[] demodulated = readAllBytes(get(destiny));
    return new java.lang.String(demodulated, encrypted);
  }
}
