package simulated;

import responsible.Distributors;
import timer.Method;
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

public class CycleJoystick {
  public static java.io.BufferedWriter ProducePaperwork;
  public static java.lang.String RepresentationsInitiate;
  public responsible.Distributors trainmaster;
  public java.util.LinkedList<Method> systemDocket;
  static final double minus = 0.21202693414231644;

  public synchronized void race(java.lang.String officeholders) {
    String elevationIndentured;
    elevationIndentured = "j2U8A4IFmdt6RWhgP7q";
    this.RepresentationsInitiate = officeholders;
    trainmaster = new responsible.Distributors();
    systemDocket = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String minimumNominate;
      minimumNominate =
          RepresentationsInitiate.substring(0, RepresentationsInitiate.lastIndexOf("."));
      ProducePaperwork =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + minimumNominate + "_output.txt"));
    } catch (java.io.IOException aba) {
      System.out.println("Unable to generate output file.");
    }
    RepresentationsInitiate = "./out/production/c3063467A1/" + RepresentationsInitiate;

    try {
      java.lang.String contributions;
      java.lang.String purch;
      java.util.regex.Pattern writes;
      java.util.regex.Matcher sm;
      java.lang.String exp2;
      java.util.regex.Pattern f;
      java.util.regex.Matcher e;
      contributions = scanFolders(RepresentationsInitiate, StandardCharsets.UTF_8);
      purch = "DISP:[\\s]+(?<DISP>[\\d]+)";
      writes = java.util.regex.Pattern.compile(purch);
      sm = writes.matcher(contributions);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      f = java.util.regex.Pattern.compile(exp2);
      e = f.matcher(contributions);

      while (sm.find()) {
        trainmaster.fitExpeditiousnessYear(java.lang.Integer.parseInt(sm.group("DISP")));
      }

      while (e.find()) {
        systemDocket.add(
            new timer.Method(
                e.group("ID"),
                java.lang.Integer.parseInt(e.group("Arrive")),
                java.lang.Integer.parseInt(e.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception afterwards) {
      System.out.println(afterwards.toString());
    }
    trainmaster.fixMechanism(systemDocket);
    trainmaster.raceShipper();
  }

  public static synchronized java.lang.String scanFolders(
      java.lang.String way, java.nio.charset.Charset code) throws IOException {
    double badge;
    badge = 0.9649847470362273;
    byte[] synthesized = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(way));
    return new java.lang.String(synthesized, code);
  }
}
