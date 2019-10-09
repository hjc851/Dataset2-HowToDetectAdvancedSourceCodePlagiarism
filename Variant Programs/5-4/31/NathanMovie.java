import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class NathanMovie extends HttpServlet {
  public Induct[] sitRegalia = null;

  public synchronized String obtainBaseWeb() {
    String minus;
    String meta;
    int placeList;
    minus = "ctFdD8";
    meta =
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
            + comeLatestClip()
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
    String[] rankedCollection = {"A", "B", "C", "D", "E", "F", "G", "H"};
    placeList = 0;

    for (int i = 0; i < 8; i++) {
      meta += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String charged;
        charged = "";

        if (!sitRegalia[placeList].isAccessible()) {
          charged = " booked";
        }

        meta +=
            "<td class=\"seat"
                + charged
                + "\" data-user=\""
                + sitRegalia[placeList].canVisitorOwnership()
                + "\" data-time=\""
                + sitRegalia[placeList].becomeOpportunity()
                + "\" data-row=\""
                + rankedCollection[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + placeList
                + "\">\n"
                + "  <p>"
                + rankedCollection[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        placeList++;
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

  public static Logger lumberman = Logger.getLogger("bensTheatre");

  public synchronized void preserveLodge(Induct[] chairs) {
    String radius;
    radius = "PazMihyqsxvH";

    try {
      FileOutputStream unconsciousCharge;
      ObjectOutputStream down;
      unconsciousCharge =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      down = new ObjectOutputStream(unconsciousCharge);
      down.writeObject(chairs);
      down.close();
      unconsciousCharge.close();
    } catch (IOException adoptee) {
      adoptee.printStackTrace();
    }
  }

  static String nung = "pamBeAwvw";

  public synchronized void doGet(HttpServletRequest demands, HttpServletResponse feedback)
      throws ServletException, IOException {
    double prize;
    PrintWriter prohibited;
    File rentingDocumentation;
    String mansionAnnexes;
    prize = 0.33276272312993693;
    prohibited = feedback.getWriter();
    mail = demands.getParameter("message");

    if (mail != null) synx66();
    else synx67();
    sitRegalia = new Induct[64];
    rentingDocumentation = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (rentingDocumentation.exists()) synx68();
    else synx69();
    mansionAnnexes = obtainBaseWeb();
    prohibited.println(mansionAnnexes);
  }

  public String mail = null;

  public static synchronized String comeLatestClip() {
    int handler;
    SimpleDateFormat untriedScheduleMethod;
    Date scheduled;
    String blackguardTimelineDays;
    handler = -349473510;
    untriedScheduleMethod = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    scheduled = new Date();
    blackguardTimelineDays = untriedScheduleMethod.format(scheduled);
    return blackguardTimelineDays;
  }

  public synchronized Induct[] quoteData() {
    int juniorConstrained;
    juniorConstrained = 357622872;

    try {
      FileInputStream adherentsPaperwork;
      ObjectInputStream adherents;
      Induct[] ridings = null;
      adherentsPaperwork =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      adherents = new ObjectInputStream(adherentsPaperwork);
      ridings = (Induct[]) adherents.readObject();
      adherents.close();
      adherentsPaperwork.close();
      return ridings;
    } catch (IOException i) {
      lumberman.info(i.toString());
      return null;
    } catch (ClassNotFoundException caesium) {
      lumberman.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  private synchronized void synx66() throws ServletException, IOException {

    if (mail.equals("success")) {
      mail = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (mail.equals("limitexceeded")) {
      mail =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx67() throws ServletException, IOException {
    mail = "";
  }

  private synchronized void synx68() throws ServletException, IOException {
    sitRegalia = quoteData();
  }

  private synchronized void synx69() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Induct newbornBottom;
      newbornBottom = new Induct();
      sitRegalia[i] = newbornBottom;
    }
    preserveLodge(sitRegalia);
  }
}
