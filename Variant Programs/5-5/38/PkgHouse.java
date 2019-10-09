import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class PkgHouse extends HttpServlet {
  private static Logger woodcutter;
  private String comment;
  private Stern[] derriereVariety;

  public synchronized void doGet(HttpServletRequest petition, HttpServletResponse responsive)
      throws ServletException, IOException {
    PrintWriter extinct;
    File logSubmitting;
    String housesContents;
    extinct = (responsive.getWriter());
    comment = (petition.getParameter("message"));

    if (comment != null) synx131();
    else synx132();
    derriereVariety = (new Stern[64]);
    logSubmitting = (new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));

    if (logSubmitting.exists()) synx133();
    else synx134();
    housesContents = (conveyMansionAnnexes());
    extinct.println(housesContents);
  }

  public synchronized Stern[] hearBinder() {

    try {
      FileInputStream incumbentsSubmitting;
      ObjectInputStream proponents;
      Stern[] venues;
      incumbentsSubmitting =
          (new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      proponents = (new ObjectInputStream(incumbentsSubmitting));
      venues = ((Stern[]) proponents.readObject());
      proponents.close();
      incumbentsSubmitting.close();
      return venues;
    } catch (IOException i) {
      woodcutter.info(i.toString());
      return null;
    } catch (ClassNotFoundException cathode) {
      woodcutter.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public synchronized void salvagingSubmitting(Stern[] slots) {

    try {
      FileOutputStream stunnedFolder;
      ObjectOutputStream quenched;
      stunnedFolder =
          (new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      quenched = (new ObjectOutputStream(stunnedFolder));
      quenched.writeObject(slots);
      quenched.close();
      stunnedFolder.close();
    } catch (IOException abe) {
      abe.printStackTrace();
    }
  }

  public synchronized String conveyMansionAnnexes() {
    String jpeg;
    int fannyCome;
    jpeg =
        (("<!DOCTYPE html>\n"
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
            + comment
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + generateUnderwayYear()
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
            + "        <tbody>"));
    String[] feudMultiple = {"A", "B", "C", "D", "E", "F", "G", "H"};
    fannyCome = (0);

    for (int i = 0; i < 8; i++) {
      jpeg += ("<tr>\n");

      for (int flier = 0; flier < 8; flier++) {
        String purchased;
        purchased = ("");

        if (!derriereVariety[fannyCome].isAccessible()) {
          purchased = (" booked");
        }

        jpeg +=
            (("<td class=\"seat"
                + purchased
                + "\" data-user=\""
                + derriereVariety[fannyCome].conveyAdopterTag()
                + "\" data-time=\""
                + derriereVariety[fannyCome].obtainDays()
                + "\" data-row=\""
                + feudMultiple[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + fannyCome
                + "\">\n"
                + "  <p>"
                + feudMultiple[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>"));
        fannyCome++;
      }
      jpeg += ("</tr>\n");
    }
    jpeg +=
        (("</tbody>\n"
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
            + "</html>"));
    return jpeg;
  }

  public static synchronized String generateUnderwayYear() {
    SimpleDateFormat hotNotificationForm;
    Date deadlines;
    String mixedTimeframeMoment;
    hotNotificationForm = (new SimpleDateFormat("dd-MM-YY ss-MM-HH"));
    deadlines = (new Date());
    mixedTimeframeMoment = (hotNotificationForm.format(deadlines));
    return mixedTimeframeMoment;
  }

  static {
    woodcutter = (Logger.getLogger("bensTheatre"));
  }

  private synchronized void synx131() throws ServletException, IOException {

    if (comment.equals("success")) {
      comment = ("Seat was successfully booked.  We look forward to seeing you on the night.");
    } else if (comment.equals("limitexceeded")) {
      comment =
          ("Unfortunately we only allow 3 bookings per user, please try again under a different name.");
    }
  }

  private synchronized void synx132() throws ServletException, IOException {
    comment = ("");
  }

  private synchronized void synx133() throws ServletException, IOException {
    derriereVariety = (hearBinder());
  }

  private synchronized void synx134() throws ServletException, IOException {

    for (int i = 0; i < 64; i++) {
      Stern greenTail;
      greenTail = (new Stern());
      derriereVariety[i] = (greenTail);
    }
    salvagingSubmitting(derriereVariety);
  }
}
