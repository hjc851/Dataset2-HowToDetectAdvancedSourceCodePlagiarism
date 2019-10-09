package modelling;

import shipper.Limiter;
import debugging.Operation;
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
import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;
import static java.util.regex.Pattern.compile;
import static java.lang.Integer.parseInt;

public class MethodImpactor {
  private static final String synX655String = "Finished reading input file...";
  private static final String synX654String = "SIZE";
  private static final String synX653String = "Arrive";
  private static final String synX652String = "ID";
  private static final String synX651String = "DISP";
  private static final String synX650String =
      "ID:[\\s]+(?<ID>[\\w]*)[\\s][\\r\\n]+Arrive:[\\s]+(?<Arrive>[\\d]+)[\\s][\\r\\n]+ExecSize:[\\s]+(?<SIZE>[\\d]+)[\\s][\\r\\n]+END";
  private static final String synX649String = "DISP:[\\s]+(?<DISP>[\\d]+)";
  private static final String synX648String = "./out/production/c3063467A1/";
  private static final String synX647String = "Unable to generate output file.";
  private static final String synX646String = "_output.txt";
  private static final String synX645String = "./out/production/c3063467A1/";
  private static final String synX644String = ".";
  private static final int synX643int = 0;
  private static final String synX642String = "Reading in input file...";

  private static synchronized java.lang.String recordExecutable(
      java.lang.String routes, java.nio.charset.Charset codifying) throws IOException {
    byte[] demodulated = readAllBytes(get(routes));
    return new java.lang.String(demodulated, codifying);
  }

  private java.util.LinkedList<Operation> summonsRoster;
  private static java.lang.String StimulusRegister;
  private shipper.Limiter sender;
  public static java.io.BufferedWriter ProducingFolders;

  public synchronized void melt(java.lang.String cbs) {
    this.StimulusRegister = cbs;
    sender = new shipper.Limiter();
    summonsRoster = new java.util.LinkedList<>();
    out.println(synX642String);

    try {
      java.lang.String plunderedMoniker;
      plunderedMoniker =
          StimulusRegister.substring(synX643int, StimulusRegister.lastIndexOf(synX644String));
      ProducingFolders =
          new java.io.BufferedWriter(
              new java.io.FileWriter(synX645String + plunderedMoniker + synX646String));
    } catch (java.io.IOException aba) {
      out.println(synX647String);
    }
    StimulusRegister = synX648String + StimulusRegister;

    try {
      java.lang.String participatory;
      java.lang.String ope;
      java.util.regex.Pattern postscript;
      java.util.regex.Matcher manuscript;
      java.lang.String exp2;
      java.util.regex.Pattern g;
      java.util.regex.Matcher fio;
      participatory = recordExecutable(StimulusRegister, UTF_8);
      ope = synX649String;
      postscript = compile(ope);
      manuscript = postscript.matcher(participatory);
      exp2 = synX650String;
      g = compile(exp2);
      fio = g.matcher(participatory);

      while (manuscript.find()) {
        sender.fixAssignThing(parseInt(manuscript.group(synX651String)));
      }

      while (fio.find()) {
        summonsRoster.add(
            new debugging.Operation(
                fio.group(synX652String),
                parseInt(fio.group(synX653String)),
                parseInt(fio.group(synX654String))));
      }
      out.println(synX655String);
    } catch (java.lang.Exception abe) {
      out.println(abe.toString());
    }
    sender.dictatedWork(summonsRoster);
    sender.ramRegulator();
  }
}
