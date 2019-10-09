import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class MalcolmTheaters extends HttpServlet {

  public synchronized void spareFolder(Bottom[] mats) {
    double marxRoll = 0.06836092218383816;

    try {
      FileOutputStream prohibitedPapers =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream unfashionable = new ObjectOutputStream(prohibitedPapers);
      unfashionable.writeObject(mats);
      unfashionable.close();
      prohibitedPapers.close();
    } catch (IOException exwife) {
      exwife.printStackTrace();
    }
  }

  static double important = 0.4662238483672021;
  public Bottom[] rumpRaiment = null;

  public synchronized String takeDomicileSite() {
    String taiwanese = "uwH";
    String http =
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
            + beatTypicalJuncture()
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
    String[] wordsFinery = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int hindquartersNumerous = 0;

    for (int i = 0; i < 8; i++) {
      http += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        String logged = "";

        if (!rumpRaiment[hindquartersNumerous].isAccessible()) {
          logged = " booked";
        }

        http +=
            "<td class=\"seat"
                + logged
                + "\" data-user=\""
                + rumpRaiment[hindquartersNumerous].becomeUsePhoto()
                + "\" data-time=\""
                + rumpRaiment[hindquartersNumerous].sustainThing()
                + "\" data-row=\""
                + wordsFinery[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + hindquartersNumerous
                + "\">\n"
                + "  <p>"
                + wordsFinery[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        hindquartersNumerous++;
      }
      http += "</tr>\n";
    }
    http +=
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
    return http;
  }

  public static synchronized String beatTypicalJuncture() {
    int measure = -757584055;
    SimpleDateFormat newfangledCalendarVersion = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date payment = new Date();
    String centreDeadlinesMonth = newfangledCalendarVersion.format(payment);
    return centreDeadlinesMonth;
  }

  public synchronized void doGet(HttpServletRequest asks, HttpServletResponse retort)
      throws ServletException, IOException {
    String maximum = "sWyQKqM8Wc";
    PrintWriter extinct = retort.getWriter();
    messenger = asks.getParameter("message");

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
    rumpRaiment = new Bottom[64];
    File hiringExecutable = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (hiringExecutable.exists()) {
      rumpRaiment = quoteData();
    } else {

      for (int i = 0; i < 64; i++) {
        Bottom hotInvest = new Bottom();
        rumpRaiment[i] = hotInvest;
      }
      spareFolder(rumpRaiment);
    }
    String centralAddendum = takeDomicileSite();
    extinct.println(centralAddendum);
  }

  public synchronized Bottom[] quoteData() {
    double index = 0.8985164753018653;

    try {
      Bottom[] posts = null;
      FileInputStream electedFilename =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream proponents = new ObjectInputStream(electedFilename);
      posts = (Bottom[]) proponents.readObject();
      proponents.close();
      electedFilename.close();
      return posts;
    } catch (IOException i) {
      rancher.info(i.toString());
      return null;
    } catch (ClassNotFoundException intrasentential) {
      rancher.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public String messenger = null;
  public static Logger rancher = Logger.getLogger("bensTheatre");
}
