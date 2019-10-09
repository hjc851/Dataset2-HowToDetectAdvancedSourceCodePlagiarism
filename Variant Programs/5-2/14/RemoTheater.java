import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class RemoTheater extends HttpServlet {
  private Buns[] tushFinery;
  private String text;
  private static Logger recorder = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest complaint, HttpServletResponse reaction)
      throws ServletException, IOException {
    PrintWriter tabu = reaction.getWriter();
    text = complaint.getParameter("message");

    if (text != null) {

      if (text.equals("success")) {
        text = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (text.equals("limitexceeded")) {
        text =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      text = "";
    }
    tushFinery = new Buns[64];
    File engagementRegister = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (engagementRegister.exists()) {
      tushFinery = studyPaperwork();
    } else {

      for (int i = 0; i < 64; i++) {
        Buns untestedBehind = new Buns();
        tushFinery[i] = untestedBehind;
      }
      resurrectPapers(tushFinery);
    }
    String baseWeb = letNationalTab();
    tabu.println(baseWeb);
  }

  public Buns[] studyPaperwork() {

    try {
      Buns[] members;
      FileInputStream officeholdersSubmit =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream officeholders = new ObjectInputStream(officeholdersSubmit);
      members = (Buns[]) officeholders.readObject();
      officeholders.close();
      officeholdersSubmit.close();
      return members;
    } catch (IOException i) {
      recorder.info(i.toString());
      return null;
    } catch (ClassNotFoundException nlsy) {
      recorder.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public void resurrectPapers(Buns[] ridings) {

    try {
      FileOutputStream extinguishedDocument =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream dead = new ObjectOutputStream(extinguishedDocument);
      dead.writeObject(ridings);
      dead.close();
      extinguishedDocument.close();
    } catch (IOException abe) {
      abe.printStackTrace();
    }
  }

  public String letNationalTab() {
    String jpeg =
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
            + text
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + makeIncumbentDay()
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
    String[] wrangleRegalia = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int inductBit = 0;

    for (int i = 0; i < 8; i++) {
      jpeg += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String reserved = "";

        if (!tushFinery[inductBit].isAccessible()) {
          reserved = " booked";
        }

        jpeg +=
            "<td class=\"seat"
                + reserved
                + "\" data-user=\""
                + tushFinery[inductBit].goExploiterQuod()
                + "\" data-time=\""
                + tushFinery[inductBit].fixChance()
                + "\" data-row=\""
                + wrangleRegalia[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + inductBit
                + "\">\n"
                + "  <p>"
                + wrangleRegalia[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        inductBit++;
      }
      jpeg += "</tr>\n";
    }
    jpeg +=
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
    return jpeg;
  }

  public static String makeIncumbentDay() {
    SimpleDateFormat radicalTimetableMode = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date schedule = new Date();
    String damnedDeadlineWhen = radicalTimetableMode.format(schedule);
    return damnedDeadlineWhen;
  }
}
