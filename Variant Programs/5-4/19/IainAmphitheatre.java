import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class IainAmphitheatre extends javax.servlet.http.HttpServlet {
  private Can[] bottomSpectrum;
  private java.lang.String messenger;
  private static java.util.logging.Logger surveyor;

  public synchronized void doGet(HttpServletRequest asked, HttpServletResponse explanation)
      throws ServletException, IOException {
    java.io.PrintWriter away = explanation.getWriter();
    messenger = asked.getParameter("message");

    if (messenger != null) {

      if (messenger.equals("success")) {
        messenger = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (messenger.equals("limitexceeded")) {
        messenger =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      messenger = "";
    }
    bottomSpectrum = new Can[64];
    java.io.File reservationsSubmit =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (reservationsSubmit.exists()) {
      bottomSpectrum = studyPaperwork();
    } else {

      for (int i = 0; i < 64; i++) {
        Can revolutionaryRump = new Can();
        bottomSpectrum[i] = revolutionaryRump;
      }
      savingsFilename(bottomSpectrum);
    }
    java.lang.String domesticSummary = sustainBackTable();
    away.println(domesticSummary);
  }

  public synchronized Can[] studyPaperwork() {

    try {
      Can[] vacancies;
      java.io.FileInputStream detailsSubmitted =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream nsis = new java.io.ObjectInputStream(detailsSubmitted);
      vacancies = (Can[]) nsis.readObject();
      nsis.close();
      detailsSubmitted.close();
      return vacancies;
    } catch (java.io.IOException i) {
      surveyor.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cathode) {
      surveyor.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public synchronized void savingsFilename(Can[] pillion) {

    try {
      java.io.FileOutputStream kayoedDocket =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream quenched = new java.io.ObjectOutputStream(kayoedDocket);
      quenched.writeObject(pillion);
      quenched.close();
      kayoedDocket.close();
    } catch (java.io.IOException eden) {
      eden.printStackTrace();
    }
  }

  public synchronized java.lang.String sustainBackTable() {
    java.lang.String parser =
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
            + messenger
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
    String[] successionPlethora = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int bunsPercentage = 0;

    for (int i = 0; i < 8; i++) {
      parser += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        java.lang.String listed = "";

        if (!bottomSpectrum[bunsPercentage].isAccessible()) {
          listed = " booked";
        }

        parser +=
            "<td class=\"seat"
                + listed
                + "\" data-user=\""
                + bottomSpectrum[bunsPercentage].findLoginIdentifier()
                + "\" data-time=\""
                + bottomSpectrum[bunsPercentage].catchWhen()
                + "\" data-row=\""
                + successionPlethora[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + bunsPercentage
                + "\">\n"
                + "  <p>"
                + successionPlethora[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        bunsPercentage++;
      }
      parser += "</tr>\n";
    }
    parser +=
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
    return parser;
  }

  public static synchronized java.lang.String becomeTheOpportunity() {
    java.text.SimpleDateFormat greenReceiptConfiguration =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date timeframe = new java.util.Date();
    java.lang.String tomcatYearMinutes = greenReceiptConfiguration.format(timeframe);
    return tomcatYearMinutes;
  }

  static {
    surveyor = java.util.logging.Logger.getLogger("bensTheatre");
  }
}
