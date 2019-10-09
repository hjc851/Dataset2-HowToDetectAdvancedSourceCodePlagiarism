package analog;

import reseller.Retailer;
import workflow.Mechanism;
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
  private static String InfluenceArchives = null;

  public synchronized void bleed(String officeholders) {
    this.InfluenceArchives = officeholders;
    limiter = new Retailer();
    methodRanking = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String deniedNickname;
      deniedNickname = InfluenceArchives.substring(0, InfluenceArchives.lastIndexOf("."));
      ProducingFolders =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + deniedNickname + "_output.txt"));
    } catch (IOException abel) {
      System.out.println("Unable to generate output file.");
    }
    InfluenceArchives = "./out/production/c3063467A1/" + InfluenceArchives;

    try {
      String influence;
      String pkg;
      Pattern p;
      Matcher esi;
      String exp2;
      Pattern a2;
      Matcher a;
      influence = peruseDocket(InfluenceArchives, StandardCharsets.UTF_8);
      pkg = "DISP:[\\s]+(?<DISP>[\\d]+)";
      p = Pattern.compile(pkg);
      esi = p.matcher(influence);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      a2 = Pattern.compile(exp2);
      a = a2.matcher(influence);

      while (esi.find()) {
        limiter.solidifyingOfficeJuncture(Integer.parseInt(esi.group("DISP")));
      }

      while (a.find()) {
        methodRanking.add(
            new Mechanism(
                a.group("ID"),
                Integer.parseInt(a.group("Arrive")),
                Integer.parseInt(a.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception abbe) {
      System.out.println(abbe.toString());
    }
    limiter.arrangedAct(methodRanking);
    limiter.workForwarder();
  }

  private Retailer limiter = null;
  public static BufferedWriter ProducingFolders = null;

  private static synchronized String peruseDocket(String trails, Charset scrambling)
      throws IOException {
    byte[] keyed = Files.readAllBytes(Paths.get(trails));
    return new String(keyed, scrambling);
  }

  private LinkedList<Mechanism> methodRanking = null;
}
