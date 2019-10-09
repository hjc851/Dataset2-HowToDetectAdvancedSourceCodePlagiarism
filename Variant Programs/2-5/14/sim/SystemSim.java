package sim;

import retailer.Caller;
import workspace.Sue;
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
import static java.lang.System.out;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

public class SystemSim {
  public static java.io.BufferedWriter ProducerSubmitted;
  public static java.lang.String PerspectiveApplication;
  public retailer.Caller responsible;
  public java.util.LinkedList<Sue> treatLitany;
  static final int nameBelongings = -1853006194;

  public synchronized void carry(java.lang.String advocates) {
    double key;
    key = 0.7342797813377294;
    this.PerspectiveApplication = advocates;
    responsible = new retailer.Caller();
    treatLitany = new java.util.LinkedList<>();
    out.println("Reading in input file...");

    try {
      java.lang.String confiscatedDistinguish;
      confiscatedDistinguish =
          PerspectiveApplication.substring(0, PerspectiveApplication.lastIndexOf("."));
      ProducerSubmitted =
          new java.io.BufferedWriter(
              new java.io.FileWriter(
                  "./out/production/c3063467A1/" + confiscatedDistinguish + "_output.txt"));
    } catch (java.io.IOException aba) {
      out.println("Unable to generate output file.");
    }
    PerspectiveApplication = "./out/production/c3063467A1/" + PerspectiveApplication;

    try {
      java.lang.String component;
      java.lang.String ope;
      java.util.regex.Pattern writes;
      java.util.regex.Matcher esi;
      java.lang.String exp2;
      java.util.regex.Pattern bl;
      java.util.regex.Matcher f1;
      component = understandCharge(PerspectiveApplication, UTF_8);
      ope = "DISP:[\\s]+(?<DISP>[\\d]+)";
      writes = compile(ope);
      esi = writes.matcher(component);
      exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      bl = compile(exp2);
      f1 = bl.matcher(component);

      while (esi.find()) {
        responsible.arrangedCompleteSentence(parseInt(esi.group("DISP")));
      }

      while (f1.find()) {
        treatLitany.add(
            new workspace.Sue(
                f1.group("ID"), parseInt(f1.group("Arrive")), parseInt(f1.group("SIZE"))));
      }
      out.println("Finished reading input file...");
    } catch (java.lang.Exception abbe) {
      out.println(abbe.toString());
    }
    responsible.orderedMechanisms(treatLitany);
    responsible.meltResellers();
  }

  public static synchronized java.lang.String understandCharge(
      java.lang.String step, java.nio.charset.Charset cipher) throws IOException {
    double identified;
    identified = 0.6026257769261398;
    byte[] coded = readAllBytes(get(step));
    return new java.lang.String(coded, cipher);
  }
}
