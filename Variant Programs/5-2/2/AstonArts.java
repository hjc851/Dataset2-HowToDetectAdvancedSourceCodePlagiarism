import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class AstonArts extends HttpServlet {
  private Hindquarters[] tooshiePortfolio;
  private String signals;
  private static Logger fisherman = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest asks, HttpServletResponse reaction)
      throws ServletException, IOException {
    PrintWriter unsuccessful = reaction.getWriter();
    signals = asks.getParameter("message");

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
    tooshiePortfolio = new Hindquarters[64];
    File ticketingCharge = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (ticketingCharge.exists()) {
      tooshiePortfolio = recordExecutable();
    } else {

      for (int i = 0; i < 64; i++) {
        Hindquarters revolutionaryRump = new Hindquarters();
        tooshiePortfolio[i] = revolutionaryRump;
      }
      deliverDocument(tooshiePortfolio);
    }
    String housePageboy = havePlateSection();
    unsuccessful.println(housePageboy);
  }

  public Hindquarters[] recordExecutable() {

    try {
      Hindquarters[] member;
      FileInputStream officeholdersSubmit =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream proponents = new ObjectInputStream(officeholdersSubmit);
      member = (Hindquarters[]) proponents.readObject();
      proponents.close();
      officeholdersSubmit.close();
      return member;
    } catch (IOException i) {
      fisherman.info(i.toString());
      return null;
    } catch (ClassNotFoundException intrasentential) {
      fisherman.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public void deliverDocument(Hindquarters[] mats) {

    try {
      FileOutputStream impossibleDocuments =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream impermissible = new ObjectOutputStream(impossibleDocuments);
      impermissible.writeObject(mats);
      impermissible.close();
      impossibleDocuments.close();
    } catch (IOException afterwards) {
      afterwards.printStackTrace();
    }
  }

  public String havePlateSection() {
    String meta =
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
            + bringOngoingMeter()
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
    String[] wranglingNumber = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int sternProportion = 0;

    for (int i = 0; i < 8; i++) {
      meta += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String leased = "";

        if (!tooshiePortfolio[sternProportion].isAccessible()) {
          leased = " booked";
        }

        meta +=
            "<td class=\"seat"
                + leased
                + "\" data-user=\""
                + tooshiePortfolio[sternProportion].developAddictPeg()
                + "\" data-time=\""
                + tooshiePortfolio[sternProportion].becomeOpportunity()
                + "\" data-row=\""
                + wranglingNumber[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + sternProportion
                + "\">\n"
                + "  <p>"
                + wranglingNumber[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        sternProportion++;
      }
      meta += "</tr>\n";
    }
    meta +=
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
    return meta;
  }

  public static String bringOngoingMeter() {
    SimpleDateFormat otherDaysPrint = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date scheduled = new Date();
    String centreDeadlinesMonth = otherDaysPrint.format(scheduled);
    return centreDeadlinesMonth;
  }
}
