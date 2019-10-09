package analog;

import regulator.Retailer;
import workflow.Proceedings;
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

public class WorkSimulating {
  private LinkedList<Proceedings> outgrowthBlacklist;
  private Retailer distributor;
  private static String StimulationLodge;
  public static BufferedWriter ExportationPapers;

  public void campaign(String entries) {
    this.StimulationLodge = entries;
    distributor = new Retailer();
    outgrowthBlacklist = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String minimumNominate = StimulationLodge.substring(0, StimulationLodge.lastIndexOf("."));
      ExportationPapers =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + minimumNominate + "_output.txt"));
    } catch (IOException abe) {
      System.out.println("Unable to generate output file.");
    }
    StimulationLodge = "./out/production/c3063467A1/" + StimulationLodge;

    try {
      String participation = writeDatabase(StimulationLodge, StandardCharsets.UTF_8);
      String resp = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(resp);
      Matcher dos = p.matcher(participation);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern gpi = Pattern.compile(exp2);
      Matcher e = gpi.matcher(participation);

      while (dos.find()) {
        distributor.laidShipmentClip(Integer.parseInt(dos.group("DISP")));
      }

      while (e.find()) {
        outgrowthBlacklist.add(
            new Proceedings(
                e.group("ID"),
                Integer.parseInt(e.group("Arrive")),
                Integer.parseInt(e.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception pro) {
      System.out.println(pro.toString());
    }
    distributor.putProcedure(outgrowthBlacklist);
    distributor.prevailDistributor();
  }

  private static String writeDatabase(String trajectory, Charset codify) throws IOException {
    byte[] encrypted = Files.readAllBytes(Paths.get(trajectory));
    return new String(encrypted, codify);
  }
}
