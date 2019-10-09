import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class GarethTheatrical extends javax.servlet.http.HttpServlet {
  public Can[] bumSelection;
  public java.lang.String msg;
  public static java.util.logging.Logger thermometer =
      java.util.logging.Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest bespeak, HttpServletResponse intervention)
      throws ServletException, IOException {
    java.io.PrintWriter unstylish = intervention.getWriter();
    msg = bespeak.getParameter("message");

    if (msg != null) {

      if (msg.equals("success")) {
        msg = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (msg.equals("limitexceeded")) {
        msg =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      msg = "";
    }
    bumSelection = new Can[64];
    java.io.File ticketFolder =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (ticketFolder.exists()) {
      bumSelection = showDocumentation();
    } else {

      for (int i = 0; i < 64; i++) {
        Can novelTooshie = new Can();
        bumSelection[i] = novelTooshie;
      }
      economiseInitiate(bumSelection);
    }
    java.lang.String centralAddendum = catchDomesticSummary();
    unstylish.println(centralAddendum);
  }

  public synchronized Can[] showDocumentation() {

    try {
      Can[] stalls;
      java.io.FileInputStream officeholdersSubmit =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream whys = new java.io.ObjectInputStream(officeholdersSubmit);
      stalls = (Can[]) whys.readObject();
      whys.close();
      officeholdersSubmit.close();
      return stalls;
    } catch (java.io.IOException i) {
      thermometer.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cesium) {
      thermometer.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  public synchronized void economiseInitiate(Can[] chairs) {

    try {
      java.io.FileOutputStream outgoingArchives =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream down = new java.io.ObjectOutputStream(outgoingArchives);
      down.writeObject(chairs);
      down.close();
      outgoingArchives.close();
    } catch (java.io.IOException adult) {
      adult.printStackTrace();
    }
  }

  public synchronized java.lang.String catchDomesticSummary() {
    java.lang.String url =
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
            + msg
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + canExistingYears()
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
    int keisterRoutine = 0;

    for (int i = 0; i < 8; i++) {
      url += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        java.lang.String rented = "";

        if (!bumSelection[keisterRoutine].isAccessible()) {
          rented = " booked";
        }

        url +=
            "<td class=\"seat"
                + rented
                + "\" data-user=\""
                + bumSelection[keisterRoutine].letSearcherIdentification()
                + "\" data-time=\""
                + bumSelection[keisterRoutine].havePeriods()
                + "\" data-row=\""
                + rankedCollection[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + keisterRoutine
                + "\">\n"
                + "  <p>"
                + rankedCollection[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        keisterRoutine++;
      }
      url += "</tr>\n";
    }
    url +=
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
    return url;
  }

  public static synchronized java.lang.String canExistingYears() {
    java.text.SimpleDateFormat greenReceiptConfiguration =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date timing = new java.util.Date();
    java.lang.String damnTimingYear = greenReceiptConfiguration.format(timing);
    return damnTimingYear;
  }
}
