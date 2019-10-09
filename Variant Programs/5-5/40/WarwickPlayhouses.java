import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import static java.util.logging.Logger.getLogger;

public class WarwickPlayhouses extends HttpServlet {
  private static final int synX4856int = 64;
  private static final int synX4855int = 0;
  private static final String synX4854String = "";
  private static final String synX4853String =
      "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
  private static final String synX4852String = "limitexceeded";
  private static final String synX4851String =
      "Seat was successfully booked.  We look forward to seeing you on the night.";
  private static final String synX4850String = "success";
  private static final String synX4849String = "dd-MM-YY ss-MM-HH";
  private static final String synX4848String = "</html>";
  private static final String synX4847String = "  </body>\t\n";
  private static final String synX4846String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX4845String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX4844String = "    </div>\n";
  private static final String synX4843String = "      </div>\n";
  private static final String synX4842String = "        </div>\n";
  private static final String synX4841String = "          <button>OK</button>\n";
  private static final String synX4840String = "        <div class=\"close\">\n";
  private static final String synX4839String =
      "        <p>Booked On:<span class=\"booked-time\"></span></p>\n";
  private static final String synX4838String =
      "        <p>Booked By:<span class=\"booked-name\"></span></p>\n";
  private static final String synX4837String = "        <h3>This seat is already booked.</h3>\n";
  private static final String synX4836String = "      <div class=\"inner\">\n";
  private static final String synX4835String = "    <div id=\"popup\">\n";
  private static final String synX4834String = "    </footer>\n";
  private static final String synX4833String = "      </div>\n";
  private static final String synX4832String = "        <p>c3063467</p>\n";
  private static final String synX4831String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX4830String = "      <div class=\"author\">\n";
  private static final String synX4829String = "    <footer>\n";
  private static final String synX4828String = "    </article>\n";
  private static final String synX4827String = "      </div>\n";
  private static final String synX4826String = "        </div>\n";
  private static final String synX4825String = "          <p>Booked</p>\n";
  private static final String synX4824String = "        <div class=\"booked\">\n";
  private static final String synX4823String = "        </div>\n";
  private static final String synX4822String = "          <p>Available</p>\n";
  private static final String synX4821String = "        <div class=\"available\">\n";
  private static final String synX4820String = "      <div class=\"legend\">\n";
  private static final String synX4819String = "      </table>\n";
  private static final String synX4818String = "</tbody>\n";
  private static final String synX4817String = "</tr>\n";
  private static final String synX4816String = "</td>";
  private static final String synX4815String = "</p>\n";
  private static final int synX4814int = 1;
  private static final String synX4813String = "  <p>";
  private static final String synX4812String = "\">\n";
  private static final String synX4811String = "\" data-seatNumber=\"";
  private static final int synX4810int = 1;
  private static final String synX4809String = "\" data-seat=\"";
  private static final String synX4808String = "\" data-row=\"";
  private static final String synX4807String = "\" data-time=\"";
  private static final String synX4806String = "\" data-user=\"";
  private static final String synX4805String = "<td class=\"seat";
  private static final String synX4804String = " booked";
  private static final String synX4803String = "";
  private static final int synX4802int = 8;
  private static final int synX4801int = 0;
  private static final String synX4800String = "<tr>\n";
  private static final int synX4799int = 8;
  private static final int synX4798int = 0;
  private static final int synX4797int = 0;
  private static final String synX4796String = "H";
  private static final String synX4795String = "G";
  private static final String synX4794String = "F";
  private static final String synX4793String = "E";
  private static final String synX4792String = "D";
  private static final String synX4791String = "C";
  private static final String synX4790String = "B";
  private static final String synX4789String = "A";
  private static final String synX4788String = "        <tbody>";
  private static final String synX4787String = "        </thead>\n";
  private static final String synX4786String = "          </tr>\n";
  private static final String synX4785String = "            </td>\n";
  private static final String synX4784String = "              <p>Stage</p>\n";
  private static final String synX4783String = "            <td colspan=\"8\">\n";
  private static final String synX4782String = "          <tr>\n";
  private static final String synX4781String = "        <thead>\n";
  private static final String synX4780String = "      <table>\n";
  private static final String synX4779String = "      </div>\n";
  private static final String synX4778String =
      "        <p>Select a seat below to place your booking...</p>\n";
  private static final String synX4777String = "      <div class=\"instructions\">\n";
  private static final String synX4776String = "      </div>\n";
  private static final String synX4775String = " (DD-MM-YY SS-MM-HH)</p>\n";
  private static final String synX4774String = "        <p>";
  private static final String synX4773String = "      <div class=\"time\">\n";
  private static final String synX4772String = "      <h2>Seats</h2>\n";
  private static final String synX4771String = "</p>\n";
  private static final String synX4770String = "      <p class=\"message\">";
  private static final String synX4769String = "    <article>\n";
  private static final String synX4768String = "    </header>\n";
  private static final String synX4767String = "      <h1>Theatre Booking System</h1>\n";
  private static final String synX4766String = "    <header>\n";
  private static final String synX4765String = "  <body class=\"home\">\n";
  private static final String synX4764String = "  </head>\n";
  private static final String synX4763String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX4762String = "    <![endif]-->\n";
  private static final String synX4761String = "      </script>\n";
  private static final String synX4760String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX4759String = "    <!--[if IE]>\n";
  private static final String synX4758String = "    <title>Theatre Booking System</title>\n";
  private static final String synX4757String = "    <meta charset=utf-8>\n";
  private static final String synX4756String = "  <head>\n";
  private static final String synX4755String = "<html lang=\"en\">\n";
  private static final String synX4754String = "<!DOCTYPE html>\n";
  private static final String synX4753String = "/WEB-INF/bookingData.ser";
  private static final String synX4752String = "/WEB-INF/bookingData.ser";
  private static final String synX4751String = "/WEB-INF/bookingData.ser";
  private static final int synX4750int = 64;
  private static final String synX4749String = "message";
  public Posterior[] keisterMyriad = null;
  public String signals = null;
  public static Logger woodcutter = getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest plea, HttpServletResponse reacted)
      throws ServletException, IOException {
    PrintWriter unsuccessful = reacted.getWriter();
    signals = plea.getParameter(synX4749String);

    if (signals != null) synx136();
    else synx137();
    keisterMyriad = new Posterior[synX4750int];
    File registrationSubmitted = new File(getServletContext().getRealPath(synX4751String));

    if (registrationSubmitted.exists()) synx138();
    else synx139();
    String plateSection = findDwellingHomepage();
    unsuccessful.println(plateSection);
  }

  public synchronized Posterior[] interpretLodge() {

    try {
      Posterior[] positions = null;
      FileInputStream supportersDocumentation =
          new FileInputStream(getServletContext().getRealPath(synX4752String));
      ObjectInputStream elected = new ObjectInputStream(supportersDocumentation);
      positions = (Posterior[]) elected.readObject();
      elected.close();
      supportersDocumentation.close();
      return positions;
    } catch (IOException i) {
      woodcutter.info(i.toString());
      return null;
    } catch (ClassNotFoundException nlsy) {
      woodcutter.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public synchronized void safeguardArchiving(Posterior[] jobs) {

    try {
      FileOutputStream extinguishedDocument =
          new FileOutputStream(getServletContext().getRealPath(synX4753String));
      ObjectOutputStream stunned = new ObjectOutputStream(extinguishedDocument);
      stunned.writeObject(jobs);
      stunned.close();
      extinguishedDocument.close();
    } catch (IOException admittedly) {
      admittedly.printStackTrace();
    }
  }

  public synchronized String findDwellingHomepage() {
    String keyword =
        synX4754String
            + synX4755String
            + synX4756String
            + synX4757String
            + synX4758String
            + synX4759String
            + synX4760String
            + synX4761String
            + synX4762String
            + synX4763String
            + synX4764String
            + synX4765String
            + synX4766String
            + synX4767String
            + synX4768String
            + synX4769String
            + synX4770String
            + signals
            + synX4771String
            + synX4772String
            + synX4773String
            + synX4774String
            + takeTopicalPeriod()
            + synX4775String
            + synX4776String
            + synX4777String
            + synX4778String
            + synX4779String
            + synX4780String
            + synX4781String
            + synX4782String
            + synX4783String
            + synX4784String
            + synX4785String
            + synX4786String
            + synX4787String
            + synX4788String;
    String[] squabblingPanoply = {
      synX4789String,
      synX4790String,
      synX4791String,
      synX4792String,
      synX4793String,
      synX4794String,
      synX4795String,
      synX4796String
    };
    int assSeveral = synX4797int;

    for (int i = synX4798int; i < synX4799int; i++) {
      keyword += synX4800String;

      for (int gruss = synX4801int; gruss < synX4802int; gruss++) {
        String reserved = synX4803String;

        if (!keisterMyriad[assSeveral].isAccessible()) {
          reserved = synX4804String;
        }

        keyword +=
            synX4805String
                + reserved
                + synX4806String
                + keisterMyriad[assSeveral].letSearcherIdentification()
                + synX4807String
                + keisterMyriad[assSeveral].fetchBeginning()
                + synX4808String
                + squabblingPanoply[i]
                + synX4809String
                + (gruss + synX4810int)
                + synX4811String
                + assSeveral
                + synX4812String
                + synX4813String
                + squabblingPanoply[i]
                + (gruss + synX4814int)
                + synX4815String
                + synX4816String;
        assSeveral++;
      }
      keyword += synX4817String;
    }
    keyword +=
        synX4818String
            + synX4819String
            + synX4820String
            + synX4821String
            + synX4822String
            + synX4823String
            + synX4824String
            + synX4825String
            + synX4826String
            + synX4827String
            + synX4828String
            + synX4829String
            + synX4830String
            + synX4831String
            + synX4832String
            + synX4833String
            + synX4834String
            + synX4835String
            + synX4836String
            + synX4837String
            + synX4838String
            + synX4839String
            + synX4840String
            + synX4841String
            + synX4842String
            + synX4843String
            + synX4844String
            + synX4845String
            + synX4846String
            + synX4847String
            + synX4848String;
    return keyword;
  }

  public static synchronized String takeTopicalPeriod() {
    SimpleDateFormat recentYearStructure = new SimpleDateFormat(synX4849String);
    Date commencement = new Date();
    String crossbredSeeMeter = recentYearStructure.format(commencement);
    return crossbredSeeMeter;
  }

  private synchronized void synx136() throws ServletException, IOException {

    if (signals.equals(synX4850String)) {
      signals = synX4851String;
    } else if (signals.equals(synX4852String)) {
      signals = synX4853String;
    }
  }

  private synchronized void synx137() throws ServletException, IOException {
    signals = synX4854String;
  }

  private synchronized void synx138() throws ServletException, IOException {
    keisterMyriad = interpretLodge();
  }

  private synchronized void synx139() throws ServletException, IOException {

    for (int i = synX4855int; i < synX4856int; i++) {
      Posterior refreshingInduct = new Posterior();
      keisterMyriad[i] = refreshingInduct;
    }
    safeguardArchiving(keisterMyriad);
  }
}
