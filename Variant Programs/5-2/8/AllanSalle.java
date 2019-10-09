import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class AllanSalle extends javax.servlet.http.HttpServlet {
  private Buttocks[] sternArsenal;
  private java.lang.String messenger;
  private static java.util.logging.Logger forester =
      java.util.logging.Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest asked, HttpServletResponse reacted)
      throws ServletException, IOException {
    java.io.PrintWriter unsuccessful = reacted.getWriter();
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
    sternArsenal = new Buttocks[64];
    java.io.File reservingDocuments =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (reservingDocuments.exists()) {
      sternArsenal = tellReadme();
    } else {

      for (int i = 0; i < 64; i++) {
        Buttocks newlyRear = new Buttocks();
        sternArsenal[i] = newlyRear;
      }
      deliverDocument(sternArsenal);
    }
    java.lang.String baseWeb = havePlateSection();
    unsuccessful.println(baseWeb);
  }

  public Buttocks[] tellReadme() {

    try {
      Buttocks[] venues;
      java.io.FileInputStream immigrationFolder =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream nsis = new java.io.ObjectInputStream(immigrationFolder);
      venues = (Buttocks[]) nsis.readObject();
      nsis.close();
      immigrationFolder.close();
      return venues;
    } catch (java.io.IOException i) {
      forester.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException nlsy) {
      forester.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public void deliverDocument(Buttocks[] tickets) {

    try {
      java.io.FileOutputStream impossibleDocuments =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream down = new java.io.ObjectOutputStream(impossibleDocuments);
      down.writeObject(tickets);
      down.close();
      impossibleDocuments.close();
    } catch (java.io.IOException con) {
      con.printStackTrace();
    }
  }

  public java.lang.String havePlateSection() {
    java.lang.String browser =
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
            + sustainThisThing()
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
    int bunsPercentage = 0;

    for (int i = 0; i < 8; i++) {
      browser += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        java.lang.String arrested = "";

        if (!sternArsenal[bunsPercentage].isAccessible()) {
          arrested = " booked";
        }

        browser +=
            "<td class=\"seat"
                + arrested
                + "\" data-user=\""
                + sternArsenal[bunsPercentage].takeUsageFinger()
                + "\" data-time=\""
                + sternArsenal[bunsPercentage].findSentence()
                + "\" data-row=\""
                + quarrelAlign[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + bunsPercentage
                + "\">\n"
                + "  <p>"
                + quarrelAlign[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        bunsPercentage++;
      }
      browser += "</tr>\n";
    }
    browser +=
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
    return browser;
  }

  public static java.lang.String sustainThisThing() {
    java.text.SimpleDateFormat earlyBeginningArrangement =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date escort = new java.util.Date();
    java.lang.String essenceUpdateHour = earlyBeginningArrangement.format(escort);
    return essenceUpdateHour;
  }
}
