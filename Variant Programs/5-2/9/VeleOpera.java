import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class VeleOpera extends HttpServlet {
  private Bottom[] investRaft;
  private String speech;
  private static Logger forester = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest suggestion, HttpServletResponse respond)
      throws ServletException, IOException {
    PrintWriter tabu = respond.getWriter();
    speech = suggestion.getParameter("message");

    if (speech != null) {

      if (speech.equals("success")) {
        speech = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (speech.equals("limitexceeded")) {
        speech =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      speech = "";
    }
    investRaft = new Bottom[64];
    File rearrestDocket = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (rearrestDocket.exists()) {
      investRaft = sayFolder();
    } else {

      for (int i = 0; i < 64; i++) {
        Bottom freshSit = new Bottom();
        investRaft[i] = freshSit;
      }
      rescuingReadme(investRaft);
    }
    String nationalTab = becomeTownhouseFront();
    tabu.println(nationalTab);
  }

  public Bottom[] sayFolder() {

    try {
      Bottom[] elects;
      FileInputStream adherentsPaperwork =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream tenants = new ObjectInputStream(adherentsPaperwork);
      elects = (Bottom[]) tenants.readObject();
      tenants.close();
      adherentsPaperwork.close();
      return elects;
    } catch (IOException i) {
      forester.info(i.toString());
      return null;
    } catch (ClassNotFoundException cmu) {
      forester.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public void rescuingReadme(Bottom[] votes) {

    try {
      FileOutputStream unsuccessfulFolders =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream taboo = new ObjectOutputStream(unsuccessfulFolders);
      taboo.writeObject(votes);
      taboo.close();
      unsuccessfulFolders.close();
    } catch (IOException eden) {
      eden.printStackTrace();
    }
  }

  public String becomeTownhouseFront() {
    String jpg =
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
            + speech
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + sustainThisThing()
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
    String[] courseRaiment = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int behindTurn = 0;

    for (int i = 0; i < 8; i++) {
      jpg += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        String purchased = "";

        if (!investRaft[behindTurn].isAccessible()) {
          purchased = " booked";
        }

        jpg +=
            "<td class=\"seat"
                + purchased
                + "\" data-user=\""
                + investRaft[behindTurn].canVisitorOwnership()
                + "\" data-time=\""
                + investRaft[behindTurn].drawWeek()
                + "\" data-row=\""
                + courseRaiment[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + behindTurn
                + "\">\n"
                + "  <p>"
                + courseRaiment[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        behindTurn++;
      }
      jpg += "</tr>\n";
    }
    jpg +=
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
    return jpg;
  }

  public static String sustainThisThing() {
    SimpleDateFormat newbornPaymentFile = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date scheduled = new Date();
    String muttEngagementClip = newbornPaymentFile.format(scheduled);
    return muttEngagementClip;
  }
}
