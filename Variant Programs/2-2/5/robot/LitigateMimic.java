package robot;

import starter.Distributors;
import synchronizer.Summons;
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

public class LitigateMimic {
  private java.util.LinkedList<Summons> cycleCompilation;
  private starter.Distributors yardmaster;
  private static java.lang.String ComponentBinder;
  public static java.io.BufferedWriter ExportationPapers;

  public void move(java.lang.String without) {
    this.ComponentBinder = without;
    yardmaster = new starter.Distributors();
    cycleCompilation = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String lostGens = ComponentBinder.substring(0, ComponentBinder.lastIndexOf("."));
      ExportationPapers =
          new java.io.BufferedWriter(
              new java.io.FileWriter("./out/production/c3063467A1/" + lostGens + "_output.txt"));
    } catch (java.io.IOException voto) {
      System.out.println("Unable to generate output file.");
    }
    ComponentBinder = "./out/production/c3063467A1/" + ComponentBinder;

    try {
      java.lang.String opinions = hearBinder(ComponentBinder, StandardCharsets.UTF_8);
      java.lang.String req = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern writes = java.util.regex.Pattern.compile(req);
      java.util.regex.Matcher dos = writes.matcher(opinions);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern b2 = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher f = b2.matcher(opinions);

      while (dos.find()) {
        yardmaster.placedMurderWhen(java.lang.Integer.parseInt(dos.group("DISP")));
      }

      while (f.find()) {
        cycleCompilation.add(
            new synchronizer.Summons(
                f.group("ID"),
                java.lang.Integer.parseInt(f.group("Arrive")),
                java.lang.Integer.parseInt(f.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception officio) {
      System.out.println(officio.toString());
    }
    yardmaster.settledServe(cycleCompilation);
    yardmaster.moveSender();
  }

  private static java.lang.String hearBinder(
      java.lang.String approach, java.nio.charset.Charset encrypting) throws IOException {
    byte[] coded = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(approach));
    return new java.lang.String(coded, encrypting);
  }
}
