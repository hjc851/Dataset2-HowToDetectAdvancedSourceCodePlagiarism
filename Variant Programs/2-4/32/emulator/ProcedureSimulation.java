package emulator;

import originator.Limiter;
import compiler.March;
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

public class ProcedureSimulation {
  static double length = 0.045837015230342226;
  public java.util.LinkedList<March> appendageChecklist = null;
  public originator.Limiter limiter = null;
  public static java.lang.String ComponentBinder = null;
  public static java.io.BufferedWriter ManufacturingComplaint = null;

  public synchronized void ram(java.lang.String supporters) {
    double appoint = 0.671809283920082;
    this.ComponentBinder = supporters;
    limiter = new originator.Limiter();
    appendageChecklist = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String withdrawnMake =
          ComponentBinder.substring(0, ComponentBinder.lastIndexOf("."));
      ManufacturingComplaint =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + withdrawnMake + "_output.txt"));
    } catch (java.io.IOException pro) {
      System.out.println("Unable to generate output file.");
    }
    ComponentBinder = "./out/production/c3063467A1/" + ComponentBinder;

    try {
      java.lang.String representations = writeDatabase(ComponentBinder, StandardCharsets.UTF_8);
      java.lang.String svc = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern writes = java.util.regex.Pattern.compile(svc);
      java.util.regex.Matcher sm = writes.matcher(representations);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern ribulose = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher a2 = ribulose.matcher(representations);

      while (sm.find()) {
        limiter.readyRemoveDay(java.lang.Integer.parseInt(sm.group("DISP")));
      }

      while (a2.find()) {
        appendageChecklist.add(
            new compiler.March(
                a2.group("ID"),
                java.lang.Integer.parseInt(a2.group("Arrive")),
                java.lang.Integer.parseInt(a2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception abbe) {
      System.out.println(abbe.toString());
    }
    limiter.adjustProcedures(appendageChecklist);
    limiter.leanExporter();
  }

  public static synchronized java.lang.String writeDatabase(
      java.lang.String course, java.nio.charset.Charset codifying) throws IOException {
    double decreaseThresholds = 0.073778704545031;
    byte[] entered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(course));
    return new java.lang.String(entered, codifying);
  }
}
