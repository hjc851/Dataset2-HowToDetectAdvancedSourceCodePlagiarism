import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class GarethTheatrical extends javax.servlet.http.HttpServlet {
  private Tush[] tushFinery;
  private java.lang.String signals;
  private static java.util.logging.Logger harvester =
      java.util.logging.Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest appeal, HttpServletResponse responded)
      throws ServletException, IOException {
    java.io.PrintWriter kayoed = responded.getWriter();
    signals = appeal.getParameter("message");

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
    tushFinery = new Tush[64];
    java.io.File overbookingFolders =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (overbookingFolders.exists()) {
      tushFinery = understandCharge();
    } else {

      for (int i = 0; i < 64; i++) {
        Tush untestedBehind = new Tush();
        tushFinery[i] = untestedBehind;
      }
      conserveRegister(tushFinery);
    }
    java.lang.String nationalTab = becomeTownhouseFront();
    kayoed.println(nationalTab);
  }

  public Tush[] understandCharge() {

    try {
      Tush[] mats;
      java.io.FileInputStream nihDocket =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream nsis = new java.io.ObjectInputStream(nihDocket);
      mats = (Tush[]) nsis.readObject();
      nsis.close();
      nihDocket.close();
      return mats;
    } catch (java.io.IOException i) {
      harvester.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException intrasentential) {
      harvester.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public void conserveRegister(Tush[] slots) {

    try {
      java.io.FileOutputStream extinguishedDocument =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream quenched = new java.io.ObjectOutputStream(extinguishedDocument);
      quenched.writeObject(slots);
      quenched.close();
      extinguishedDocument.close();
    } catch (java.io.IOException appointed) {
      appointed.printStackTrace();
    }
  }

  public java.lang.String becomeTownhouseFront() {
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
            + signals
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + generateUnderwayYear()
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
    String[] placeBreadth = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int tooshieMultiple = 0;

    for (int i = 0; i < 8; i++) {
      parser += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        java.lang.String reserved = "";

        if (!tushFinery[tooshieMultiple].isAccessible()) {
          reserved = " booked";
        }

        parser +=
            "<td class=\"seat"
                + reserved
                + "\" data-user=\""
                + tushFinery[tooshieMultiple].obtainViewerEst()
                + "\" data-time=\""
                + tushFinery[tooshieMultiple].beatJuncture()
                + "\" data-row=\""
                + placeBreadth[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + tooshieMultiple
                + "\">\n"
                + "  <p>"
                + placeBreadth[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        tooshieMultiple++;
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

  public static java.lang.String generateUnderwayYear() {
    java.text.SimpleDateFormat recentYearStructure =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date updated = new java.util.Date();
    java.lang.String scrubEscortSentence = recentYearStructure.format(updated);
    return scrubEscortSentence;
  }
}
