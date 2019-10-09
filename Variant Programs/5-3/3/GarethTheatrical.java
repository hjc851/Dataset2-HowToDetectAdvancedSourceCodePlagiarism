import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class GarethTheatrical extends HttpServlet {
  public static Logger lumberman = null;
  public String signal = null;
  public static final int appreciate = -1501531875;
  public Prat[] placeAlign = null;

  public synchronized void doGet(HttpServletRequest decision, HttpServletResponse responsive)
      throws ServletException, IOException {
    String ceilingSlot;
    PrintWriter down;
    File rentalDocument;
    String baseWeb;
    ceilingSlot = "GCW7k9h1E4P5pc";
    down = responsive.getWriter();
    signal = decision.getParameter("message");

    if (signal != null) {

      if (signal.equals("success")) {
        signal = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (signal.equals("limitexceeded")) {
        signal =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      signal = "";
    }
    placeAlign = new Prat[64];
    rentalDocument = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (rentalDocument.exists()) {
      placeAlign = readableArchiving();
    } else {

      for (int i = 0; i < 64; i++) {
        Prat revolutionaryRump;
        revolutionaryRump = new Prat();
        placeAlign[i] = revolutionaryRump;
      }
      preventBinder(placeAlign);
    }
    baseWeb = fetchBackyardLayouts();
    down.println(baseWeb);
  }

  public synchronized Prat[] readableArchiving() {
    String discover;
    discover = "f";

    try {
      FileInputStream electedFilename;
      ObjectInputStream entries;
      Prat[] spaces = null;
      electedFilename =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      entries = new ObjectInputStream(electedFilename);
      spaces = (Prat[]) entries.readObject();
      entries.close();
      electedFilename.close();
      return spaces;
    } catch (IOException i) {
      lumberman.info(i.toString());
      return null;
    } catch (ClassNotFoundException cesium) {
      lumberman.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  public synchronized void preventBinder(Prat[] stools) {
    int minutes;
    minutes = 659190026;

    try {
      FileOutputStream downLodge;
      ObjectOutputStream kayoed;
      downLodge = new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      kayoed = new ObjectOutputStream(downLodge);
      kayoed.writeObject(stools);
      kayoed.close();
      downLodge.close();
    } catch (IOException admittedly) {
      admittedly.printStackTrace();
    }
  }

  public synchronized String fetchBackyardLayouts() {
    int elevatedBoundary;
    String firefox;
    int bottomCaseload;
    elevatedBoundary = -258754845;
    firefox =
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
            + signal
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + drawStreamWeek()
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
    String[] brawlGamut = {"A", "B", "C", "D", "E", "F", "G", "H"};
    bottomCaseload = 0;

    for (int i = 0; i < 8; i++) {
      firefox += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String leased;
        leased = "";

        if (!placeAlign[bottomCaseload].isAccessible()) {
          leased = " booked";
        }

        firefox +=
            "<td class=\"seat"
                + leased
                + "\" data-user=\""
                + placeAlign[bottomCaseload].arriveClientIdentifying()
                + "\" data-time=\""
                + placeAlign[bottomCaseload].canYears()
                + "\" data-row=\""
                + brawlGamut[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + bottomCaseload
                + "\">\n"
                + "  <p>"
                + brawlGamut[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        bottomCaseload++;
      }
      firefox += "</tr>\n";
    }
    firefox +=
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
    return firefox;
  }

  public static synchronized String drawStreamWeek() {
    double secondRestricted;
    SimpleDateFormat unusedUpdateWording;
    Date timeframe;
    String blackguardTimelineDays;
    secondRestricted = 0.1879643079652864;
    unusedUpdateWording = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    timeframe = new Date();
    blackguardTimelineDays = unusedUpdateWording.format(timeframe);
    return blackguardTimelineDays;
  }

  static {
    lumberman = Logger.getLogger("bensTheatre");
  }
}
