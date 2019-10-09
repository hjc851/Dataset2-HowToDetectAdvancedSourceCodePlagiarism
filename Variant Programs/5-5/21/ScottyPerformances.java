import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

public class ScottyPerformances extends HttpServlet {
  private static final int synX2297int = 64;
  private static final int synX2296int = 0;
  private static final String synX2295String = "";
  private static final String synX2294String =
      "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
  private static final String synX2293String = "limitexceeded";
  private static final String synX2292String =
      "Seat was successfully booked.  We look forward to seeing you on the night.";
  private static final String synX2291String = "success";
  private static final String synX2290String = "dd-MM-YY ss-MM-HH";
  private static final double synX2289double = 0.35187746222459493;
  private static final String synX2288String = "</html>";
  private static final String synX2287String = "  </body>\t\n";
  private static final String synX2286String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX2285String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX2284String = "    </div>\n";
  private static final String synX2283String = "      </div>\n";
  private static final String synX2282String = "        </div>\n";
  private static final String synX2281String = "          <button>OK</button>\n";
  private static final String synX2280String = "        <div class=\"close\">\n";
  private static final String synX2279String =
      "        <p>Booked On:<span class=\"booked-time\"></span></p>\n";
  private static final String synX2278String =
      "        <p>Booked By:<span class=\"booked-name\"></span></p>\n";
  private static final String synX2277String = "        <h3>This seat is already booked.</h3>\n";
  private static final String synX2276String = "      <div class=\"inner\">\n";
  private static final String synX2275String = "    <div id=\"popup\">\n";
  private static final String synX2274String = "    </footer>\n";
  private static final String synX2273String = "      </div>\n";
  private static final String synX2272String = "        <p>c3063467</p>\n";
  private static final String synX2271String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX2270String = "      <div class=\"author\">\n";
  private static final String synX2269String = "    <footer>\n";
  private static final String synX2268String = "    </article>\n";
  private static final String synX2267String = "      </div>\n";
  private static final String synX2266String = "        </div>\n";
  private static final String synX2265String = "          <p>Booked</p>\n";
  private static final String synX2264String = "        <div class=\"booked\">\n";
  private static final String synX2263String = "        </div>\n";
  private static final String synX2262String = "          <p>Available</p>\n";
  private static final String synX2261String = "        <div class=\"available\">\n";
  private static final String synX2260String = "      <div class=\"legend\">\n";
  private static final String synX2259String = "      </table>\n";
  private static final String synX2258String = "</tbody>\n";
  private static final String synX2257String = "</tr>\n";
  private static final String synX2256String = "</td>";
  private static final String synX2255String = "</p>\n";
  private static final int synX2254int = 1;
  private static final String synX2253String = "  <p>";
  private static final String synX2252String = "\">\n";
  private static final String synX2251String = "\" data-seatNumber=\"";
  private static final int synX2250int = 1;
  private static final String synX2249String = "\" data-seat=\"";
  private static final String synX2248String = "\" data-row=\"";
  private static final String synX2247String = "\" data-time=\"";
  private static final String synX2246String = "\" data-user=\"";
  private static final String synX2245String = "<td class=\"seat";
  private static final String synX2244String = " booked";
  private static final String synX2243String = "";
  private static final int synX2242int = 8;
  private static final int synX2241int = 0;
  private static final String synX2240String = "<tr>\n";
  private static final int synX2239int = 8;
  private static final int synX2238int = 0;
  private static final int synX2237int = 0;
  private static final String synX2236String = "H";
  private static final String synX2235String = "G";
  private static final String synX2234String = "F";
  private static final String synX2233String = "E";
  private static final String synX2232String = "D";
  private static final String synX2231String = "C";
  private static final String synX2230String = "B";
  private static final String synX2229String = "A";
  private static final String synX2228String = "        <tbody>";
  private static final String synX2227String = "        </thead>\n";
  private static final String synX2226String = "          </tr>\n";
  private static final String synX2225String = "            </td>\n";
  private static final String synX2224String = "              <p>Stage</p>\n";
  private static final String synX2223String = "            <td colspan=\"8\">\n";
  private static final String synX2222String = "          <tr>\n";
  private static final String synX2221String = "        <thead>\n";
  private static final String synX2220String = "      <table>\n";
  private static final String synX2219String = "      </div>\n";
  private static final String synX2218String =
      "        <p>Select a seat below to place your booking...</p>\n";
  private static final String synX2217String = "      <div class=\"instructions\">\n";
  private static final String synX2216String = "      </div>\n";
  private static final String synX2215String = " (DD-MM-YY SS-MM-HH)</p>\n";
  private static final String synX2214String = "        <p>";
  private static final String synX2213String = "      <div class=\"time\">\n";
  private static final String synX2212String = "      <h2>Seats</h2>\n";
  private static final String synX2211String = "</p>\n";
  private static final String synX2210String = "      <p class=\"message\">";
  private static final String synX2209String = "    <article>\n";
  private static final String synX2208String = "    </header>\n";
  private static final String synX2207String = "      <h1>Theatre Booking System</h1>\n";
  private static final String synX2206String = "    <header>\n";
  private static final String synX2205String = "  <body class=\"home\">\n";
  private static final String synX2204String = "  </head>\n";
  private static final String synX2203String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX2202String = "    <![endif]-->\n";
  private static final String synX2201String = "      </script>\n";
  private static final String synX2200String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX2199String = "    <!--[if IE]>\n";
  private static final String synX2198String = "    <title>Theatre Booking System</title>\n";
  private static final String synX2197String = "    <meta charset=utf-8>\n";
  private static final String synX2196String = "  <head>\n";
  private static final String synX2195String = "<html lang=\"en\">\n";
  private static final String synX2194String = "<!DOCTYPE html>\n";
  private static final int synX2193int = -1175071911;
  private static final String synX2192String = "/WEB-INF/bookingData.ser";
  private static final double synX2191double = 0.34487865443632015;
  private static final String synX2190String = "/WEB-INF/bookingData.ser";
  private static final String synX2189String = "wji2xP7Hlq7DjJ";
  private static final String synX2188String = "/WEB-INF/bookingData.ser";
  private static final int synX2187int = 64;
  private static final String synX2186String = "message";
  private static final double synX2185double = 0.6127285646846239;
  static String constitute = "Cww2mBiQuxf";
  public Sit[] sitRegalia;
  public String tagline;
  public static Logger lumberman = Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest ask, HttpServletResponse reacting)
      throws ServletException, IOException {
    double weigh = synX2185double;
    PrintWriter taboo = reacting.getWriter();
    tagline = ask.getParameter(synX2186String);

    if (tagline != null) synx71();
    else synx72();
    sitRegalia = new Sit[synX2187int];
    File detentionData = new File(getServletContext().getRealPath(synX2188String));

    if (detentionData.exists()) synx73();
    else synx74();
    String backyardLayouts = receiveHouseholdWebsite();
    taboo.println(backyardLayouts);
  }

  public synchronized Sit[] readerInitiate() {
    String relic = synX2189String;

    try {
      Sit[] slots;
      FileInputStream electedFilename =
          new FileInputStream(getServletContext().getRealPath(synX2190String));
      ObjectInputStream nih = new ObjectInputStream(electedFilename);
      slots = (Sit[]) nih.readObject();
      nih.close();
      electedFilename.close();
      return slots;
    } catch (IOException i) {
      lumberman.info(i.toString());
      return null;
    } catch (ClassNotFoundException nlsy) {
      lumberman.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public synchronized void resurrectPapers(Sit[] votes) {
    double higherLimit = synX2191double;

    try {
      FileOutputStream impossibleDocuments =
          new FileOutputStream(getServletContext().getRealPath(synX2192String));
      ObjectOutputStream back = new ObjectOutputStream(impossibleDocuments);
      back.writeObject(votes);
      back.close();
      impossibleDocuments.close();
    } catch (IOException officio) {
      officio.printStackTrace();
    }
  }

  public synchronized String receiveHouseholdWebsite() {
    int indentured = synX2193int;
    String htm =
        synX2194String
            + synX2195String
            + synX2196String
            + synX2197String
            + synX2198String
            + synX2199String
            + synX2200String
            + synX2201String
            + synX2202String
            + synX2203String
            + synX2204String
            + synX2205String
            + synX2206String
            + synX2207String
            + synX2208String
            + synX2209String
            + synX2210String
            + tagline
            + synX2211String
            + synX2212String
            + synX2213String
            + synX2214String
            + drawStreamWeek()
            + synX2215String
            + synX2216String
            + synX2217String
            + synX2218String
            + synX2219String
            + synX2220String
            + synX2221String
            + synX2222String
            + synX2223String
            + synX2224String
            + synX2225String
            + synX2226String
            + synX2227String
            + synX2228String;
    String[] wrangleRegalia = {
      synX2229String,
      synX2230String,
      synX2231String,
      synX2232String,
      synX2233String,
      synX2234String,
      synX2235String,
      synX2236String
    };
    int canQuantity = synX2237int;
    {
      int i = synX2238int;

      while (i < synX2239int) {
        {
          {
            htm += htm + synX2240String;
            {
              int flier = synX2241int;

              while (flier < synX2242int) {
                {
                  {
                    String taken = synX2243String;

                    if (!sitRegalia[canQuantity].isAccessible()) {
                      taken = synX2244String;
                    }

                    htm +=
                        htm
                            + synX2245String
                            + taken
                            + synX2246String
                            + sitRegalia[canQuantity].driveOperatorSecurity()
                            + synX2247String
                            + sitRegalia[canQuantity].receiveMoment()
                            + synX2248String
                            + wrangleRegalia[i]
                            + synX2249String
                            + (flier + synX2250int)
                            + synX2251String
                            + canQuantity
                            + synX2252String
                            + synX2253String
                            + wrangleRegalia[i]
                            + (flier + synX2254int)
                            + synX2255String
                            + synX2256String;
                    canQuantity++;
                  }
                }
                flier++;
              }
            }
            htm += htm + synX2257String;
          }
        }
        i++;
      }
    }
    htm +=
        htm
            + synX2258String
            + synX2259String
            + synX2260String
            + synX2261String
            + synX2262String
            + synX2263String
            + synX2264String
            + synX2265String
            + synX2266String
            + synX2267String
            + synX2268String
            + synX2269String
            + synX2270String
            + synX2271String
            + synX2272String
            + synX2273String
            + synX2274String
            + synX2275String
            + synX2276String
            + synX2277String
            + synX2278String
            + synX2279String
            + synX2280String
            + synX2281String
            + synX2282String
            + synX2283String
            + synX2284String
            + synX2285String
            + synX2286String
            + synX2287String
            + synX2288String;
    return htm;
  }

  public static synchronized String drawStreamWeek() {
    double curveGauge = synX2289double;
    SimpleDateFormat untriedScheduleMethod = new SimpleDateFormat(synX2290String);
    Date deadline = new Date();
    String coreReceiptWeek = untriedScheduleMethod.format(deadline);
    return coreReceiptWeek;
  }

  private synchronized void synx71() throws ServletException, IOException {

    if (tagline.equals(synX2291String)) {
      tagline = synX2292String;
    } else if (tagline.equals(synX2293String)) {
      tagline = synX2294String;
    }
  }

  private synchronized void synx72() throws ServletException, IOException {
    tagline = synX2295String;
  }

  private synchronized void synx73() throws ServletException, IOException {
    sitRegalia = readerInitiate();
  }

  private synchronized void synx74() throws ServletException, IOException {
    {
      int i = synX2296int;

      while (i < synX2297int) {
        {
          {
            Sit recentlyDerriere = new Sit();
            sitRegalia[i] = recentlyDerriere;
          }
        }
        i++;
      }
    }
    resurrectPapers(sitRegalia);
  }
}
