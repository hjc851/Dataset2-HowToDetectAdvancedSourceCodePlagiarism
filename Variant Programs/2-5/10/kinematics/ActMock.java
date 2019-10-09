package kinematics;

import sender.Distributor;
import controller.Outgrowth;
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
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class ActMock {
  private static final double synX1017double = 0.7875549737935247;
  private static final String synX1016String = "Finished reading input file...";
  private static final String synX1015String = "SIZE";
  private static final String synX1014String = "Arrive";
  private static final String synX1013String = "ID";
  private static final String synX1012String = "DISP";
  private static final String synX1011String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX1010String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX1009String = "./out/production/c3063467A1/";
  private static final String synX1008String = "Unable to generate output file.";
  private static final String synX1007String = "_output.txt";
  private static final String synX1006String = "./out/production/c3063467A1/";
  private static final String synX1005String = ".";
  private static final int synX1004int = 0;
  private static final String synX1003String = "Reading in input file...";
  private static final double synX1002double = 0.8106972588755409;
  public static BufferedWriter ProducesFilename;
  public static String AdviceDocumentation;
  public Distributor limiter;
  public LinkedList<Outgrowth> phaseDirectory;
  public static double apexSure = 0.6615123949181833;

  public synchronized void move(String cbs) {
    double height;
    height = (synX1002double);
    this.AdviceDocumentation = (cbs);
    limiter = (new Distributor());
    phaseDirectory = (new LinkedList<>());
    System.out.println(synX1003String);

    try {
      String minimumNominate;
      minimumNominate =
          (AdviceDocumentation.substring(
              synX1004int, AdviceDocumentation.lastIndexOf(synX1005String)));
      ProducesFilename =
          (new BufferedWriter(new FileWriter((synX1006String + minimumNominate + synX1007String))));
    } catch (IOException adult) {
      System.out.println(synX1008String);
    }
    AdviceDocumentation = (synX1009String + AdviceDocumentation);

    try {
      String output;
      String skil;
      Pattern postscript;
      Matcher sm;
      String exp2;
      Pattern f2;
      Matcher f1;
      output = (aloudApplication(AdviceDocumentation, StandardCharsets.UTF_8));
      skil = (synX1010String);
      postscript = (compile(skil));
      sm = (postscript.matcher(output));
      exp2 = (synX1011String);
      f2 = (compile(exp2));
      f1 = (f2.matcher(output));

      while (sm.find()) {
        limiter.arrangeSentYears(parseInt(sm.group(synX1012String)));
      }

      while (f1.find()) {
        phaseDirectory.add(
            new Outgrowth(
                f1.group(synX1013String),
                parseInt(f1.group(synX1014String)),
                parseInt(f1.group(synX1015String))));
      }
      System.out.println(synX1016String);
    } catch (Exception officio) {
      System.out.println(officio.toString());
    }
    limiter.fixedPractices(phaseDirectory);
    limiter.goTrainmaster();
  }

  public static synchronized String aloudApplication(String destiny, Charset crypto)
      throws IOException {
    double kesThings;
    kesThings = (synX1017double);
    byte[] programmed = readAllBytes(get(destiny));
    return new String(programmed, crypto);
  }
}
