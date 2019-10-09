import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class RemoTheater extends javax.servlet.http.HttpServlet {
  private static final int synX3685int = 64;
  private static final int synX3684int = 0;
  private static final String synX3683String = "";
  private static final String synX3682String =
      "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
  private static final String synX3681String = "limitexceeded";
  private static final String synX3680String =
      "Seat was successfully booked.  We look forward to seeing you on the night.";
  private static final String synX3679String = "success";
  private static final String synX3678String = "bensTheatre";
  private static final String synX3677String = "dd-MM-YY ss-MM-HH";
  private static final double synX3676double = 0.46039428602461274;
  private static final String synX3675String = "</html>";
  private static final String synX3674String = "  </body>\t\n";
  private static final String synX3673String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX3672String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX3671String = "    </div>\n";
  private static final String synX3670String = "      </div>\n";
  private static final String synX3669String = "        </div>\n";
  private static final String synX3668String = "          <button>OK</button>\n";
  private static final String synX3667String = "        <div class=\"close\">\n";
  private static final String synX3666String =
      "        <p>Booked On:<span class=\"booked-time\"></span></p>\n";
  private static final String synX3665String =
      "        <p>Booked By:<span class=\"booked-name\"></span></p>\n";
  private static final String synX3664String = "        <h3>This seat is already booked.</h3>\n";
  private static final String synX3663String = "      <div class=\"inner\">\n";
  private static final String synX3662String = "    <div id=\"popup\">\n";
  private static final String synX3661String = "    </footer>\n";
  private static final String synX3660String = "      </div>\n";
  private static final String synX3659String = "        <p>c3063467</p>\n";
  private static final String synX3658String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX3657String = "      <div class=\"author\">\n";
  private static final String synX3656String = "    <footer>\n";
  private static final String synX3655String = "    </article>\n";
  private static final String synX3654String = "      </div>\n";
  private static final String synX3653String = "        </div>\n";
  private static final String synX3652String = "          <p>Booked</p>\n";
  private static final String synX3651String = "        <div class=\"booked\">\n";
  private static final String synX3650String = "        </div>\n";
  private static final String synX3649String = "          <p>Available</p>\n";
  private static final String synX3648String = "        <div class=\"available\">\n";
  private static final String synX3647String = "      <div class=\"legend\">\n";
  private static final String synX3646String = "      </table>\n";
  private static final String synX3645String = "</tbody>\n";
  private static final String synX3644String = "</tr>\n";
  private static final String synX3643String = "</td>";
  private static final String synX3642String = "</p>\n";
  private static final int synX3641int = 1;
  private static final String synX3640String = "  <p>";
  private static final String synX3639String = "\">\n";
  private static final String synX3638String = "\" data-seatNumber=\"";
  private static final int synX3637int = 1;
  private static final String synX3636String = "\" data-seat=\"";
  private static final String synX3635String = "\" data-row=\"";
  private static final String synX3634String = "\" data-time=\"";
  private static final String synX3633String = "\" data-user=\"";
  private static final String synX3632String = "<td class=\"seat";
  private static final String synX3631String = " booked";
  private static final String synX3630String = "";
  private static final int synX3629int = 8;
  private static final int synX3628int = 0;
  private static final String synX3627String = "<tr>\n";
  private static final int synX3626int = 8;
  private static final int synX3625int = 0;
  private static final int synX3624int = 0;
  private static final String synX3623String = "H";
  private static final String synX3622String = "G";
  private static final String synX3621String = "F";
  private static final String synX3620String = "E";
  private static final String synX3619String = "D";
  private static final String synX3618String = "C";
  private static final String synX3617String = "B";
  private static final String synX3616String = "A";
  private static final String synX3615String = "        <tbody>";
  private static final String synX3614String = "        </thead>\n";
  private static final String synX3613String = "          </tr>\n";
  private static final String synX3612String = "            </td>\n";
  private static final String synX3611String = "              <p>Stage</p>\n";
  private static final String synX3610String = "            <td colspan=\"8\">\n";
  private static final String synX3609String = "          <tr>\n";
  private static final String synX3608String = "        <thead>\n";
  private static final String synX3607String = "      <table>\n";
  private static final String synX3606String = "      </div>\n";
  private static final String synX3605String =
      "        <p>Select a seat below to place your booking...</p>\n";
  private static final String synX3604String = "      <div class=\"instructions\">\n";
  private static final String synX3603String = "      </div>\n";
  private static final String synX3602String = " (DD-MM-YY SS-MM-HH)</p>\n";
  private static final String synX3601String = "        <p>";
  private static final String synX3600String = "      <div class=\"time\">\n";
  private static final String synX3599String = "      <h2>Seats</h2>\n";
  private static final String synX3598String = "</p>\n";
  private static final String synX3597String = "      <p class=\"message\">";
  private static final String synX3596String = "    <article>\n";
  private static final String synX3595String = "    </header>\n";
  private static final String synX3594String = "      <h1>Theatre Booking System</h1>\n";
  private static final String synX3593String = "    <header>\n";
  private static final String synX3592String = "  <body class=\"home\">\n";
  private static final String synX3591String = "  </head>\n";
  private static final String synX3590String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX3589String = "    <![endif]-->\n";
  private static final String synX3588String = "      </script>\n";
  private static final String synX3587String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX3586String = "    <!--[if IE]>\n";
  private static final String synX3585String = "    <title>Theatre Booking System</title>\n";
  private static final String synX3584String = "    <meta charset=utf-8>\n";
  private static final String synX3583String = "  <head>\n";
  private static final String synX3582String = "<html lang=\"en\">\n";
  private static final String synX3581String = "<!DOCTYPE html>\n";
  private static final double synX3580double = 0.33804606597923603;
  private static final String synX3579String = "/WEB-INF/bookingData.ser";
  private static final String synX3578String = "";
  private static final String synX3577String = "/WEB-INF/bookingData.ser";
  private static final double synX3576double = 0.6784525277557281;
  private static final String synX3575String = "/WEB-INF/bookingData.ser";
  private static final int synX3574int = 64;
  private static final String synX3573String = "message";
  private static final String synX3572String = "bOBOlXySiMXBjm";
  static double edge = 0.4071964631473475;
  public Can[] buttocksMultitude;
  public java.lang.String msg;
  public static java.util.logging.Logger lumberjack;

  public synchronized void doGet(HttpServletRequest decision, HttpServletResponse reaction)
      throws ServletException, IOException {
    String constrained = synX3572String;
    java.io.PrintWriter quenched = reaction.getWriter();
    msg = decision.getParameter(synX3573String);

    if (msg != null) synx106();
    else synx107();
    buttocksMultitude = new Can[synX3574int];
    java.io.File rentApplication =
        new java.io.File(getServletContext().getRealPath(synX3575String));

    if (rentApplication.exists()) synx108();
    else synx109();
    java.lang.String baseWeb = fixInternalPaper();
    quenched.println(baseWeb);
  }

  public synchronized Can[] reciteSubmitting() {
    double positionFoods = synX3576double;

    try {
      Can[] elections;
      java.io.FileInputStream establishmentFolders =
          new java.io.FileInputStream(getServletContext().getRealPath(synX3577String));
      java.io.ObjectInputStream nsis = new java.io.ObjectInputStream(establishmentFolders);
      elections = (Can[]) nsis.readObject();
      nsis.close();
      establishmentFolders.close();
      return elections;
    } catch (java.io.IOException i) {
      lumberjack.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cmu) {
      lumberjack.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized void keepSubmit(Can[] votes) {
    String maximum = synX3578String;

    try {
      java.io.FileOutputStream offData =
          new java.io.FileOutputStream(getServletContext().getRealPath(synX3579String));
      java.io.ObjectOutputStream impermissible = new java.io.ObjectOutputStream(offData);
      impermissible.writeObject(votes);
      impermissible.close();
      offData.close();
    } catch (java.io.IOException officio) {
      officio.printStackTrace();
    }
  }

  public synchronized java.lang.String fixInternalPaper() {
    double fundamental = synX3580double;
    java.lang.String browser =
        synX3581String
            + synX3582String
            + synX3583String
            + synX3584String
            + synX3585String
            + synX3586String
            + synX3587String
            + synX3588String
            + synX3589String
            + synX3590String
            + synX3591String
            + synX3592String
            + synX3593String
            + synX3594String
            + synX3595String
            + synX3596String
            + synX3597String
            + msg
            + synX3598String
            + synX3599String
            + synX3600String
            + synX3601String
            + goPrevailingClock()
            + synX3602String
            + synX3603String
            + synX3604String
            + synX3605String
            + synX3606String
            + synX3607String
            + synX3608String
            + synX3609String
            + synX3610String
            + synX3611String
            + synX3612String
            + synX3613String
            + synX3614String
            + synX3615String;
    String[] controversyMultiplicity = {
      synX3616String,
      synX3617String,
      synX3618String,
      synX3619String,
      synX3620String,
      synX3621String,
      synX3622String,
      synX3623String
    };
    int tailMany = synX3624int;
    {
      int i = synX3625int;

      while (i < synX3626int) {
        {
          {
            browser += synX3627String;
            {
              int flier = synX3628int;

              while (flier < synX3629int) {
                {
                  {
                    java.lang.String made = synX3630String;

                    if (!buttocksMultitude[tailMany].isAccessible()) {
                      made = synX3631String;
                    }

                    browser +=
                        synX3632String
                            + made
                            + synX3633String
                            + buttocksMultitude[tailMany].sustainSomeoneSelf()
                            + synX3634String
                            + buttocksMultitude[tailMany].fetchBeginning()
                            + synX3635String
                            + controversyMultiplicity[i]
                            + synX3636String
                            + (flier + synX3637int)
                            + synX3638String
                            + tailMany
                            + synX3639String
                            + synX3640String
                            + controversyMultiplicity[i]
                            + (flier + synX3641int)
                            + synX3642String
                            + synX3643String;
                    tailMany++;
                  }
                }
                flier++;
              }
            }
            browser += synX3644String;
          }
        }
        i++;
      }
    }
    browser +=
        synX3645String
            + synX3646String
            + synX3647String
            + synX3648String
            + synX3649String
            + synX3650String
            + synX3651String
            + synX3652String
            + synX3653String
            + synX3654String
            + synX3655String
            + synX3656String
            + synX3657String
            + synX3658String
            + synX3659String
            + synX3660String
            + synX3661String
            + synX3662String
            + synX3663String
            + synX3664String
            + synX3665String
            + synX3666String
            + synX3667String
            + synX3668String
            + synX3669String
            + synX3670String
            + synX3671String
            + synX3672String
            + synX3673String
            + synX3674String
            + synX3675String;
    return browser;
  }

  public static synchronized java.lang.String goPrevailingClock() {
    double call = synX3676double;
    java.text.SimpleDateFormat risingTimeManner = new java.text.SimpleDateFormat(synX3677String);
    java.util.Date timeframe = new java.util.Date();
    java.lang.String curshipTimeAmount = risingTimeManner.format(timeframe);
    return curshipTimeAmount;
  }

  static {
    lumberjack = java.util.logging.Logger.getLogger(synX3678String);
  }

  private synchronized void synx106() throws ServletException, IOException {

    if (msg.equals(synX3679String)) {
      msg = synX3680String;
    } else if (msg.equals(synX3681String)) {
      msg = synX3682String;
    }
  }

  private synchronized void synx107() throws ServletException, IOException {
    msg = synX3683String;
  }

  private synchronized void synx108() throws ServletException, IOException {
    buttocksMultitude = reciteSubmitting();
  }

  private synchronized void synx109() throws ServletException, IOException {
    {
      int i = synX3684int;

      while (i < synX3685int) {
        {
          {
            Can modernPlace = new Can();
            buttocksMultitude[i] = modernPlace;
          }
        }
        i++;
      }
    }
    keepSubmit(buttocksMultitude);
  }
}
