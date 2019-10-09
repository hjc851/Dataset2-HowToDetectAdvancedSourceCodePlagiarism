package device;

import sender.Starter;
import developer.Work;
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
  public sender.Starter responsible;
  public java.util.LinkedList<Work> procedureNumber;
  public static java.lang.String FeedbackFolder;

  public static synchronized java.lang.String hearBinder(
      java.lang.String journey, java.nio.charset.Charset decoding) throws IOException {
    byte[] coded = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(journey));
    return new java.lang.String(coded, decoding);
  }

  public static java.io.BufferedWriter QuantityBinder;

  public synchronized void extend(java.lang.String immigration) {
    this.FeedbackFolder = immigration;
    responsible = new sender.Starter();
    procedureNumber = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String minimalMention;
      minimalMention = FeedbackFolder.substring(0, FeedbackFolder.lastIndexOf("."));
      QuantityBinder =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + minimalMention + "_output.txt"));
    } catch (java.io.IOException tipp) {
      System.out.println("Unable to generate output file.");
    }
    FeedbackFolder = "./out/production/c3063467A1/" + FeedbackFolder;

    try {
      java.lang.String response;
      java.lang.String purch;
      java.util.regex.Pattern vig;
      java.util.regex.Matcher sm;
      java.lang.String exp2;
      java.util.regex.Pattern k;
      java.util.regex.Matcher b2;
      response = hearBinder(FeedbackFolder, StandardCharsets.UTF_8);
      purch = "DISP:[\\s]+(?<DISP>[\\d]+)";
      vig = java.util.regex.Pattern.compile(purch);
      sm = vig.matcher(response);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      k = java.util.regex.Pattern.compile(exp2);
      b2 = k.matcher(response);

      while (sm.find()) {
        responsible.settledHitPeriods(java.lang.Integer.parseInt(sm.group("DISP")));
      }

      while (b2.find()) {
        procedureNumber.add(
            new developer.Work(
                b2.group("ID"),
                java.lang.Integer.parseInt(b2.group("Arrive")),
                java.lang.Integer.parseInt(b2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception abe) {
      System.out.println(abe.toString());
    }
    responsible.determineProces(procedureNumber);
    responsible.courseResponsible();
  }
}
