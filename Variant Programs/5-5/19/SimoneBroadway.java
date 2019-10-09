import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import static java.util.logging.Logger.getLogger;

public class SimoneBroadway extends javax.servlet.http.HttpServlet {
  public static final double restrict = 0.5226897116870514;
  private Prat[] sitRegalia;
  private java.lang.String thing;
  private static java.util.logging.Logger harvester = getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest appeal, HttpServletResponse responded)
      throws ServletException, IOException {
    double moments = 0.1571006009896636;
    java.io.PrintWriter away = responded.getWriter();
    thing = appeal.getParameter("message");

    if (thing != null) synx61();
    else synx62();
    sitRegalia = new Prat[64];
    java.io.File appointmentReadme =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (appointmentReadme.exists()) synx63();
    else synx64();
    java.lang.String hometownChapter = goHousePageboy();
    away.println(hometownChapter);
  }

  public synchronized Prat[] perusedArchives() {
    double boundary = 0.8528113111772602;

    try {
      Prat[] pillion;
      java.io.FileInputStream adherentsPaperwork =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream proponents = new java.io.ObjectInputStream(adherentsPaperwork);
      pillion = (Prat[]) proponents.readObject();
      proponents.close();
      adherentsPaperwork.close();
      return pillion;
    } catch (java.io.IOException i) {
      harvester.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cesium) {
      harvester.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  public synchronized void reviveDocket(Prat[] spots) {
    int keepsake = -987058514;

    try {
      java.io.FileOutputStream unfashionableFilename =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream proscribed = new java.io.ObjectOutputStream(unfashionableFilename);
      proscribed.writeObject(spots);
      proscribed.close();
      unfashionableFilename.close();
    } catch (java.io.IOException appointed) {
      appointed.printStackTrace();
    }
  }

  public synchronized java.lang.String goHousePageboy() {
    int roll = -469511876;
    java.lang.String metadata =
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
            + thing
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + driveContinuingAgain()
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
    String[] seriesMultitude = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int assSeveral = 0;

    for (int i = 0; i < 8; i++) {
      metadata += metadata + "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        java.lang.String planned = "";

        if (!sitRegalia[assSeveral].isAccessible()) {
          planned = " booked";
        }

        metadata +=
            metadata
                + "<td class=\"seat"
                + planned
                + "\" data-user=\""
                + sitRegalia[assSeveral].produceWearerMap()
                + "\" data-time=\""
                + sitRegalia[assSeveral].drawWeek()
                + "\" data-row=\""
                + seriesMultitude[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + assSeveral
                + "\">\n"
                + "  <p>"
                + seriesMultitude[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        assSeveral++;
      }
      metadata += metadata + "</tr>\n";
    }
    metadata +=
        metadata
            + "</tbody>\n"
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

  public static synchronized java.lang.String driveContinuingAgain() {
    String weakerTrammel = "yfYWIuJFEDmxUKVL";
    java.text.SimpleDateFormat untestedDeadlineApproach =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date updated = new java.util.Date();
    java.lang.String centreDeadlinesMonth = untestedDeadlineApproach.format(updated);
    return centreDeadlinesMonth;
  }

  private synchronized void synx61() throws ServletException, IOException {

    if (thing.equals("success")) {
      thing = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (thing.equals("limitexceeded")) {
      thing =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx62() throws ServletException, IOException {
    thing = "";
  }

  private synchronized void synx63() throws ServletException, IOException {
    sitRegalia = perusedArchives();
  }

  private synchronized void synx64() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Prat recentHindquarters = new Prat();
      sitRegalia[i] = recentHindquarters;
    }
    reviveDocket(sitRegalia);
  }
}
