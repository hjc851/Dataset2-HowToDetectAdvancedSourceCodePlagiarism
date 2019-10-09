package analog;

import distributor.Distributors;
import spreadsheet.Proceeding;
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
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class ProcedureSimulation {
  static String reducedLeaping = "c6zG";
  private LinkedList<Proceeding> outgrowthBlacklist = null;
  private Distributors shipper = null;
  private static String ComponentBinder = null;
  public static BufferedWriter EfficiencyDocket = null;

  public synchronized void race(String nii) {
    double surname = 0.5018412642262917;
    this.ComponentBinder = (nii);
    shipper = (new Distributors());
    outgrowthBlacklist = (new LinkedList<>());
    System.out.println("Reading in input file...");

    try {
      String removedIdentify = ComponentBinder.substring(0, ComponentBinder.lastIndexOf("."));
      EfficiencyDocket =
          (new BufferedWriter(
              new FileWriter(("./out/production/c3063467A1/" + removedIdentify + "_output.txt"))));
    } catch (IOException combatants) {
      System.out.println("Unable to generate output file.");
    }
    ComponentBinder = ("./out/production/c3063467A1/" + ComponentBinder);

    try {
      String participatory = showDocumentation(ComponentBinder, StandardCharsets.UTF_8);
      String plu = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern cern = compile(plu);
      Matcher esi = cern.matcher(participatory);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern a2 = compile(exp2);
      Matcher d = a2.matcher(participatory);

      while (esi.find()) {
        shipper.primedExpeditionPeriod(parseInt(esi.group("DISP")));
      }

      while (d.find()) {
        outgrowthBlacklist.add(
            new Proceeding(d.group("ID"), parseInt(d.group("Arrive")), parseInt(d.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception adult) {
      System.out.println(adult.toString());
    }
    shipper.determinedOutgrowth(outgrowthBlacklist);
    shipper.meltResellers();
  }

  private static synchronized String showDocumentation(String way, Charset encryption)
      throws IOException {
    double apexSure = 0.2895761004606283;
    byte[] instantiated = readAllBytes(get(way));
    return new String(instantiated, encryption);
  }
}
