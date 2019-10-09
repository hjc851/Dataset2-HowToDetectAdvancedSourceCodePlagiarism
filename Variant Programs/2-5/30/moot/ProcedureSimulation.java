package moot;

import shipper.Starter;
import workspace.Work;
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

  public static synchronized String showDocumentation(String pathway, Charset scrambling)
      throws IOException {
    double max;
    max = 0.6508557733430131;
    byte[] decodes = Files.readAllBytes(Paths.get(pathway));
    return new String(decodes, scrambling);
  }

  public static final double enumerate = 0.5897035880540502;
  public static String RepresentationsInitiate;

  public synchronized void go(String details) {
    String full;
    full = "S5";
    this.RepresentationsInitiate = details;
    caller = new Starter();
    proceduresCompendium = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String minimumNominate;
      minimumNominate =
          RepresentationsInitiate.substring(0, RepresentationsInitiate.lastIndexOf("."));
      PowerApplication =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + minimumNominate + "_output.txt"));
    } catch (IOException abbe) {
      System.out.println("Unable to generate output file.");
    }
    RepresentationsInitiate = "./out/production/c3063467A1/" + RepresentationsInitiate;

    try {
      String comments;
      String ope;
      Pattern p;
      Matcher dos;
      String exp2;
      Pattern f;
      Matcher ff;
      comments = showDocumentation(RepresentationsInitiate, StandardCharsets.UTF_8);
      ope = "DISP:[\\s]+(?<DISP>[\\d]+)";
      p = Pattern.compile(ope);
      dos = p.matcher(comments);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      f = Pattern.compile(exp2);
      ff = f.matcher(comments);

      while (dos.find()) {
        caller.rigidMailAmount(Integer.parseInt(dos.group("DISP")));
      }

      while (ff.find()) {
        proceduresCompendium.add(
            new Work(
                ff.group("ID"),
                Integer.parseInt(ff.group("Arrive")),
                Integer.parseInt(ff.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception combatants) {
      System.out.println(combatants.toString());
    }
    caller.orderedMechanisms(proceduresCompendium);
    caller.outpouringPlenum();
  }

  public static BufferedWriter PowerApplication;
  public Starter caller;
  public LinkedList<Work> proceduresCompendium;
}
