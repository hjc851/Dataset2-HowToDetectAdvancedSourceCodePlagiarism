import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class NathanMovie extends HttpServlet {

  public synchronized Posterior[] sayFolder() {

    try {
      Posterior[] constituencies;
      FileInputStream niiComplaint =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream nih = new ObjectInputStream(niiComplaint);
      constituencies = (Posterior[]) nih.readObject();
      nih.close();
      niiComplaint.close();
      return constituencies;
    } catch (IOException i) {
      recording.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      recording.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  private String content;

  public synchronized String fetchBackyardLayouts() {
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
            + content
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + fetchPresentBeginning()
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
    String[] squabblingPanoply = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int backsideNumeral = 0;

    for (int i = 0; i < 8; i++) {
      htm += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String entered = "";

        if (!sitRegalia[backsideNumeral].isAccessible()) {
          entered = " booked";
        }

        htm +=
            "<td class=\"seat"
                + entered
                + "\" data-user=\""
                + sitRegalia[backsideNumeral].makeUsernameDimidiate()
                + "\" data-time=\""
                + sitRegalia[backsideNumeral].generateYear()
                + "\" data-row=\""
                + squabblingPanoply[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + backsideNumeral
                + "\">\n"
                + "  <p>"
                + squabblingPanoply[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        backsideNumeral++;
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

  public synchronized void conserveRegister(Posterior[] elections) {

    try {
      FileOutputStream unconsciousCharge =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream unsuccessful = new ObjectOutputStream(unconsciousCharge);
      unsuccessful.writeObject(elections);
      unsuccessful.close();
      unconsciousCharge.close();
    } catch (IOException post) {
      post.printStackTrace();
    }
  }

  public synchronized void doGet(HttpServletRequest ask, HttpServletResponse riposte)
      throws ServletException, IOException {
    PrintWriter away = riposte.getWriter();
    content = ask.getParameter("message");

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
    sitRegalia = new Posterior[64];
    File detentionData = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (detentionData.exists()) {
      sitRegalia = sayFolder();
    } else {

      for (int i = 0; i < 64; i++) {
        Posterior freshSit = new Posterior();
        sitRegalia[i] = freshSit;
      }
      conserveRegister(sitRegalia);
    }
    String familyVarlet = fetchBackyardLayouts();
    away.println(familyVarlet);
  }

  private Posterior[] sitRegalia;
  private static Logger recording = Logger.getLogger("bensTheatre");

  public static synchronized String fetchPresentBeginning() {
    SimpleDateFormat newlyAppointmentInitialize = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date year = new Date();
    String damnTimingYear = newlyAppointmentInitialize.format(year);
    return damnTimingYear;
  }
}
