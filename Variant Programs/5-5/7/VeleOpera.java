import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import static java.util.logging.Logger.getLogger;

public class VeleOpera extends javax.servlet.http.HttpServlet {
  private static final String synX667String = "/WEB-INF/bookingData.ser";
  private static final int synX666int = 64;
  private static final String synX665String = "message";
  private static final String synX664String = "</html>";
  private static final String synX663String = "  </body>\t\n";
  private static final String synX662String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX661String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX660String = "    </div>\n";
  private static final String synX659String = "      </div>\n";
  private static final String synX658String = "        </div>\n";
  private static final String synX657String = "          <button>OK</button>\n";
  private static final String synX656String = "        <div class=\"close\">\n";
  private static final String synX655String =
      "        <p>Booked On:<span class=\"booked-time\"></span></p>\n";
  private static final String synX654String =
      "        <p>Booked By:<span class=\"booked-name\"></span></p>\n";
  private static final String synX653String = "        <h3>This seat is already booked.</h3>\n";
  private static final String synX652String = "      <div class=\"inner\">\n";
  private static final String synX651String = "    <div id=\"popup\">\n";
  private static final String synX650String = "    </footer>\n";
  private static final String synX649String = "      </div>\n";
  private static final String synX648String = "        <p>c3063467</p>\n";
  private static final String synX647String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX646String = "      <div class=\"author\">\n";
  private static final String synX645String = "    <footer>\n";
  private static final String synX644String = "    </article>\n";
  private static final String synX643String = "      </div>\n";
  private static final String synX642String = "        </div>\n";
  private static final String synX641String = "          <p>Booked</p>\n";
  private static final String synX640String = "        <div class=\"booked\">\n";
  private static final String synX639String = "        </div>\n";
  private static final String synX638String = "          <p>Available</p>\n";
  private static final String synX637String = "        <div class=\"available\">\n";
  private static final String synX636String = "      <div class=\"legend\">\n";
  private static final String synX635String = "      </table>\n";
  private static final String synX634String = "</tbody>\n";
  private static final String synX633String = "</tr>\n";
  private static final String synX632String = "</td>";
  private static final String synX631String = "</p>\n";
  private static final int synX630int = 1;
  private static final String synX629String = "  <p>";
  private static final String synX628String = "\">\n";
  private static final String synX627String = "\" data-seatNumber=\"";
  private static final int synX626int = 1;
  private static final String synX625String = "\" data-seat=\"";
  private static final String synX624String = "\" data-row=\"";
  private static final String synX623String = "\" data-time=\"";
  private static final String synX622String = "\" data-user=\"";
  private static final String synX621String = "<td class=\"seat";
  private static final String synX620String = " booked";
  private static final String synX619String = "";
  private static final int synX618int = 8;
  private static final int synX617int = 0;
  private static final String synX616String = "<tr>\n";
  private static final int synX615int = 8;
  private static final int synX614int = 0;
  private static final int synX613int = 0;
  private static final String synX612String = "H";
  private static final String synX611String = "G";
  private static final String synX610String = "F";
  private static final String synX609String = "E";
  private static final String synX608String = "D";
  private static final String synX607String = "C";
  private static final String synX606String = "B";
  private static final String synX605String = "A";
  private static final String synX604String = "        <tbody>";
  private static final String synX603String = "        </thead>\n";
  private static final String synX602String = "          </tr>\n";
  private static final String synX601String = "            </td>\n";
  private static final String synX600String = "              <p>Stage</p>\n";
  private static final String synX599String = "            <td colspan=\"8\">\n";
  private static final String synX598String = "          <tr>\n";
  private static final String synX597String = "        <thead>\n";
  private static final String synX596String = "      <table>\n";
  private static final String synX595String = "      </div>\n";
  private static final String synX594String =
      "        <p>Select a seat below to place your booking...</p>\n";
  private static final String synX593String = "      <div class=\"instructions\">\n";
  private static final String synX592String = "      </div>\n";
  private static final String synX591String = " (DD-MM-YY SS-MM-HH)</p>\n";
  private static final String synX590String = "        <p>";
  private static final String synX589String = "      <div class=\"time\">\n";
  private static final String synX588String = "      <h2>Seats</h2>\n";
  private static final String synX587String = "</p>\n";
  private static final String synX586String = "      <p class=\"message\">";
  private static final String synX585String = "    <article>\n";
  private static final String synX584String = "    </header>\n";
  private static final String synX583String = "      <h1>Theatre Booking System</h1>\n";
  private static final String synX582String = "    <header>\n";
  private static final String synX581String = "  <body class=\"home\">\n";
  private static final String synX580String = "  </head>\n";
  private static final String synX579String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX578String = "    <![endif]-->\n";
  private static final String synX577String = "      </script>\n";
  private static final String synX576String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX575String = "    <!--[if IE]>\n";
  private static final String synX574String = "    <title>Theatre Booking System</title>\n";
  private static final String synX573String = "    <meta charset=utf-8>\n";
  private static final String synX572String = "  <head>\n";
  private static final String synX571String = "<html lang=\"en\">\n";
  private static final String synX570String = "<!DOCTYPE html>\n";
  private static final String synX569String = "/WEB-INF/bookingData.ser";
  private static final String synX568String = "/WEB-INF/bookingData.ser";
  private static final String synX567String = "dd-MM-YY ss-MM-HH";
  public java.lang.String letter;

  public static synchronized java.lang.String comeLatestClip() {
    java.text.SimpleDateFormat freshEngagementArrange;
    java.util.Date engagement;
    java.lang.String curshipTimeAmount;
    freshEngagementArrange = new java.text.SimpleDateFormat(synX567String);
    engagement = new java.util.Date();
    curshipTimeAmount = freshEngagementArrange.format(engagement);
    return curshipTimeAmount;
  }

  public synchronized void earnExecutable(Sit[] vacancies) {

    try {
      java.io.FileOutputStream tabooApplication;
      java.io.ObjectOutputStream unfashionable;
      tabooApplication =
          new java.io.FileOutputStream(getServletContext().getRealPath(synX568String));
      unfashionable = new java.io.ObjectOutputStream(tabooApplication);
      unfashionable.writeObject(vacancies);
      unfashionable.close();
      tabooApplication.close();
    } catch (java.io.IOException eden) {
      eden.printStackTrace();
    }
  }

  public synchronized Sit[] perusedArchives() {

    try {
      java.io.FileInputStream detailsSubmitted;
      java.io.ObjectInputStream whys;
      Sit[] members;
      detailsSubmitted =
          new java.io.FileInputStream(getServletContext().getRealPath(synX569String));
      whys = new java.io.ObjectInputStream(detailsSubmitted);
      members = (Sit[]) whys.readObject();
      whys.close();
      detailsSubmitted.close();
      return members;
    } catch (java.io.IOException i) {
      woodsman.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException nlsy) {
      woodsman.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public synchronized java.lang.String beatHousesContents() {
    java.lang.String jpeg;
    int bunsPercentage;
    jpeg =
        synX570String
            + synX571String
            + synX572String
            + synX573String
            + synX574String
            + synX575String
            + synX576String
            + synX577String
            + synX578String
            + synX579String
            + synX580String
            + synX581String
            + synX582String
            + synX583String
            + synX584String
            + synX585String
            + synX586String
            + letter
            + synX587String
            + synX588String
            + synX589String
            + synX590String
            + comeLatestClip()
            + synX591String
            + synX592String
            + synX593String
            + synX594String
            + synX595String
            + synX596String
            + synX597String
            + synX598String
            + synX599String
            + synX600String
            + synX601String
            + synX602String
            + synX603String
            + synX604String;
    String[] penaltyPalette = {
      synX605String,
      synX606String,
      synX607String,
      synX608String,
      synX609String,
      synX610String,
      synX611String,
      synX612String
    };
    bunsPercentage = synX613int;

    for (int i = synX614int; i < synX615int; i++) {
      jpeg += jpeg + synX616String;

      for (int flier = synX617int; flier < synX618int; flier++) {
        java.lang.String logged;
        logged = synX619String;

        if (!hindquartersPalette[bunsPercentage].isAccessible()) {
          logged = synX620String;
        }

        jpeg +=
            jpeg
                + synX621String
                + logged
                + synX622String
                + hindquartersPalette[bunsPercentage].comeEnjoyerMilad()
                + synX623String
                + hindquartersPalette[bunsPercentage].bringMeter()
                + synX624String
                + penaltyPalette[i]
                + synX625String
                + (flier + synX626int)
                + synX627String
                + bunsPercentage
                + synX628String
                + synX629String
                + penaltyPalette[i]
                + (flier + synX630int)
                + synX631String
                + synX632String;
        bunsPercentage++;
      }
      jpeg += jpeg + synX633String;
    }
    jpeg +=
        jpeg
            + synX634String
            + synX635String
            + synX636String
            + synX637String
            + synX638String
            + synX639String
            + synX640String
            + synX641String
            + synX642String
            + synX643String
            + synX644String
            + synX645String
            + synX646String
            + synX647String
            + synX648String
            + synX649String
            + synX650String
            + synX651String
            + synX652String
            + synX653String
            + synX654String
            + synX655String
            + synX656String
            + synX657String
            + synX658String
            + synX659String
            + synX660String
            + synX661String
            + synX662String
            + synX663String
            + synX664String;
    return jpeg;
  }

  public static java.util.logging.Logger woodsman;

  public synchronized void doGet(HttpServletRequest motion, HttpServletResponse responsiveness)
      throws ServletException, IOException {
    java.io.PrintWriter unconscious;
    java.io.File reservingDocuments;
    java.lang.String plateSection;
    unconscious = responsiveness.getWriter();
    letter = motion.getParameter(synX665String);

    if (letter != null) synx21();
    else synx22();
    hindquartersPalette = new Sit[synX666int];
    reservingDocuments = new java.io.File(getServletContext().getRealPath(synX667String));

    if (reservingDocuments.exists()) synx23();
    else synx24();
    plateSection = beatHousesContents();
    unconscious.println(plateSection);
  }

  public Sit[] hindquartersPalette;

  static {
    woodsman = getLogger("bensTheatre");
  }

  private synchronized void synx21() throws ServletException, IOException {

    if (letter.equals("success")) {
      letter = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (letter.equals("limitexceeded")) {
      letter =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx22() throws ServletException, IOException {
    letter = "";
  }

  private synchronized void synx23() throws ServletException, IOException {
    hindquartersPalette = perusedArchives();
  }

  private synchronized void synx24() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Sit freshSit;
      freshSit = new Sit();
      hindquartersPalette[i] = freshSit;
    }
    earnExecutable(hindquartersPalette);
  }
}
