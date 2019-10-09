import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class VeleOpera extends javax.servlet.http.HttpServlet {
  public static java.util.logging.Logger forestry =
      java.util.logging.Logger.getLogger("bensTheatre");
  public java.lang.String substance;
  public Bottom[] placeAlign;

  public synchronized void doGet(HttpServletRequest quest, HttpServletResponse reception)
      throws ServletException, IOException {
    java.io.PrintWriter dead;
    java.io.File ticketFolder;
    java.lang.String placeText;
    dead = reception.getWriter();
    substance = quest.getParameter("message");

    if (substance != null) {

      if (substance.equals("success")) {
        substance = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (substance.equals("limitexceeded")) {
        substance =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      substance = "";
    }
    placeAlign = new Bottom[64];
    ticketFolder = new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (ticketFolder.exists()) {
      placeAlign = showDocumentation();
    } else {

      for (int i = 0; i < 64; i++) {
        Bottom radicalPosterior;
        radicalPosterior = new Bottom();
        placeAlign[i] = radicalPosterior;
      }
      redeemDocuments(placeAlign);
    }
    placeText = arriveInteriorPagination();
    dead.println(placeText);
  }

  public synchronized Bottom[] showDocumentation() {

    try {
      java.io.FileInputStream supportersDocumentation;
      java.io.ObjectInputStream incumbents;
      Bottom[] member;
      supportersDocumentation =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      incumbents = new java.io.ObjectInputStream(supportersDocumentation);
      member = (Bottom[]) incumbents.readObject();
      incumbents.close();
      supportersDocumentation.close();
      return member;
    } catch (java.io.IOException i) {
      forestry.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException caesium) {
      forestry.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public synchronized void redeemDocuments(Bottom[] constituencies) {

    try {
      java.io.FileOutputStream unstylishPaperwork;
      java.io.ObjectOutputStream outer;
      unstylishPaperwork =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      outer = new java.io.ObjectOutputStream(unstylishPaperwork);
      outer.writeObject(constituencies);
      outer.close();
      unstylishPaperwork.close();
    } catch (java.io.IOException afterwards) {
      afterwards.printStackTrace();
    }
  }

  public synchronized java.lang.String arriveInteriorPagination() {
    java.lang.String jpg;
    int bottomCaseload;
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
            + substance
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
    String[] penaltyPalette = {"A", "B", "C", "D", "E", "F", "G", "H"};
    bottomCaseload = 0;

    for (int i = 0; i < 8; i++) {
      jpg += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        java.lang.String attributed;
        attributed = "";

        if (!placeAlign[bottomCaseload].isAccessible()) {
          attributed = " booked";
        }

        jpg +=
            "<td class=\"seat"
                + attributed
                + "\" data-user=\""
                + placeAlign[bottomCaseload].becomeUsePhoto()
                + "\" data-time=\""
                + placeAlign[bottomCaseload].findSentence()
                + "\" data-row=\""
                + penaltyPalette[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + bottomCaseload
                + "\">\n"
                + "  <p>"
                + penaltyPalette[i]
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
    java.text.SimpleDateFormat untestedDeadlineApproach;
    java.util.Date receipt;
    java.lang.String midstUpdatedOpportunity;
    untestedDeadlineApproach = new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    receipt = new java.util.Date();
    midstUpdatedOpportunity = untestedDeadlineApproach.format(receipt);
    return midstUpdatedOpportunity;
  }
}
