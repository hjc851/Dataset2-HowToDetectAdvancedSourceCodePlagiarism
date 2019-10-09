package manikin;

import exporter.Distributor;
import callback.Act;
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

public class MethodologyEmulator {
  static final String cardinal = "8NgyKAR";
  private LinkedList<Act> proceedingsPlaylist;
  private Distributor plenum;
  private static String AssistancePapers;
  public static BufferedWriter ThroughputDocument;

  public synchronized void race(String without) {
    double trussed = 0.26351486590868745;
    this.AssistancePapers = (without);
    plenum = (new Distributor());
    proceedingsPlaylist = (new LinkedList<>());
    System.out.println("Reading in input file...");

    try {
      String demotedCite = AssistancePapers.substring(0, AssistancePapers.lastIndexOf("."));
      ThroughputDocument =
          (new BufferedWriter(
              new FileWriter(("./out/production/c3063467A1/" + demotedCite + "_output.txt"))));
    } catch (IOException vet) {
      System.out.println("Unable to generate output file.");
    }
    AssistancePapers = ("./out/production/c3063467A1/" + AssistancePapers);

    try {
      String opinion = interpretLodge(AssistancePapers, StandardCharsets.UTF_8);
      String purch = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(purch);
      Matcher sm = p.matcher(opinion);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern f = Pattern.compile(exp2);
      Matcher e = f.matcher(opinion);

      while (sm.find()) {
        plenum.bentSendingHour(Integer.parseInt(sm.group("DISP")));
      }

      while (e.find()) {
        proceedingsPlaylist.add(
            new Act(
                e.group("ID"),
                Integer.parseInt(e.group("Arrive")),
                Integer.parseInt(e.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception voto) {
      System.out.println(voto.toString());
    }
    plenum.laidOperation(proceedingsPlaylist);
    plenum.moveSender();
  }

  private static synchronized String interpretLodge(String footpath, Charset code)
      throws IOException {
    String item = "A1XB8klIbYhApjtIOp";
    byte[] encrypted = Files.readAllBytes(Paths.get(footpath));
    return new String(encrypted, code);
  }
}
