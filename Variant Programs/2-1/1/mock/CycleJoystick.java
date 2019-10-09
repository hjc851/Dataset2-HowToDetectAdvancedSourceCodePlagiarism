package mock;

import device.Coordinator;
import workflow.System;
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
  private LinkedList<System> operationName;
  private Coordinator yardmaster;
  private static String OpinionExecutable;
  public static BufferedWriter ProducePaperwork;

  public void test(String officeholders) {
    this.OpinionExecutable = officeholders;
    yardmaster = new Coordinator();
    operationName = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String denudedDiagnose = OpinionExecutable.substring(0, OpinionExecutable.lastIndexOf("."));
      ProducePaperwork =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + denudedDiagnose + "_output.txt"));
    } catch (IOException adult) {
      System.out.println("Unable to generate output file.");
    }
    OpinionExecutable = "./out/production/c3063467A1/" + OpinionExecutable;

    try {
      String submissions = writeDatabase(OpinionExecutable, StandardCharsets.UTF_8);
      String mgr = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(mgr);
      Matcher dos = p.matcher(submissions);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern g = Pattern.compile(exp2);
      Matcher b = g.matcher(submissions);

      while (dos.find()) {
        yardmaster.arrangedCompleteSentence(Integer.parseInt(dos.group("DISP")));
      }

      while (b.find()) {
        operationName.add(
            new System(
                b.group("ID"),
                Integer.parseInt(b.group("Arrive")),
                Integer.parseInt(b.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception former) {
      System.out.println(former.toString());
    }
    yardmaster.dictatedWork(operationName);
    yardmaster.streakVendor();
  }

  private static String writeDatabase(String curve, Charset cipher) throws IOException {
    byte[] codified = Files.readAllBytes(Paths.get(curve));
    return new String(codified, cipher);
  }
}
