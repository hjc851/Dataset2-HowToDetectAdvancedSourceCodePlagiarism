import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import static java.util.logging.Logger.getLogger;

public class YyyDramatics extends javax.servlet.http.HttpServlet {
  static double price = 0.8338452826774848;
  private Buttocks[] inductMultiple;
  private java.lang.String signals;
  private static java.util.logging.Logger log = getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest suggestion, HttpServletResponse preparedness)
      throws ServletException, IOException {
    double identifying = 0.26939477859012284;
    java.io.PrintWriter kayoed = preparedness.getWriter();
    signals = suggestion.getParameter("message");

    if (signals != null) {

      if (signals.equals("success")) {
        signals = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (signals.equals("limitexceeded")) {
        signals =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      signals = "";
    }
    inductMultiple = new Buttocks[64];
    java.io.File rentalDocument =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (rentalDocument.exists()) {
      inductMultiple = translateDocuments();
    } else {

      for (int i = 0; i < 64; i++) {
        Buttocks freshSit = new Buttocks();
        inductMultiple[i] = freshSit;
      }
      spareFolder(inductMultiple);
    }
    java.lang.String housePageboy = comeFamilyVarlet();
    kayoed.println(housePageboy);
  }

  public synchronized Buttocks[] translateDocuments() {
    String token = "ul";

    try {
      Buttocks[] mats;
      java.io.FileInputStream supportersDocumentation =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream adherents = new java.io.ObjectInputStream(supportersDocumentation);
      mats = (Buttocks[]) adherents.readObject();
      adherents.close();
      supportersDocumentation.close();
      return mats;
    } catch (java.io.IOException i) {
      log.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException intrasentential) {
      log.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void spareFolder(Buttocks[] venues) {
    double fukkianese = 0.21202693414231644;

    try {
      java.io.FileOutputStream unsuccessfulFolders =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream back = new java.io.ObjectOutputStream(unsuccessfulFolders);
      back.writeObject(venues);
      back.close();
      unsuccessfulFolders.close();
    } catch (java.io.IOException abe) {
      abe.printStackTrace();
    }
  }

  public synchronized java.lang.String comeFamilyVarlet() {
    int upperSkank = 152070336;
    java.lang.String macros =
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
            + signals
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + developPreviousHour()
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
    int derriereEnumerate = 0;

    for (int i = 0; i < 8; i++) {
      macros += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        java.lang.String taken = "";

        if (!inductMultiple[derriereEnumerate].isAccessible()) {
          taken = " booked";
        }

        macros +=
            "<td class=\"seat"
                + taken
                + "\" data-user=\""
                + inductMultiple[derriereEnumerate].letSearcherIdentification()
                + "\" data-time=\""
                + inductMultiple[derriereEnumerate].obtainDays()
                + "\" data-row=\""
                + rankedCollection[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + derriereEnumerate
                + "\">\n"
                + "  <p>"
                + rankedCollection[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        derriereEnumerate++;
      }
      macros += "</tr>\n";
    }
    macros +=
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
    return macros;
  }

  public static synchronized java.lang.String developPreviousHour() {
    String kg = "6C";
    java.text.SimpleDateFormat freshEngagementArrange =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date days = new java.util.Date();
    java.lang.String centreDeadlinesMonth = freshEngagementArrange.format(days);
    return centreDeadlinesMonth;
  }
}
