package faker;

import mailer.Responsible;
import parser.March;
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
  private LinkedList<March> methodRanking;
  private Responsible resellers;
  private static String AdviceDocumentation;
  public static BufferedWriter ExportationPapers;

  public synchronized void streak(String advocates) {
    this.AdviceDocumentation = advocates;
    resellers = new Responsible();
    methodRanking = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String denudedDiagnose =
          AdviceDocumentation.substring(0, AdviceDocumentation.lastIndexOf("."));
      ExportationPapers =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + denudedDiagnose + "_output.txt"));
    } catch (IOException eden) {
      System.out.println("Unable to generate output file.");
    }
    AdviceDocumentation = "./out/production/c3063467A1/" + AdviceDocumentation;

    try {
      String assistance = peruseDocket(AdviceDocumentation, StandardCharsets.UTF_8);
      String equiv = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(equiv);
      Matcher esi = p.matcher(assistance);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern a = Pattern.compile(exp2);
      Matcher a1 = a.matcher(assistance);

      while (esi.find()) {
        resellers.bentSendingHour(Integer.parseInt(esi.group("DISP")));
      }

      while (a1.find()) {
        methodRanking.add(
            new March(
                a1.group("ID"),
                Integer.parseInt(a1.group("Arrive")),
                Integer.parseInt(a1.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception exwife) {
      System.out.println(exwife.toString());
    }
    resellers.orderedMechanisms(methodRanking);
    resellers.workForwarder();
  }

  private static synchronized String peruseDocket(String approach, Charset coded)
      throws IOException {
    byte[] codified = Files.readAllBytes(Paths.get(approach));
    return new String(codified, coded);
  }
}
