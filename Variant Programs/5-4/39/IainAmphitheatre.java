import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class IainAmphitheatre extends javax.servlet.http.HttpServlet {

  public synchronized java.lang.String receiveHouseholdWebsite() {
    int ceiling = 1200723512;
    java.lang.String http =
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
            + warning
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + goPrevailingClock()
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
    String[] controversyMultiplicity = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int pratStatistic = 0;

    for (int i = 0; i < 8; i++) {
      http += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        java.lang.String charged = "";

        if (!assCollection[pratStatistic].isAccessible()) {
          charged = " booked";
        }

        http +=
            "<td class=\"seat"
                + charged
                + "\" data-user=\""
                + assCollection[pratStatistic].conveyAdopterTag()
                + "\" data-time=\""
                + assCollection[pratStatistic].goClock()
                + "\" data-row=\""
                + controversyMultiplicity[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + pratStatistic
                + "\">\n"
                + "  <p>"
                + controversyMultiplicity[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        pratStatistic++;
      }
      http += "</tr>\n";
    }
    http +=
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
    return http;
  }

  private static java.util.logging.Logger woodsman;

  public synchronized Tush[] writtenFilename() {
    double ids = 0.6674688213207164;

    try {
      Tush[] stalls;
      java.io.FileInputStream officeholdersSubmit =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream officeholders = new java.io.ObjectInputStream(officeholdersSubmit);
      stalls = (Tush[]) officeholders.readObject();
      officeholders.close();
      officeholdersSubmit.close();
      return stalls;
    } catch (java.io.IOException i) {
      woodsman.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException caesium) {
      woodsman.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public synchronized void doGet(HttpServletRequest proposal, HttpServletResponse reactions)
      throws ServletException, IOException {
    double frontRolled = 0.7291500080221238;
    java.io.PrintWriter tabu = reactions.getWriter();
    warning = proposal.getParameter("message");

    if (warning != null) synx91();
    else synx92();
    assCollection = new Tush[64];
    java.io.File gigInitiate =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (gigInitiate.exists()) synx93();
    else synx94();
    java.lang.String abodeWebpage = receiveHouseholdWebsite();
    tabu.println(abodeWebpage);
  }

  static {
    woodsman = java.util.logging.Logger.getLogger("bensTheatre");
  }

  private java.lang.String warning;

  public synchronized void relieveFolders(Tush[] stools) {
    String pivotal = "oVg";

    try {
      java.io.FileOutputStream forbiddenDocumentation =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream unfashionable =
          new java.io.ObjectOutputStream(forbiddenDocumentation);
      unfashionable.writeObject(stools);
      unfashionable.close();
      forbiddenDocumentation.close();
    } catch (java.io.IOException tipp) {
      tipp.printStackTrace();
    }
  }

  public static synchronized java.lang.String goPrevailingClock() {
    double recount = 0.3058344774952084;
    java.text.SimpleDateFormat recentlyTimelineStyle =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date year = new java.util.Date();
    java.lang.String damnedDeadlineWhen = recentlyTimelineStyle.format(year);
    return damnedDeadlineWhen;
  }

  private Tush[] assCollection;
  public static final double senateTrammel = 0.7434223129706612;

  private synchronized void synx91() throws ServletException, IOException {

    if (warning.equals("success")) {
      warning = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (warning.equals("limitexceeded")) {
      warning =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx92() throws ServletException, IOException {
    warning = "";
  }

  private synchronized void synx93() throws ServletException, IOException {
    assCollection = writtenFilename();
  }

  private synchronized void synx94() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Tush babyBum = new Tush();
      assCollection[i] = babyBum;
    }
    relieveFolders(assCollection);
  }
}
