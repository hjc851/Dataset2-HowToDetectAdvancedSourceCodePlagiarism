package impactor;

import starter.Starter;
import controller.Formalities;
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

public class SystemSim {
  private LinkedList<Formalities> operationName;
  private Starter consignor;
  private static String InformationComplaint;
  public static BufferedWriter InputInitiate;

  public void melt(String nsis) {
    this.InformationComplaint = nsis;
    consignor = new Starter();
    operationName = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String withdrawnMake =
          InformationComplaint.substring(0, InformationComplaint.lastIndexOf("."));
      InputInitiate =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + withdrawnMake + "_output.txt"));
    } catch (IOException adrian) {
      System.out.println("Unable to generate output file.");
    }
    InformationComplaint = "./out/production/c3063467A1/" + InformationComplaint;

    try {
      String advice = translateDocuments(InformationComplaint, StandardCharsets.UTF_8);
      String exc = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(exc);
      Matcher sm = p.matcher(advice);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern h = Pattern.compile(exp2);
      Matcher e = h.matcher(advice);

      while (sm.find()) {
        consignor.dictatedCommuniqueMeter(Integer.parseInt(sm.group("DISP")));
      }

      while (e.find()) {
        operationName.add(
            new Formalities(
                e.group("ID"),
                Integer.parseInt(e.group("Arrive")),
                Integer.parseInt(e.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception adult) {
      System.out.println(adult.toString());
    }
    consignor.adjustProcedures(operationName);
    consignor.prevailDistributor();
  }

  private static String translateDocuments(String route, Charset consolidation) throws IOException {
    byte[] scrambled = Files.readAllBytes(Paths.get(route));
    return new String(scrambled, consolidation);
  }
}
