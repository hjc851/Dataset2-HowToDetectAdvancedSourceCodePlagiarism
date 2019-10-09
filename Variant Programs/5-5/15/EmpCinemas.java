import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import static java.util.logging.Logger.getLogger;

public class EmpCinemas extends HttpServlet {
  private static final int synX2059int = 64;
  private static final int synX2058int = 0;
  private static final String synX2057String = "";
  private static final String synX2056String =
      "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
  private static final String synX2055String = "limitexceeded";
  private static final String synX2054String =
      "Seat was successfully booked.  We look forward to seeing you on the night.";
  private static final String synX2053String = "success";
  private static final String synX2052String = "bensTheatre";
  private static final String synX2051String = "dd-MM-YY ss-MM-HH";
  private static final String synX2050String = "</html>";
  private static final String synX2049String = "  </body>\t\n";
  private static final String synX2048String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX2047String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX2046String = "    </div>\n";
  private static final String synX2045String = "      </div>\n";
  private static final String synX2044String = "        </div>\n";
  private static final String synX2043String = "          <button>OK</button>\n";
  private static final String synX2042String = "        <div class=\"close\">\n";
  private static final String synX2041String =
      "        <p>Booked On:<span class=\"booked-time\"></span></p>\n";
  private static final String synX2040String =
      "        <p>Booked By:<span class=\"booked-name\"></span></p>\n";
  private static final String synX2039String = "        <h3>This seat is already booked.</h3>\n";
  private static final String synX2038String = "      <div class=\"inner\">\n";
  private static final String synX2037String = "    <div id=\"popup\">\n";
  private static final String synX2036String = "    </footer>\n";
  private static final String synX2035String = "      </div>\n";
  private static final String synX2034String = "        <p>c3063467</p>\n";
  private static final String synX2033String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX2032String = "      <div class=\"author\">\n";
  private static final String synX2031String = "    <footer>\n";
  private static final String synX2030String = "    </article>\n";
  private static final String synX2029String = "      </div>\n";
  private static final String synX2028String = "        </div>\n";
  private static final String synX2027String = "          <p>Booked</p>\n";
  private static final String synX2026String = "        <div class=\"booked\">\n";
  private static final String synX2025String = "        </div>\n";
  private static final String synX2024String = "          <p>Available</p>\n";
  private static final String synX2023String = "        <div class=\"available\">\n";
  private static final String synX2022String = "      <div class=\"legend\">\n";
  private static final String synX2021String = "      </table>\n";
  private static final String synX2020String = "</tbody>\n";
  private static final String synX2019String = "</tr>\n";
  private static final String synX2018String = "</td>";
  private static final String synX2017String = "</p>\n";
  private static final int synX2016int = 1;
  private static final String synX2015String = "  <p>";
  private static final String synX2014String = "\">\n";
  private static final String synX2013String = "\" data-seatNumber=\"";
  private static final int synX2012int = 1;
  private static final String synX2011String = "\" data-seat=\"";
  private static final String synX2010String = "\" data-row=\"";
  private static final String synX2009String = "\" data-time=\"";
  private static final String synX2008String = "\" data-user=\"";
  private static final String synX2007String = "<td class=\"seat";
  private static final String synX2006String = " booked";
  private static final String synX2005String = "";
  private static final int synX2004int = 8;
  private static final int synX2003int = 0;
  private static final String synX2002String = "<tr>\n";
  private static final int synX2001int = 8;
  private static final int synX2000int = 0;
  private static final int synX1999int = 0;
  private static final String synX1998String = "H";
  private static final String synX1997String = "G";
  private static final String synX1996String = "F";
  private static final String synX1995String = "E";
  private static final String synX1994String = "D";
  private static final String synX1993String = "C";
  private static final String synX1992String = "B";
  private static final String synX1991String = "A";
  private static final String synX1990String = "        <tbody>";
  private static final String synX1989String = "        </thead>\n";
  private static final String synX1988String = "          </tr>\n";
  private static final String synX1987String = "            </td>\n";
  private static final String synX1986String = "              <p>Stage</p>\n";
  private static final String synX1985String = "            <td colspan=\"8\">\n";
  private static final String synX1984String = "          <tr>\n";
  private static final String synX1983String = "        <thead>\n";
  private static final String synX1982String = "      <table>\n";
  private static final String synX1981String = "      </div>\n";
  private static final String synX1980String =
      "        <p>Select a seat below to place your booking...</p>\n";
  private static final String synX1979String = "      <div class=\"instructions\">\n";
  private static final String synX1978String = "      </div>\n";
  private static final String synX1977String = " (DD-MM-YY SS-MM-HH)</p>\n";
  private static final String synX1976String = "        <p>";
  private static final String synX1975String = "      <div class=\"time\">\n";
  private static final String synX1974String = "      <h2>Seats</h2>\n";
  private static final String synX1973String = "</p>\n";
  private static final String synX1972String = "      <p class=\"message\">";
  private static final String synX1971String = "    <article>\n";
  private static final String synX1970String = "    </header>\n";
  private static final String synX1969String = "      <h1>Theatre Booking System</h1>\n";
  private static final String synX1968String = "    <header>\n";
  private static final String synX1967String = "  <body class=\"home\">\n";
  private static final String synX1966String = "  </head>\n";
  private static final String synX1965String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX1964String = "    <![endif]-->\n";
  private static final String synX1963String = "      </script>\n";
  private static final String synX1962String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX1961String = "    <!--[if IE]>\n";
  private static final String synX1960String = "    <title>Theatre Booking System</title>\n";
  private static final String synX1959String = "    <meta charset=utf-8>\n";
  private static final String synX1958String = "  <head>\n";
  private static final String synX1957String = "<html lang=\"en\">\n";
  private static final String synX1956String = "<!DOCTYPE html>\n";
  private static final String synX1955String = "/WEB-INF/bookingData.ser";
  private static final String synX1954String = "/WEB-INF/bookingData.ser";
  private static final String synX1953String = "/WEB-INF/bookingData.ser";
  private static final int synX1952int = 64;
  private static final String synX1951String = "message";
  private Prat[] derriereVariety = null;
  private String speech = null;
  private static Logger homesteader = null;

  public synchronized void doGet(HttpServletRequest motion, HttpServletResponse retort)
      throws ServletException, IOException {
    PrintWriter quenched = retort.getWriter();
    speech = (motion.getParameter(synX1951String));

    if (speech != null) synx51();
    else synx52();
    derriereVariety = (new Prat[synX1952int]);
    File reservingDocuments = new File(getServletContext().getRealPath(synX1953String));

    if (reservingDocuments.exists()) synx53();
    else synx54();
    String habitationSheet = drawMenageFootnote();
    quenched.println(habitationSheet);
  }

  public synchronized Prat[] hearBinder() {

    try {
      Prat[] spots = null;
      FileInputStream nihDocket =
          new FileInputStream(getServletContext().getRealPath(synX1954String));
      ObjectInputStream tenants = new ObjectInputStream(nihDocket);
      spots = ((Prat[]) tenants.readObject());
      tenants.close();
      nihDocket.close();
      return spots;
    } catch (IOException i) {
      homesteader.info(i.toString());
      return null;
    } catch (ClassNotFoundException intrasentential) {
      homesteader.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void deliverDocument(Prat[] space) {

    try {
      FileOutputStream outerSubmitted =
          new FileOutputStream(getServletContext().getRealPath(synX1955String));
      ObjectOutputStream down = new ObjectOutputStream(outerSubmitted);
      down.writeObject(space);
      down.close();
      outerSubmitted.close();
    } catch (IOException tipp) {
      tipp.printStackTrace();
    }
  }

  public synchronized String drawMenageFootnote() {
    String filename =
        (synX1956String
            + synX1957String
            + synX1958String
            + synX1959String
            + synX1960String
            + synX1961String
            + synX1962String
            + synX1963String
            + synX1964String
            + synX1965String
            + synX1966String
            + synX1967String
            + synX1968String
            + synX1969String
            + synX1970String
            + synX1971String
            + synX1972String
            + speech
            + synX1973String
            + synX1974String
            + synX1975String
            + synX1976String
            + generateUnderwayYear()
            + synX1977String
            + synX1978String
            + synX1979String
            + synX1980String
            + synX1981String
            + synX1982String
            + synX1983String
            + synX1984String
            + synX1985String
            + synX1986String
            + synX1987String
            + synX1988String
            + synX1989String
            + synX1990String);
    String[] tiffMix = {
      synX1991String,
      synX1992String,
      synX1993String,
      synX1994String,
      synX1995String,
      synX1996String,
      synX1997String,
      synX1998String
    };
    int bunsPercentage = synX1999int;

    for (int i = synX2000int; i < synX2001int; i++) {
      filename += (filename + synX2002String);

      for (int flier = synX2003int; flier < synX2004int; flier++) {
        String engaged = synX2005String;

        if (!derriereVariety[bunsPercentage].isAccessible()) {
          engaged = (synX2006String);
        }

        filename +=
            (filename
                + (synX2007String
                    + engaged
                    + synX2008String
                    + derriereVariety[bunsPercentage].becomeUsePhoto()
                    + synX2009String
                    + derriereVariety[bunsPercentage].letHours()
                    + synX2010String
                    + tiffMix[i]
                    + synX2011String
                    + (flier + synX2012int)
                    + synX2013String
                    + bunsPercentage
                    + synX2014String
                    + synX2015String
                    + tiffMix[i]
                    + (flier + synX2016int)
                    + synX2017String
                    + synX2018String));
        bunsPercentage++;
      }
      filename += (filename + synX2019String);
    }
    filename +=
        (filename
            + (synX2020String
                + synX2021String
                + synX2022String
                + synX2023String
                + synX2024String
                + synX2025String
                + synX2026String
                + synX2027String
                + synX2028String
                + synX2029String
                + synX2030String
                + synX2031String
                + synX2032String
                + synX2033String
                + synX2034String
                + synX2035String
                + synX2036String
                + synX2037String
                + synX2038String
                + synX2039String
                + synX2040String
                + synX2041String
                + synX2042String
                + synX2043String
                + synX2044String
                + synX2045String
                + synX2046String
                + synX2047String
                + synX2048String
                + synX2049String
                + synX2050String));
    return filename;
  }

  public static synchronized String generateUnderwayYear() {
    SimpleDateFormat unprecedentedYetModality = new SimpleDateFormat(synX2051String);
    Date yet = new Date();
    String feistBeginningBeginning = unprecedentedYetModality.format(yet);
    return feistBeginningBeginning;
  }

  static {
    homesteader = (getLogger(synX2052String));
  }

  private synchronized void synx51() throws ServletException, IOException {

    if (speech.equals(synX2053String)) {
      speech = (synX2054String);
    } else if (speech.equals(synX2055String)) {
      speech = (synX2056String);
    }
  }

  private synchronized void synx52() throws ServletException, IOException {
    speech = (synX2057String);
  }

  private synchronized void synx53() throws ServletException, IOException {
    derriereVariety = (hearBinder());
  }

  private synchronized void synx54() throws ServletException, IOException {

    for (int i = synX2058int; i < synX2059int; i++) {
      Prat recentlyDerriere = new Prat();
      derriereVariety[i] = (recentlyDerriere);
    }
    deliverDocument(derriereVariety);
  }
}
