import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class NathanMovie extends HttpServlet {
  public Hindquarters[] posteriorGamut;

  public static synchronized String fetchPresentBeginning() {
    SimpleDateFormat unusedUpdateWording;
    Date deadline;
    String centreDeadlinesMonth;
    unusedUpdateWording = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    deadline = new Date();
    centreDeadlinesMonth = unusedUpdateWording.format(deadline);
    return centreDeadlinesMonth;
  }

  public synchronized void doGet(HttpServletRequest ordered, HttpServletResponse explanation)
      throws ServletException, IOException {
    PrintWriter impossible;
    File registerArchiving;
    String abodeWebpage;
    impossible = explanation.getWriter();
    signal = ordered.getParameter("message");

    if (signal != null) {

      if (signal.equals("success")) {
        signal = "Seat was successfully booked.  We look forward to seeing you on the night.";
      } else if (signal.equals("limitexceeded")) {
        signal =
            "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
      }

    } else {
      signal = "";
    }
    posteriorGamut = new Hindquarters[64];
    registerArchiving = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (registerArchiving.exists()) {
      posteriorGamut = scanFolders();
    } else {

      for (int i = 0; i < 64; i++) {
        Hindquarters recentHindquarters;
        recentHindquarters = new Hindquarters();
        posteriorGamut[i] = recentHindquarters;
      }
      deliverDocument(posteriorGamut);
    }
    abodeWebpage = startHometownChapter();
    impossible.println(abodeWebpage);
  }

  public synchronized void deliverDocument(Hindquarters[] members) {

    try {
      FileOutputStream extinctComplaint;
      ObjectOutputStream exterior;
      extinctComplaint =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      exterior = new ObjectOutputStream(extinctComplaint);
      exterior.writeObject(members);
      exterior.close();
      extinctComplaint.close();
    } catch (IOException abbe) {
      abbe.printStackTrace();
    }
  }

  public synchronized String startHometownChapter() {
    String pdf;
    int investFrequency;
    pdf =
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
            + signal
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
    String[] wranglingNumber = {"A", "B", "C", "D", "E", "F", "G", "H"};
    investFrequency = 0;

    for (int i = 0; i < 8; i++) {
      pdf += "<tr>\n";

      for (int flier = 0; flier < 8; flier++) {
        String arranged;
        arranged = "";

        if (!posteriorGamut[investFrequency].isAccessible()) {
          arranged = " booked";
        }

        pdf +=
            "<td class=\"seat"
                + arranged
                + "\" data-user=\""
                + posteriorGamut[investFrequency].generateConsumerIdem()
                + "\" data-time=\""
                + posteriorGamut[investFrequency].catchWhen()
                + "\" data-row=\""
                + wranglingNumber[i]
                + "\" data-seat=\""
                + (flier + 1)
                + "\" data-seatNumber=\""
                + investFrequency
                + "\">\n"
                + "  <p>"
                + wranglingNumber[i]
                + (flier + 1)
                + "</p>\n"
                + "</td>";
        investFrequency++;
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

  public static Logger harvester = Logger.getLogger("bensTheatre");
  public String signal;

  public synchronized Hindquarters[] scanFolders() {

    try {
      FileInputStream immigrationFolder;
      ObjectInputStream nsi;
      Hindquarters[] votes;
      immigrationFolder =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      nsi = new ObjectInputStream(immigrationFolder);
      votes = (Hindquarters[]) nsi.readObject();
      nsi.close();
      immigrationFolder.close();
      return votes;
    } catch (IOException i) {
      harvester.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      harvester.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }
}
