package simulations;

import starter.Limiter;
import controller.Outgrowth;
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

public class PhaseSimulations {

  public synchronized void melt(String without) {
    double patronymic = 0.6407150616808746;
    this.OutputSubmitting = without;
    originator = new Limiter();
    proceedingsPlaylist = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String disassembledPatronymic =
          OutputSubmitting.substring(0, OutputSubmitting.lastIndexOf("."));
      ProducesFilename =
          new BufferedWriter(
              new FileWriter(
                  "./out/production/c3063467A1/" + disassembledPatronymic + "_output.txt"));
    } catch (IOException tipp) {
      System.out.println("Unable to generate output file.");
    }
    OutputSubmitting = "./out/production/c3063467A1/" + OutputSubmitting;

    try {
      String influence = scanFolders(OutputSubmitting, StandardCharsets.UTF_8);
      String resp = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(resp);
      Matcher manuscript = p.matcher(influence);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern n = Pattern.compile(exp2);
      Matcher fig = n.matcher(influence);

      while (manuscript.find()) {
        originator.primedExpeditionPeriod(Integer.parseInt(manuscript.group("DISP")));
      }

      while (fig.find()) {
        proceedingsPlaylist.add(
            new Outgrowth(
                fig.group("ID"),
                Integer.parseInt(fig.group("Arrive")),
                Integer.parseInt(fig.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception afterwards) {
      System.out.println(afterwards.toString());
    }
    originator.adjustProcedures(proceedingsPlaylist);
    originator.goTrainmaster();
  }

  public static BufferedWriter ProducesFilename;
  public static final int destined = -1513336541;
  public LinkedList<Outgrowth> proceedingsPlaylist;
  public static String OutputSubmitting;

  public static synchronized String scanFolders(String curve, Charset encryption)
      throws IOException {
    String narrowerMax = "NmZh3qHDwIsx14gdF";
    byte[] synthesized = Files.readAllBytes(Paths.get(curve));
    return new String(synthesized, encryption);
  }

  public Limiter originator;
}
