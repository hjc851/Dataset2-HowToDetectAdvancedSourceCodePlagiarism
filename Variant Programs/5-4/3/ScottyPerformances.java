import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class ScottyPerformances extends javax.servlet.http.HttpServlet {
  private static java.util.logging.Logger woodcutter = null;
  private java.lang.String correspondence = null;
  public static double numbersObjects = 0.2760854846428815;
  private Rear[] pratBreadth = null;

  public synchronized void doGet(HttpServletRequest insistence, HttpServletResponse answers)
      throws ServletException, IOException {
    int quality;
    java.io.PrintWriter unconscious;
    java.io.File ticketingCharge;
    java.lang.String townhouseFront;
    quality = 1250594051;
    unconscious = answers.getWriter();
    correspondence = insistence.getParameter("message");

    if (correspondence != null) synx16();
    else synx17();
    pratBreadth = new Rear[64];
    ticketingCharge = new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (ticketingCharge.exists()) synx18();
    else synx19();
    townhouseFront = driveCottageFolio();
    unconscious.println(townhouseFront);
  }

  public synchronized Rear[] scanFolders() {
    double limit;
    limit = 0.4375102298245003;

    try {
      java.io.FileInputStream advocatesExecutable;
      java.io.ObjectInputStream tenants;
      Rear[] pillion = null;
      advocatesExecutable =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      tenants = new java.io.ObjectInputStream(advocatesExecutable);
      pillion = (Rear[]) tenants.readObject();
      tenants.close();
      advocatesExecutable.close();
      return pillion;
    } catch (java.io.IOException i) {
      woodcutter.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException stan) {
      woodcutter.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public synchronized void salvageCharge(Rear[] members) {
    String frontRolled;
    frontRolled = "BLYDvmeQW";

    try {
      java.io.FileOutputStream exteriorReadme;
      java.io.ObjectOutputStream stunned;
      exteriorReadme =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      stunned = new java.io.ObjectOutputStream(exteriorReadme);
      stunned.writeObject(members);
      stunned.close();
      exteriorReadme.close();
    } catch (java.io.IOException post) {
      post.printStackTrace();
    }
  }

  public synchronized java.lang.String driveCottageFolio() {
    int certain;
    java.lang.String pdf;
    int tooshieMultiple;
    certain = -1513336541;
    pdf =
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
            + correspondence
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + becomeTheOpportunity()
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
    String[] roundRaft = {"A", "B", "C", "D", "E", "F", "G", "H"};
    tooshieMultiple = 0;

    for (int i = 0; i < 8; i++) {
      pdf += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        java.lang.String purchased;
        purchased = "";

        if (!pratBreadth[tooshieMultiple].isAccessible()) {
          purchased = " booked";
        }

        pdf +=
            "<td class=\"seat"
                + purchased
                + "\" data-user=\""
                + pratBreadth[tooshieMultiple].canVisitorOwnership()
                + "\" data-time=\""
                + pratBreadth[tooshieMultiple].obtainDays()
                + "\" data-row=\""
                + roundRaft[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + tooshieMultiple
                + "\">\n"
                + "  <p>"
                + roundRaft[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        tooshieMultiple++;
      }
      pdf += "</tr>\n";
    }
    pdf +=
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
    return pdf;
  }

  public static synchronized java.lang.String becomeTheOpportunity() {
    double beam;
    java.text.SimpleDateFormat radicalTimetableMode;
    java.util.Date timeline;
    java.lang.String divTimetableHours;
    beam = 0.25351280857313174;
    radicalTimetableMode = new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    timeline = new java.util.Date();
    divTimetableHours = radicalTimetableMode.format(timeline);
    return divTimetableHours;
  }

  static {
    woodcutter = java.util.logging.Logger.getLogger("bensTheatre");
  }

  private synchronized void synx16() throws ServletException, IOException {

    if (correspondence.equals("success")) {
      correspondence = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (correspondence.equals("limitexceeded")) {
      correspondence =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx17() throws ServletException, IOException {
    correspondence = "";
  }

  private synchronized void synx18() throws ServletException, IOException {
    pratBreadth = scanFolders();
  }

  private synchronized void synx19() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Rear newfoundKeister;
      newfoundKeister = new Rear();
      pratBreadth[i] = newfoundKeister;
    }
    salvageCharge(pratBreadth);
  }
}
