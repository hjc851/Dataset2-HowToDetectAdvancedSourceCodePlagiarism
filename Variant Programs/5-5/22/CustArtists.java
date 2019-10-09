import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import static java.util.logging.Logger.getLogger;

public class CustArtists extends javax.servlet.http.HttpServlet {
  private static final int synX2535int = 64;
  private static final int synX2534int = 0;
  private static final String synX2533String = "";
  private static final String synX2532String =
      "Unfortunately we only allow 3 bookings per user, please try again under a different name.";
  private static final String synX2531String = "limitexceeded";
  private static final String synX2530String =
      "Seat was successfully booked.  We look forward to seeing you on the night.";
  private static final String synX2529String = "success";
  private static final String synX2528String = "dd-MM-YY ss-MM-HH";
  private static final int synX2527int = 1063517969;
  private static final String synX2526String = "</html>";
  private static final String synX2525String = "  </body>\t\n";
  private static final String synX2524String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX2523String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX2522String = "    </div>\n";
  private static final String synX2521String = "      </div>\n";
  private static final String synX2520String = "        </div>\n";
  private static final String synX2519String = "          <button>OK</button>\n";
  private static final String synX2518String = "        <div class=\"close\">\n";
  private static final String synX2517String =
      "        <p>Booked On:<span class=\"booked-time\"></span></p>\n";
  private static final String synX2516String =
      "        <p>Booked By:<span class=\"booked-name\"></span></p>\n";
  private static final String synX2515String = "        <h3>This seat is already booked.</h3>\n";
  private static final String synX2514String = "      <div class=\"inner\">\n";
  private static final String synX2513String = "    <div id=\"popup\">\n";
  private static final String synX2512String = "    </footer>\n";
  private static final String synX2511String = "      </div>\n";
  private static final String synX2510String = "        <p>c3063467</p>\n";
  private static final String synX2509String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX2508String = "      <div class=\"author\">\n";
  private static final String synX2507String = "    <footer>\n";
  private static final String synX2506String = "    </article>\n";
  private static final String synX2505String = "      </div>\n";
  private static final String synX2504String = "        </div>\n";
  private static final String synX2503String = "          <p>Booked</p>\n";
  private static final String synX2502String = "        <div class=\"booked\">\n";
  private static final String synX2501String = "        </div>\n";
  private static final String synX2500String = "          <p>Available</p>\n";
  private static final String synX2499String = "        <div class=\"available\">\n";
  private static final String synX2498String = "      <div class=\"legend\">\n";
  private static final String synX2497String = "      </table>\n";
  private static final String synX2496String = "</tbody>\n";
  private static final String synX2495String = "</tr>\n";
  private static final String synX2494String = "</td>";
  private static final String synX2493String = "</p>\n";
  private static final int synX2492int = 1;
  private static final String synX2491String = "  <p>";
  private static final String synX2490String = "\">\n";
  private static final String synX2489String = "\" data-seatNumber=\"";
  private static final int synX2488int = 1;
  private static final String synX2487String = "\" data-seat=\"";
  private static final String synX2486String = "\" data-row=\"";
  private static final String synX2485String = "\" data-time=\"";
  private static final String synX2484String = "\" data-user=\"";
  private static final String synX2483String = "<td class=\"seat";
  private static final String synX2482String = " booked";
  private static final String synX2481String = "";
  private static final int synX2480int = 8;
  private static final int synX2479int = 0;
  private static final String synX2478String = "<tr>\n";
  private static final int synX2477int = 8;
  private static final int synX2476int = 0;
  private static final int synX2475int = 0;
  private static final String synX2474String = "H";
  private static final String synX2473String = "G";
  private static final String synX2472String = "F";
  private static final String synX2471String = "E";
  private static final String synX2470String = "D";
  private static final String synX2469String = "C";
  private static final String synX2468String = "B";
  private static final String synX2467String = "A";
  private static final String synX2466String = "        <tbody>";
  private static final String synX2465String = "        </thead>\n";
  private static final String synX2464String = "          </tr>\n";
  private static final String synX2463String = "            </td>\n";
  private static final String synX2462String = "              <p>Stage</p>\n";
  private static final String synX2461String = "            <td colspan=\"8\">\n";
  private static final String synX2460String = "          <tr>\n";
  private static final String synX2459String = "        <thead>\n";
  private static final String synX2458String = "      <table>\n";
  private static final String synX2457String = "      </div>\n";
  private static final String synX2456String =
      "        <p>Select a seat below to place your booking...</p>\n";
  private static final String synX2455String = "      <div class=\"instructions\">\n";
  private static final String synX2454String = "      </div>\n";
  private static final String synX2453String = " (DD-MM-YY SS-MM-HH)</p>\n";
  private static final String synX2452String = "        <p>";
  private static final String synX2451String = "      <div class=\"time\">\n";
  private static final String synX2450String = "      <h2>Seats</h2>\n";
  private static final String synX2449String = "</p>\n";
  private static final String synX2448String = "      <p class=\"message\">";
  private static final String synX2447String = "    <article>\n";
  private static final String synX2446String = "    </header>\n";
  private static final String synX2445String = "      <h1>Theatre Booking System</h1>\n";
  private static final String synX2444String = "    <header>\n";
  private static final String synX2443String = "  <body class=\"home\">\n";
  private static final String synX2442String = "  </head>\n";
  private static final String synX2441String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX2440String = "    <![endif]-->\n";
  private static final String synX2439String = "      </script>\n";
  private static final String synX2438String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX2437String = "    <!--[if IE]>\n";
  private static final String synX2436String = "    <title>Theatre Booking System</title>\n";
  private static final String synX2435String = "    <meta charset=utf-8>\n";
  private static final String synX2434String = "  <head>\n";
  private static final String synX2433String = "<html lang=\"en\">\n";
  private static final String synX2432String = "<!DOCTYPE html>\n";
  private static final double synX2431double = 0.8432879509574335;
  private static final String synX2430String = "/WEB-INF/bookingData.ser";
  private static final int synX2429int = -526778320;
  private static final String synX2428String = "/WEB-INF/bookingData.ser";
  private static final String synX2427String = "53hppO26NVsvUg";
  private static final String synX2426String = "/WEB-INF/bookingData.ser";
  private static final int synX2425int = 64;
  private static final String synX2424String = "message";
  private static final double synX2423double = 0.5857964171182133;
  public static final double advert = 0.03740911689986315;
  private Butt[] buttocksMultitude = null;
  private java.lang.String warning = null;
  private static java.util.logging.Logger forester = getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest petitioning, HttpServletResponse reacted)
      throws ServletException, IOException {
    double maineAmount = synX2423double;
    java.io.PrintWriter kayoed = reacted.getWriter();
    warning = petitioning.getParameter(synX2424String);

    if (warning != null) synx76();
    else synx77();
    buttocksMultitude = new Butt[synX2425int];
    java.io.File engagementRegister =
        new java.io.File(getServletContext().getRealPath(synX2426String));

    if (engagementRegister.exists()) synx78();
    else synx79();
    java.lang.String baseWeb = drawMenageFootnote();
    kayoed.println(baseWeb);
  }

  public synchronized Butt[] readerInitiate() {
    String slot = synX2427String;

    try {
      Butt[] benches = null;
      java.io.FileInputStream incumbentsSubmitting =
          new java.io.FileInputStream(getServletContext().getRealPath(synX2428String));
      java.io.ObjectInputStream proponents = new java.io.ObjectInputStream(incumbentsSubmitting);
      benches = (Butt[]) proponents.readObject();
      proponents.close();
      incumbentsSubmitting.close();
      return benches;
    } catch (java.io.IOException i) {
      forester.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cesium) {
      forester.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  public synchronized void earnExecutable(Butt[] stools) {
    int symbol = synX2429int;

    try {
      java.io.FileOutputStream prohibitedPapers =
          new java.io.FileOutputStream(getServletContext().getRealPath(synX2430String));
      java.io.ObjectOutputStream quenched = new java.io.ObjectOutputStream(prohibitedPapers);
      quenched.writeObject(stools);
      quenched.close();
      prohibitedPapers.close();
    } catch (java.io.IOException abdul) {
      abdul.printStackTrace();
    }
  }

  public synchronized java.lang.String drawMenageFootnote() {
    double unfree = synX2431double;
    java.lang.String meta =
        synX2432String
            + synX2433String
            + synX2434String
            + synX2435String
            + synX2436String
            + synX2437String
            + synX2438String
            + synX2439String
            + synX2440String
            + synX2441String
            + synX2442String
            + synX2443String
            + synX2444String
            + synX2445String
            + synX2446String
            + synX2447String
            + synX2448String
            + warning
            + synX2449String
            + synX2450String
            + synX2451String
            + synX2452String
            + arriveFlowMonth()
            + synX2453String
            + synX2454String
            + synX2455String
            + synX2456String
            + synX2457String
            + synX2458String
            + synX2459String
            + synX2460String
            + synX2461String
            + synX2462String
            + synX2463String
            + synX2464String
            + synX2465String
            + synX2466String;
    String[] quarrelAlign = {
      synX2467String,
      synX2468String,
      synX2469String,
      synX2470String,
      synX2471String,
      synX2472String,
      synX2473String,
      synX2474String
    };
    int behindTurn = synX2475int;

    for (int i = synX2476int; i < synX2477int; i++) {
      meta += synX2478String;

      for (int flier = synX2479int; flier < synX2480int; flier++) {
        java.lang.String counted = synX2481String;

        if (!buttocksMultitude[behindTurn].isAccessible()) {
          counted = synX2482String;
        }

        meta +=
            synX2483String
                + counted
                + synX2484String
                + buttocksMultitude[behindTurn].fetchEmployeePictures()
                + synX2485String
                + buttocksMultitude[behindTurn].fixChance()
                + synX2486String
                + quarrelAlign[i]
                + synX2487String
                + (flier + synX2488int)
                + synX2489String
                + behindTurn
                + synX2490String
                + synX2491String
                + quarrelAlign[i]
                + (flier + synX2492int)
                + synX2493String
                + synX2494String;
        behindTurn++;
      }
      meta += synX2495String;
    }
    meta +=
        synX2496String
            + synX2497String
            + synX2498String
            + synX2499String
            + synX2500String
            + synX2501String
            + synX2502String
            + synX2503String
            + synX2504String
            + synX2505String
            + synX2506String
            + synX2507String
            + synX2508String
            + synX2509String
            + synX2510String
            + synX2511String
            + synX2512String
            + synX2513String
            + synX2514String
            + synX2515String
            + synX2516String
            + synX2517String
            + synX2518String
            + synX2519String
            + synX2520String
            + synX2521String
            + synX2522String
            + synX2523String
            + synX2524String
            + synX2525String
            + synX2526String;
    return meta;
  }

  public static synchronized java.lang.String arriveFlowMonth() {
    int maximalLength = synX2527int;
    java.text.SimpleDateFormat untriedScheduleMethod =
        new java.text.SimpleDateFormat(synX2528String);
    java.util.Date deadlines = new java.util.Date();
    java.lang.String lewDueJuncture = untriedScheduleMethod.format(deadlines);
    return lewDueJuncture;
  }

  private synchronized void synx76() throws ServletException, IOException {

    if (warning.equals(synX2529String)) {
      warning = synX2530String;
    } else if (warning.equals(synX2531String)) {
      warning = synX2532String;
    }
  }

  private synchronized void synx77() throws ServletException, IOException {
    warning = synX2533String;
  }

  private synchronized void synx78() throws ServletException, IOException {
    buttocksMultitude = readerInitiate();
  }

  private synchronized void synx79() throws ServletException, IOException {

    for (int i = synX2534int; i < synX2535int; i++) {
      Butt unusedBuns = new Butt();
      buttocksMultitude[i] = unusedBuns;
    }
    earnExecutable(buttocksMultitude);
  }
}
