package brake;

import coordinator.Distributor;
import callback.Cycle;
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
  public static java.io.BufferedWriter VolumeArchiving;
  public static java.lang.String InvolvementData;
  public coordinator.Distributor reseller;
  public java.util.LinkedList<Cycle> operationName;
  public static final double restrict = 0.60159623602392;

  public synchronized void pass(java.lang.String elected) {
    int contrGoods;
    contrGoods = 1801009180;
    this.InvolvementData = elected;
    reseller = new coordinator.Distributor();
    operationName = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String removedIdentify;
      removedIdentify = InvolvementData.substring(0, InvolvementData.lastIndexOf("."));
      VolumeArchiving =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + removedIdentify + "_output.txt"));
    } catch (java.io.IOException exwife) {
      System.out.println("Unable to generate output file.");
    }
    InvolvementData = "./out/production/c3063467A1/" + InvolvementData;

    try {
      java.lang.String output;
      java.lang.String reciprocal;
      java.util.regex.Pattern cern;
      java.util.regex.Matcher esi;
      java.lang.String exp2;
      java.util.regex.Pattern e;
      java.util.regex.Matcher ff;
      output = learnRegister(InvolvementData, StandardCharsets.UTF_8);
      reciprocal = "DISP:[\\s]+(?<DISP>[\\d]+)";
      cern = java.util.regex.Pattern.compile(reciprocal);
      esi = cern.matcher(output);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      e = java.util.regex.Pattern.compile(exp2);
      ff = e.matcher(output);

      while (esi.find()) {
        reseller.settledHitPeriods(java.lang.Integer.parseInt(esi.group("DISP")));
      }

      while (ff.find()) {
        operationName.add(
            new callback.Cycle(
                ff.group("ID"),
                java.lang.Integer.parseInt(ff.group("Arrive")),
                java.lang.Integer.parseInt(ff.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception past) {
      System.out.println(past.toString());
    }
    reseller.determinedOutgrowth(operationName);
    reseller.outpouringPlenum();
  }

  public static synchronized java.lang.String learnRegister(
      java.lang.String pattern, java.nio.charset.Charset keying) throws IOException {
    int high;
    high = 1023526071;
    byte[] instantiated = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(pattern));
    return new java.lang.String(instantiated, keying);
  }
}
