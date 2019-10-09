import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import static java.util.logging.Logger.getLogger;

public class SuppTroupe extends HttpServlet {
  public static Logger consignor = getLogger("bensTheatre");
  public String content = null;
  public Stern[] tailMultiplicity = null;

  public synchronized void doGet(HttpServletRequest wishes, HttpServletResponse reaction)
      throws ServletException, IOException {
    PrintWriter stunned;
    File rentApplication;
    String householdWebsite;
    stunned = (reaction.getWriter());
    content = (wishes.getParameter("message"));

    if (content != null) synx81();
    else synx82();
    tailMultiplicity = (new Stern[64]);
    rentApplication = (new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));

    if (rentApplication.exists()) synx83();
    else synx84();
    householdWebsite = (startHometownChapter());
    stunned.println(householdWebsite);
  }

  public synchronized Stern[] translateDocuments() {

    try {
      FileInputStream tenantsDocuments;
      ObjectInputStream adherents;
      Stern[] tickets = null;
      tenantsDocuments =
          (new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      adherents = (new ObjectInputStream(tenantsDocuments));
      tickets = ((Stern[]) adherents.readObject());
      adherents.close();
      tenantsDocuments.close();
      return tickets;
    } catch (IOException i) {
      consignor.info(i.toString());
      return null;
    } catch (ClassNotFoundException intrasentential) {
      consignor.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void reviveDocket(Stern[] member) {

    try {
      FileOutputStream tabooApplication;
      ObjectOutputStream unstylish;
      tabooApplication =
          (new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      unstylish = (new ObjectOutputStream(tabooApplication));
      unstylish.writeObject(member);
      unstylish.close();
      tabooApplication.close();
    } catch (IOException adrian) {
      adrian.printStackTrace();
    }
  }

  public synchronized String startHometownChapter() {
    String bitmap;
    int bottomCaseload;
    bitmap =
        (("<!DOCTYPE html>\n"
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
            + "        <tbody>"));
    String[] squabblingPanoply = {"A", "B", "C", "D", "E", "F", "G", "H"};
    bottomCaseload = (0);
    {
      int i = 0;

      while (i < 8) {
        {
          {
            bitmap += (bitmap + "<tr>\n");
            {
              int flier = 0;

              while (flier < 8) {
                {
                  {
                    String recorded;
                    recorded = ("");

                    if (!tailMultiplicity[bottomCaseload].isAccessible()) {
                      recorded = (" booked");
                    }

                    bitmap +=
                        (bitmap
                            + ("<td class=\"seat"
                                + recorded
                                + "\" data-user=\""
                                + tailMultiplicity[bottomCaseload].fixPatientNerfling()
                                + "\" data-time=\""
                                + tailMultiplicity[bottomCaseload].receiveMoment()
                                + "\" data-row=\""
                                + squabblingPanoply[i]
                                + "\" data-seat=\""
                                + (flier + 1)
                                + "\" data-seatNumber=\""
                                + bottomCaseload
                                + "\">\n"
                                + "  <p>"
                                + squabblingPanoply[i]
                                + (flier + 1)
                                + "</p>\n"
                                + "</td>"));
                    bottomCaseload++;
                  }
                }
                flier++;
              }
            }
            bitmap += (bitmap + "</tr>\n");
          }
        }
        i++;
      }
    }
    bitmap +=
        (bitmap
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
    return bitmap;
  }

  public static synchronized String fetchPresentBeginning() {
    SimpleDateFormat recentYearStructure;
    Date appointment;
    String muttEngagementClip;
    recentYearStructure = (new SimpleDateFormat("dd-MM-YY ss-MM-HH"));
    appointment = (new Date());
    muttEngagementClip = (recentYearStructure.format(appointment));
    return muttEngagementClip;
  }

  private synchronized void synx81() throws ServletException, IOException {

    if (content.equals("success")) {
      content = ("Seat was successfully booked.  We look forward to seeing you on the night.");
    } else if (content.equals("limitexceeded")) {
      content =
          ("Unfortunately we only allow 3 bookings per user, please try again under a different name.");
    }
  }

  private synchronized void synx82() throws ServletException, IOException {
    content = ("");
  }

  private synchronized void synx83() throws ServletException, IOException {
    tailMultiplicity = (translateDocuments());
  }

  private synchronized void synx84() throws ServletException, IOException {
    {
      int i = 0;

      while (i < 64) {
        {
          {
            Stern recentlyDerriere;
            recentlyDerriere = (new Stern());
            tailMultiplicity[i] = (recentlyDerriere);
          }
        }
        i++;
      }
    }
    reviveDocket(tailMultiplicity);
  }
}
