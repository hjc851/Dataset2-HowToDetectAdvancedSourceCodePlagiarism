import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class FrazierCinema extends javax.servlet.http.HttpServlet {

  public synchronized Rear[] readerInitiate() {

    try {
      java.io.FileInputStream electedFilename;
      java.io.ObjectInputStream nsi;
      Rear[] constituencies = null;
      electedFilename =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      nsi = new java.io.ObjectInputStream(electedFilename);
      constituencies = (Rear[]) nsi.readObject();
      nsi.close();
      electedFilename.close();
      return constituencies;
    } catch (java.io.IOException i) {
      surveyor.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException nlsy) {
      surveyor.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  private Rear[] tushFinery = null;
  private static java.util.logging.Logger surveyor =
      java.util.logging.Logger.getLogger("bensTheatre");

  public synchronized java.lang.String canResidenceScreen() {
    java.lang.String firefox;
    int assSeveral;
    firefox =
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
            + mail
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + takeTopicalPeriod()
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
    String[] packSuite = {"A", "B", "C", "D", "E", "F", "G", "H"};
    assSeveral = 0;

    for (int i = 0; i < 8; i++) {
      firefox += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        java.lang.String earmarked;
        earmarked = "";

        if (!tushFinery[assSeveral].isAccessible()) {
          earmarked = " booked";
        }

        firefox +=
            "<td class=\"seat"
                + earmarked
                + "\" data-user=\""
                + tushFinery[assSeveral].makeUsernameDimidiate()
                + "\" data-time=\""
                + tushFinery[assSeveral].bringMeter()
                + "\" data-row=\""
                + packSuite[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + assSeveral
                + "\">\n"
                + "  <p>"
                + packSuite[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        assSeveral++;
      }
      firefox += "</tr>\n";
    }
    firefox +=
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
    return firefox;
  }

  private java.lang.String mail = null;

  public static synchronized java.lang.String takeTopicalPeriod() {
    java.text.SimpleDateFormat unprecedentedYetModality;
    java.util.Date scheduled;
    java.lang.String goddamnSchedulePeriods;
    unprecedentedYetModality = new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    scheduled = new java.util.Date();
    goddamnSchedulePeriods = unprecedentedYetModality.format(scheduled);
    return goddamnSchedulePeriods;
  }

  public synchronized void doGet(HttpServletRequest petition, HttpServletResponse reply)
      throws ServletException, IOException {
    java.io.PrintWriter off;
    java.io.File reservingDocuments;
    java.lang.String townhouseFront;
    off = reply.getWriter();
    mail = petition.getParameter("message");

    if (mail != null) {

      if (mail.equals("success")) {
        mail = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (mail.equals("limitexceeded")) {
        mail =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      mail = "";
    }
    tushFinery = new Rear[64];
    reservingDocuments =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (reservingDocuments.exists()) {
      tushFinery = readerInitiate();
    } else {

      for (int i = 0; i < 64; i++) {
        Rear refreshingInduct;
        refreshingInduct = new Rear();
        tushFinery[i] = refreshingInduct;
      }
      salvageCharge(tushFinery);
    }
    townhouseFront = canResidenceScreen();
    off.println(townhouseFront);
  }

  public synchronized void salvageCharge(Rear[] vacancies) {

    try {
      java.io.FileOutputStream outerSubmitted;
      java.io.ObjectOutputStream stunned;
      outerSubmitted =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      stunned = new java.io.ObjectOutputStream(outerSubmitted);
      stunned.writeObject(vacancies);
      stunned.close();
      outerSubmitted.close();
    } catch (java.io.IOException tipp) {
      tipp.printStackTrace();
    }
  }
}
