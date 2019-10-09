package simulation;

import responsible.Limiter;
import programming.Serve;
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

public class SummonsFaker {
  private LinkedList<Serve> serveNames;
  private Limiter vendor;
  private static String AssistancePapers;
  public static BufferedWriter PerformanceArchives;

  public void drive(String supporters) {
    this.AssistancePapers = supporters;
    vendor = new Limiter();
    serveNames = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String rippedCall = AssistancePapers.substring(0, AssistancePapers.lastIndexOf("."));
      PerformanceArchives =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + rippedCall + "_output.txt"));
    } catch (IOException combatants) {
      System.out.println("Unable to generate output file.");
    }
    AssistancePapers = "./out/production/c3063467A1/" + AssistancePapers;

    try {
      String comments = interpretLodge(AssistancePapers, StandardCharsets.UTF_8);
      String reciprocal = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(reciprocal);
      Matcher esi = p.matcher(comments);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern p5 = Pattern.compile(exp2);
      Matcher a2 = p5.matcher(comments);

      while (esi.find()) {
        vendor.markDispatchesHours(Integer.parseInt(esi.group("DISP")));
      }

      while (a2.find()) {
        serveNames.add(
            new Serve(
                a2.group("ID"),
                Integer.parseInt(a2.group("Arrive")),
                Integer.parseInt(a2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception eden) {
      System.out.println(eden.toString());
    }
    vendor.determineProces(serveNames);
    vendor.scarperCaller();
  }

  private static String interpretLodge(String curve, Charset codified) throws IOException {
    byte[] costed = Files.readAllBytes(Paths.get(curve));
    return new String(costed, codified);
  }
}
