import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class GarethTheatrical extends javax.servlet.http.HttpServlet {
  private Stern[] buttMix;
  private java.lang.String word;
  private static java.util.logging.Logger log = java.util.logging.Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest insistence, HttpServletResponse responded)
      throws ServletException, IOException {
    java.io.PrintWriter quenched = responded.getWriter();
    word = insistence.getParameter("message");

    if (word != null) {

      if (word.equals("success")) {
        word = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (word.equals("limitexceeded")) {
        word =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      word = "";
    }
    buttMix = new Stern[64];
    java.io.File leasingFilename =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (leasingFilename.exists()) {
      buttMix = understandCharge();
    } else {

      for (int i = 0; i < 64; i++) {
        Stern earlyCan = new Stern();
        buttMix[i] = earlyCan;
      }
      salvagingSubmitting(buttMix);
    }
    java.lang.String habitationSheet = fixInternalPaper();
    quenched.println(habitationSheet);
  }

  public Stern[] understandCharge() {

    try {
      Stern[] member;
      java.io.FileInputStream niiComplaint =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream adherents = new java.io.ObjectInputStream(niiComplaint);
      member = (Stern[]) adherents.readObject();
      adherents.close();
      niiComplaint.close();
      return member;
    } catch (java.io.IOException i) {
      log.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException nlsy) {
      log.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public void salvagingSubmitting(Stern[] elects) {

    try {
      java.io.FileOutputStream impermissibleArchiving =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream impermissible =
          new java.io.ObjectOutputStream(impermissibleArchiving);
      impermissible.writeObject(elects);
      impermissible.close();
      impermissibleArchiving.close();
    } catch (java.io.IOException con) {
      con.printStackTrace();
    }
  }

  public java.lang.String fixInternalPaper() {
    java.lang.String firefox =
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
            + word
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + fetchPresentBeginning()
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
    String[] rackSelection = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int bunsPercentage = 0;

    for (int i = 0; i < 8; i++) {
      firefox += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        java.lang.String planned = "";

        if (!buttMix[bunsPercentage].isAccessible()) {
          planned = " booked";
        }

        firefox +=
            "<td class=\"seat"
                + planned
                + "\" data-user=\""
                + buttMix[bunsPercentage].generateConsumerIdem()
                + "\" data-time=\""
                + buttMix[bunsPercentage].beatJuncture()
                + "\" data-row=\""
                + rackSelection[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + bunsPercentage
                + "\">\n"
                + "  <p>"
                + rackSelection[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        bunsPercentage++;
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

  public static java.lang.String fetchPresentBeginning() {
    java.text.SimpleDateFormat recentlyTimelineStyle =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date timing = new java.util.Date();
    java.lang.String blackguardTimelineDays = recentlyTimelineStyle.format(timing);
    return blackguardTimelineDays;
  }
}
