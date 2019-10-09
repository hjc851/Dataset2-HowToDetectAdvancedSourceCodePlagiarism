import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class HansenComedy extends HttpServlet {
  private static Logger recorder;
  private String statement;
  static final String numberPieces = "7cok0KXK6d0";
  private Posterior[] sternArsenal;

  public synchronized void doGet(HttpServletRequest ask, HttpServletResponse responsive)
      throws ServletException, IOException {
    double nameBelongings;
    PrintWriter unfashionable;
    File registerArchiving;
    String domesticSummary;
    nameBelongings = 0.40837766901196704;
    unfashionable = responsive.getWriter();
    statement = ask.getParameter("message");

    if (statement != null) {

      if (statement.equals("success")) {
        statement = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (statement.equals("limitexceeded")) {
        statement =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      statement = "";
    }
    sternArsenal = new Posterior[64];
    registerArchiving = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (registerArchiving.exists()) {
      sternArsenal = takeDocument();
    } else {

      for (int i = 0; i < 64; i++) {
        Posterior refreshingInduct;
        refreshingInduct = new Posterior();
        sternArsenal[i] = refreshingInduct;
      }
      protectComplaint(sternArsenal);
    }
    domesticSummary = driveCottageFolio();
    unfashionable.println(domesticSummary);
  }

  public synchronized Posterior[] takeDocument() {
    double rolled;
    rolled = 0.39117021103294025;

    try {
      FileInputStream tenantsDocuments;
      ObjectInputStream without;
      Posterior[] venues;
      tenantsDocuments =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      without = new ObjectInputStream(tenantsDocuments);
      venues = (Posterior[]) without.readObject();
      without.close();
      tenantsDocuments.close();
      return venues;
    } catch (IOException i) {
      recorder.info(i.toString());
      return null;
    } catch (ClassNotFoundException nlsy) {
      recorder.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public synchronized void protectComplaint(Posterior[] chairs) {
    String secondaryTrussed;
    secondaryTrussed = "1Xjz4gJv4";

    try {
      FileOutputStream impossibleDocuments;
      ObjectOutputStream off;
      impossibleDocuments =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      off = new ObjectOutputStream(impossibleDocuments);
      off.writeObject(chairs);
      off.close();
      impossibleDocuments.close();
    } catch (IOException past) {
      past.printStackTrace();
    }
  }

  public synchronized String driveCottageFolio() {
    String demarcation;
    String parser;
    int tailMany;
    demarcation = "vkQJXZ";
    parser =
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
            + statement
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
    String[] dustupRange = {"A", "B", "C", "D", "E", "F", "G", "H"};
    tailMany = 0;

    for (int i = 0; i < 8; i++) {
      parser += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String attributed;
        attributed = "";

        if (!sternArsenal[tailMany].isAccessible()) {
          attributed = " booked";
        }

        parser +=
            "<td class=\"seat"
                + attributed
                + "\" data-user=\""
                + sternArsenal[tailMany].canVisitorOwnership()
                + "\" data-time=\""
                + sternArsenal[tailMany].catchWhen()
                + "\" data-row=\""
                + dustupRange[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + tailMany
                + "\">\n"
                + "  <p>"
                + dustupRange[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        tailMany++;
      }
      parser += "</tr>\n";
    }
    parser +=
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
    return parser;
  }

  public static synchronized String letAfootHours() {
    int epithet;
    SimpleDateFormat hotNotificationForm;
    Date commencement;
    String underbredCalendarDay;
    epithet = 471404051;
    hotNotificationForm = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    commencement = new Date();
    underbredCalendarDay = hotNotificationForm.format(commencement);
    return underbredCalendarDay;
  }

  static {
    recorder = Logger.getLogger("bensTheatre");
  }
}
