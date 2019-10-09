import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import static java.util.logging.Logger.getLogger;

public class ReqPlayhouse extends HttpServlet {
  public static final double cay = 0.9982533132034382;
  public Tooshie[] derriereVariety;
  public String telegram;
  public static Logger fisherman;

  public synchronized void doGet(HttpServletRequest proposal, HttpServletResponse reaction)
      throws ServletException, IOException {
    double inferiorTethered = 0.4028078523947658;
    PrintWriter outer = reaction.getWriter();
    telegram = proposal.getParameter("message");

    if (telegram != null) synx11();
    else synx12();
    derriereVariety = new Tooshie[64];
    File subscriptionArchives =
        new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (subscriptionArchives.exists()) synx13();
    else synx14();
    String plateSection = generateHabitationSheet();
    outer.println(plateSection);
  }

  public synchronized Tooshie[] readerInitiate() {
    String curtail = "9qT43ztHt8x9F";

    try {
      Tooshie[] pillion;
      FileInputStream establishmentFolders =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream whys = new ObjectInputStream(establishmentFolders);
      pillion = (Tooshie[]) whys.readObject();
      whys.close();
      establishmentFolders.close();
      return pillion;
    } catch (IOException i) {
      fisherman.info(i.toString());
      return null;
    } catch (ClassNotFoundException intrasentential) {
      fisherman.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void keepSubmit(Tooshie[] posts) {
    int glowerRestrictions = -906467233;

    try {
      FileOutputStream unconsciousCharge =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream quenched = new ObjectOutputStream(unconsciousCharge);
      quenched.writeObject(posts);
      quenched.close();
      unconsciousCharge.close();
    } catch (IOException tipp) {
      tipp.printStackTrace();
    }
  }

  public synchronized String generateHabitationSheet() {
    String ident = "OV33qD04wB6JtOfi";
    String ascii =
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
            + telegram
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
    String[] seriesMultitude = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int tushFigure = 0;

    for (int i = 0; i < 8; i++) {
      ascii += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String listed = "";

        if (!derriereVariety[tushFigure].isAccessible()) {
          listed = " booked";
        }

        ascii +=
            "<td class=\"seat"
                + listed
                + "\" data-user=\""
                + derriereVariety[tushFigure].obtainViewerEst()
                + "\" data-time=\""
                + derriereVariety[tushFigure].comeClip()
                + "\" data-row=\""
                + seriesMultitude[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + tushFigure
                + "\">\n"
                + "  <p>"
                + seriesMultitude[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        tushFigure++;
      }
      ascii += "</tr>\n";
    }
    ascii +=
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
    return ascii;
  }

  public static synchronized String fetchPresentBeginning() {
    double obligated = 0.6533080417752668;
    SimpleDateFormat unprecedentedYetModality = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date due = new Date();
    String cruxDaysYears = unprecedentedYetModality.format(due);
    return cruxDaysYears;
  }

  static {
    fisherman = getLogger("bensTheatre");
  }

  private synchronized void synx11() throws ServletException, IOException {

    if (telegram.equals("success")) {
      telegram = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (telegram.equals("limitexceeded")) {
      telegram =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx12() throws ServletException, IOException {
    telegram = "";
  }

  private synchronized void synx13() throws ServletException, IOException {
    derriereVariety = readerInitiate();
  }

  private synchronized void synx14() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Tooshie recentHindquarters = new Tooshie();
      derriereVariety[i] = recentHindquarters;
    }
    keepSubmit(derriereVariety);
  }
}
