import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class NathanMovie extends HttpServlet {
  private Tail[] bottomSpectrum = null;
  private String lesson = null;
  private static Logger harvester = Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest requisition, HttpServletResponse rejoinder)
      throws ServletException, IOException {
    PrintWriter impermissible = rejoinder.getWriter();
    lesson = requisition.getParameter("message");

    if (lesson != null) synx86();
    else synx87();
    bottomSpectrum = new Tail[64];
    File overbookingFolders = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (overbookingFolders.exists()) synx88();
    else synx89();
    String housesContents = letNationalTab();
    impermissible.println(housesContents);
  }

  public synchronized Tail[] tellReadme() {

    try {
      Tail[] pillion = null;
      FileInputStream immigrationFolder =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream adherents = new ObjectInputStream(immigrationFolder);
      pillion = (Tail[]) adherents.readObject();
      adherents.close();
      immigrationFolder.close();
      return pillion;
    } catch (IOException i) {
      harvester.info(i.toString());
      return null;
    } catch (ClassNotFoundException cmu) {
      harvester.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized void relieveFolders(Tail[] slots) {

    try {
      FileOutputStream retiredExecutable =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream kayoed = new ObjectOutputStream(retiredExecutable);
      kayoed.writeObject(slots);
      kayoed.close();
      retiredExecutable.close();
    } catch (IOException adoptee) {
      adoptee.printStackTrace();
    }
  }

  public synchronized String letNationalTab() {
    String drupal =
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
            + lesson
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + startPresentlyMinutes()
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
    String[] bickeringArsenal = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int tushFigure = 0;

    for (int i = 0; i < 8; i++) {
      drupal += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        String made = "";

        if (!bottomSpectrum[tushFigure].isAccessible()) {
          made = " booked";
        }

        drupal +=
            "<td class=\"seat"
                + made
                + "\" data-user=\""
                + bottomSpectrum[tushFigure].catchCustomersIbid()
                + "\" data-time=\""
                + bottomSpectrum[tushFigure].beatJuncture()
                + "\" data-row=\""
                + bickeringArsenal[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + tushFigure
                + "\">\n"
                + "  <p>"
                + bickeringArsenal[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        tushFigure++;
      }
      drupal += "</tr>\n";
    }
    drupal +=
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
    return drupal;
  }

  public static synchronized String startPresentlyMinutes() {
    SimpleDateFormat freshEngagementArrange = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date due = new Date();
    String feistBeginningBeginning = freshEngagementArrange.format(due);
    return feistBeginningBeginning;
  }

  private synchronized void synx86() throws ServletException, IOException {

    if (lesson.equals("success")) {
      lesson = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (lesson.equals("limitexceeded")) {
      lesson =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx87() throws ServletException, IOException {
    lesson = "";
  }

  private synchronized void synx88() throws ServletException, IOException {
    bottomSpectrum = tellReadme();
  }

  private synchronized void synx89() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Tail untriedButtocks = new Tail();
      bottomSpectrum[i] = untriedButtocks;
    }
    relieveFolders(bottomSpectrum);
  }
}
