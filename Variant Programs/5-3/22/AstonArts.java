import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class AstonArts extends javax.servlet.http.HttpServlet {
  private Buns[] bottomSpectrum = null;
  private java.lang.String comment = null;
  private static java.util.logging.Logger consignor = null;

  public synchronized void doGet(HttpServletRequest ask, HttpServletResponse reactions)
      throws ServletException, IOException {
    java.io.PrintWriter extinct = reactions.getWriter();
    comment = ask.getParameter("message");

    if (comment != null) {

      if (comment.equals("success")) {
        comment = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (comment.equals("limitexceeded")) {
        comment =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      comment = "";
    }
    bottomSpectrum = new Buns[64];
    java.io.File appointmentReadme =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (appointmentReadme.exists()) {
      bottomSpectrum = writeDatabase();
    } else {

      for (int i = 0; i < 64; i++) {
        Buns untestedBehind = new Buns();
        bottomSpectrum[i] = untestedBehind;
      }
      preventBinder(bottomSpectrum);
    }
    java.lang.String townhouseFront = havePlateSection();
    extinct.println(townhouseFront);
  }

  public synchronized Buns[] writeDatabase() {

    try {
      Buns[] jobs = null;
      java.io.FileInputStream proponentsDatabase =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream cbs = new java.io.ObjectInputStream(proponentsDatabase);
      jobs = (Buns[]) cbs.readObject();
      cbs.close();
      proponentsDatabase.close();
      return jobs;
    } catch (java.io.IOException i) {
      consignor.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException intrasentential) {
      consignor.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void preventBinder(Buns[] pillion) {

    try {
      java.io.FileOutputStream stunnedFolder =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream prohibited = new java.io.ObjectOutputStream(stunnedFolder);
      prohibited.writeObject(pillion);
      prohibited.close();
      stunnedFolder.close();
    } catch (java.io.IOException afterwards) {
      afterwards.printStackTrace();
    }
  }

  public synchronized java.lang.String havePlateSection() {
    java.lang.String aspx =
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
    String[] quarrelAlign = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int sitTotal = 0;

    for (int i = 0; i < 8; i++) {
      aspx += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        java.lang.String confined = "";

        if (!bottomSpectrum[sitTotal].isAccessible()) {
          confined = " booked";
        }

        aspx +=
            "<td class=\"seat"
                + confined
                + "\" data-user=\""
                + bottomSpectrum[sitTotal].haveSubscriberHandle()
                + "\" data-time=\""
                + bottomSpectrum[sitTotal].letHours()
                + "\" data-row=\""
                + quarrelAlign[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + sitTotal
                + "\">\n"
                + "  <p>"
                + quarrelAlign[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        sitTotal++;
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

  public static synchronized java.lang.String driveContinuingAgain() {
    java.text.SimpleDateFormat newfangledCalendarVersion =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date days = new java.util.Date();
    java.lang.String tomcatYearMinutes = newfangledCalendarVersion.format(days);
    return tomcatYearMinutes;
  }

  static {
    consignor = java.util.logging.Logger.getLogger("bensTheatre");
  }
}
