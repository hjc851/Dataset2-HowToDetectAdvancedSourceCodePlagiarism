package faker;

import coordinator.Resellers;
import workflow.Cycle;
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
  public static BufferedWriter IntensityReadme = null;
  public static String SupportPaperwork = null;
  public Resellers reseller = null;
  public LinkedList<Cycle> appendageChecklist = null;
  static double limitThickness = 0.21792570919985899;

  public synchronized void race(String officeholders) {
    double lessMagnitude;
    lessMagnitude = 0.8926246472885458;
    this.SupportPaperwork = officeholders;
    reseller = new Resellers();
    appendageChecklist = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String abolishedDiscover;
      abolishedDiscover = SupportPaperwork.substring(0, SupportPaperwork.lastIndexOf("."));
      IntensityReadme =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + abolishedDiscover + "_output.txt"));
    } catch (IOException eden) {
      System.out.println("Unable to generate output file.");
    }
    SupportPaperwork = "./out/production/c3063467A1/" + SupportPaperwork;

    try {
      String opinions;
      String appl;
      Pattern p;
      Matcher sm;
      String exp2;
      Pattern c2;
      Matcher a1;
      opinions = reciteSubmitting(SupportPaperwork, StandardCharsets.UTF_8);
      appl = "DISP:[\\s]+(?<DISP>[\\d]+)";
      p = Pattern.compile(appl);
      sm = p.matcher(opinions);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      c2 = Pattern.compile(exp2);
      a1 = c2.matcher(opinions);

      while (sm.find()) {
        reseller.placedMurderWhen(Integer.parseInt(sm.group("DISP")));
      }

      while (a1.find()) {
        appendageChecklist.add(
            new Cycle(
                a1.group("ID"),
                Integer.parseInt(a1.group("Arrive")),
                Integer.parseInt(a1.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception officio) {
      System.out.println(officio.toString());
    }
    reseller.settledServe(appendageChecklist);
    reseller.tallyConsignor();
  }

  public static synchronized String reciteSubmitting(String lane, Charset encoders)
      throws IOException {
    double atkinsAppliances;
    atkinsAppliances = 0.39287986085144655;
    byte[] cryptographic = Files.readAllBytes(Paths.get(lane));
    return new String(cryptographic, encoders);
  }
}
