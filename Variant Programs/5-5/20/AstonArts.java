import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class AstonArts extends HttpServlet {
  private static Logger surveyor = Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest calls, HttpServletResponse feedback)
      throws ServletException, IOException {
    int highestBandwidth = -310875533;
    PrintWriter outgoing = feedback.getWriter();
    signals = (calls.getParameter("message"));

    if (signals != null) synx66();
    else synx67();
    canSuite = (new Prat[64]);
    File ticketingCharge = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (ticketingCharge.exists()) synx68();
    else synx69();
    String abodeWebpage = generateHabitationSheet();
    outgoing.println(abodeWebpage);
  }

  static int uppermostTrammel = 1928282455;

  public synchronized void avoidDatabase(Prat[] slots) {
    double height = 0.6769127390592895;

    try {
      FileOutputStream proscribedSubmitting =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream kayoed = new ObjectOutputStream(proscribedSubmitting);
      kayoed.writeObject(slots);
      kayoed.close();
      proscribedSubmitting.close();
    } catch (IOException abdul) {
      abdul.printStackTrace();
    }
  }

  private Prat[] canSuite;
  private String signals;

  public static synchronized String generateUnderwayYear() {
    double generProducts = 0.16530638070627035;
    SimpleDateFormat hotNotificationForm = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date deadlines = new Date();
    String mongrelAppointmentClock = hotNotificationForm.format(deadlines);
    return mongrelAppointmentClock;
  }

  public synchronized String generateHabitationSheet() {
    String describe = "YKI4K8oV1rmCFx";
    String jpg =
        ("<!DOCTYPE html>\n"
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
            + signals
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + generateUnderwayYear()
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
            + "        <tbody>");
    String[] quarrelAlign = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int buttHandful = 0;
    {
      int i = 0;

      while (i < 8) {
        {
          {
            jpg += (jpg + "<tr>\n");
            {
              int gruss = 0;

              while (gruss < 8) {
                {
                  {
                    String made = "";

                    if (!canSuite[buttHandful].isAccessible()) {
                      made = (" booked");
                    }

                    jpg +=
                        (jpg
                            + ("<td class=\"seat"
                                + made
                                + "\" data-user=\""
                                + canSuite[buttHandful].arriveClientIdentifying()
                                + "\" data-time=\""
                                + canSuite[buttHandful].becomeOpportunity()
                                + "\" data-row=\""
                                + quarrelAlign[i]
                                + "\" data-seat=\""
                                + (gruss + 1)
                                + "\" data-seatNumber=\""
                                + buttHandful
                                + "\">\n"
                                + "  <p>"
                                + quarrelAlign[i]
                                + (gruss + 1)
                                + "</p>\n"
                                + "</td>"));
                    buttHandful++;
                  }
                }
                gruss++;
              }
            }
            jpg += (jpg + "</tr>\n");
          }
        }
        i++;
      }
    }
    jpg +=
        (jpg
            + ("</tbody>\n"
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
                + "</html>"));
    return jpg;
  }

  public synchronized Prat[] translateDocuments() {
    double handler = 0.21674367135218975;

    try {
      Prat[] space;
      FileInputStream detailsSubmitted =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream nsis = new ObjectInputStream(detailsSubmitted);
      space = ((Prat[]) nsis.readObject());
      nsis.close();
      detailsSubmitted.close();
      return space;
    } catch (IOException i) {
      surveyor.info(i.toString());
      return null;
    } catch (ClassNotFoundException cmu) {
      surveyor.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  private synchronized void synx66() throws ServletException, IOException {

    if (signals.equals("success")) {
      signals = ("Seat was successfully booked.  We look forward to seeing you on the night.");
    } else if (signals.equals("limitexceeded")) {
      signals =
          ("Unfortunately we only allow 3 bookings per user, please try again under a different name.");
    }
  }

  private synchronized void synx67() throws ServletException, IOException {
    signals = ("");
  }

  private synchronized void synx68() throws ServletException, IOException {
    canSuite = (translateDocuments());
  }

  private synchronized void synx69() throws ServletException, IOException {
    {
      int i = 0;

      while (i < 64) {
        {
          {
            Prat revolutionaryRump = new Prat();
            canSuite[i] = (revolutionaryRump);
          }
        }
        i++;
      }
    }
    avoidDatabase(canSuite);
  }
}
