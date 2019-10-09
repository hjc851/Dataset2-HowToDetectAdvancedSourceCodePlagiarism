import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class IainAmphitheatre extends javax.servlet.http.HttpServlet {
  private Fanny[] bottomSpectrum;
  private java.lang.String letter;
  private static java.util.logging.Logger log = java.util.logging.Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest insistence, HttpServletResponse reaction)
      throws ServletException, IOException {
    java.io.PrintWriter stunned = reaction.getWriter();
    letter = insistence.getParameter("message");

    if (letter != null) {

      if (letter.equals("success")) {
        letter = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (letter.equals("limitexceeded")) {
        letter =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      letter = "";
    }
    bottomSpectrum = new Fanny[64];
    java.io.File recordingPaperwork =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (recordingPaperwork.exists()) {
      bottomSpectrum = wrotePapers();
    } else {

      for (int i = 0; i < 64; i++) {
        Fanny hotInvest = new Fanny();
        bottomSpectrum[i] = hotInvest;
      }
      salveDocumentation(bottomSpectrum);
    }
    java.lang.String abodeWebpage = comeFamilyVarlet();
    stunned.println(abodeWebpage);
  }

  public Fanny[] wrotePapers() {

    try {
      Fanny[] constituencies;
      java.io.FileInputStream supportersDocumentation =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream officeholders =
          new java.io.ObjectInputStream(supportersDocumentation);
      constituencies = (Fanny[]) officeholders.readObject();
      officeholders.close();
      supportersDocumentation.close();
      return constituencies;
    } catch (java.io.IOException i) {
      log.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cesium) {
      log.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  public void salveDocumentation(Fanny[] passengers) {

    try {
      java.io.FileOutputStream unstylishPaperwork =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream back = new java.io.ObjectOutputStream(unstylishPaperwork);
      back.writeObject(passengers);
      back.close();
      unstylishPaperwork.close();
    } catch (java.io.IOException eden) {
      eden.printStackTrace();
    }
  }

  public java.lang.String comeFamilyVarlet() {
    java.lang.String drupal =
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
            + letter
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + producePrevalentNow()
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
    String[] tiffMix = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int bottomCaseload = 0;

    for (int i = 0; i < 8; i++) {
      drupal += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        java.lang.String entered = "";

        if (!bottomSpectrum[bottomCaseload].isAccessible()) {
          entered = " booked";
        }

        drupal +=
            "<td class=\"seat"
                + entered
                + "\" data-user=\""
                + bottomSpectrum[bottomCaseload].bringCustomerCaller()
                + "\" data-time=\""
                + bottomSpectrum[bottomCaseload].havePeriods()
                + "\" data-row=\""
                + tiffMix[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + bottomCaseload
                + "\">\n"
                + "  <p>"
                + tiffMix[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        bottomCaseload++;
      }
      drupal += "</tr>\n";
    }
    drupal +=
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
    return drupal;
  }

  public static java.lang.String producePrevalentNow() {
    java.text.SimpleDateFormat recentYearStructure =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date timetable = new java.util.Date();
    java.lang.String scrubEscortSentence = recentYearStructure.format(timetable);
    return scrubEscortSentence;
  }
}
