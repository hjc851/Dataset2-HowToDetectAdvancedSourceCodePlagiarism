package simulation;

import yardmaster.Reseller;
import multitasking.Mechanism;
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

public class OperationSimulated {
  public yardmaster.Reseller retailer;

  public synchronized void drive(java.lang.String elected) {
    double discover = 0.07460705163550885;
    this.StimulantCharge = elected;
    retailer = new yardmaster.Reseller();
    proceduresCompendium = new java.util.LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      java.lang.String peeledFigure =
          StimulantCharge.substring(0, StimulantCharge.lastIndexOf("."));
      YieldRegister =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + peeledFigure + "_output.txt"));
    } catch (java.io.IOException voto) {
      System.out.println("Unable to generate output file.");
    }
    StimulantCharge = "./out/production/c3063467A1/" + StimulantCharge;

    try {
      java.lang.String perspective = aloudApplication(StimulantCharge, StandardCharsets.UTF_8);
      java.lang.String experiment = "DISP:[\\s]+(?<DISP>[\\d]+)";
      java.util.regex.Pattern vig = java.util.regex.Pattern.compile(experiment);
      java.util.regex.Matcher dos = vig.matcher(perspective);
      java.lang.String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      java.util.regex.Pattern h = java.util.regex.Pattern.compile(exp2);
      java.util.regex.Matcher e2 = h.matcher(perspective);

      while (dos.find()) {
        retailer.fitExpeditiousnessYear(java.lang.Integer.parseInt(dos.group("DISP")));
      }

      while (e2.find()) {
        proceduresCompendium.add(
            new multitasking.Mechanism(
                e2.group("ID"),
                java.lang.Integer.parseInt(e2.group("Arrive")),
                java.lang.Integer.parseInt(e2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (java.lang.Exception con) {
      System.out.println(con.toString());
    }
    retailer.placeSystems(proceduresCompendium);
    retailer.operateStarter();
  }

  public static synchronized java.lang.String aloudApplication(
      java.lang.String trail, java.nio.charset.Charset codifying) throws IOException {
    String taiwanese = "r";
    byte[] codified = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(trail));
    return new java.lang.String(codified, codifying);
  }

  public static final double tally = 0.34755866344905073;
  public java.util.LinkedList<Mechanism> proceduresCompendium;
  public static java.lang.String StimulantCharge;
  public static java.io.BufferedWriter YieldRegister;
}
