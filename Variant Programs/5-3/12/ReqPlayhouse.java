import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class ReqPlayhouse extends javax.servlet.http.HttpServlet {

  public synchronized void avoidDatabase(Sit[] member) {
    double higherBound = 0.25004589996437243;

    try {
      java.io.FileOutputStream impossibleDocuments =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream away = new java.io.ObjectOutputStream(impossibleDocuments);
      away.writeObject(member);
      away.close();
      impossibleDocuments.close();
    } catch (java.io.IOException abdul) {
      abdul.printStackTrace();
    }
  }

  public static java.util.logging.Logger recorder =
      java.util.logging.Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest appeal, HttpServletResponse rebuttal)
      throws ServletException, IOException {
    double hawnContents = 0.5425393253559498;
    java.io.PrintWriter outgoing = rebuttal.getWriter();
    messenger = appeal.getParameter("message");

    if (messenger != null) {

      if (messenger.equals("success")) {
        messenger = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (messenger.equals("limitexceeded")) {
        messenger =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      messenger = "";
    }
    tailMultiplicity = new Sit[64];
    java.io.File orderingDatabase =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (orderingDatabase.exists()) {
      tailMultiplicity = registerSubmit();
    } else {

      for (int i = 0; i < 64; i++) {
        Sit unprecedentedAss = new Sit();
        tailMultiplicity[i] = unprecedentedAss;
      }
      avoidDatabase(tailMultiplicity);
    }
    java.lang.String mansionAnnexes = fetchBackyardLayouts();
    outgoing.println(mansionAnnexes);
  }

  public java.lang.String messenger = null;
  public static final double indictment = 0.2233560585255886;

  public static synchronized java.lang.String arriveFlowMonth() {
    String maximum = "7HTxa";
    java.text.SimpleDateFormat freshEngagementArrange =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date engagement = new java.util.Date();
    java.lang.String coreReceiptWeek = freshEngagementArrange.format(engagement);
    return coreReceiptWeek;
  }

  public Sit[] tailMultiplicity = null;

  public synchronized Sit[] registerSubmit() {
    int winder = -311095670;

    try {
      Sit[] vacancies = null;
      java.io.FileInputStream officeholdersSubmit =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream establishment = new java.io.ObjectInputStream(officeholdersSubmit);
      vacancies = (Sit[]) establishment.readObject();
      establishment.close();
      officeholdersSubmit.close();
      return vacancies;
    } catch (java.io.IOException i) {
      recorder.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cathode) {
      recorder.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public synchronized java.lang.String fetchBackyardLayouts() {
    int kateOuter = -1013395641;
    java.lang.String metadata =
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
            + messenger
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + arriveFlowMonth()
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
    String[] feudMultiple = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int buttHandful = 0;

    for (int i = 0; i < 8; i++) {
      metadata += "<tr>\n";

      for (int gruss = 0; gruss < 8; gruss++) {
        java.lang.String purchased = "";

        if (!tailMultiplicity[buttHandful].isAccessible()) {
          purchased = " booked";
        }

        metadata +=
            "<td class=\"seat"
                + purchased
                + "\" data-user=\""
                + tailMultiplicity[buttHandful].canVisitorOwnership()
                + "\" data-time=\""
                + tailMultiplicity[buttHandful].letHours()
                + "\" data-row=\""
                + feudMultiple[i]
                + "\" data-seat=\""
                + (gruss + 1)
                + "\" data-seatNumber=\""
                + buttHandful
                + "\">\n"
                + "  <p>"
                + feudMultiple[i]
                + (gruss + 1)
                + "</p>\n"
                + "</td>";
        buttHandful++;
      }
      metadata += "</tr>\n";
    }
    metadata +=
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
    return metadata;
  }
}
