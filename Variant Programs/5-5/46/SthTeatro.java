import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import static java.util.logging.Logger.getLogger;

public class SthTeatro extends javax.servlet.http.HttpServlet {
  private static java.util.logging.Logger log = getLogger("bensTheatre");
  private java.lang.String comment;
  public static final int lowlyBoundary = -1903747041;
  private Keister[] bunsNumber;

  public synchronized void doGet(HttpServletRequest motion, HttpServletResponse replies)
      throws ServletException, IOException {
    double surname;
    java.io.PrintWriter impossible;
    java.io.File engagementRegister;
    java.lang.String domesticSummary;
    surname = (0.13875721857245593);
    impossible = (replies.getWriter());
    comment = (motion.getParameter("message"));

    if (comment != null) synx161();
    else synx162();
    bunsNumber = (new Keister[64]);
    engagementRegister =
        (new java.io.File(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));

    if (engagementRegister.exists()) synx163();
    else synx164();
    domesticSummary = (obtainBaseWeb());
    impossible.println(domesticSummary);
  }

  public synchronized Keister[] readerInitiate() {
    int universal;
    universal = (-1561492807);

    try {
      java.io.FileInputStream immigrationFolder;
      java.io.ObjectInputStream incumbents;
      Keister[] member;
      immigrationFolder =
          (new java.io.FileInputStream(
              getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      incumbents = (new java.io.ObjectInputStream(immigrationFolder));
      member = ((Keister[]) incumbents.readObject());
      incumbents.close();
      immigrationFolder.close();
      return member;
    } catch (java.io.IOException i) {
      log.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException stan) {
      log.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public synchronized void deliverDocument(Keister[] jobs) {
    String cksMaterials;
    cksMaterials = ("VYdf3MR8eJIpo");

    try {
      java.io.FileOutputStream unsuccessfulFolders;
      java.io.ObjectOutputStream off;
      unsuccessfulFolders =
          (new java.io.FileOutputStream(
              getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      off = (new java.io.ObjectOutputStream(unsuccessfulFolders));
      off.writeObject(jobs);
      off.close();
      unsuccessfulFolders.close();
    } catch (java.io.IOException vet) {
      vet.printStackTrace();
    }
  }

  public synchronized java.lang.String obtainBaseWeb() {
    String enumerate;
    java.lang.String drupal;
    int posteriorAct;
    enumerate = ("zCsOxTHIazvV");
    drupal =
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
            + comment
            + "</p>\n"
            + "      <h2>Seats</h2>\n"
            + "      <div class=\"time\">\n"
            + "        <p>"
            + sustainThisThing()
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
    String[] packSuite = {"A", "B", "C", "D", "E", "F", "G", "H"};
    posteriorAct = (0);
    {
      int i = 0;

      while (i < 8) {
        {
          {
            drupal += ("<tr>\n");
            {
              int flier = 0;

              while (flier < 8) {
                {
                  {
                    java.lang.String entered;
                    entered = ("");

                    if (!bunsNumber[posteriorAct].isAccessible()) {
                      entered = (" booked");
                    }

                    drupal +=
                        (("<td class=\"seat"
                            + entered
                            + "\" data-user=\""
                            + bunsNumber[posteriorAct].letSearcherIdentification()
                            + "\" data-time=\""
                            + bunsNumber[posteriorAct].driveAgain()
                            + "\" data-row=\""
                            + packSuite[i]
                            + "\" data-seat=\""
                            + (flier + 1)
                            + "\" data-seatNumber=\""
                            + posteriorAct
                            + "\">\n"
                            + "  <p>"
                            + packSuite[i]
                            + (flier + 1)
                            + "</p>\n"
                            + "</td>"));
                    posteriorAct++;
                  }
                }
                flier++;
              }
            }
            drupal += ("</tr>\n");
          }
        }
        i++;
      }
    }
    drupal +=
        (("</tbody>\n"
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
    return drupal;
  }

  public static synchronized java.lang.String sustainThisThing() {
    double highest;
    java.text.SimpleDateFormat newfangledCalendarVersion;
    java.util.Date escort;
    java.lang.String lewDueJuncture;
    highest = (0.3302906945364046);
    newfangledCalendarVersion = (new java.text.SimpleDateFormat("dd-MM-YY ss-MM-HH"));
    escort = (new java.util.Date());
    lewDueJuncture = (newfangledCalendarVersion.format(escort));
    return lewDueJuncture;
  }

  private synchronized void synx161() throws ServletException, IOException {

    if (comment.equals("success")) {
      comment = ("Seat was successfully booked.  We look forward to seeing you on the night.");
    } else if (comment.equals("limitexceeded")) {
      comment =
          ("Unfortunately we only allow 3 bookings per user, please try again under a different name.");
    }
  }

  private synchronized void synx162() throws ServletException, IOException {
    comment = ("");
  }

  private synchronized void synx163() throws ServletException, IOException {
    bunsNumber = (readerInitiate());
  }

  private synchronized void synx164() throws ServletException, IOException {
    {
      int i = 0;

      while (i < 64) {
        {
          {
            Keister untestedBehind;
            untestedBehind = (new Keister());
            bunsNumber[i] = (untestedBehind);
          }
        }
        i++;
      }
    }
    deliverDocument(bunsNumber);
  }
}
