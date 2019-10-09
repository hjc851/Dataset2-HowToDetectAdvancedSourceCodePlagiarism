package sim;

import limiter.Yardmaster;
import programming.Mechanism;
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

public class ProceedingPrototype {
  public static java.io.BufferedWriter ProducerSubmitted;
  public static java.lang.String StimulantCharge;
  public limiter.Yardmaster exporter;
  public java.util.LinkedList<Mechanism> treatLitany;

  public synchronized void move(java.lang.String nih) {
    this.StimulantCharge = nih;
    exporter = new limiter.Yardmaster();
    treatLitany = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String forfeitedDescribe;
      forfeitedDescribe = StimulantCharge.substring(0, StimulantCharge.lastIndexOf("."));
      ProducerSubmitted =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + forfeitedDescribe + "_output.txt"));
    } catch (java.io.IOException voto) {
      System.out.println("Unable to generate output file.");
    }
    StimulantCharge = "./out/production/c3063467A1/" + StimulantCharge;

    try {
      java.lang.String stimulus;
      java.lang.String knowl;
      java.util.regex.Pattern postscript;
      java.util.regex.Matcher manuscript;
      java.lang.String exp2;
      java.util.regex.Pattern a3;
      java.util.regex.Matcher e;
      stimulus = reciteSubmitting(StimulantCharge, StandardCharsets.UTF_8);
      knowl = "DISP:[\\s]+(?<DISP>[\\d]+)";
      postscript = java.util.regex.Pattern.compile(knowl);
      manuscript = postscript.matcher(stimulus);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      a3 = java.util.regex.Pattern.compile(exp2);
      e = a3.matcher(stimulus);

      while (manuscript.find()) {
        exporter.determinedDischargeDays(java.lang.Integer.parseInt(manuscript.group("DISP")));
      }

      while (e.find()) {
        treatLitany.add(
            new programming.Mechanism(
                e.group("ID"),
                java.lang.Integer.parseInt(e.group("Arrive")),
                java.lang.Integer.parseInt(e.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception aba) {
      System.out.println(aba.toString());
    }
    exporter.adjustProcedures(treatLitany);
    exporter.moveSender();
  }

  public static synchronized java.lang.String reciteSubmitting(
      java.lang.String routes, java.nio.charset.Charset coded) throws IOException {
    byte[] entered = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(routes));
    return new java.lang.String(entered, coded);
  }
}
