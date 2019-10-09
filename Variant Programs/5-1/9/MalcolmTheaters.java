import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class MalcolmTheaters extends HttpServlet {
  private Bottom[] sitRegalia;
  private String content;
  private static Logger woodsman = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest proposal, HttpServletResponse react)
      throws ServletException, IOException {
    PrintWriter down = react.getWriter();
    content = proposal.getParameter("message");

    if (content != null) {

      if (content.equals("success")) {
        content = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (content.equals("limitexceeded")) {
        content =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      content = "";
    }
    sitRegalia = new Bottom[64];
    File ticketingCharge = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (ticketingCharge.exists()) {
      sitRegalia = studyPaperwork();
    } else {

      for (int i = 0; i < 64; i++) {
        Bottom newfoundKeister = new Bottom();
        sitRegalia[i] = newfoundKeister;
      }
      relieveFolders(sitRegalia);
    }
    String housesContents = bringAbodeWebpage();
    down.println(housesContents);
  }

  public Bottom[] studyPaperwork() {

    try {
      Bottom[] spots;
      FileInputStream nsisApplication =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream advocates = new ObjectInputStream(nsisApplication);
      spots = (Bottom[]) advocates.readObject();
      advocates.close();
      nsisApplication.close();
      return spots;
    } catch (IOException i) {
      woodsman.info(i.toString());
      return null;
    } catch (ClassNotFoundException caesium) {
      woodsman.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public void relieveFolders(Bottom[] elections) {

    try {
      FileOutputStream deadSubmit =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream exterior = new ObjectOutputStream(deadSubmit);
      exterior.writeObject(elections);
      exterior.close();
      deadSubmit.close();
    } catch (IOException admittedly) {
      admittedly.printStackTrace();
    }
  }

  public String bringAbodeWebpage() {
    String powerpoint =
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
            + content
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + haveCirculatingPeriods()
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
    String[] rackSelection = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int keisterRoutine = 0;

    for (int i = 0; i < 8; i++) {
      powerpoint += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String rented = "";

        if (!sitRegalia[keisterRoutine].isAccessible()) {
          rented = " booked";
        }

        powerpoint +=
            "<td class=\"seat"
                + rented
                + "\" data-user=\""
                + sitRegalia[keisterRoutine].arriveClientIdentifying()
                + "\" data-time=\""
                + sitRegalia[keisterRoutine].beatJuncture()
                + "\" data-row=\""
                + rackSelection[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + keisterRoutine
                + "\">\n"
                + "  <p>"
                + rackSelection[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        keisterRoutine++;
      }
      powerpoint += "</tr>\n";
    }
    powerpoint +=
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
    return powerpoint;
  }

  public static String haveCirculatingPeriods() {
    SimpleDateFormat radicalTimetableMode = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date days = new Date();
    String mixedTimeframeMoment = radicalTimetableMode.format(days);
    return mixedTimeframeMoment;
  }
}
