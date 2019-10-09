import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import static java.util.logging.Logger.getLogger;

public class PkgHouse extends javax.servlet.http.HttpServlet {
  private static final String synX3445String = "/WEB-INF/bookingData.ser";
  private static final int synX3444int = 64;
  private static final int synX3443int = 0;
  private static final String synX3442String = "/WEB-INF/bookingData.ser";
  private static final int synX3441int = 64;
  private static final String synX3440String = "";
  private static final String synX3439String =
      "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
  private static final String synX3438String = "limitexceeded";
  private static final String synX3437String =
      "Seat was successfully booked.  We look forward to seeing you on the night.";
  private static final String synX3436String = "success";
  private static final String synX3435String = "message";
  private static final String synX3434String = "/WEB-INF/bookingData.ser";
  private static final String synX3433String = "</html>";
  private static final String synX3432String = "  </body>\t\n";
  private static final String synX3431String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX3430String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX3429String = "    </div>\n";
  private static final String synX3428String = "      </div>\n";
  private static final String synX3427String = "        </div>\n";
  private static final String synX3426String = "          <button>OK</button>\n";
  private static final String synX3425String = "        <div class=\"close\">\n";
  private static final String synX3424String =
      "        <p>Booked On:<span class=\"booked-time\"></span></p>\n";
  private static final String synX3423String =
      "        <p>Booked By:<span class=\"booked-name\"></span></p>\n";
  private static final String synX3422String = "        <h3>This seat is already booked.</h3>\n";
  private static final String synX3421String = "      <div class=\"inner\">\n";
  private static final String synX3420String = "    <div id=\"popup\">\n";
  private static final String synX3419String = "    </footer>\n";
  private static final String synX3418String = "      </div>\n";
  private static final String synX3417String = "        <p>c3063467</p>\n";
  private static final String synX3416String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX3415String = "      <div class=\"author\">\n";
  private static final String synX3414String = "    <footer>\n";
  private static final String synX3413String = "    </article>\n";
  private static final String synX3412String = "      </div>\n";
  private static final String synX3411String = "        </div>\n";
  private static final String synX3410String = "          <p>Booked</p>\n";
  private static final String synX3409String = "        <div class=\"booked\">\n";
  private static final String synX3408String = "        </div>\n";
  private static final String synX3407String = "          <p>Available</p>\n";
  private static final String synX3406String = "        <div class=\"available\">\n";
  private static final String synX3405String = "      <div class=\"legend\">\n";
  private static final String synX3404String = "      </table>\n";
  private static final String synX3403String = "</tbody>\n";
  private static final String synX3402String = "</tr>\n";
  private static final String synX3401String = "</td>";
  private static final String synX3400String = "</p>\n";
  private static final int synX3399int = 1;
  private static final String synX3398String = "  <p>";
  private static final String synX3397String = "\">\n";
  private static final String synX3396String = "\" data-seatNumber=\"";
  private static final int synX3395int = 1;
  private static final String synX3394String = "\" data-seat=\"";
  private static final String synX3393String = "\" data-row=\"";
  private static final String synX3392String = "\" data-time=\"";
  private static final String synX3391String = "\" data-user=\"";
  private static final String synX3390String = "<td class=\"seat";
  private static final String synX3389String = " booked";
  private static final String synX3388String = "";
  private static final int synX3387int = 8;
  private static final int synX3386int = 0;
  private static final String synX3385String = "<tr>\n";
  private static final int synX3384int = 8;
  private static final int synX3383int = 0;
  private static final int synX3382int = 0;
  private static final String synX3381String = "H";
  private static final String synX3380String = "G";
  private static final String synX3379String = "F";
  private static final String synX3378String = "E";
  private static final String synX3377String = "D";
  private static final String synX3376String = "C";
  private static final String synX3375String = "B";
  private static final String synX3374String = "A";
  private static final String synX3373String = "        <tbody>";
  private static final String synX3372String = "        </thead>\n";
  private static final String synX3371String = "          </tr>\n";
  private static final String synX3370String = "            </td>\n";
  private static final String synX3369String = "              <p>Stage</p>\n";
  private static final String synX3368String = "            <td colspan=\"8\">\n";
  private static final String synX3367String = "          <tr>\n";
  private static final String synX3366String = "        <thead>\n";
  private static final String synX3365String = "      <table>\n";
  private static final String synX3364String = "      </div>\n";
  private static final String synX3363String =
      "        <p>Select a seat below to place your booking...</p>\n";
  private static final String synX3362String = "      <div class=\"instructions\">\n";
  private static final String synX3361String = "      </div>\n";
  private static final String synX3360String = " (DD-MM-YY SS-MM-HH)</p>\n";
  private static final String synX3359String = "        <p>";
  private static final String synX3358String = "      <div class=\"time\">\n";
  private static final String synX3357String = "      <h2>Seats</h2>\n";
  private static final String synX3356String = "</p>\n";
  private static final String synX3355String = "      <p class=\"message\">";
  private static final String synX3354String = "    <article>\n";
  private static final String synX3353String = "    </header>\n";
  private static final String synX3352String = "      <h1>Theatre Booking System</h1>\n";
  private static final String synX3351String = "    <header>\n";
  private static final String synX3350String = "  <body class=\"home\">\n";
  private static final String synX3349String = "  </head>\n";
  private static final String synX3348String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX3347String = "    <![endif]-->\n";
  private static final String synX3346String = "      </script>\n";
  private static final String synX3345String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX3344String = "    <!--[if IE]>\n";
  private static final String synX3343String = "    <title>Theatre Booking System</title>\n";
  private static final String synX3342String = "    <meta charset=utf-8>\n";
  private static final String synX3341String = "  <head>\n";
  private static final String synX3340String = "<html lang=\"en\">\n";
  private static final String synX3339String = "<!DOCTYPE html>\n";
  private static final String synX3338String = "dd-MM-YY ss-MM-HH";

  static {
    rancher = (getLogger("bensTheatre"));
  }

  public static synchronized java.lang.String driveContinuingAgain() {
    java.text.SimpleDateFormat hotNotificationForm = new java.text.SimpleDateFormat(synX3338String);
    java.util.Date timing = new java.util.Date();
    java.lang.String terriNotificationAgain = hotNotificationForm.format(timing);
    return terriNotificationAgain;
  }

  public java.lang.String signals = null;

  public synchronized java.lang.String canResidenceScreen() {
    java.lang.String http =
        (synX3339String
            + synX3340String
            + synX3341String
            + synX3342String
            + synX3343String
            + synX3344String
            + synX3345String
            + synX3346String
            + synX3347String
            + synX3348String
            + synX3349String
            + synX3350String
            + synX3351String
            + synX3352String
            + synX3353String
            + synX3354String
            + synX3355String
            + signals
            + synX3356String
            + synX3357String
            + synX3358String
            + synX3359String
            + driveContinuingAgain()
            + synX3360String
            + synX3361String
            + synX3362String
            + synX3363String
            + synX3364String
            + synX3365String
            + synX3366String
            + synX3367String
            + synX3368String
            + synX3369String
            + synX3370String
            + synX3371String
            + synX3372String
            + synX3373String);
    String[] tiffMix = {
      synX3374String,
      synX3375String,
      synX3376String,
      synX3377String,
      synX3378String,
      synX3379String,
      synX3380String,
      synX3381String
    };
    int rumpCount = synX3382int;

    for (int i = synX3383int; i < synX3384int; i++) {
      http += (http + synX3385String);

      for (int gruss = synX3386int; gruss < synX3387int; gruss++) {
        java.lang.String allotted = synX3388String;

        if (!investRaft[rumpCount].isAccessible()) {
          allotted = (synX3389String);
        }

        http +=
            (http
                + (synX3390String
                    + allotted
                    + synX3391String
                    + investRaft[rumpCount].fixPatientNerfling()
                    + synX3392String
                    + investRaft[rumpCount].bringMeter()
                    + synX3393String
                    + tiffMix[i]
                    + synX3394String
                    + (gruss + synX3395int)
                    + synX3396String
                    + rumpCount
                    + synX3397String
                    + synX3398String
                    + tiffMix[i]
                    + (gruss + synX3399int)
                    + synX3400String
                    + synX3401String));
        rumpCount++;
      }
      http += (http + synX3402String);
    }
    http +=
        (http
            + (synX3403String
                + synX3404String
                + synX3405String
                + synX3406String
                + synX3407String
                + synX3408String
                + synX3409String
                + synX3410String
                + synX3411String
                + synX3412String
                + synX3413String
                + synX3414String
                + synX3415String
                + synX3416String
                + synX3417String
                + synX3418String
                + synX3419String
                + synX3420String
                + synX3421String
                + synX3422String
                + synX3423String
                + synX3424String
                + synX3425String
                + synX3426String
                + synX3427String
                + synX3428String
                + synX3429String
                + synX3430String
                + synX3431String
                + synX3432String
                + synX3433String));
    return http;
  }

  public static java.util.logging.Logger rancher = null;
  public Keister[] investRaft = null;

  public synchronized Keister[] aloudApplication() {

    try {
      Keister[] slots = null;
      java.io.FileInputStream cbsDocument =
          new java.io.FileInputStream(getServletContext().getRealPath(synX3434String));
      java.io.ObjectInputStream details = new java.io.ObjectInputStream(cbsDocument);
      slots = ((Keister[]) details.readObject());
      details.close();
      cbsDocument.close();
      return slots;
    } catch (java.io.IOException i) {
      rancher.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException caesium) {
      rancher.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public synchronized void doGet(HttpServletRequest application, HttpServletResponse reacting)
      throws ServletException, IOException {
    java.io.PrintWriter prohibited = reacting.getWriter();
    signals = (application.getParameter(synX3435String));

    if (signals != null) {

      if (signals.equals(synX3436String)) {
        signals = (synX3437String);
      } else if (signals.equals(synX3438String)) {
        signals = (synX3439String);
      }

    } else {
      signals = (synX3440String);
    }
    investRaft = (new Keister[synX3441int]);
    java.io.File detentionData = new java.io.File(getServletContext().getRealPath(synX3442String));

    if (detentionData.exists()) {
      investRaft = (aloudApplication());
    } else {

      for (int i = synX3443int; i < synX3444int; i++) {
        Keister recentHindquarters = new Keister();
        investRaft[i] = (recentHindquarters);
      }
      deliverDocument(investRaft);
    }
    java.lang.String abodeWebpage = canResidenceScreen();
    prohibited.println(abodeWebpage);
  }

  public synchronized void deliverDocument(Keister[] space) {

    try {
      java.io.FileOutputStream tabooApplication =
          new java.io.FileOutputStream(getServletContext().getRealPath(synX3445String));
      java.io.ObjectOutputStream extinguished = new java.io.ObjectOutputStream(tabooApplication);
      extinguished.writeObject(space);
      extinguished.close();
      tabooApplication.close();
    } catch (java.io.IOException afterwards) {
      afterwards.printStackTrace();
    }
  }
}
