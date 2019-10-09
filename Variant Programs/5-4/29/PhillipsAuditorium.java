import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class PhillipsAuditorium extends HttpServlet {
  static String highestBandwidth = "vuG";
  public Butt[] bumSelection;
  public String comment;
  public static Logger woodsman;

  public synchronized void doGet(HttpServletRequest insistence, HttpServletResponse replies)
      throws ServletException, IOException {
    double modicumFatty = 0.16819104036714716;
    PrintWriter extinguished = replies.getWriter();
    comment = insistence.getParameter("message");

    if (comment != null) synx61();
    else synx62();
    bumSelection = new Butt[64];
    File appointmentReadme = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (appointmentReadme.exists()) synx63();
    else synx64();
    String housePageboy = findDwellingHomepage();
    extinguished.println(housePageboy);
  }

  public synchronized Butt[] interpretLodge() {
    String peakSize = "";

    try {
      Butt[] posts;
      FileInputStream nsiPapers =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream adherents = new ObjectInputStream(nsiPapers);
      posts = (Butt[]) adherents.readObject();
      adherents.close();
      nsiPapers.close();
      return posts;
    } catch (IOException i) {
      woodsman.info(i.toString());
      return null;
    } catch (ClassNotFoundException intrasentential) {
      woodsman.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void preventBinder(Butt[] slots) {
    String apexSure = "APW9AWGeCOMp";

    try {
      FileOutputStream impossibleDocuments =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream back = new ObjectOutputStream(impossibleDocuments);
      back.writeObject(slots);
      back.close();
      impossibleDocuments.close();
    } catch (IOException abel) {
      abel.printStackTrace();
    }
  }

  public synchronized String findDwellingHomepage() {
    double johannesBeam = 0.4029842439740505;
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
            + comment
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + findActualSentence()
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
    String[] wranglingNumber = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int rumpCount = 0;

    for (int i = 0; i < 8; i++) {
      xhtml += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        String logged = "";

        if (!bumSelection[rumpCount].isAccessible()) {
          logged = " booked";
        }

        xhtml +=
            "<td class=\"seat"
                + logged
                + "\" data-user=\""
                + bumSelection[rumpCount].produceWearerMap()
                + "\" data-time=\""
                + bumSelection[rumpCount].produceNow()
                + "\" data-row=\""
                + wranglingNumber[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + rumpCount
                + "\">\n"
                + "  <p>"
                + wranglingNumber[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        rumpCount++;
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

  public static synchronized String findActualSentence() {
    double frownObligated = 0.8766011844615584;
    SimpleDateFormat untriedScheduleMethod = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date receipt = new Date();
    String cruxDaysYears = untriedScheduleMethod.format(receipt);
    return cruxDaysYears;
  }

  static {
    woodsman = Logger.getLogger("bensTheatre");
  }

  private synchronized void synx61() throws ServletException, IOException {

    if (comment.equals("success")) {
      comment = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (comment.equals("limitexceeded")) {
      comment =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx62() throws ServletException, IOException {
    comment = "";
  }

  private synchronized void synx63() throws ServletException, IOException {
    bumSelection = interpretLodge();
  }

  private synchronized void synx64() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Butt freshlyFanny = new Butt();
      bumSelection[i] = freshlyFanny;
    }
    preventBinder(bumSelection);
  }
}
