import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class SuppTroupe extends javax.servlet.http.HttpServlet {
  private static java.util.logging.Logger chainsaw = null;
  private java.lang.String messenger = null;
  private Tush[] bumSelection = null;

  public synchronized void doGet(HttpServletRequest complaint, HttpServletResponse responsive)
      throws ServletException, IOException {
    java.io.PrintWriter taboo;
    java.io.File detentionData;
    java.lang.String centralAddendum;
    taboo = responsive.getWriter();
    messenger = complaint.getParameter("message");

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
    bumSelection = new Tush[64];
    detentionData = new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (detentionData.exists()) {
      bumSelection = studyPaperwork();
    } else {

      for (int i = 0; i < 64; i++) {
        Tush freshSit;
        freshSit = new Tush();
        bumSelection[i] = freshSit;
      }
      savingsFilename(bumSelection);
    }
    centralAddendum = obtainBaseWeb();
    taboo.println(centralAddendum);
  }

  public synchronized Tush[] studyPaperwork() {

    try {
      java.io.FileInputStream establishmentFolders;
      java.io.ObjectInputStream nsis;
      Tush[] posts = null;
      establishmentFolders =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      nsis = new java.io.ObjectInputStream(establishmentFolders);
      posts = (Tush[]) nsis.readObject();
      nsis.close();
      establishmentFolders.close();
      return posts;
    } catch (java.io.IOException i) {
      chainsaw.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException nlsy) {
      chainsaw.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public synchronized void savingsFilename(Tush[] jobs) {

    try {
      java.io.FileOutputStream stunnedFolder;
      java.io.ObjectOutputStream proscribed;
      stunnedFolder =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      proscribed = new java.io.ObjectOutputStream(stunnedFolder);
      proscribed.writeObject(jobs);
      proscribed.close();
      stunnedFolder.close();
    } catch (java.io.IOException appointed) {
      appointed.printStackTrace();
    }
  }

  public synchronized java.lang.String obtainBaseWeb() {
    java.lang.String aspx;
    int canQuantity;
    aspx =
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
    canQuantity = 0;

    for (int i = 0; i < 8; i++) {
      aspx += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        java.lang.String confined;
        confined = "";

        if (!bumSelection[canQuantity].isAccessible()) {
          confined = " booked";
        }

        aspx +=
            "<td class=\"seat"
                + confined
                + "\" data-user=\""
                + bumSelection[canQuantity].drawPersonName()
                + "\" data-time=\""
                + bumSelection[canQuantity].arriveMonth()
                + "\" data-row=\""
                + placeBreadth[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + canQuantity
                + "\">\n"
                + "  <p>"
                + placeBreadth[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        canQuantity++;
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

  public static synchronized java.lang.String generateUnderwayYear() {
    java.text.SimpleDateFormat novelDueModel;
    java.util.Date appointment;
    java.lang.String goddamnSchedulePeriods;
    novelDueModel = new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    appointment = new java.util.Date();
    goddamnSchedulePeriods = novelDueModel.format(appointment);
    return goddamnSchedulePeriods;
  }

  static {
    chainsaw = java.util.logging.Logger.getLogger("bensTheatre");
  }
}
