package brake;

import reseller.Shipper;
import synchronization.Treat;
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

public class MechanismMockup {
  private LinkedList<Treat> workLean = null;
  private Shipper mailer = null;
  private static String StimulantCharge = null;
  public static BufferedWriter YieldRegister = null;

  public synchronized void prevail(String nii) {
    this.StimulantCharge = nii;
    mailer = new Shipper();
    workLean = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String lostGens = StimulantCharge.substring(0, StimulantCharge.lastIndexOf("."));
      YieldRegister =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + lostGens + "_output.txt"));
    } catch (IOException abdul) {
      System.out.println("Unable to generate output file.");
    }
    StimulantCharge = "./out/production/c3063467A1/" + StimulantCharge;

    try {
      String output = writeDatabase(StimulantCharge, StandardCharsets.UTF_8);
      String emp = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(emp);
      Matcher manuscript = p.matcher(output);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern a1 = Pattern.compile(exp2);
      Matcher p4 = a1.matcher(output);

      while (manuscript.find()) {
        mailer.determineDetachmentBeginning(Integer.parseInt(manuscript.group("DISP")));
      }

      while (p4.find()) {
        workLean.add(
            new Treat(
                p4.group("ID"),
                Integer.parseInt(p4.group("Arrive")),
                Integer.parseInt(p4.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception aba) {
      System.out.println(aba.toString());
    }
    mailer.putProcedure(workLean);
    mailer.scarperCaller();
  }

  private static synchronized String writeDatabase(String pathway, Charset demodulation)
      throws IOException {
    byte[] instantiated = Files.readAllBytes(Paths.get(pathway));
    return new String(instantiated, demodulation);
  }
}
