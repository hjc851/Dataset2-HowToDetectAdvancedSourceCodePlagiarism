import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class ReqPlayhouse extends HttpServlet {
  private Prat[] keisterMyriad;
  private String note;
  private static Logger forestry = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest asking, HttpServletResponse intervention)
      throws ServletException, IOException {
    PrintWriter off = intervention.getWriter();
    note = asking.getParameter("message");

    if (note != null) {

      if (note.equals("success")) {
        note = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (note.equals("limitexceeded")) {
        note =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      note = "";
    }
    keisterMyriad = new Prat[64];
    File detentionData = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (detentionData.exists()) {
      keisterMyriad = perusedArchives();
    } else {

      for (int i = 0; i < 64; i++) {
        Prat recentlyDerriere = new Prat();
        keisterMyriad[i] = recentlyDerriere;
      }
      helpData(keisterMyriad);
    }
    String menageFootnote = canResidenceScreen();
    off.println(menageFootnote);
  }

  public Prat[] perusedArchives() {

    try {
      Prat[] mats;
      FileInputStream incumbentsSubmitting =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream elected = new ObjectInputStream(incumbentsSubmitting);
      mats = (Prat[]) elected.readObject();
      elected.close();
      incumbentsSubmitting.close();
      return mats;
    } catch (IOException i) {
      forestry.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      forestry.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public void helpData(Prat[] elects) {

    try {
      FileOutputStream outerSubmitted =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream away = new ObjectOutputStream(outerSubmitted);
      away.writeObject(elects);
      away.close();
      outerSubmitted.close();
    } catch (IOException adult) {
      adult.printStackTrace();
    }
  }

  public String canResidenceScreen() {
    String parser =
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
            + note
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + beatTypicalJuncture()
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
    String[] placeBreadth = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int buttHandful = 0;

    for (int i = 0; i < 8; i++) {
      parser += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String counted = "";

        if (!keisterMyriad[buttHandful].isAccessible()) {
          counted = " booked";
        }

        parser +=
            "<td class=\"seat"
                + counted
                + "\" data-user=\""
                + keisterMyriad[buttHandful].letSearcherIdentification()
                + "\" data-time=\""
                + keisterMyriad[buttHandful].becomeOpportunity()
                + "\" data-row=\""
                + placeBreadth[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + buttHandful
                + "\">\n"
                + "  <p>"
                + placeBreadth[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        buttHandful++;
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

  public static String beatTypicalJuncture() {
    SimpleDateFormat refreshingDeadlinesFiles = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date calendar = new Date();
    String centreDeadlinesMonth = refreshingDeadlinesFiles.format(calendar);
    return centreDeadlinesMonth;
  }
}
