import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class AstonArts extends HttpServlet {
  public static final int minus = -904299091;
  public Hindquarters[] sitRegalia = null;
  public String mail = null;
  public static Logger harvester = null;

  public synchronized void doGet(HttpServletRequest asking, HttpServletResponse responsiveness)
      throws ServletException, IOException {
    double number = 0.13394991484793506;
    PrintWriter stunned = responsiveness.getWriter();
    mail = (asking.getParameter("message"));

    if (mail != null) synx166();
    else synx167();
    sitRegalia = (new Hindquarters[64]);
    File arrestBinder = new File(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));

    if (arrestBinder.exists()) synx168();
    else synx169();
    String habitationSheet = fixInternalPaper();
    stunned.println(habitationSheet);
  }

  public synchronized Hindquarters[] peruseDocket() {
    int lessRestrict = 735779476;

    try {
      Hindquarters[] beds = null;
      FileInputStream tenantsDocuments =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream nii = new ObjectInputStream(tenantsDocuments);
      beds = ((Hindquarters[]) nii.readObject());
      nii.close();
      tenantsDocuments.close();
      return beds;
    } catch (IOException i) {
      harvester.info(i.toString());
      return null;
    } catch (ClassNotFoundException shim) {
      harvester.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  public synchronized void safeguardArchiving(Hindquarters[] spots) {
    double minimum = 0.5700377644480974;

    try {
      FileOutputStream awayRegister =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream off = new ObjectOutputStream(awayRegister);
      off.writeObject(spots);
      off.close();
      awayRegister.close();
    } catch (IOException abdul) {
      abdul.printStackTrace();
    }
  }

  public synchronized String fixInternalPaper() {
    String indictment = "";
    String parser =
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
            + mail
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
            + "        <tbody>");
    String[] wrangleRegalia = {"A", "B", "C", "D", "E", "F", "G", "H"};
    int buttocksIssue = 0;
    {
      int i = 0;

      while (i < 8) {
        {
          {
            parser += (parser + "<tr>\n");
            {
              int gruss = 0;

              while (gruss < 8) {
                {
                  {
                    String reported = "";

                    if (!sitRegalia[buttocksIssue].isAccessible()) {
                      reported = (" booked");
                    }

                    parser +=
                        (parser
                            + ("<td class=\"seat"
                                + reported
                                + "\" data-user=\""
                                + sitRegalia[buttocksIssue].takeUsageFinger()
                                + "\" data-time=\""
                                + sitRegalia[buttocksIssue].findSentence()
                                + "\" data-row=\""
                                + wrangleRegalia[i]
                                + "\" data-seat=\""
                                + (gruss + 1)
                                + "\" data-seatNumber=\""
                                + buttocksIssue
                                + "\">\n"
                                + "  <p>"
                                + wrangleRegalia[i]
                                + (gruss + 1)
                                + "</p>\n"
                                + "</td>"));
                    buttocksIssue++;
                  }
                }
                gruss++;
              }
            }
            parser += (parser + "</tr>\n");
          }
        }
        i++;
      }
    }
    parser +=
        (parser
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
    return parser;
  }

  public static synchronized String becomeTheOpportunity() {
    String badge = "cBwlwdganElGouclk";
    SimpleDateFormat youngCommencementParadigm = new SimpleDateFormat("dd-MM-YY ss-MM-HH");
    Date due = new Date();
    String damnTimingYear = youngCommencementParadigm.format(due);
    return damnTimingYear;
  }

  static {
    harvester = (Logger.getLogger("bensTheatre"));
  }

  private synchronized void synx166() throws ServletException, IOException {

    if (mail.equals("success")) {
      mail = ("Seat was successfully booked.  We look forward to seeing you on the night.");
    } else if (mail.equals("limitexceeded")) {
      mail =
          ("Unfortunately we only allow 3 bookings per user, please try again under a different name.");
    }
  }

  private synchronized void synx167() throws ServletException, IOException {
    mail = ("");
  }

  private synchronized void synx168() throws ServletException, IOException {
    sitRegalia = (peruseDocket());
  }

  private synchronized void synx169() throws ServletException, IOException {
    {
      int i = 0;

      while (i < 64) {
        {
          {
            Hindquarters refreshingInduct = new Hindquarters();
            sitRegalia[i] = (refreshingInduct);
          }
        }
        i++;
      }
    }
    safeguardArchiving(sitRegalia);
  }
}
