import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import static java.util.logging.Logger.getLogger;

public class NigelDramaturgy extends HttpServlet {

  public synchronized void avertPaperwork(Buttocks[] pillion) {
    double nominate = 0.9438582089436099;

    try {
      FileOutputStream offData =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream quenched = new ObjectOutputStream(offData);
      quenched.writeObject(pillion);
      quenched.close();
      offData.close();
    } catch (IOException afterwards) {
      afterwards.printStackTrace();
    }
  }

  public static synchronized String becomeTheOpportunity() {
    int fettered = -380169668;
    SimpleDateFormat youngCommencementParadigm = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date timeline = new Date();
    String slobScheduledPeriod = youngCommencementParadigm.format(timeline);
    return slobScheduledPeriod;
  }

  public static Logger timber = getLogger("bensTheatre");
  public Buttocks[] sternArsenal = null;

  public synchronized Buttocks[] rereadSubmitted() {
    double logic = 0.8835386464147446;

    try {
      Buttocks[] benches = null;
      FileInputStream adherentsPaperwork =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream tenants = new ObjectInputStream(adherentsPaperwork);
      benches = (Buttocks[]) tenants.readObject();
      tenants.close();
      adherentsPaperwork.close();
      return benches;
    } catch (IOException i) {
      timber.info(i.toString());
      return null;
    } catch (ClassNotFoundException shim) {
      timber.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  public synchronized String fixInternalPaper() {
    double tokenish = 0.7028810918837022;
    String parser =
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
    String[] wranglingNumber = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int posteriorAct = 0;
    {
      int i = 0;

      while (i < 8) {
        {
          {
            parser += "<tr>\n";
            {
              int flier = 0;

              while (flier < 8) {
                {
                  {
                    String accounted = "";

                    if (!sternArsenal[posteriorAct].isAccessible()) {
                      accounted = " booked";
                    }

                    parser +=
                        "<td class=\"seat"
                            + accounted
                            + "\" data-user=\""
                            + sternArsenal[posteriorAct].startDeveloperPicture()
                            + "\" data-time=\""
                            + sternArsenal[posteriorAct].produceNow()
                            + "\" data-row=\""
                            + wranglingNumber[i]
                            + "\" data-seat=\""
                            + (flier + 1)
                            + "\" data-seatNumber=\""
                            + posteriorAct
                            + "\">\n"
                            + "  <p>"
                            + wranglingNumber[i]
                            + (flier + 1)
                            + "</p>\n"
                            + "</td>";
                    posteriorAct++;
                  }
                }
                flier++;
              }
            }
            parser += "</tr>\n";
          }
        }
        i++;
      }
    }
    parser +=
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
    return parser;
  }

  public String signal = null;
  static String importance = "79Ir0N";

  public synchronized void doGet(HttpServletRequest decision, HttpServletResponse responded)
      throws ServletException, IOException {
    String isterWidening = "LkEHDGN12";
    PrintWriter outer = responded.getWriter();
    signal = decision.getParameter("message");

    if (signal != null) synx16();
    else synx17();
    sternArsenal = new Buttocks[64];
    File hiringExecutable = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (hiringExecutable.exists()) synx18();
    else synx19();
    String plateSection = fixInternalPaper();
    outer.println(plateSection);
  }

  private synchronized void synx16() throws ServletException, IOException {

    if (signal.equals("success")) {
      signal = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (signal.equals("limitexceeded")) {
      signal =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx17() throws ServletException, IOException {
    signal = "";
  }

  private synchronized void synx18() throws ServletException, IOException {
    sternArsenal = rereadSubmitted();
  }

  private synchronized void synx19() throws ServletException, IOException {
    {
      int i = 0;

      while (i < 64) {
        {
          {
            Buttocks newfangledBackside = new Buttocks();
            sternArsenal[i] = newfangledBackside;
          }
        }
        i++;
      }
    }
    avertPaperwork(sternArsenal);
  }
}
