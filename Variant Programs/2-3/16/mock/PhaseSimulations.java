package mock;

import dealer.Dealer;
import workflow.Negotiations;
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
  private LinkedList<Negotiations> mechanismAgenda = null;
  private Dealer responsible = null;
  private static String ComponentBinder = null;
  public static BufferedWriter QuantityBinder = null;

  public synchronized void footrace(String elected) {
    this.ComponentBinder = elected;
    responsible = new Dealer();
    mechanismAgenda = new LinkedList<>();
    System.out.println("Reading in input file...");

    try {
      String disassembledPatronymic =
          ComponentBinder.substring(0, ComponentBinder.lastIndexOf("."));
      QuantityBinder =
          new BufferedWriter(
              new FileWriter(
                  "./out/production/c3063467A1/" + disassembledPatronymic + "_output.txt"));
    } catch (IOException abbe) {
      System.out.println("Unable to generate output file.");
    }
    ComponentBinder = "./out/production/c3063467A1/" + ComponentBinder;

    try {
      String perspective = wrotePapers(ComponentBinder, StandardCharsets.UTF_8);
      String reciprocal = "DISP:[\\s]+(?<DISP>[\\d]+)";
      Pattern p = Pattern.compile(reciprocal);
      Matcher manuscript = p.matcher(perspective);
      String exp2 =
          "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
      Pattern f2 = Pattern.compile(exp2);
      Matcher aml = f2.matcher(perspective);

      while (manuscript.find()) {
        responsible.adjustDispatchedMonth(Integer.parseInt(manuscript.group("DISP")));
      }

      while (aml.find()) {
        mechanismAgenda.add(
            new Negotiations(
                aml.group("ID"),
                Integer.parseInt(aml.group("Arrive")),
                Integer.parseInt(aml.group("SIZE"))));
      }
      System.out.println("Finished reading input file...");
    } catch (Exception abe) {
      System.out.println(abe.toString());
    }
    responsible.fixMechanism(mechanismAgenda);
    responsible.bleedOriginator();
  }

  private static synchronized String wrotePapers(String direction, Charset coding)
      throws IOException {
    byte[] demodulated = Files.readAllBytes(Paths.get(direction));
    return new String(demodulated, coding);
  }
}
