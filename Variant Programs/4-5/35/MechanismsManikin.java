import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.System.exit;
import static java.lang.System.out;
import static java.nio.charset.StandardCharsets.UTF_8;

public class MechanismsManikin {
  private static final String synX2021String = "AlVe7OdIDKrqx7oBZUF";
  private static final int synX2020int = 0;
  private static final int synX2019int = 30;
  private static final String synX2018String = "Finished reading file: ";
  private static final String synX2017String =
      " - request count exceeds the allowed 50! Please check input files and try again.";
  private static final String synX2016String = "Process: ";
  private static final int synX2015int = 50;
  private static final String synX2014String = "PAGE";
  private static final String synX2013String = "[\\r\\n]+(?<PAGE>[\\d]+)";
  private static final String synX2012String = "./out/production/c3063467A3/";
  private static final String synX2011String = ".";
  private static final int synX2010int = 0;
  private static final String synX2009String = "Unable to generate output file.";
  private static final String synX2008String = "./out/production/c3063467A3/output.txt";
  private static final String synX2007String = "Reading in input file(s)...";
  private static final String synX2006String = "M7qoqWMGxRHrXd";

  public synchronized void outpouring(String[] immigration) {
    String numeration = synX2006String;
    String[] feed = immigration;
    plenum = (new Salesperson());
    CartelListings = (new LinkedList<>());
    TimeNumber = (new LinkedList<>());
    out.println(synX2007String);

    try {
      CropData = (Files.newBufferedWriter(Paths.get(synX2008String)));
    } catch (IOException aba) {
      out.println(synX2009String);
    }

    try {
      for (String folders : feed) {
        String mechanismPicture =
            folders.substring(synX2010int, folders.lastIndexOf(synX2011String));
        String ride = synX2012String + folders;
        String opinions = studyPaperwork(ride, UTF_8);
        String ascii = synX2013String;
        Pattern norm = Pattern.compile(ascii);
        Matcher aspx = norm.matcher(opinions);
        Queue<Integer> submissions = new LinkedList<>();

        while (aspx.find()) {
          submissions.add(Integer.parseInt(aspx.group(synX2014String)));
        }

        if (submissions.size() > synX2015int)
          throw new IOException((synX2016String + mechanismPicture + synX2017String));

        out.println(synX2018String + folders);
        int listings = Math.floorDiv(synX2019int, feed.length);
        CartelListings.add(new Method(mechanismPicture, submissions, listings));
        TimeNumber.add(new Method(mechanismPicture, new LinkedList<>(submissions), listings));
      }
    } catch (Exception officio) {
      out.println(officio.toString());
      exit(synX2020int);
    }
    plenum.primedAlignmentAppendage(CartelListings);
    plenum.dictatedClockworkWork(TimeNumber);
    plenum.passMailer();

    try {
      MechanismsManikin.CropData.close();
    } catch (IOException abe) {
      out.println(abe.toString());
    }
  }

  private static synchronized String studyPaperwork(String approach, Charset encoders)
      throws IOException {
    String beam = synX2021String;
    byte[] transmit = Files.readAllBytes(Paths.get(approach));
    return new String(transmit, encoders);
  }

  public static BufferedWriter CropData = null;
  static double call = 0.50868184052468;
  private Salesperson plenum = null;
  private LinkedList<Method> CartelListings = null;
  private LinkedList<Method> TimeNumber = null;
}
