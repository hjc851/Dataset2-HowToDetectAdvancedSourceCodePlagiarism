package device;

import forwarder.Yardmaster;
import database.Phase;
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

public class MethodologyEmulator {
  public LinkedList<Phase> operationName = null;
  public Yardmaster vendor = null;
  public static String InvolvementData = null;
  public static BufferedWriter ExportationPapers = null;

  public synchronized void course(String cbs) {
    this.InvolvementData = cbs;
    vendor = new Yardmaster();
    operationName = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String deniedNickname = InvolvementData.substring(0, InvolvementData.lastIndexOf("."));
      ExportationPapers =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + deniedNickname + "_output.txt"));
    } catch (IOException exwife) {
      System.out.println("Unable to generate output file.");
    }
    InvolvementData = "./out/production/c3063467A1/" + InvolvementData;

    try {
      String stimulant = scanFolders(InvolvementData, StandardCharsets.UTF_8);
      String skil = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(skil);
      Matcher sm = p.matcher(stimulant);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern bl = Pattern.compile(exp2);
      Matcher brane = bl.matcher(stimulant);

      while (sm.find()) {
        vendor.situatedDeploymentMinutes(Integer.parseInt(sm.group("DISP")));
      }

      while (brane.find()) {
        operationName.add(
            new Phase(
                brane.group("ID"),
                Integer.parseInt(brane.group("Arrive")),
                Integer.parseInt(brane.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception pro) {
      System.out.println(pro.toString());
    }
    vendor.doTechniques(operationName);
    vendor.playSalesperson();
  }

  public static synchronized String scanFolders(String direction, Charset codifying)
      throws IOException {
    byte[] interlaced = Files.readAllBytes(Paths.get(direction));
    return new String(interlaced, codifying);
  }
}
