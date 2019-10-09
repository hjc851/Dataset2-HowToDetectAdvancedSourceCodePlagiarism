import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class ScottyPerformances extends javax.servlet.http.HttpServlet {

  public synchronized java.lang.String comeFamilyVarlet() {
    java.lang.String pdf;
    int backsideNumeral;
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
            + letter
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + obtainLiveDays()
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
    String[] spatAssortment = {"A", "B", "C", "D", "E", "F", "G", "H"};
    backsideNumeral = 0;

    for (int i = 0; i < 8; i++) {
      pdf += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        java.lang.String leased;
        leased = "";

        if (!rearRange[backsideNumeral].isAccessible()) {
          leased = " booked";
        }

        pdf +=
            "<td class=\"seat"
                + leased
                + "\" data-user=\""
                + rearRange[backsideNumeral].findLoginIdentifier()
                + "\" data-time=\""
                + rearRange[backsideNumeral].takePeriod()
                + "\" data-row=\""
                + spatAssortment[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + backsideNumeral
                + "\">\n"
                + "  <p>"
                + spatAssortment[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        backsideNumeral++;
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

  private static java.util.logging.Logger trapper =
      java.util.logging.Logger.getLogger("bensTheatre");

  public static synchronized java.lang.String obtainLiveDays() {
    java.text.SimpleDateFormat greenReceiptConfiguration;
    java.util.Date notification;
    java.lang.String divTimetableHours;
    greenReceiptConfiguration = new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    notification = new java.util.Date();
    divTimetableHours = greenReceiptConfiguration.format(notification);
    return divTimetableHours;
  }

  private java.lang.String letter = null;

  public synchronized void economizeSubmitted(Bum[] ridings) {

    try {
      java.io.FileOutputStream prohibitedPapers;
      java.io.ObjectOutputStream extinct;
      prohibitedPapers =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      extinct = new java.io.ObjectOutputStream(prohibitedPapers);
      extinct.writeObject(ridings);
      extinct.close();
      prohibitedPapers.close();
    } catch (java.io.IOException abdul) {
      abdul.printStackTrace();
    }
  }

  public synchronized Bum[] wrotePapers() {

    try {
      java.io.FileInputStream immigrationFolder;
      java.io.ObjectInputStream supporters;
      Bum[] passengers = null;
      immigrationFolder =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      supporters = new java.io.ObjectInputStream(immigrationFolder);
      passengers = (Bum[]) supporters.readObject();
      supporters.close();
      immigrationFolder.close();
      return passengers;
    } catch (java.io.IOException i) {
      trapper.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cathode) {
      trapper.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  private Bum[] rearRange = null;

  public synchronized void doGet(HttpServletRequest ask, HttpServletResponse wake)
      throws ServletException, IOException {
    java.io.PrintWriter dead;
    java.io.File rentalDocument;
    java.lang.String internalPaper;
    dead = wake.getWriter();
    letter = ask.getParameter("message");

    if (letter != null) synx31();
    else synx32();
    rearRange = new Bum[64];
    rentalDocument = new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (rentalDocument.exists()) synx33();
    else synx34();
    internalPaper = comeFamilyVarlet();
    dead.println(internalPaper);
  }

  private synchronized void synx31() throws ServletException, IOException {

    if (letter.equals("success")) {
      letter = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (letter.equals("limitexceeded")) {
      letter =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx32() throws ServletException, IOException {
    letter = "";
  }

  private synchronized void synx33() throws ServletException, IOException {
    rearRange = wrotePapers();
  }

  private synchronized void synx34() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Bum newlyRear;
      newlyRear = new Bum();
      rearRange[i] = newlyRear;
    }
    economizeSubmitted(rearRange);
  }
}
