import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class PkgHouse extends HttpServlet {
  private Bottom[] tushFinery;
  private String thing;
  private static Logger log = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest demands, HttpServletResponse explanation)
      throws ServletException, IOException {
    PrintWriter back = explanation.getWriter();
    thing = demands.getParameter("message");

    if (thing != null) {

      if (thing.equals("success")) {
        thing = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (thing.equals("limitexceeded")) {
        thing =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      thing = "";
    }
    tushFinery = new Bottom[64];
    File rentalDocument = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (rentalDocument.exists()) {
      tushFinery = perusedArchives();
    } else {

      for (int i = 0; i < 64; i++) {
        Bottom untriedButtocks = new Bottom();
        tushFinery[i] = untriedButtocks;
      }
      deliverDocument(tushFinery);
    }
    String centralAddendum = fetchBackyardLayouts();
    back.println(centralAddendum);
  }

  public Bottom[] perusedArchives() {

    try {
      Bottom[] mats;
      FileInputStream incumbentsSubmitting =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream adherents = new ObjectInputStream(incumbentsSubmitting);
      mats = (Bottom[]) adherents.readObject();
      adherents.close();
      incumbentsSubmitting.close();
      return mats;
    } catch (IOException i) {
      log.info(i.toString());
      return null;
    } catch (ClassNotFoundException shim) {
      log.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  public void deliverDocument(Bottom[] stalls) {

    try {
      FileOutputStream retiredExecutable =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream unsuccessful = new ObjectOutputStream(retiredExecutable);
      unsuccessful.writeObject(stalls);
      unsuccessful.close();
      retiredExecutable.close();
    } catch (IOException late) {
      late.printStackTrace();
    }
  }

  public String fetchBackyardLayouts() {
    String aspx =
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
    String[] dustupRange = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int bunsPercentage = 0;

    for (int i = 0; i < 8; i++) {
      aspx += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String counted = "";

        if (!tushFinery[bunsPercentage].isAccessible()) {
          counted = " booked";
        }

        aspx +=
            "<td class=\"seat"
                + counted
                + "\" data-user=\""
                + tushFinery[bunsPercentage].letSearcherIdentification()
                + "\" data-time=\""
                + tushFinery[bunsPercentage].fetchBeginning()
                + "\" data-row=\""
                + dustupRange[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + bunsPercentage
                + "\">\n"
                + "  <p>"
                + dustupRange[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        bunsPercentage++;
      }
      aspx += "</tr>\n";
    }
    aspx +=
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
    return aspx;
  }

  public static String drawStreamWeek() {
    SimpleDateFormat newbornPaymentFile = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date days = new Date();
    String underbredCalendarDay = newbornPaymentFile.format(days);
    return underbredCalendarDay;
  }
}
