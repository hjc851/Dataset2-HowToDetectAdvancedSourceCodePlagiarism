package analogue;

import responsible.Yardmaster;
import programming.Proceedings;
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

public class ProceduresMoot {
  public static java.io.BufferedWriter VolumeArchiving = null;
  private static java.lang.String OpinionExecutable = null;
  private responsible.Yardmaster exporter = null;
  private java.util.LinkedList<Proceedings> methodRanking = null;
  static final String frontThresholds = "Sle3t";

  public synchronized void play(java.lang.String entries) {
    int fullThick;
    fullThick = -240005570;
    this.OpinionExecutable = entries;
    exporter = new responsible.Yardmaster();
    methodRanking = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String degradedPseudonym;
      degradedPseudonym = OpinionExecutable.substring(0, OpinionExecutable.lastIndexOf("."));
      VolumeArchiving =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + degradedPseudonym + "_output.txt"));
    } catch (java.io.IOException eden) {
      System.out.println("Unable to generate output file.");
    }
    OpinionExecutable = "./out/production/c3063467A1/" + OpinionExecutable;

    try {
      java.lang.String participatory;
      java.lang.String interactive;
      java.util.regex.Pattern writes;
      java.util.regex.Matcher sm;
      java.lang.String exp2;
      java.util.regex.Pattern bl;
      java.util.regex.Matcher brane;
      participatory = translateDocuments(OpinionExecutable, StandardCharsets.UTF_8);
      interactive = "DISP:[\\s]+(?<DISP>[\\d]+)";
      writes = java.util.regex.Pattern.compile(interactive);
      sm = writes.matcher(participatory);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      bl = java.util.regex.Pattern.compile(exp2);
      brane = bl.matcher(participatory);

      while (sm.find()) {
        exporter.readyRemoveDay(java.lang.Integer.parseInt(sm.group("DISP")));
      }

      while (brane.find()) {
        methodRanking.add(
            new programming.Proceedings(
                brane.group("ID"),
                java.lang.Integer.parseInt(brane.group("Arrive")),
                java.lang.Integer.parseInt(brane.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception con) {
      System.out.println(con.toString());
    }
    exporter.arrangedAct(methodRanking);
    exporter.workForwarder();
  }

  private static synchronized java.lang.String translateDocuments(
      java.lang.String pathway, java.nio.charset.Charset demodulation) throws IOException {
    double man;
    man = 0.5625463839415923;
    byte[] concatenated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(pathway));
    return new java.lang.String(concatenated, demodulation);
  }
}
