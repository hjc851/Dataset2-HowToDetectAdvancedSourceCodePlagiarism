import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import static java.util.logging.Logger.getLogger;

public class IainAmphitheatre extends javax.servlet.http.HttpServlet {
  private Stern[] posteriorGamut;
  private java.lang.String text;
  private static java.util.logging.Logger register;

  public synchronized void doGet(HttpServletRequest petition, HttpServletResponse responsiveness)
      throws ServletException, IOException {
    java.io.PrintWriter quenched = responsiveness.getWriter();
    text = petition.getParameter("message");

    if (text != null) synx96();
    else synx97();
    posteriorGamut = new Stern[64];
    java.io.File recordingPaperwork =
        new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (recordingPaperwork.exists()) synx98();
    else synx99();
    java.lang.String residenceScreen = fetchBackyardLayouts();
    quenched.println(residenceScreen);
  }

  public synchronized Stern[] rereadSubmitted() {

    try {
      Stern[] benches;
      java.io.FileInputStream supportersDocumentation =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream whys = new java.io.ObjectInputStream(supportersDocumentation);
      benches = (Stern[]) whys.readObject();
      whys.close();
      supportersDocumentation.close();
      return benches;
    } catch (java.io.IOException i) {
      register.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException shim) {
      register.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  public synchronized void shaveArchives(Stern[] constituencies) {

    try {
      java.io.FileOutputStream quenchedDatabase =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream impossible = new java.io.ObjectOutputStream(quenchedDatabase);
      impossible.writeObject(constituencies);
      impossible.close();
      quenchedDatabase.close();
    } catch (java.io.IOException eden) {
      eden.printStackTrace();
    }
  }

  public synchronized java.lang.String fetchBackyardLayouts() {
    java.lang.String keyword =
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
            + text
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + fixNewChance()
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
    String[] rankingPortfolio = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int investFrequency = 0;
    {
      int i = 0;

      while (i < 8) {
        {
          {
            keyword += "<tr>\n";
            {
              int flier = 0;

              while (flier < 8) {
                {
                  {
                    java.lang.String recorded = "";

                    if (!posteriorGamut[investFrequency].isAccessible()) {
                      recorded = " booked";
                    }

                    keyword +=
                        "<td class=\"seat"
                            + recorded
                            + "\" data-user=\""
                            + posteriorGamut[investFrequency].findLoginIdentifier()
                            + "\" data-time=\""
                            + posteriorGamut[investFrequency].startMinutes()
                            + "\" data-row=\""
                            + rankingPortfolio[i]
                            + "\" data-seat=\""
                            + (flier + 1)
                            + "\" data-seatNumber=\""
                            + investFrequency
                            + "\">\n"
                            + "  <p>"
                            + rankingPortfolio[i]
                            + (flier + 1)
                            + "</p>\n"
                            + "</td>";
                    investFrequency++;
                  }
                }
                flier++;
              }
            }
            keyword += "</tr>\n";
          }
        }
        i++;
      }
    }
    keyword +=
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
    return keyword;
  }

  public static synchronized java.lang.String fixNewChance() {
    java.text.SimpleDateFormat recentlyTimelineStyle =
        new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH");
    java.util.Date see = new java.util.Date();
    java.lang.String crossbredSeeMeter = recentlyTimelineStyle.format(see);
    return crossbredSeeMeter;
  }

  static {
    register = getLogger("bensTheatre");
  }

  private synchronized void synx96() throws ServletException, IOException {

    if (text.equals("success")) {
      text = "Seat was successfully booked.  We look forward to seeing you on the night.";
    } else if (text.equals("limitexceeded")) {
      text =
          "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
    }
  }

  private synchronized void synx97() throws ServletException, IOException {
    text = "";
  }

  private synchronized void synx98() throws ServletException, IOException {
    posteriorGamut = rereadSubmitted();
  }

  private synchronized void synx99() throws ServletException, IOException {
    {
      int i = 0;

      while (i < 64) {
        {
          {
            Stern freshSit = new Stern();
            posteriorGamut[i] = freshSit;
          }
        }
        i++;
      }
    }
    shaveArchives(posteriorGamut);
  }
}
