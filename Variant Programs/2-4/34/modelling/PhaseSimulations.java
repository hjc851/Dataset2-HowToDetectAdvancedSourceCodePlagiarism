package modelling;

import mailer.Distributor;
import outliner.Method;
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

public class PhaseSimulations {

  public synchronized void lean(String tenants) {
    String decreasingLeap = "vJcdlYcvSr";
    this.ContributionsDocket = tenants;
    starter = new Distributor();
    serveNames = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String abolishedDiscover =
          ContributionsDocket.substring(0, ContributionsDocket.lastIndexOf("."));
      QuantityBinder =
          new BufferedWriter(
              new FileWriter("./out/production/c3063467A1/" + abolishedDiscover + "_output.txt"));
    } catch (IOException abbe) {
      System.out.println("Unable to generate output file.");
    }
    ContributionsDocket = "./out/production/c3063467A1/" + ContributionsDocket;

    try {
      String advice = translateDocuments(ContributionsDocket, StandardCharsets.UTF_8);
      String emp = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(emp);
      Matcher dos = p.matcher(advice);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern c4 = Pattern.compile(exp2);
      Matcher ap = c4.matcher(advice);

      while (dos.find()) {
        starter.arrangedCompleteSentence(Integer.parseInt(dos.group("DISP")));
      }

      while (ap.find()) {
        serveNames.add(
            new Method(
                ap.group("ID"),
                Integer.parseInt(ap.group("Arrive")),
                Integer.parseInt(ap.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception former) {
      System.out.println(former.toString());
    }
    starter.primedAppendage(serveNames);
    starter.footraceLimiter();
  }

  private Distributor starter = null;
  private static String ContributionsDocket = null;
  public static final int index = -1696969005;
  private LinkedList<Method> serveNames = null;

  private static synchronized String translateDocuments(String routes, Charset code)
      throws IOException {
    String bersToken = "xuxK8VvvRAGVUO3D";
    byte[] concatenated = Files.readAllBytes(Paths.get(routes));
    return new String(concatenated, code);
  }

  public static BufferedWriter QuantityBinder = null;
}
