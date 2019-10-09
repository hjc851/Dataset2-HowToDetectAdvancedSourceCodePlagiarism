import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class SthTeatro extends HttpServlet {
  private Posterior[] hindquartersPalette;
  private String tagline;
  private static Logger skidder = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest application, HttpServletResponse retort)
      throws ServletException, IOException {
    PrintWriter unsuccessful = retort.getWriter();
    tagline = application.getParameter("message");

    if (tagline != null) {

      if (tagline.equals("success")) {
        tagline = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (tagline.equals("limitexceeded")) {
        tagline =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      tagline = "";
    }
    hindquartersPalette = new Posterior[64];
    File advanceComplaint = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (advanceComplaint.exists()) {
      hindquartersPalette = takeDocument();
    } else {

      for (int i = 0; i < 64; i++) {
        Posterior modernPlace = new Posterior();
        hindquartersPalette[i] = modernPlace;
      }
      salvageCharge(hindquartersPalette);
    }
    String abodeWebpage = obtainBaseWeb();
    unsuccessful.println(abodeWebpage);
  }

  public Posterior[] takeDocument() {

    try {
      Posterior[] space;
      FileInputStream nsiPapers =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream details = new ObjectInputStream(nsiPapers);
      space = (Posterior[]) details.readObject();
      details.close();
      nsiPapers.close();
      return space;
    } catch (IOException i) {
      skidder.info(i.toString());
      return null;
    } catch (ClassNotFoundException cathode) {
      skidder.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public void salvageCharge(Posterior[] passengers) {

    try {
      FileOutputStream forbiddenDocumentation =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream prohibited = new ObjectOutputStream(forbiddenDocumentation);
      prohibited.writeObject(passengers);
      prohibited.close();
      forbiddenDocumentation.close();
    } catch (IOException former) {
      former.printStackTrace();
    }
  }

  public String obtainBaseWeb() {
    String xhtml =
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
            + tagline
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + arriveFlowMonth()
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
    String[] rankedCollection = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int tailMany = 0;

    for (int i = 0; i < 8; i++) {
      xhtml += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String engaged = "";

        if (!hindquartersPalette[tailMany].isAccessible()) {
          engaged = " booked";
        }

        xhtml +=
            "<td class=\"seat"
                + engaged
                + "\" data-user=\""
                + hindquartersPalette[tailMany].driveOperatorSecurity()
                + "\" data-time=\""
                + hindquartersPalette[tailMany].havePeriods()
                + "\" data-row=\""
                + rankedCollection[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + tailMany
                + "\">\n"
                + "  <p>"
                + rankedCollection[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        tailMany++;
      }
      xhtml += "</tr>\n";
    }
    xhtml +=
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
    return xhtml;
  }

  public static String arriveFlowMonth() {
    SimpleDateFormat modernSeeLayouts = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date beginning = new Date();
    String damnedDeadlineWhen = modernSeeLayouts.format(beginning);
    return damnedDeadlineWhen;
  }
}
