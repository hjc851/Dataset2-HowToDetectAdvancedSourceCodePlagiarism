import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class VeleOpera extends HttpServlet {
  private static final int synX5074int = 64;
  private static final int synX5073int = 0;
  private static final String synX5072String = "";
  private static final String synX5071String =
      "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
  private static final String synX5070String = "limitexceeded";
  private static final String synX5069String =
      "Seat was successfully booked.  We look forward to seeing you on the night.";
  private static final String synX5068String = "success";
  private static final String synX5067String = "dd-MM-YY ss-MM-HH";
  private static final String synX5066String = "</html>";
  private static final String synX5065String = "  </body>\t\n";
  private static final String synX5064String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX5063String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX5062String = "    </div>\n";
  private static final String synX5061String = "      </div>\n";
  private static final String synX5060String = "        </div>\n";
  private static final String synX5059String = "          <button>OK</button>\n";
  private static final String synX5058String = "        <div class=\"close\">\n";
  private static final String synX5057String =
      "        <p>Booked On:<span class=\"booked-time\"></span></p>\n";
  private static final String synX5056String =
      "        <p>Booked By:<span class=\"booked-name\"></span></p>\n";
  private static final String synX5055String = "        <h3>This seat is already booked.</h3>\n";
  private static final String synX5054String = "      <div class=\"inner\">\n";
  private static final String synX5053String = "    <div id=\"popup\">\n";
  private static final String synX5052String = "    </footer>\n";
  private static final String synX5051String = "      </div>\n";
  private static final String synX5050String = "        <p>c3063467</p>\n";
  private static final String synX5049String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX5048String = "      <div class=\"author\">\n";
  private static final String synX5047String = "    <footer>\n";
  private static final String synX5046String = "    </article>\n";
  private static final String synX5045String = "      </div>\n";
  private static final String synX5044String = "        </div>\n";
  private static final String synX5043String = "          <p>Booked</p>\n";
  private static final String synX5042String = "        <div class=\"booked\">\n";
  private static final String synX5041String = "        </div>\n";
  private static final String synX5040String = "          <p>Available</p>\n";
  private static final String synX5039String = "        <div class=\"available\">\n";
  private static final String synX5038String = "      <div class=\"legend\">\n";
  private static final String synX5037String = "      </table>\n";
  private static final String synX5036String = "</tbody>\n";
  private static final String synX5035String = "</tr>\n";
  private static final String synX5034String = "</td>";
  private static final String synX5033String = "</p>\n";
  private static final int synX5032int = 1;
  private static final String synX5031String = "  <p>";
  private static final String synX5030String = "\">\n";
  private static final String synX5029String = "\" data-seatNumber=\"";
  private static final int synX5028int = 1;
  private static final String synX5027String = "\" data-seat=\"";
  private static final String synX5026String = "\" data-row=\"";
  private static final String synX5025String = "\" data-time=\"";
  private static final String synX5024String = "\" data-user=\"";
  private static final String synX5023String = "<td class=\"seat";
  private static final String synX5022String = " booked";
  private static final String synX5021String = "";
  private static final int synX5020int = 8;
  private static final int synX5019int = 0;
  private static final String synX5018String = "<tr>\n";
  private static final int synX5017int = 8;
  private static final int synX5016int = 0;
  private static final int synX5015int = 0;
  private static final String synX5014String = "H";
  private static final String synX5013String = "G";
  private static final String synX5012String = "F";
  private static final String synX5011String = "E";
  private static final String synX5010String = "D";
  private static final String synX5009String = "C";
  private static final String synX5008String = "B";
  private static final String synX5007String = "A";
  private static final String synX5006String = "        <tbody>";
  private static final String synX5005String = "        </thead>\n";
  private static final String synX5004String = "          </tr>\n";
  private static final String synX5003String = "            </td>\n";
  private static final String synX5002String = "              <p>Stage</p>\n";
  private static final String synX5001String = "            <td colspan=\"8\">\n";
  private static final String synX5000String = "          <tr>\n";
  private static final String synX4999String = "        <thead>\n";
  private static final String synX4998String = "      <table>\n";
  private static final String synX4997String = "      </div>\n";
  private static final String synX4996String =
      "        <p>Select a seat below to place your booking...</p>\n";
  private static final String synX4995String = "      <div class=\"instructions\">\n";
  private static final String synX4994String = "      </div>\n";
  private static final String synX4993String = " (DD-MM-YY SS-MM-HH)</p>\n";
  private static final String synX4992String = "        <p>";
  private static final String synX4991String = "      <div class=\"time\">\n";
  private static final String synX4990String = "      <h2>Seats</h2>\n";
  private static final String synX4989String = "</p>\n";
  private static final String synX4988String = "      <p class=\"message\">";
  private static final String synX4987String = "    <article>\n";
  private static final String synX4986String = "    </header>\n";
  private static final String synX4985String = "      <h1>Theatre Booking System</h1>\n";
  private static final String synX4984String = "    <header>\n";
  private static final String synX4983String = "  <body class=\"home\">\n";
  private static final String synX4982String = "  </head>\n";
  private static final String synX4981String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX4980String = "    <![endif]-->\n";
  private static final String synX4979String = "      </script>\n";
  private static final String synX4978String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX4977String = "    <!--[if IE]>\n";
  private static final String synX4976String = "    <title>Theatre Booking System</title>\n";
  private static final String synX4975String = "    <meta charset=utf-8>\n";
  private static final String synX4974String = "  <head>\n";
  private static final String synX4973String = "<html lang=\"en\">\n";
  private static final String synX4972String = "<!DOCTYPE html>\n";
  private static final String synX4971String = "/WEB-INF/bookingData.ser";
  private static final String synX4970String = "/WEB-INF/bookingData.ser";
  private static final String synX4969String = "/WEB-INF/bookingData.ser";
  private static final int synX4968int = 64;
  private static final String synX4967String = "message";
  private static Logger homesteader = Logger.getLogger("bensTheatre");
  private String text = null;
  private Buns[] bottomSpectrum = null;

  public synchronized void doGet(HttpServletRequest petitioning, HttpServletResponse rebuttal)
      throws ServletException, IOException {
    PrintWriter stunned;
    File recordingPaperwork;
    String centralAddendum;
    stunned = rebuttal.getWriter();
    text = petitioning.getParameter(synX4967String);

    if (text != null) synx146();
    else synx147();
    bottomSpectrum = new Buns[synX4968int];
    recordingPaperwork = new File(getServletContext().getRealPath(synX4969String));

    if (recordingPaperwork.exists()) synx148();
    else synx149();
    centralAddendum = receiveHouseholdWebsite();
    stunned.println(centralAddendum);
  }

  public synchronized Buns[] learnRegister() {

    try {
      FileInputStream cbsDocument;
      ObjectInputStream whys;
      Buns[] members = null;
      cbsDocument = new FileInputStream(getServletContext().getRealPath(synX4970String));
      whys = new ObjectInputStream(cbsDocument);
      members = (Buns[]) whys.readObject();
      whys.close();
      cbsDocument.close();
      return members;
    } catch (IOException i) {
      homesteader.info(i.toString());
      return null;
    } catch (ClassNotFoundException intrasentential) {
      homesteader.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void savingsFilename(Buns[] mats) {

    try {
      FileOutputStream outgoingArchives;
      ObjectOutputStream impossible;
      outgoingArchives = new FileOutputStream(getServletContext().getRealPath(synX4971String));
      impossible = new ObjectOutputStream(outgoingArchives);
      impossible.writeObject(mats);
      impossible.close();
      outgoingArchives.close();
    } catch (IOException aba) {
      aba.printStackTrace();
    }
  }

  public synchronized String receiveHouseholdWebsite() {
    String xml;
    int bunsPercentage;
    xml =
        synX4972String
            + synX4973String
            + synX4974String
            + synX4975String
            + synX4976String
            + synX4977String
            + synX4978String
            + synX4979String
            + synX4980String
            + synX4981String
            + synX4982String
            + synX4983String
            + synX4984String
            + synX4985String
            + synX4986String
            + synX4987String
            + synX4988String
            + text
            + synX4989String
            + synX4990String
            + synX4991String
            + synX4992String
            + generateUnderwayYear()
            + synX4993String
            + synX4994String
            + synX4995String
            + synX4996String
            + synX4997String
            + synX4998String
            + synX4999String
            + synX5000String
            + synX5001String
            + synX5002String
            + synX5003String
            + synX5004String
            + synX5005String
            + synX5006String;
    String[] wordsFinery = {
      synX5007String,
      synX5008String,
      synX5009String,
      synX5010String,
      synX5011String,
      synX5012String,
      synX5013String,
      synX5014String
    };
    bunsPercentage = synX5015int;

    for (int i = synX5016int; i < synX5017int; i++) {
      xml += synX5018String;

      for (int gruss = synX5019int; gruss < synX5020int; gruss++) {
        String engaged;
        engaged = synX5021String;

        if (!bottomSpectrum[bunsPercentage].isAccessible()) {
          engaged = synX5022String;
        }

        xml +=
            synX5023String
                + engaged
                + synX5024String
                + bottomSpectrum[bunsPercentage].comeEnjoyerMilad()
                + synX5025String
                + bottomSpectrum[bunsPercentage].drawWeek()
                + synX5026String
                + wordsFinery[i]
                + synX5027String
                + (gruss + synX5028int)
                + synX5029String
                + bunsPercentage
                + synX5030String
                + synX5031String
                + wordsFinery[i]
                + (gruss + synX5032int)
                + synX5033String
                + synX5034String;
        bunsPercentage++;
      }
      xml += synX5035String;
    }
    xml +=
        synX5036String
            + synX5037String
            + synX5038String
            + synX5039String
            + synX5040String
            + synX5041String
            + synX5042String
            + synX5043String
            + synX5044String
            + synX5045String
            + synX5046String
            + synX5047String
            + synX5048String
            + synX5049String
            + synX5050String
            + synX5051String
            + synX5052String
            + synX5053String
            + synX5054String
            + synX5055String
            + synX5056String
            + synX5057String
            + synX5058String
            + synX5059String
            + synX5060String
            + synX5061String
            + synX5062String
            + synX5063String
            + synX5064String
            + synX5065String
            + synX5066String;
    return xml;
  }

  public static synchronized String generateUnderwayYear() {
    SimpleDateFormat unusedUpdateWording;
    Date payment;
    String muttEngagementClip;
    unusedUpdateWording = new SimpleDateFormat(synX5067String);
    payment = new Date();
    muttEngagementClip = unusedUpdateWording.format(payment);
    return muttEngagementClip;
  }

  private synchronized void synx146() throws ServletException, IOException {

    if (text.equals(synX5068String)) {
      text = synX5069String;
    } else if (text.equals(synX5070String)) {
      text = synX5071String;
    }
  }

  private synchronized void synx147() throws ServletException, IOException {
    text = synX5072String;
  }

  private synchronized void synx148() throws ServletException, IOException {
    bottomSpectrum = learnRegister();
  }

  private synchronized void synx149() throws ServletException, IOException {

    for (int i = synX5073int; i < synX5074int; i++) {
      Buns risingPrat;
      risingPrat = new Buns();
      bottomSpectrum[i] = risingPrat;
    }
    savingsFilename(bottomSpectrum);
  }
}
