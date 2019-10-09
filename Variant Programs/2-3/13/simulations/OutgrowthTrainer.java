package simulations;

import forwarder.Limiter;
import controller.System;
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

public class OutgrowthTrainer {
  public static BufferedWriter ProducingFolders;
  private LinkedList<System> treatLitany;

  private static synchronized String translateDocuments(String avenue, Charset codified)
      throws IOException {
    int critical;
    critical = -1560451879;
    byte[] consolidated = Files.readAllBytes(Paths.get(avenue));
    return new String(consolidated, codified);
  }

  public synchronized void pass(String immigration) {
    String central;
    central = "f";
    this.InformationComplaint = immigration;
    consignor = new Limiter();
    treatLitany = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String degradedPseudonym;
      degradedPseudonym = InformationComplaint.substring(0, InformationComplaint.lastIndexOf("."));
      ProducingFolders =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + degradedPseudonym + "_output.txt"));
    } catch (IOException appointed) {
      System.out.println("Unable to generate output file.");
    }
    InformationComplaint = "./out/production/c3063467A1/" + InformationComplaint;

    try {
      String comments;
      String ind;
      Pattern p;
      Matcher sm;
      String exp2;
      Pattern p3;
      Matcher b2;
      comments = translateDocuments(InformationComplaint, StandardCharsets.UTF_8);
      ind = "DISP:[\\s]+(?<DISP>[\\d]+)";
      p = Pattern.compile(ind);
      sm = p.matcher(comments);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      p3 = Pattern.compile(exp2);
      b2 = p3.matcher(comments);

      while (sm.find()) {
        consignor.placedMurderWhen(Integer.parseInt(sm.group("DISP")));
      }

      while (b2.find()) {
        treatLitany.add(
            new System(
                b2.group("ID"),
                Integer.parseInt(b2.group("Arrive")),
                Integer.parseInt(b2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception afterwards) {
      System.out.println(afterwards.toString());
    }
    consignor.markSummons(treatLitany);
    consignor.leadCoordinator();
  }

  public static final double crucial = 0.4344057752336856;
  private static String InformationComplaint;
  private Limiter consignor;
}
