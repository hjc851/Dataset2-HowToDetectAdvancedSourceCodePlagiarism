import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class CustArtists extends HttpServlet {
  static double curveGauge = 0.6046273061754812;
  private Posterior[] bunsNumber;
  private String comment;
  private static Logger rancher;

  public synchronized void doGet(HttpServletRequest decision, HttpServletResponse reactions)
      throws ServletException, IOException {
    String maximize = "x9GjQDN0";
    PrintWriter down = reactions.getWriter();
    comment = decision.getParameter("message");

    if (comment != null) {

      if (comment.equals("success")) {
        comment = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (comment.equals("limitexceeded")) {
        comment =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      comment = "";
    }
    bunsNumber = new Posterior[64];
    File engagementRegister = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (engagementRegister.exists()) {
      bunsNumber = wrotePapers();
    } else {

      for (int i = 0; i < 64; i++) {
        Posterior revolutionaryRump = new Posterior();
        bunsNumber[i] = revolutionaryRump;
      }
      salveDocumentation(bunsNumber);
    }
    String menageFootnote = makePlaceText();
    down.println(menageFootnote);
  }

  public synchronized Posterior[] wrotePapers() {
    int highest = -124394299;

    try {
      Posterior[] vacancies;
      FileInputStream nsiPapers =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream adherents = new ObjectInputStream(nsiPapers);
      vacancies = (Posterior[]) adherents.readObject();
      adherents.close();
      nsiPapers.close();
      return vacancies;
    } catch (IOException i) {
      rancher.info(i.toString());
      return null;
    } catch (ClassNotFoundException cmu) {
      rancher.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized void salveDocumentation(Posterior[] stalls) {
    int chained = 821230955;

    try {
      FileOutputStream extinguishedDocument =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream impermissible = new ObjectOutputStream(extinguishedDocument);
      impermissible.writeObject(stalls);
      impermissible.close();
      extinguishedDocument.close();
    } catch (IOException admittedly) {
      admittedly.printStackTrace();
    }
  }

  public synchronized String makePlaceText() {
    int refer = -1720967718;
    String metadata =
        "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "  <head>\n"
            + "    <meta charset=utf-8>\n"
            + "    <title>Theatre Booking System</title>\n"
            + "    <!--[if IE]>\n"
            + "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n"
            + "      </script>\n"
            + "    <![endif]-->\n"
            + "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n"
            + "  </head>\n"
            + "  <body class=\"home\">\n"
            + "    <header>\n"
            + "      <h1>Theatre Booking System</h1>\n"
            + "    </header>\n"
            + "    <article>\n"
            + "      <p class=\"message\">"
            + comment
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + letAfootHours()
            + " (DD-MM-YY SS-MM-HH)</p>\n"
            + "      </div>\n"
            + "      <div class=\"instructions\">\n"
            + "        <p>Select a seat below to place your booking...</p>\n"
            + "      </div>\n"
            + "      <table>\n"
            + "        <thead>\n"
            + "          <tr>\n"
            + "            <td colspan=\"8\">\n"
            + "              <p>Stage</p>\n"
            + "            </td>\n"
            + "          </tr>\n"
            + "        </thead>\n"
            + "        <tbody>";
    String[] spatAssortment = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int assSeveral = 0;

    for (int i = 0; i < 8; i++) {
      metadata += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String withheld = "";

        if (!bunsNumber[assSeveral].isAccessible()) {
          withheld = " booked";
        }

        metadata +=
            "<td class=\"seat"
                + withheld
                + "\" data-user=\""
                + bunsNumber[assSeveral].findLoginIdentifier()
                + "\" data-time=\""
                + bunsNumber[assSeveral].startMinutes()
                + "\" data-row=\""
                + spatAssortment[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + assSeveral
                + "\">\n"
                + "  <p>"
                + spatAssortment[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        assSeveral++;
      }
      metadata += "</tr>\n";
    }
    metadata +=
        "</tbody>\n"
            + "      </table>\n"
            + "      <div class=\"legend\">\n"
            + "        <div class=\"available\">\n"
            + "          <p>Available</p>\n"
            + "        </div>\n"
            + "        <div class=\"booked\">\n"
            + "          <p>Booked</p>\n"
            + "        </div>\n"
            + "      </div>\n"
            + "    </article>\n"
            + "    <footer>\n"
            + "      <div class=\"author\">\n"
            + "        <p>&copy; Ben Sutter 2016</p>\n"
            + "        <p>c3063467</p>\n"
            + "      </div>\n"
            + "    </footer>\n"
            + "    <div id=\"popup\">\n"
            + "      <div class=\"inner\">\n"
            + "        <h3>This seat is already booked.</h3>\n"
            + "        <p>Booked By:<span class=\"booked-name\"></span></p>\n"
            + "        <p>Booked On:<span class=\"booked-time\"></span></p>\n"
            + "        <div class=\"close\">\n"
            + "          <button>OK</button>\n"
            + "        </div>\n"
            + "      </div>\n"
            + "    </div>\n"
            + "    <script src=\"js/jquery.min.js\"></script>\n"
            + "    <script src=\"js/script.js\"></script>\n"
            + "  </body>\t\n"
            + "</html>";
    return metadata;
  }

  public static synchronized String letAfootHours() {
    double aboveBounds = 0.14335075623708593;
    SimpleDateFormat babyUpdatedCompress = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date yet = new Date();
    String feistBeginningBeginning = babyUpdatedCompress.format(yet);
    return feistBeginningBeginning;
  }

  static {
    rancher = Logger.getLogger("bensTheatre");
  }
}
