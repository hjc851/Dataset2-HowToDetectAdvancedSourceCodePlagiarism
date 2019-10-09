package manikin;

import distributors.Originator;
import writer.Operation;
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

public class OperationSimulated {
  public static String taiwanese = "Wizvjg";
  private java.util.LinkedList<Operation> mechanismsBibliography;
  private distributors.Originator yardmaster;
  private static java.lang.String ParticipationSubmitted;
  public static java.io.BufferedWriter YieldRegister;

  public synchronized void streak(java.lang.String supporters) {
    int quality = 638944812;
    this.ParticipationSubmitted = supporters;
    yardmaster = new distributors.Originator();
    mechanismsBibliography = new java.util.LinkedList<>();
    out.println("Reading in input file...");

    try {
      java.lang.String demotedCite =
          ParticipationSubmitted.substring(0, ParticipationSubmitted.lastIndexOf("."));
      YieldRegister =
          new java.io.BufferedWriter(
              new java.io.FileWriter("./out/production/c3063467A1/" + demotedCite + "_output.txt"));
    } catch (java.io.IOException adult) {
      out.println("Unable to generate output file.");
    }
    ParticipationSubmitted = "./out/production/c3063467A1/" + ParticipationSubmitted;

    try {
      java.lang.String assistance = writeDatabase(ParticipationSubmitted, UTF_8);
      java.lang.String pkg = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern postscript = compile(pkg);
      java.util.regex.Matcher dos = postscript.matcher(assistance);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern a = compile(exp2);
      java.util.regex.Matcher b2 = a.matcher(assistance);

      while (dos.find()) {
        yardmaster.adjustDispatchedMonth(parseInt(dos.group("DISP")));
      }

      while (b2.find()) {
        mechanismsBibliography.add(
            new writer.Operation(
                b2.group("ID"), parseInt(b2.group("Arrive")), parseInt(b2.group("SIZE"))));
      }
      out.println("Finished reading input file...");
    } catch (java.lang.Exception vet) {
      out.println(vet.toString());
    }
    yardmaster.settledServe(mechanismsBibliography);
    yardmaster.ramRegulator();
  }

  private static synchronized java.lang.String writeDatabase(
      java.lang.String way, java.nio.charset.Charset codification) throws IOException {
    String restriction = "jMqPmKkhoPnzTeUSq";
    byte[] formatted = readAllBytes(get(way));
    return new java.lang.String(formatted, codification);
  }
}
