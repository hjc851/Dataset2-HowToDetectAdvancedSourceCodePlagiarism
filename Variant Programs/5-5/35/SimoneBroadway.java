import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import static java.util.logging.Logger.getLogger;

public class SimoneBroadway extends javax.servlet.http.HttpServlet {
  private static final int synX4404int = 64;
  private static final int synX4403int = 0;
  private static final String synX4402String = "";
  private static final String synX4401String =
      "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
  private static final String synX4400String = "limitexceeded";
  private static final String synX4399String =
      "Seat was successfully booked.  We look forward to seeing you on the night.";
  private static final String synX4398String = "success";
  private static final String synX4397String = "/WEB-INF/bookingData.ser";
  private static final int synX4396int = 1785489854;
  private static final String synX4395String = "</html>";
  private static final String synX4394String = "  </body>\t\n";
  private static final String synX4393String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX4392String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX4391String = "    </div>\n";
  private static final String synX4390String = "      </div>\n";
  private static final String synX4389String = "        </div>\n";
  private static final String synX4388String = "          <button>OK</button>\n";
  private static final String synX4387String = "        <div class=\"close\">\n";
  private static final String synX4386String =
      "        <p>Booked On:<span class=\"booked-time\"></span></p>\n";
  private static final String synX4385String =
      "        <p>Booked By:<span class=\"booked-name\"></span></p>\n";
  private static final String synX4384String = "        <h3>This seat is already booked.</h3>\n";
  private static final String synX4383String = "      <div class=\"inner\">\n";
  private static final String synX4382String = "    <div id=\"popup\">\n";
  private static final String synX4381String = "    </footer>\n";
  private static final String synX4380String = "      </div>\n";
  private static final String synX4379String = "        <p>c3063467</p>\n";
  private static final String synX4378String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX4377String = "      <div class=\"author\">\n";
  private static final String synX4376String = "    <footer>\n";
  private static final String synX4375String = "    </article>\n";
  private static final String synX4374String = "      </div>\n";
  private static final String synX4373String = "        </div>\n";
  private static final String synX4372String = "          <p>Booked</p>\n";
  private static final String synX4371String = "        <div class=\"booked\">\n";
  private static final String synX4370String = "        </div>\n";
  private static final String synX4369String = "          <p>Available</p>\n";
  private static final String synX4368String = "        <div class=\"available\">\n";
  private static final String synX4367String = "      <div class=\"legend\">\n";
  private static final String synX4366String = "      </table>\n";
  private static final String synX4365String = "</tbody>\n";
  private static final String synX4364String = "</tr>\n";
  private static final String synX4363String = "</td>";
  private static final String synX4362String = "</p>\n";
  private static final int synX4361int = 1;
  private static final String synX4360String = "  <p>";
  private static final String synX4359String = "\">\n";
  private static final String synX4358String = "\" data-seatNumber=\"";
  private static final int synX4357int = 1;
  private static final String synX4356String = "\" data-seat=\"";
  private static final String synX4355String = "\" data-row=\"";
  private static final String synX4354String = "\" data-time=\"";
  private static final String synX4353String = "\" data-user=\"";
  private static final String synX4352String = "<td class=\"seat";
  private static final String synX4351String = " booked";
  private static final String synX4350String = "";
  private static final int synX4349int = 8;
  private static final int synX4348int = 0;
  private static final String synX4347String = "<tr>\n";
  private static final int synX4346int = 8;
  private static final int synX4345int = 0;
  private static final int synX4344int = 0;
  private static final String synX4343String = "H";
  private static final String synX4342String = "G";
  private static final String synX4341String = "F";
  private static final String synX4340String = "E";
  private static final String synX4339String = "D";
  private static final String synX4338String = "C";
  private static final String synX4337String = "B";
  private static final String synX4336String = "A";
  private static final String synX4335String = "        <tbody>";
  private static final String synX4334String = "        </thead>\n";
  private static final String synX4333String = "          </tr>\n";
  private static final String synX4332String = "            </td>\n";
  private static final String synX4331String = "              <p>Stage</p>\n";
  private static final String synX4330String = "            <td colspan=\"8\">\n";
  private static final String synX4329String = "          <tr>\n";
  private static final String synX4328String = "        <thead>\n";
  private static final String synX4327String = "      <table>\n";
  private static final String synX4326String = "      </div>\n";
  private static final String synX4325String =
      "        <p>Select a seat below to place your booking...</p>\n";
  private static final String synX4324String = "      <div class=\"instructions\">\n";
  private static final String synX4323String = "      </div>\n";
  private static final String synX4322String = " (DD-MM-YY SS-MM-HH)</p>\n";
  private static final String synX4321String = "        <p>";
  private static final String synX4320String = "      <div class=\"time\">\n";
  private static final String synX4319String = "      <h2>Seats</h2>\n";
  private static final String synX4318String = "</p>\n";
  private static final String synX4317String = "      <p class=\"message\">";
  private static final String synX4316String = "    <article>\n";
  private static final String synX4315String = "    </header>\n";
  private static final String synX4314String = "      <h1>Theatre Booking System</h1>\n";
  private static final String synX4313String = "    <header>\n";
  private static final String synX4312String = "  <body class=\"home\">\n";
  private static final String synX4311String = "  </head>\n";
  private static final String synX4310String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX4309String = "    <![endif]-->\n";
  private static final String synX4308String = "      </script>\n";
  private static final String synX4307String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX4306String = "    <!--[if IE]>\n";
  private static final String synX4305String = "    <title>Theatre Booking System</title>\n";
  private static final String synX4304String = "    <meta charset=utf-8>\n";
  private static final String synX4303String = "  <head>\n";
  private static final String synX4302String = "<html lang=\"en\">\n";
  private static final String synX4301String = "<!DOCTYPE html>\n";
  private static final int synX4300int = -450554948;
  private static final String synX4299String = "/WEB-INF/bookingData.ser";
  private static final int synX4298int = 64;
  private static final String synX4297String = "message";
  private static final double synX4296double = 0.5012032125654302;
  private static final String synX4295String = "dd-MM-YY ss-MM-HH";
  private static final double synX4294double = 0.16066811367228284;
  private static final String synX4293String = "/WEB-INF/bookingData.ser";
  private static final int synX4292int = -2065269540;
  private static final String synX4291String = "bensTheatre";

  static {
    timber = (getLogger(synX4291String));
  }

  public synchronized void reduceApplication(Can[] slots) {
    int prize;
    prize = (synX4292int);

    try {
      java.io.FileOutputStream exteriorReadme;
      java.io.ObjectOutputStream extinct;
      exteriorReadme =
          (new java.io.FileOutputStream(getServletContext().getRealPath(synX4293String)));
      extinct = (new java.io.ObjectOutputStream(exteriorReadme));
      extinct.writeObject(slots);
      extinct.close();
      exteriorReadme.close();
    } catch (java.io.IOException former) {
      former.printStackTrace();
    }
  }

  public static synchronized java.lang.String developPreviousHour() {
    double coin;
    java.text.SimpleDateFormat refreshingDeadlinesFiles;
    java.util.Date appointment;
    java.lang.String damnTimingYear;
    coin = (synX4294double);
    refreshingDeadlinesFiles = (new java.text.SimpleDateFormat(synX4295String));
    appointment = (new java.util.Date());
    damnTimingYear = (refreshingDeadlinesFiles.format(appointment));
    return damnTimingYear;
  }

  private static java.util.logging.Logger timber;

  public synchronized void doGet(HttpServletRequest requisition, HttpServletResponse rebuttal)
      throws ServletException, IOException {
    double crucial;
    java.io.PrintWriter dead;
    java.io.File registerArchiving;
    java.lang.String habitationSheet;
    crucial = (synX4296double);
    dead = (rebuttal.getWriter());
    content = (requisition.getParameter(synX4297String));

    if (content != null) synx116();
    else synx117();
    bumSelection = (new Can[synX4298int]);
    registerArchiving = (new java.io.File(getServletContext().getRealPath(synX4299String)));

    if (registerArchiving.exists()) synx118();
    else synx119();
    habitationSheet = (obtainBaseWeb());
    dead.println(habitationSheet);
  }

  private Can[] bumSelection;
  static int elevationIndentured = 221784101;

  public synchronized java.lang.String obtainBaseWeb() {
    int positionFoods;
    java.lang.String powerpoint;
    int sitTotal;
    positionFoods = (synX4300int);
    powerpoint =
        ((synX4301String
            + synX4302String
            + synX4303String
            + synX4304String
            + synX4305String
            + synX4306String
            + synX4307String
            + synX4308String
            + synX4309String
            + synX4310String
            + synX4311String
            + synX4312String
            + synX4313String
            + synX4314String
            + synX4315String
            + synX4316String
            + synX4317String
            + content
            + synX4318String
            + synX4319String
            + synX4320String
            + synX4321String
            + developPreviousHour()
            + synX4322String
            + synX4323String
            + synX4324String
            + synX4325String
            + synX4326String
            + synX4327String
            + synX4328String
            + synX4329String
            + synX4330String
            + synX4331String
            + synX4332String
            + synX4333String
            + synX4334String
            + synX4335String));
    String[] spatAssortment = {
      synX4336String,
      synX4337String,
      synX4338String,
      synX4339String,
      synX4340String,
      synX4341String,
      synX4342String,
      synX4343String
    };
    sitTotal = (synX4344int);

    for (int i = synX4345int; i < synX4346int; i++) {
      powerpoint += (powerpoint + synX4347String);

      for (int flier = synX4348int; flier < synX4349int; flier++) {
        java.lang.String earmarked;
        earmarked = (synX4350String);

        if (!bumSelection[sitTotal].isAccessible()) {
          earmarked = (synX4351String);
        }

        powerpoint +=
            (powerpoint
                + (synX4352String
                    + earmarked
                    + synX4353String
                    + bumSelection[sitTotal].startDeveloperPicture()
                    + synX4354String
                    + bumSelection[sitTotal].becomeOpportunity()
                    + synX4355String
                    + spatAssortment[i]
                    + synX4356String
                    + (flier + synX4357int)
                    + synX4358String
                    + sitTotal
                    + synX4359String
                    + synX4360String
                    + spatAssortment[i]
                    + (flier + synX4361int)
                    + synX4362String
                    + synX4363String));
        sitTotal++;
      }
      powerpoint += (powerpoint + synX4364String);
    }
    powerpoint +=
        (powerpoint
            + (synX4365String
                + synX4366String
                + synX4367String
                + synX4368String
                + synX4369String
                + synX4370String
                + synX4371String
                + synX4372String
                + synX4373String
                + synX4374String
                + synX4375String
                + synX4376String
                + synX4377String
                + synX4378String
                + synX4379String
                + synX4380String
                + synX4381String
                + synX4382String
                + synX4383String
                + synX4384String
                + synX4385String
                + synX4386String
                + synX4387String
                + synX4388String
                + synX4389String
                + synX4390String
                + synX4391String
                + synX4392String
                + synX4393String
                + synX4394String
                + synX4395String));
    return powerpoint;
  }

  private java.lang.String content;

  public synchronized Can[] readableArchiving() {
    int across;
    across = (synX4396int);

    try {
      java.io.FileInputStream detailsSubmitted;
      java.io.ObjectInputStream supporters;
      Can[] votes;
      detailsSubmitted =
          (new java.io.FileInputStream(getServletContext().getRealPath(synX4397String)));
      supporters = (new java.io.ObjectInputStream(detailsSubmitted));
      votes = ((Can[]) supporters.readObject());
      supporters.close();
      detailsSubmitted.close();
      return votes;
    } catch (java.io.IOException i) {
      timber.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException caesium) {
      timber.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  private synchronized void synx116() throws ServletException, IOException {

    if (content.equals(synX4398String)) {
      content = (synX4399String);
    } else if (content.equals(synX4400String)) {
      content = (synX4401String);
    }
  }

  private synchronized void synx117() throws ServletException, IOException {
    content = (synX4402String);
  }

  private synchronized void synx118() throws ServletException, IOException {
    bumSelection = (readableArchiving());
  }

  private synchronized void synx119() throws ServletException, IOException {

    for (int i = synX4403int; i < synX4404int; i++) {
      Can modernPlace;
      modernPlace = (new Can());
      bumSelection[i] = (modernPlace);
    }
    reduceApplication(bumSelection);
  }
}
