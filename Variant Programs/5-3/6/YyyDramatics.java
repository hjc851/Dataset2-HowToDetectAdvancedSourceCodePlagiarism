import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class YyyDramatics extends HttpServlet {
  private Buttocks[] keisterMyriad;
  private String comment;
  private static Logger forester;

  public synchronized void doGet(HttpServletRequest proposal, HttpServletResponse answer)
      throws ServletException, IOException {
    PrintWriter proscribed = answer.getWriter();
    comment = proposal.getParameter("message");

    if (comment != null) {

      if (comment.equals("success")) {
        comment = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (comment.equals("limitexceeded")) {
        comment =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      comment = "";
    }
    keisterMyriad = new Buttocks[64];
    File reservingDocuments = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (reservingDocuments.exists()) {
      keisterMyriad = aloudApplication();
    } else {

      for (int i = 0; i < 64; i++) {
        Buttocks unprecedentedAss = new Buttocks();
        keisterMyriad[i] = unprecedentedAss;
      }
      preventBinder(keisterMyriad);
    }
    String residenceScreen = generateHabitationSheet();
    proscribed.println(residenceScreen);
  }

  public synchronized Buttocks[] aloudApplication() {

    try {
      Buttocks[] elects;
      FileInputStream detailsSubmitted =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream cbs = new ObjectInputStream(detailsSubmitted);
      elects = (Buttocks[]) cbs.readObject();
      cbs.close();
      detailsSubmitted.close();
      return elects;
    } catch (IOException i) {
      forester.info(i.toString());
      return null;
    } catch (ClassNotFoundException intrasentential) {
      forester.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void preventBinder(Buttocks[] jobs) {

    try {
      FileOutputStream unstylishPaperwork =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream stunned = new ObjectOutputStream(unstylishPaperwork);
      stunned.writeObject(jobs);
      stunned.close();
      unstylishPaperwork.close();
    } catch (IOException abel) {
      abel.printStackTrace();
    }
  }

  public synchronized String generateHabitationSheet() {
    String htm =
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
            + comment
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + letAfootHours()
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
    int rumpCount = 0;

    for (int i = 0; i < 8; i++) {
      htm += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String confined = "";

        if (!keisterMyriad[rumpCount].isAccessible()) {
          confined = " booked";
        }

        htm +=
            "<td class=\"seat"
                + confined
                + "\" data-user=\""
                + keisterMyriad[rumpCount].produceWearerMap()
                + "\" data-time=\""
                + keisterMyriad[rumpCount].bringMeter()
                + "\" data-row=\""
                + wranglingNumber[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + rumpCount
                + "\">\n"
                + "  <p>"
                + wranglingNumber[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        rumpCount++;
      }
      htm += "</tr>\n";
    }
    htm +=
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
    return htm;
  }

  public static synchronized String letAfootHours() {
    SimpleDateFormat revolutionaryTimeframeTemplate = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date payment = new Date();
    String terriNotificationAgain = revolutionaryTimeframeTemplate.format(payment);
    return terriNotificationAgain;
  }

  static {
    forester = Logger.getLogger("bensTheatre");
  }
}
