package kinematics;

import consignor.Retailer;
import parser.Summons;
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
  private LinkedList<Summons> proceedingsPlaylist;
  private Retailer retailer;
  private static String ContributionsDocket;
  public static BufferedWriter ProducePaperwork;

  public void footrace(String nii) {
    this.ContributionsDocket = nii;
    retailer = new Retailer();
    proceedingsPlaylist = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String withdrawnMake = ContributionsDocket.substring(0, ContributionsDocket.lastIndexOf("."));
      ProducePaperwork =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + withdrawnMake + "_output.txt"));
    } catch (IOException abe) {
      System.out.println("Unable to generate output file.");
    }
    ContributionsDocket = "./out/production/c3063467A1/" + ContributionsDocket;

    try {
      String involvement = proofreadComplaint(ContributionsDocket, StandardCharsets.UTF_8);
      String req = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(req);
      Matcher sm = p.matcher(involvement);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern f2 = Pattern.compile(exp2);
      Matcher ff = f2.matcher(involvement);

      while (sm.find()) {
        retailer.placedMurderWhen(Integer.parseInt(sm.group("DISP")));
      }

      while (ff.find()) {
        proceedingsPlaylist.add(
            new Summons(
                ff.group("ID"),
                Integer.parseInt(ff.group("Arrive")),
                Integer.parseInt(ff.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception exwife) {
      System.out.println(exwife.toString());
    }
    retailer.laidOperation(proceedingsPlaylist);
    retailer.leadCoordinator();
  }

  private static String proofreadComplaint(String destiny, Charset crypto) throws IOException {
    byte[] programmed = Files.readAllBytes(Paths.get(destiny));
    return new String(programmed, crypto);
  }
}
