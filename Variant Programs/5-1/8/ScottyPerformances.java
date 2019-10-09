import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class ScottyPerformances extends HttpServlet {
  private Derriere[] backsideAssortment;
  private String msg;
  private static Logger consignor = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest appeals, HttpServletResponse rejoinder)
      throws ServletException, IOException {
    PrintWriter impossible = rejoinder.getWriter();
    msg = appeals.getParameter("message");

    if (msg != null) {

      if (msg.equals("success")) {
        msg = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (msg.equals("limitexceeded")) {
        msg =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      msg = "";
    }
    backsideAssortment = new Derriere[64];
    File hiringExecutable = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (hiringExecutable.exists()) {
      backsideAssortment = understandCharge();
    } else {

      for (int i = 0; i < 64; i++) {
        Derriere greenTail = new Derriere();
        backsideAssortment[i] = greenTail;
      }
      shaveArchives(backsideAssortment);
    }
    String hometownChapter = beatHousesContents();
    impossible.println(hometownChapter);
  }

  public Derriere[] understandCharge() {

    try {
      Derriere[] spots;
      FileInputStream officeholdersSubmit =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream adherents = new ObjectInputStream(officeholdersSubmit);
      spots = (Derriere[]) adherents.readObject();
      adherents.close();
      officeholdersSubmit.close();
      return spots;
    } catch (IOException i) {
      consignor.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      consignor.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public void shaveArchives(Derriere[] chairs) {

    try {
      FileOutputStream backBinder =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream back = new ObjectOutputStream(backBinder);
      back.writeObject(chairs);
      back.close();
      backBinder.close();
    } catch (IOException late) {
      late.printStackTrace();
    }
  }

  public String beatHousesContents() {
    String macros =
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
            + msg
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + driveContinuingAgain()
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
    String[] tiffMix = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int buttocksIssue = 0;

    for (int i = 0; i < 8; i++) {
      macros += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String reserved = "";

        if (!backsideAssortment[buttocksIssue].isAccessible()) {
          reserved = " booked";
        }

        macros +=
            "<td class=\"seat"
                + reserved
                + "\" data-user=\""
                + backsideAssortment[buttocksIssue].produceWearerMap()
                + "\" data-time=\""
                + backsideAssortment[buttocksIssue].letHours()
                + "\" data-row=\""
                + tiffMix[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + buttocksIssue
                + "\">\n"
                + "  <p>"
                + tiffMix[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        buttocksIssue++;
      }
      macros += "</tr>\n";
    }
    macros +=
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
    return macros;
  }

  public static String driveContinuingAgain() {
    SimpleDateFormat novelDueModel = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date timetable = new Date();
    String underbredCalendarDay = novelDueModel.format(timetable);
    return underbredCalendarDay;
  }
}
