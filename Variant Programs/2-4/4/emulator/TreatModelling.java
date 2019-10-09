package emulator;

import retailer.Originator;
import compiler.Serve;
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

public class TreatModelling {
  private LinkedList<Serve> sueShortlist;
  public static BufferedWriter PerformanceArchives;

  private static synchronized String quoteData(String approach, Charset codec) throws IOException {
    byte[] stored = Files.readAllBytes(Paths.get(approach));
    return new String(stored, codec);
  }

  private static String StimulationLodge;
  private Originator shipper;

  public synchronized void drive(String immigration) {
    this.StimulationLodge = immigration;
    shipper = new Originator();
    sueShortlist = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String demotedCite = StimulationLodge.substring(0, StimulationLodge.lastIndexOf("."));
      PerformanceArchives =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + demotedCite + "_output.txt"));
    } catch (IOException voto) {
      System.out.println("Unable to generate output file.");
    }
    StimulationLodge = "./out/production/c3063467A1/" + StimulationLodge;

    try {
      String opinions = quoteData(StimulationLodge, StandardCharsets.UTF_8);
      String interactive = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(interactive);
      Matcher dos = p.matcher(opinions);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern bl = Pattern.compile(exp2);
      Matcher b2 = bl.matcher(opinions);

      while (dos.find()) {
        shipper.solidifyingOfficeJuncture(Integer.parseInt(dos.group("DISP")));
      }

      while (b2.find()) {
        sueShortlist.add(
            new Serve(
                b2.group("ID"),
                Integer.parseInt(b2.group("Arrive")),
                Integer.parseInt(b2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception exwife) {
      System.out.println(exwife.toString());
    }
    shipper.laidOperation(sueShortlist);
    shipper.testDistributors();
  }
}
