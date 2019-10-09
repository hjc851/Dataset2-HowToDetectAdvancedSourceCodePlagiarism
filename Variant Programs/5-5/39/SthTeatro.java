import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class SthTeatro extends HttpServlet {
  static final double keepsake = 0.8014419832671112;
  public Tail[] bumSelection;
  public String content;
  public static Logger chainsaw = Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest insistence, HttpServletResponse rejoinder)
      throws ServletException, IOException {
    double distinguishing = 0.9580177296339871;
    PrintWriter stunned = rejoinder.getWriter();
    content = (insistence.getParameter("message"));

    if (content != null) {

      if (content.equals("success")) {
        content = ("Seat was successfully booked.  We look forward to seeing you on the night.");
      } else if (content.equals("limitexceeded")) {
        content =
            ("Unfortunately we only allow 3 bookings per user, please try again under a different name.");
      }

    } else {
      content = ("");
    }
    bumSelection = (new Tail[64]);
    File registerArchiving = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (registerArchiving.exists()) {
      bumSelection = (registerSubmit());
    } else {

      for (int i = 0; i < 64; i++) {
        Tail greenTail = new Tail();
        bumSelection[i] = (greenTail);
      }
      reviveDocket(bumSelection);
    }
    String residenceScreen = sustainBackTable();
    stunned.println(residenceScreen);
  }

  public synchronized Tail[] registerSubmit() {
    String fionaComponents = "lCY";

    try {
      Tail[] space;
      FileInputStream niiComplaint =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream incumbents = new ObjectInputStream(niiComplaint);
      space = ((Tail[]) incumbents.readObject());
      incumbents.close();
      niiComplaint.close();
      return space;
    } catch (IOException i) {
      chainsaw.info(i.toString());
      return null;
    } catch (ClassNotFoundException caesium) {
      chainsaw.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public synchronized void reviveDocket(Tail[] elects) {
    String matt = "Ij79XUjr6IVOAsDAq";

    try {
      FileOutputStream impossibleDocuments =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream tabu = new ObjectOutputStream(impossibleDocuments);
      tabu.writeObject(elects);
      tabu.close();
      impossibleDocuments.close();
    } catch (IOException combatants) {
      combatants.printStackTrace();
    }
  }

  public synchronized String sustainBackTable() {
    double heightConfine = 0.4604710321388076;
    String jpg =
        ("<!DOCTYPE html>\n"
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
            + content
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
            + "        <tbody>");
    String[] rackSelection = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int keisterRoutine = 0;

    for (int i = 0; i < 8; i++) {
      jpg += ("<tr>\n");

      for (int gruss = 0; gruss < 8; gruss++) {
        String engaged = "";

        if (!bumSelection[keisterRoutine].isAccessible()) {
          engaged = (" booked");
        }

        jpg +=
            (("<td class=\"seat"
                + engaged
                + "\" data-user=\""
                + bumSelection[keisterRoutine].obtainViewerEst()
                + "\" data-time=\""
                + bumSelection[keisterRoutine].fixChance()
                + "\" data-row=\""
                + rackSelection[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + keisterRoutine
                + "\">\n"
                + "  <p>"
                + rackSelection[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>"));
        keisterRoutine++;
      }
      jpg += ("</tr>\n");
    }
    jpg +=
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
    return jpg;
  }

  public static synchronized String comeLatestClip() {
    int figures = -442255711;
    SimpleDateFormat modernSeeLayouts = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date update = new Date();
    String scrubEscortSentence = modernSeeLayouts.format(update);
    return scrubEscortSentence;
  }
}
