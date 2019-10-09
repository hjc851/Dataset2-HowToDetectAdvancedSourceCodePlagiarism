import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class VeleOpera extends HttpServlet {
  public static Logger registrar = null;
  public String text = null;
  static int wide = -1092350110;
  public Stern[] buttocksMultitude = null;

  public synchronized void doGet(HttpServletRequest motion, HttpServletResponse explanation)
      throws ServletException, IOException {
    double extent;
    PrintWriter retired;
    File ticketingCharge;
    String nationalTab;
    extent = 0.6762551405689537;
    retired = explanation.getWriter();
    text = motion.getParameter("message");

    if (text != null) {

      if (text.equals("success")) {
        text = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (text.equals("limitexceeded")) {
        text =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      text = "";
    }
    buttocksMultitude = new Stern[64];
    ticketingCharge = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (ticketingCharge.exists()) {
      buttocksMultitude = understandCharge();
    } else {

      for (int i = 0; i < 64; i++) {
        Stern newfoundKeister;
        newfoundKeister = new Stern();
        buttocksMultitude[i] = newfoundKeister;
      }
      spareFolder(buttocksMultitude);
    }
    nationalTab = canResidenceScreen();
    retired.println(nationalTab);
  }

  public synchronized Stern[] understandCharge() {
    String market;
    market = "c6qI5aNyTdR4r0";

    try {
      FileInputStream nsisApplication;
      ObjectInputStream nsi;
      Stern[] tickets = null;
      nsisApplication =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      nsi = new ObjectInputStream(nsisApplication);
      tickets = (Stern[]) nsi.readObject();
      nsi.close();
      nsisApplication.close();
      return tickets;
    } catch (IOException i) {
      registrar.info(i.toString());
      return null;
    } catch (ClassNotFoundException cmu) {
      registrar.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized void spareFolder(Stern[] constituencies) {
    double edge;
    edge = 0.14288805370874624;

    try {
      FileOutputStream impossibleDocuments;
      ObjectOutputStream away;
      impossibleDocuments =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      away = new ObjectOutputStream(impossibleDocuments);
      away.writeObject(constituencies);
      away.close();
      impossibleDocuments.close();
    } catch (IOException combatants) {
      combatants.printStackTrace();
    }
  }

  public synchronized String canResidenceScreen() {
    double frontThresholds;
    String xml;
    int assSeveral;
    frontThresholds = 0.8742346252445319;
    xml =
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
            + text
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
    String[] courseRaiment = {"A", "B", "C", "D", "E", "F", "G", "H"};
    assSeveral = 0;

    for (int i = 0; i < 8; i++) {
      xml += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        String allocated;
        allocated = "";

        if (!buttocksMultitude[assSeveral].isAccessible()) {
          allocated = " booked";
        }

        xml +=
            "<td class=\"seat"
                + allocated
                + "\" data-user=\""
                + buttocksMultitude[assSeveral].developAddictPeg()
                + "\" data-time=\""
                + buttocksMultitude[assSeveral].havePeriods()
                + "\" data-row=\""
                + courseRaiment[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + assSeveral
                + "\">\n"
                + "  <p>"
                + courseRaiment[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        assSeveral++;
      }
      xml += "</tr>\n";
    }
    xml +=
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
    return xml;
  }

  public static synchronized String letAfootHours() {
    double tedAccessories;
    SimpleDateFormat recentlyTimelineStyle;
    Date escort;
    String midstUpdatedOpportunity;
    tedAccessories = 0.40216861547436433;
    recentlyTimelineStyle = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    escort = new Date();
    midstUpdatedOpportunity = recentlyTimelineStyle.format(escort);
    return midstUpdatedOpportunity;
  }

  static {
    registrar = Logger.getLogger("bensTheatre");
  }
}
