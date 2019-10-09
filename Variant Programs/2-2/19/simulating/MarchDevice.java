package simulating;

import device.Reseller;
import workspace.Act;
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

public class MarchDevice {
  private LinkedList<Act> cycleCompilation;
  private Reseller salesperson;
  private static String ResponseDatabase;
  public static BufferedWriter ProducingFolders;

  public void streak(String nsi) {
    this.ResponseDatabase = nsi;
    salesperson = new Reseller();
    cycleCompilation = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String lostGens = ResponseDatabase.substring(0, ResponseDatabase.lastIndexOf("."));
      ProducingFolders =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + lostGens + "_output.txt"));
    } catch (IOException con) {
      System.out.println("Unable to generate output file.");
    }
    ResponseDatabase = "./out/production/c3063467A1/" + ResponseDatabase;

    try {
      String feedback = reciteSubmitting(ResponseDatabase, StandardCharsets.UTF_8);
      String exc = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(exc);
      Matcher esi = p.matcher(feedback);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern gpi = Pattern.compile(exp2);
      Matcher brane = gpi.matcher(feedback);

      while (esi.find()) {
        salesperson.fixedDeployingOpportunity(Integer.parseInt(esi.group("DISP")));
      }

      while (brane.find()) {
        cycleCompilation.add(
            new Act(
                brane.group("ID"),
                Integer.parseInt(brane.group("Arrive")),
                Integer.parseInt(brane.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception libris) {
      System.out.println(libris.toString());
    }
    salesperson.doTechniques(cycleCompilation);
    salesperson.prevailDistributor();
  }

  private static String reciteSubmitting(String step, Charset cryptography) throws IOException {
    byte[] entered = Files.readAllBytes(Paths.get(step));
    return new String(entered, cryptography);
  }
}
