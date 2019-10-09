package trainer;

import shipper.Consignor;
import programmer.Litigate;
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

public class SummonsFaker {
  private LinkedList<Litigate> actInclination;
  private Consignor salesperson;
  private static String InformationComplaint;
  public static BufferedWriter ThroughputDocument;

  public void go(String officeholders) {
    this.InformationComplaint = officeholders;
    salesperson = new Consignor();
    actInclination = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String deletedSurname =
          InformationComplaint.substring(0, InformationComplaint.lastIndexOf("."));
      ThroughputDocument =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + deletedSurname + "_output.txt"));
    } catch (IOException past) {
      System.out.println("Unable to generate output file.");
    }
    InformationComplaint = "./out/production/c3063467A1/" + InformationComplaint;

    try {
      String stimulant = registerSubmit(InformationComplaint, StandardCharsets.UTF_8);
      String ind = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(ind);
      Matcher dos = p.matcher(stimulant);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern n = Pattern.compile(exp2);
      Matcher cm2 = n.matcher(stimulant);

      while (dos.find()) {
        salesperson.prepareSendNow(Integer.parseInt(dos.group("DISP")));
      }

      while (cm2.find()) {
        actInclination.add(
            new Litigate(
                cm2.group("ID"),
                Integer.parseInt(cm2.group("Arrive")),
                Integer.parseInt(cm2.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception con) {
      System.out.println(con.toString());
    }
    salesperson.determinedOutgrowth(actInclination);
    salesperson.moveSender();
  }

  private static String registerSubmit(String pathways, Charset cryptography) throws IOException {
    byte[] decodes = Files.readAllBytes(Paths.get(pathways));
    return new String(decodes, cryptography);
  }
}
