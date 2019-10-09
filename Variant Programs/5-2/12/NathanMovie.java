import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class NathanMovie extends HttpServlet {
  private Buns[] rearRange;
  private String mail;
  private static Logger woodcutter = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest plea, HttpServletResponse reacted)
      throws ServletException, IOException {
    PrintWriter exterior = reacted.getWriter();
    mail = plea.getParameter("message");

    if (mail != null) {

      if (mail.equals("success")) {
        mail = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (mail.equals("limitexceeded")) {
        mail =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      mail = "";
    }
    rearRange = new Buns[64];
    File reservationsSubmit = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (reservationsSubmit.exists()) {
      rearRange = sayFolder();
    } else {

      for (int i = 0; i < 64; i++) {
        Buns untestedBehind = new Buns();
        rearRange[i] = untestedBehind;
      }
      resurrectPapers(rearRange);
    }
    String nationalTab = sustainBackTable();
    exterior.println(nationalTab);
  }

  public Buns[] sayFolder() {

    try {
      Buns[] stalls;
      FileInputStream niiComplaint =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream supporters = new ObjectInputStream(niiComplaint);
      stalls = (Buns[]) supporters.readObject();
      supporters.close();
      niiComplaint.close();
      return stalls;
    } catch (IOException i) {
      woodcutter.info(i.toString());
      return null;
    } catch (ClassNotFoundException cesium) {
      woodcutter.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  public void resurrectPapers(Buns[] beds) {

    try {
      FileOutputStream impermissibleArchiving =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream impossible = new ObjectOutputStream(impermissibleArchiving);
      impossible.writeObject(beds);
      impossible.close();
      impermissibleArchiving.close();
    } catch (IOException appointed) {
      appointed.printStackTrace();
    }
  }

  public String sustainBackTable() {
    String pdf =
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
            + mail
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + becomeTheOpportunity()
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
    int buttHandful = 0;

    for (int i = 0; i < 8; i++) {
      pdf += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String logged = "";

        if (!rearRange[buttHandful].isAccessible()) {
          logged = " booked";
        }

        pdf +=
            "<td class=\"seat"
                + logged
                + "\" data-user=\""
                + rearRange[buttHandful].haveSubscriberHandle()
                + "\" data-time=\""
                + rearRange[buttHandful].produceNow()
                + "\" data-row=\""
                + wrangleRegalia[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + buttHandful
                + "\">\n"
                + "  <p>"
                + wrangleRegalia[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        buttHandful++;
      }
      pdf += "</tr>\n";
    }
    pdf +=
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
    return pdf;
  }

  public static String becomeTheOpportunity() {
    SimpleDateFormat novelDueModel = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date deadline = new Date();
    String midstUpdatedOpportunity = novelDueModel.format(deadline);
    return midstUpdatedOpportunity;
  }
}
