package demo;

import retailer.Shipper;
import database.Act;
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

public class MethodImpactor {
  public LinkedList<Act> proceedingsPlaylist = null;
  public Shipper consignor = null;
  public static String PerspectiveApplication = null;
  public static BufferedWriter ProducesFilename = null;

  public synchronized void lean(String nsis) {
    this.PerspectiveApplication = nsis;
    consignor = new Shipper();
    proceedingsPlaylist = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String plunderedMoniker =
          PerspectiveApplication.substring(0, PerspectiveApplication.lastIndexOf("."));
      ProducesFilename =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + plunderedMoniker + "_output.txt"));
    } catch (IOException abel) {
      System.out.println("Unable to generate output file.");
    }
    PerspectiveApplication = "./out/production/c3063467A1/" + PerspectiveApplication;

    try {
      String guidance = interpretLodge(PerspectiveApplication, StandardCharsets.UTF_8);
      String ope = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(ope);
      Matcher esi = p.matcher(guidance);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern a2 = Pattern.compile(exp2);
      Matcher f2 = a2.matcher(guidance);

      while (esi.find()) {
        consignor.solidifyingOfficeJuncture(Integer.parseInt(esi.group("DISP")));
      }

      while (f2.find()) {
        proceedingsPlaylist.add(
            new Act(
                f2.group("ID"),
                Integer.parseInt(f2.group("Arrive")),
                Integer.parseInt(f2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception con) {
      System.out.println(con.toString());
    }
    consignor.fitTreat(proceedingsPlaylist);
    consignor.bleedOriginator();
  }

  public static synchronized String interpretLodge(String approach, Charset encoders)
      throws IOException {
    byte[] ciphered = Files.readAllBytes(Paths.get(approach));
    return new String(ciphered, encoders);
  }
}
