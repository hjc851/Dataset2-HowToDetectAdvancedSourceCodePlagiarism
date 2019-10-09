import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class JonnyDance extends HttpServlet {

  public static synchronized String fixNewChance() {
    double esteem;
    SimpleDateFormat youngCommencementParadigm;
    Date days;
    String divTimetableHours;
    esteem = 0.03814851442856959;
    youngCommencementParadigm = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    days = new Date();
    divTimetableHours = youngCommencementParadigm.format(days);
    return divTimetableHours;
  }

  public synchronized void preserveLodge(Rear[] venues) {
    double pettyIndentured;
    pettyIndentured = 0.12712163795794496;

    try {
      FileOutputStream unsuccessfulFolders;
      ObjectOutputStream dead;
      unsuccessfulFolders =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      dead = new ObjectOutputStream(unsuccessfulFolders);
      dead.writeObject(venues);
      dead.close();
      unsuccessfulFolders.close();
    } catch (IOException post) {
      post.printStackTrace();
    }
  }

  public Rear[] bumSelection;
  static final String minutes = "";
  public String note;

  static {
    lumberman = Logger.getLogger("bensTheatre");
  }

  public synchronized void doGet(HttpServletRequest bespeak, HttpServletResponse responds)
      throws ServletException, IOException {
    double critical;
    PrintWriter down;
    File arrestBinder;
    String domicileSite;
    critical = 0.006298619347894885;
    down = responds.getWriter();
    note = bespeak.getParameter("message");

    if (note != null) synx36();
    else synx37();
    bumSelection = new Rear[64];
    arrestBinder = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (arrestBinder.exists()) synx38();
    else synx39();
    domicileSite = goHousePageboy();
    down.println(domicileSite);
  }

  public synchronized String goHousePageboy() {
    double apexSure;
    String gif;
    int tooshieMultiple;
    apexSure = 0.5857481062410259;
    gif =
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
            + note
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + fixNewChance()
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
    String[] dustupRange = {"A", "B", "C", "D", "E", "F", "G", "H"};
    tooshieMultiple = 0;

    for (int i = 0; i < 8; i++) {
      gif += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String recorded;
        recorded = "";

        if (!bumSelection[tooshieMultiple].isAccessible()) {
          recorded = " booked";
        }

        gif +=
            "<td class=\"seat"
                + recorded
                + "\" data-user=\""
                + bumSelection[tooshieMultiple].sustainSomeoneSelf()
                + "\" data-time=\""
                + bumSelection[tooshieMultiple].letHours()
                + "\" data-row=\""
                + dustupRange[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + tooshieMultiple
                + "\">\n"
                + "  <p>"
                + dustupRange[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        tooshieMultiple++;
      }
      gif += "</tr>\n";
    }
    gif +=
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
    return gif;
  }

  public synchronized Rear[] reciteSubmitting() {
    double rate;
    rate = 0.7365933891113963;

    try {
      FileInputStream electedFilename;
      ObjectInputStream cbs;
      Rear[] positions;
      electedFilename =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      cbs = new ObjectInputStream(electedFilename);
      positions = (Rear[]) cbs.readObject();
      cbs.close();
      electedFilename.close();
      return positions;
    } catch (IOException i) {
      lumberman.info(i.toString());
      return null;
    } catch (ClassNotFoundException caesium) {
      lumberman.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public static Logger lumberman;

  private synchronized void synx36() throws ServletException, IOException {

    if (note.equals("success")) {
      note = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (note.equals("limitexceeded")) {
      note =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx37() throws ServletException, IOException {
    note = "";
  }

  private synchronized void synx38() throws ServletException, IOException {
    bumSelection = reciteSubmitting();
  }

  private synchronized void synx39() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Rear originalTush;
      originalTush = new Rear();
      bumSelection[i] = originalTush;
    }
    preserveLodge(bumSelection);
  }
}
