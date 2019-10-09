package mimic;

import vendor.Exporter;
import compiler.Mechanisms;
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
  private static String AssistancePapers;

  private static synchronized String recordExecutable(String avenue, Charset encrypted)
      throws IOException {
    byte[] interleaves = Files.readAllBytes(Paths.get(avenue));
    return new String(interleaves, encrypted);
  }

  private LinkedList<Mechanisms> negotiationsListings;
  private Exporter distributors;

  public synchronized void campaign(String proponents) {
    this.AssistancePapers = proponents;
    distributors = new Exporter();
    negotiationsListings = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String peeledFigure;
      peeledFigure = AssistancePapers.substring(0, AssistancePapers.lastIndexOf("."));
      ExportSubmit =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + peeledFigure + "_output.txt"));
    } catch (IOException con) {
      System.out.println("Unable to generate output file.");
    }
    AssistancePapers = "./out/production/c3063467A1/" + AssistancePapers;

    try {
      String submissions;
      String supp;
      Pattern p;
      Matcher esi;
      String exp2;
      Pattern p3;
      Matcher b2;
      submissions = recordExecutable(AssistancePapers, StandardCharsets.UTF_8);
      supp = "DISP:[\\s]+(?<DISP>[\\d]+)";
      p = Pattern.compile(supp);
      esi = p.matcher(submissions);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      p3 = Pattern.compile(exp2);
      b2 = p3.matcher(submissions);

      while (esi.find()) {
        distributors.readyRemoveDay(Integer.parseInt(esi.group("DISP")));
      }

      while (b2.find()) {
        negotiationsListings.add(
            new Mechanisms(
                b2.group("ID"),
                Integer.parseInt(b2.group("Arrive")),
                Integer.parseInt(b2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception abel) {
      System.out.println(abel.toString());
    }
    distributors.prepareMethodologies(negotiationsListings);
    distributors.scarperCaller();
  }

  public static BufferedWriter ExportSubmit;
}
