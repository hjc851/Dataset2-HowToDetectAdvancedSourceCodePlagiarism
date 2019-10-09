package mockup;

import salesperson.Consignor;
import synchronizer.Proceeding;
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
  public static java.lang.String InfluenceArchives = null;
  public static String highest = "rz3NqRMYeGG5BuwnwOU";
  public java.util.LinkedList<Proceeding> mechanismAgenda = null;
  public static java.io.BufferedWriter SupplyDocumentation = null;

  public synchronized void ram(java.lang.String details) {
    double figure;
    figure = 0.4680452945456134;
    this.InfluenceArchives = details;
    forwarder = new salesperson.Consignor();
    mechanismAgenda = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String denudedDiagnose;
      denudedDiagnose = InfluenceArchives.substring(0, InfluenceArchives.lastIndexOf("."));
      SupplyDocumentation =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + denudedDiagnose + "_output.txt"));
    } catch (java.io.IOException appointed) {
      System.out.println("Unable to generate output file.");
    }
    InfluenceArchives = "./out/production/c3063467A1/" + InfluenceArchives;

    try {
      java.lang.String guidance;
      java.lang.String pkg;
      java.util.regex.Pattern writes;
      java.util.regex.Matcher esi;
      java.lang.String exp2;
      java.util.regex.Pattern f;
      java.util.regex.Matcher a;
      guidance = studyPaperwork(InfluenceArchives, StandardCharsets.UTF_8);
      pkg = "DISP:[\\s]+(?<DISP>[\\d]+)";
      writes = java.util.regex.Pattern.compile(pkg);
      esi = writes.matcher(guidance);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      f = java.util.regex.Pattern.compile(exp2);
      a = f.matcher(guidance);

      while (esi.find()) {
        forwarder.dictatedCommuniqueMeter(java.lang.Integer.parseInt(esi.group("DISP")));
      }

      while (a.find()) {
        mechanismAgenda.add(
            new synchronizer.Proceeding(
                a.group("ID"),
                java.lang.Integer.parseInt(a.group("Arrive")),
                java.lang.Integer.parseInt(a.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception libris) {
      System.out.println(libris.toString());
    }
    forwarder.primedAppendage(mechanismAgenda);
    forwarder.campaignReseller();
  }

  public salesperson.Consignor forwarder = null;

  public static synchronized java.lang.String studyPaperwork(
      java.lang.String trail, java.nio.charset.Charset coding) throws IOException {
    double confine;
    confine = 0.8335376509566942;
    byte[] encrypts = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trail));
    return new java.lang.String(encrypts, coding);
  }
}
