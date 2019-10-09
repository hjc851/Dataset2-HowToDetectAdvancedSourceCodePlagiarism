import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class ReqPlayhouse extends javax.servlet.http.HttpServlet {
  private static java.util.logging.Logger homesteader =
      java.util.logging.Logger.getLogger("bensTheatre");
  private java.lang.String tagline;
  public static int highestLimit = 2022278952;
  private Ass[] fannyPlethora;

  public synchronized void doGet(HttpServletRequest decision, HttpServletResponse answers)
      throws ServletException, IOException {
    int sense;
    java.io.PrintWriter unconscious;
    java.io.File venuePapers;
    java.lang.String dwellingHomepage;
    sense = 1072226033;
    unconscious = answers.getWriter();
    tagline = decision.getParameter("message");

    if (tagline != null) {

      if (tagline.equals("success")) {
        tagline = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (tagline.equals("limitexceeded")) {
        tagline =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      tagline = "";
    }
    fannyPlethora = new Ass[64];
    venuePapers = new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (venuePapers.exists()) {
      fannyPlethora = hearBinder();
    } else {

      for (int i = 0; i < 64; i++) {
        Ass greenTail;
        greenTail = new Ass();
        fannyPlethora[i] = greenTail;
      }
      protectComplaint(fannyPlethora);
    }
    dwellingHomepage = takeDomicileSite();
    unconscious.println(dwellingHomepage);
  }

  public synchronized Ass[] hearBinder() {
    double bundle;
    bundle = 0.9178763841709784;

    try {
      java.io.FileInputStream immigrationFolder;
      java.io.ObjectInputStream nih;
      Ass[] passengers;
      immigrationFolder =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      nih = new java.io.ObjectInputStream(immigrationFolder);
      passengers = (Ass[]) nih.readObject();
      nih.close();
      immigrationFolder.close();
      return passengers;
    } catch (java.io.IOException i) {
      homesteader.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cesium) {
      homesteader.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  public synchronized void protectComplaint(Ass[] venues) {
    double highestBandwidth;
    highestBandwidth = 0.6045190667188953;

    try {
      java.io.FileOutputStream tabooApplication;
      java.io.ObjectOutputStream prohibited;
      tabooApplication =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      prohibited = new java.io.ObjectOutputStream(tabooApplication);
      prohibited.writeObject(venues);
      prohibited.close();
      tabooApplication.close();
    } catch (java.io.IOException eden) {
      eden.printStackTrace();
    }
  }

  public synchronized java.lang.String takeDomicileSite() {
    int esteem;
    java.lang.String jpg;
    int bottomCaseload;
    esteem = 1956675524;
    jpg =
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
            + tagline
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + catchRifeWhen()
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
    bottomCaseload = 0;

    for (int i = 0; i < 8; i++) {
      jpg += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        java.lang.String arranged;
        arranged = "";

        if (!fannyPlethora[bottomCaseload].isAccessible()) {
          arranged = " booked";
        }

        jpg +=
            "<td class=\"seat"
                + arranged
                + "\" data-user=\""
                + fannyPlethora[bottomCaseload].findLoginIdentifier()
                + "\" data-time=\""
                + fannyPlethora[bottomCaseload].havePeriods()
                + "\" data-row=\""
                + seriesMultitude[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + bottomCaseload
                + "\">\n"
                + "  <p>"
                + seriesMultitude[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        bottomCaseload++;
      }
      jpg += "</tr>\n";
    }
    jpg +=
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
    return jpg;
  }

  public static synchronized java.lang.String catchRifeWhen() {
    int upperSkank;
    java.text.SimpleDateFormat newfangledCalendarVersion;
    java.util.Date see;
    java.lang.String heartCommencementNow;
    upperSkank = -1895306073;
    newfangledCalendarVersion = new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    see = new java.util.Date();
    heartCommencementNow = newfangledCalendarVersion.format(see);
    return heartCommencementNow;
  }
}
