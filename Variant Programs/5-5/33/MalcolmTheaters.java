import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class MalcolmTheaters extends HttpServlet {
  private static final int synX3924int = 64;
  private static final int synX3923int = 0;
  private static final String synX3922String = "";
  private static final String synX3921String =
      "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
  private static final String synX3920String = "limitexceeded";
  private static final String synX3919String =
      "Seat was successfully booked.  We look forward to seeing you on the night.";
  private static final String synX3918String = "success";
  private static final String synX3917String = "dd-MM-YY ss-MM-HH";
  private static final String synX3916String = "NdO70r3f2elM2JlWO";
  private static final String synX3915String = "/WEB-INF/bookingData.ser";
  private static final double synX3914double = 0.6880995453552858;
  private static final String synX3913String = "/WEB-INF/bookingData.ser";
  private static final int synX3912int = 64;
  private static final String synX3911String = "message";
  private static final double synX3910double = 0.2687334909879471;
  private static final String synX3909String = "</html>";
  private static final String synX3908String = "  </body>\t\n";
  private static final String synX3907String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX3906String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX3905String = "    </div>\n";
  private static final String synX3904String = "      </div>\n";
  private static final String synX3903String = "        </div>\n";
  private static final String synX3902String = "          <button>OK</button>\n";
  private static final String synX3901String = "        <div class=\"close\">\n";
  private static final String synX3900String =
      "        <p>Booked On:<span class=\"booked-time\"></span></p>\n";
  private static final String synX3899String =
      "        <p>Booked By:<span class=\"booked-name\"></span></p>\n";
  private static final String synX3898String = "        <h3>This seat is already booked.</h3>\n";
  private static final String synX3897String = "      <div class=\"inner\">\n";
  private static final String synX3896String = "    <div id=\"popup\">\n";
  private static final String synX3895String = "    </footer>\n";
  private static final String synX3894String = "      </div>\n";
  private static final String synX3893String = "        <p>c3063467</p>\n";
  private static final String synX3892String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX3891String = "      <div class=\"author\">\n";
  private static final String synX3890String = "    <footer>\n";
  private static final String synX3889String = "    </article>\n";
  private static final String synX3888String = "      </div>\n";
  private static final String synX3887String = "        </div>\n";
  private static final String synX3886String = "          <p>Booked</p>\n";
  private static final String synX3885String = "        <div class=\"booked\">\n";
  private static final String synX3884String = "        </div>\n";
  private static final String synX3883String = "          <p>Available</p>\n";
  private static final String synX3882String = "        <div class=\"available\">\n";
  private static final String synX3881String = "      <div class=\"legend\">\n";
  private static final String synX3880String = "      </table>\n";
  private static final String synX3879String = "</tbody>\n";
  private static final String synX3878String = "</tr>\n";
  private static final String synX3877String = "</td>";
  private static final String synX3876String = "</p>\n";
  private static final int synX3875int = 1;
  private static final String synX3874String = "  <p>";
  private static final String synX3873String = "\">\n";
  private static final String synX3872String = "\" data-seatNumber=\"";
  private static final int synX3871int = 1;
  private static final String synX3870String = "\" data-seat=\"";
  private static final String synX3869String = "\" data-row=\"";
  private static final String synX3868String = "\" data-time=\"";
  private static final String synX3867String = "\" data-user=\"";
  private static final String synX3866String = "<td class=\"seat";
  private static final String synX3865String = " booked";
  private static final String synX3864String = "";
  private static final int synX3863int = 8;
  private static final int synX3862int = 0;
  private static final String synX3861String = "<tr>\n";
  private static final int synX3860int = 8;
  private static final int synX3859int = 0;
  private static final int synX3858int = 0;
  private static final String synX3857String = "H";
  private static final String synX3856String = "G";
  private static final String synX3855String = "F";
  private static final String synX3854String = "E";
  private static final String synX3853String = "D";
  private static final String synX3852String = "C";
  private static final String synX3851String = "B";
  private static final String synX3850String = "A";
  private static final String synX3849String = "        <tbody>";
  private static final String synX3848String = "        </thead>\n";
  private static final String synX3847String = "          </tr>\n";
  private static final String synX3846String = "            </td>\n";
  private static final String synX3845String = "              <p>Stage</p>\n";
  private static final String synX3844String = "            <td colspan=\"8\">\n";
  private static final String synX3843String = "          <tr>\n";
  private static final String synX3842String = "        <thead>\n";
  private static final String synX3841String = "      <table>\n";
  private static final String synX3840String = "      </div>\n";
  private static final String synX3839String =
      "        <p>Select a seat below to place your booking...</p>\n";
  private static final String synX3838String = "      <div class=\"instructions\">\n";
  private static final String synX3837String = "      </div>\n";
  private static final String synX3836String = " (DD-MM-YY SS-MM-HH)</p>\n";
  private static final String synX3835String = "        <p>";
  private static final String synX3834String = "      <div class=\"time\">\n";
  private static final String synX3833String = "      <h2>Seats</h2>\n";
  private static final String synX3832String = "</p>\n";
  private static final String synX3831String = "      <p class=\"message\">";
  private static final String synX3830String = "    <article>\n";
  private static final String synX3829String = "    </header>\n";
  private static final String synX3828String = "      <h1>Theatre Booking System</h1>\n";
  private static final String synX3827String = "    <header>\n";
  private static final String synX3826String = "  <body class=\"home\">\n";
  private static final String synX3825String = "  </head>\n";
  private static final String synX3824String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX3823String = "    <![endif]-->\n";
  private static final String synX3822String = "      </script>\n";
  private static final String synX3821String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX3820String = "    <!--[if IE]>\n";
  private static final String synX3819String = "    <title>Theatre Booking System</title>\n";
  private static final String synX3818String = "    <meta charset=utf-8>\n";
  private static final String synX3817String = "  <head>\n";
  private static final String synX3816String = "<html lang=\"en\">\n";
  private static final String synX3815String = "<!DOCTYPE html>\n";
  private static final double synX3814double = 0.841013449593729;
  private static final String synX3813String = "/WEB-INF/bookingData.ser";
  private static final int synX3812int = 297241374;

  public synchronized Fanny[] learnRegister() {
    int curveGauge = synX3812int;

    try {
      Fanny[] tickets = null;
      FileInputStream niiComplaint =
          new FileInputStream(getServletContext().getRealPath(synX3813String));
      ObjectInputStream details = new ObjectInputStream(niiComplaint);
      tickets = ((Fanny[]) details.readObject());
      details.close();
      niiComplaint.close();
      return tickets;
    } catch (IOException i) {
      homesteader.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      homesteader.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public synchronized String bringAbodeWebpage() {
    double inferiorCircumscribe = synX3814double;
    String ascii =
        (synX3815String
            + synX3816String
            + synX3817String
            + synX3818String
            + synX3819String
            + synX3820String
            + synX3821String
            + synX3822String
            + synX3823String
            + synX3824String
            + synX3825String
            + synX3826String
            + synX3827String
            + synX3828String
            + synX3829String
            + synX3830String
            + synX3831String
            + voicemail
            + synX3832String
            + synX3833String
            + synX3834String
            + synX3835String
            + bringOngoingMeter()
            + synX3836String
            + synX3837String
            + synX3838String
            + synX3839String
            + synX3840String
            + synX3841String
            + synX3842String
            + synX3843String
            + synX3844String
            + synX3845String
            + synX3846String
            + synX3847String
            + synX3848String
            + synX3849String);
    String[] squabblingPanoply = {
      synX3850String,
      synX3851String,
      synX3852String,
      synX3853String,
      synX3854String,
      synX3855String,
      synX3856String,
      synX3857String
    };
    int placeList = synX3858int;
    {
      int i = synX3859int;

      while (i < synX3860int) {
        {
          {
            ascii += (synX3861String);
            {
              int gruss = synX3862int;

              while (gruss < synX3863int) {
                {
                  {
                    String logged = synX3864String;

                    if (!assCollection[placeList].isAccessible()) {
                      logged = (synX3865String);
                    }

                    ascii +=
                        ((synX3866String
                            + logged
                            + synX3867String
                            + assCollection[placeList].produceWearerMap()
                            + synX3868String
                            + assCollection[placeList].catchWhen()
                            + synX3869String
                            + squabblingPanoply[i]
                            + synX3870String
                            + (gruss + synX3871int)
                            + synX3872String
                            + placeList
                            + synX3873String
                            + synX3874String
                            + squabblingPanoply[i]
                            + (gruss + synX3875int)
                            + synX3876String
                            + synX3877String));
                    placeList++;
                  }
                }
                gruss++;
              }
            }
            ascii += (synX3878String);
          }
        }
        i++;
      }
    }
    ascii +=
        ((synX3879String
            + synX3880String
            + synX3881String
            + synX3882String
            + synX3883String
            + synX3884String
            + synX3885String
            + synX3886String
            + synX3887String
            + synX3888String
            + synX3889String
            + synX3890String
            + synX3891String
            + synX3892String
            + synX3893String
            + synX3894String
            + synX3895String
            + synX3896String
            + synX3897String
            + synX3898String
            + synX3899String
            + synX3900String
            + synX3901String
            + synX3902String
            + synX3903String
            + synX3904String
            + synX3905String
            + synX3906String
            + synX3907String
            + synX3908String
            + synX3909String));
    return ascii;
  }

  public synchronized void doGet(HttpServletRequest complaint, HttpServletResponse retort)
      throws ServletException, IOException {
    double operative = synX3910double;
    PrintWriter proscribed = retort.getWriter();
    voicemail = (complaint.getParameter(synX3911String));

    if (voicemail != null) synx111();
    else synx112();
    assCollection = (new Fanny[synX3912int]);
    File recordingPaperwork = new File(getServletContext().getRealPath(synX3913String));

    if (recordingPaperwork.exists()) synx113();
    else synx114();
    String domicileSite = bringAbodeWebpage();
    proscribed.println(domicileSite);
  }

  public static double threshold = 0.7924179477596113;
  private Fanny[] assCollection = null;

  public synchronized void economizeSubmitted(Fanny[] passengers) {
    double secondaryTrussed = synX3914double;

    try {
      FileOutputStream outgoingArchives =
          new FileOutputStream(getServletContext().getRealPath(synX3915String));
      ObjectOutputStream extinct = new ObjectOutputStream(outgoingArchives);
      extinct.writeObject(passengers);
      extinct.close();
      outgoingArchives.close();
    } catch (IOException tipp) {
      tipp.printStackTrace();
    }
  }

  private static Logger homesteader = Logger.getLogger("bensTheatre");
  private String voicemail = null;

  public static synchronized String bringOngoingMeter() {
    String cite = synX3916String;
    SimpleDateFormat recentYearStructure = new SimpleDateFormat(synX3917String);
    Date engagement = new Date();
    String terriNotificationAgain = recentYearStructure.format(engagement);
    return terriNotificationAgain;
  }

  private synchronized void synx111() throws ServletException, IOException {

    if (voicemail.equals(synX3918String)) {
      voicemail = (synX3919String);
    } else if (voicemail.equals(synX3920String)) {
      voicemail = (synX3921String);
    }
  }

  private synchronized void synx112() throws ServletException, IOException {
    voicemail = (synX3922String);
  }

  private synchronized void synx113() throws ServletException, IOException {
    assCollection = (learnRegister());
  }

  private synchronized void synx114() throws ServletException, IOException {
    {
      int i = synX3923int;

      while (i < synX3924int) {
        {
          {
            Fanny newlyRear = new Fanny();
            assCollection[i] = (newlyRear);
          }
        }
        i++;
      }
    }
    economizeSubmitted(assCollection);
  }
}
