package trainer;

import plenum.Distributors;
import spreadsheet.Operation;
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
  public LinkedList<Operation> appendageChecklist = null;
  public Distributors resellers = null;
  public static String ContributionsDocket = null;
  public static BufferedWriter InputInitiate = null;

  public synchronized void course(String nih) {
    this.ContributionsDocket = nih;
    resellers = new Distributors();
    appendageChecklist = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String removedIdentify =
          ContributionsDocket.substring(0, ContributionsDocket.lastIndexOf("."));
      InputInitiate =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + removedIdentify + "_output.txt"));
    } catch (IOException adoptee) {
      System.out.println("Unable to generate output file.");
    }
    ContributionsDocket = "./out/production/c3063467A1/" + ContributionsDocket;

    try {
      String involvement = writtenFilename(ContributionsDocket, StandardCharsets.UTF_8);
      String ope = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(ope);
      Matcher esi = p.matcher(involvement);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern c2 = Pattern.compile(exp2);
      Matcher a1 = c2.matcher(involvement);

      while (esi.find()) {
        resellers.solidifyingOfficeJuncture(Integer.parseInt(esi.group("DISP")));
      }

      while (a1.find()) {
        appendageChecklist.add(
            new Operation(
                a1.group("ID"),
                Integer.parseInt(a1.group("Arrive")),
                Integer.parseInt(a1.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception officio) {
      System.out.println(officio.toString());
    }
    resellers.readyMarch(appendageChecklist);
    resellers.tallyConsignor();
  }

  public static synchronized String writtenFilename(String pattern, Charset metadata)
      throws IOException {
    byte[] codified = Files.readAllBytes(Paths.get(pattern));
    return new String(codified, metadata);
  }
}
