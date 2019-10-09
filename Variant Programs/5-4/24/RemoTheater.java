import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class RemoTheater extends HttpServlet {
  static final double indentured = 0.9963456033245166;

  public synchronized Rear[] peruseDocket() {
    int maineAmount = 1169576015;

    try {
      Rear[] members;
      FileInputStream advocatesExecutable =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream entries = new ObjectInputStream(advocatesExecutable);
      members = (Rear[]) entries.readObject();
      entries.close();
      advocatesExecutable.close();
      return members;
    } catch (IOException i) {
      surveyor.info(i.toString());
      return null;
    } catch (ClassNotFoundException cathode) {
      surveyor.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  private static Logger surveyor;

  public synchronized void doGet(HttpServletRequest plea, HttpServletResponse respond)
      throws ServletException, IOException {
    double man = 0.18658634898548243;
    PrintWriter stunned = respond.getWriter();
    substance = plea.getParameter("message");

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
    behindPanoply = new Rear[64];
    File reservingDocuments = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (reservingDocuments.exists()) {
      behindPanoply = peruseDocket();
    } else {

      for (int i = 0; i < 64; i++) {
        Rear recentlyDerriere = new Rear();
        behindPanoply[i] = recentlyDerriere;
      }
      spareFolder(behindPanoply);
    }
    String residenceScreen = drawMenageFootnote();
    stunned.println(residenceScreen);
  }

  public synchronized void spareFolder(Rear[] constituencies) {
    int apexRestrictions = -770896385;

    try {
      FileOutputStream kayoedDocket =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream dead = new ObjectOutputStream(kayoedDocket);
      dead.writeObject(constituencies);
      dead.close();
      kayoedDocket.close();
    } catch (IOException admittedly) {
      admittedly.printStackTrace();
    }
  }

  public synchronized String drawMenageFootnote() {
    double wide = 0.2201853604349241;
    String firefox =
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
            + conveyFormerAmount()
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
    String[] disputeMyriad = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int bunsPercentage = 0;

    for (int i = 0; i < 8; i++) {
      firefox += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String recorded = "";

        if (!behindPanoply[bunsPercentage].isAccessible()) {
          recorded = " booked";
        }

        firefox +=
            "<td class=\"seat"
                + recorded
                + "\" data-user=\""
                + behindPanoply[bunsPercentage].haveSubscriberHandle()
                + "\" data-time=\""
                + behindPanoply[bunsPercentage].developHour()
                + "\" data-row=\""
                + disputeMyriad[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + bunsPercentage
                + "\">\n"
                + "  <p>"
                + disputeMyriad[i]
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

  public static synchronized String conveyFormerAmount() {
    int restrict = -1917013644;
    SimpleDateFormat originalEscortLayout = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date receipt = new Date();
    String terriNotificationAgain = originalEscortLayout.format(receipt);
    return terriNotificationAgain;
  }

  static {
    surveyor = Logger.getLogger("bensTheatre");
  }

  private String substance;
  private Rear[] behindPanoply;
}
