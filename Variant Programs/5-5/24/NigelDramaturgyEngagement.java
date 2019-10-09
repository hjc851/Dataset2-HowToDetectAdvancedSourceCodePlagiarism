import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class NigelDramaturgyEngagement extends javax.servlet.http.HttpServlet {
  private static final String synX2645String = "</html>";
  private static final String synX2644String = "  </body>\t\n";
  private static final String synX2643String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX2642String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX2641String = "    </footer>\n";
  private static final String synX2640String = "      </div>\n";
  private static final String synX2639String = "        <p>c3063467</p>\n";
  private static final String synX2638String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX2637String = "      <div class=\"author\">\n";
  private static final String synX2636String = "    <footer>\n";
  private static final String synX2635String = "    </article>\n";
  private static final String synX2634String = "      </form>\n";
  private static final String synX2633String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX2632String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX2631String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX2630String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX2629String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX2628String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX2627String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX2626String = "\" />\n";
  private static final String synX2625String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX2624String = "\" />\n";
  private static final String synX2623String =
      "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX2622String = "\" />\n";
  private static final String synX2621String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX2620String =
      "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX2619String = "\n";
  private static final String synX2618String = "</div>\n";
  private static final String synX2617String = "</p>";
  private static final String synX2616String = "\">";
  private static final String synX2615String = "<p class=\"option\" data-code=\"";
  private static final String synX2614String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX2613String = "      <div class=\"security\">\n";
  private static final String synX2612String = "</div>\n";
  private static final String synX2611String = "</p>";
  private static final String synX2610String = "<p class=\"option\">";
  private static final String synX2609String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX2608String = "      <div class=\"selected\">\n";
  private static final String synX2607String = "      <h2>Your Selection</h2>\n";
  private static final String synX2606String = "    <article>\n";
  private static final String synX2605String = "    </header>\n";
  private static final String synX2604String = "      <h1>Seat Booking</h1>\n";
  private static final String synX2603String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX2602String = "    <header>\n";
  private static final String synX2601String = "  <body class=\"booking\">\n";
  private static final String synX2600String = "  </head>\n";
  private static final String synX2599String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX2598String = "    <![endif]-->\n";
  private static final String synX2597String = "      </script>\n";
  private static final String synX2596String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX2595String = "    <!--[if IE]>\n";
  private static final String synX2594String = "    <title>Seat Booking</title>\n";
  private static final String synX2593String = "    <meta charset=utf-8>\n";
  private static final String synX2592String = "  <head>\n";
  private static final String synX2591String = "<html lang=\"en\">\n";
  private static final String synX2590String = "<!DOCTYPE html>\n";
  private static final String synX2589String = "";
  private static final String synX2588String = "seatnumber";
  private static final String synX2587String = "seat";
  private static final String synX2586String = "row";
  private static final String synX2585String = "/WEB-INF/bookingData.ser";
  private static final String synX2584String = "/WEB-INF/bookingData.ser";
  private static final String synX2583String = "benstheatre?message=success";
  private static final boolean synX2582boolean = false;
  private static final String synX2581String = "benstheatre?message=limitexceeded";
  private static final int synX2580int = 2;
  private static final int synX2579int = 0;
  private static final String synX2578String = "phone";
  private static final String synX2577String = "email";
  private static final String synX2576String = "address";
  private static final String synX2575String = "userid";
  private static final String synX2574String = "seatnumber";
  private static final String synX2573String = "seat";
  private static final String synX2572String = "row";
  private static final String synX2571String = "9";
  private static final String synX2570String = "8";
  private static final String synX2569String = "7";
  private static final String synX2568String = "6";
  private static final String synX2567String = "5";
  private static final String synX2566String = "4";
  private static final String synX2565String = "3";
  private static final String synX2564String = "2";
  private static final String synX2563String = "1";
  private static final String synX2562String = "0";
  private static final String synX2561String = "Z";
  private static final String synX2560String = "Y";
  private static final String synX2559String = "X";
  private static final String synX2558String = "W";
  private static final String synX2557String = "V";
  private static final String synX2556String = "U";
  private static final String synX2555String = "T";
  private static final String synX2554String = "S";
  private static final String synX2553String = "R";
  private static final String synX2552String = "Q";
  private static final String synX2551String = "P";
  private static final String synX2550String = "O";
  private static final String synX2549String = "N";
  private static final String synX2548String = "M";
  private static final String synX2547String = "L";
  private static final String synX2546String = "K";
  private static final String synX2545String = "J";
  private static final String synX2544String = "I";
  private static final String synX2543String = "H";
  private static final String synX2542String = "G";
  private static final String synX2541String = "F";
  private static final String synX2540String = "E";
  private static final String synX2539String = "D";
  private static final String synX2538String = "C";
  private static final String synX2537String = "B";
  private static final String synX2536String = "A";
  private Rear[] canSuite = null;

  public synchronized java.lang.String certificateCypher() {
    java.lang.String memoranda[] = {
      synX2536String,
      synX2537String,
      synX2538String,
      synX2539String,
      synX2540String,
      synX2541String,
      synX2542String,
      synX2543String,
      synX2544String,
      synX2545String,
      synX2546String,
      synX2547String,
      synX2548String,
      synX2549String,
      synX2550String,
      synX2551String,
      synX2552String,
      synX2553String,
      synX2554String,
      synX2555String,
      synX2556String,
      synX2557String,
      synX2558String,
      synX2559String,
      synX2560String,
      synX2561String
    };
    java.lang.String percentages[] = {
      synX2562String,
      synX2563String,
      synX2564String,
      synX2565String,
      synX2566String,
      synX2567String,
      synX2568String,
      synX2569String,
      synX2570String,
      synX2571String
    };
    java.util.Random stochastic;
    java.lang.String fl, a1, robot, cp, logarithm, e;
    stochastic = (new java.util.Random());
    fl = (null);
    a1 = (null);
    robot = (null);
    cp = (null);
    logarithm = (null);
    e = (null);
    fl = (memoranda[stochastic.nextInt(memoranda.length)]);
    a1 = (percentages[stochastic.nextInt(percentages.length)]);
    robot = (memoranda[stochastic.nextInt(memoranda.length)]);
    cp = (percentages[stochastic.nextInt(percentages.length)]);
    logarithm = (memoranda[stochastic.nextInt(memoranda.length)]);
    e = (percentages[stochastic.nextInt(percentages.length)]);
    return (fl + a1 + robot + cp + logarithm + e);
  }

  public synchronized void doPost(HttpServletRequest proposal, HttpServletResponse rejoinder)
      throws ServletException, IOException {
    int rented;
    ranked = (proposal.getParameter(synX2572String));
    induct = (java.lang.Integer.parseInt(proposal.getParameter(synX2573String)));
    tushFigure = (java.lang.Integer.parseInt(proposal.getParameter(synX2574String)));
    operatorSecurity = (proposal.getParameter(synX2575String));
    alleviate = (proposal.getParameter(synX2576String));
    fax = (proposal.getParameter(synX2577String));
    calls = (proposal.getParameter(synX2578String));
    canSuite = (wrotePapers());
    rented = (synX2579int);
    for (Rear ora : canSuite) synx85(ora, rented);

    if (rented > synX2580int) {
      rejoinder.sendRedirect(synX2581String);
    } else {
      canSuite[tushFigure].laidEnjoyerMilad(operatorSecurity);
      canSuite[tushFigure].fitPlow(alleviate);
      canSuite[tushFigure].settledCorrespondence(fax);
      canSuite[tushFigure].situatedTelephony(calls);
      canSuite[tushFigure].primedPeriod(AstonArts.beatTypicalJuncture());
      canSuite[tushFigure].bentGettable(synX2582boolean);
      deliverDocument(canSuite);
      rejoinder.sendRedirect(synX2583String);
    }
  }

  private java.lang.String calls = null;
  private static java.util.logging.Logger log = java.util.logging.Logger.getLogger("bensTheatre");
  private java.lang.String fax = null;
  private int induct = 0;
  private java.lang.String ranked = null;

  public synchronized Rear[] wrotePapers() {

    try {
      java.io.FileInputStream withoutRegister;
      java.io.ObjectInputStream whys;
      Rear[] stools = null;
      withoutRegister =
          (new java.io.FileInputStream(getServletContext().getRealPath(synX2584String)));
      whys = (new java.io.ObjectInputStream(withoutRegister));
      stools = ((Rear[]) whys.readObject());
      whys.close();
      withoutRegister.close();
      return stools;
    } catch (java.io.IOException i) {
      log.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException shim) {
      log.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  private java.lang.String operatorSecurity = null;
  private int tushFigure = 0;

  public synchronized void deliverDocument(Rear[] beds) {

    try {
      java.io.FileOutputStream unsuccessfulFolders;
      java.io.ObjectOutputStream taboo;
      unsuccessfulFolders =
          (new java.io.FileOutputStream(getServletContext().getRealPath(synX2585String)));
      taboo = (new java.io.ObjectOutputStream(unsuccessfulFolders));
      taboo.writeObject(beds);
      taboo.close();
      unsuccessfulFolders.close();
    } catch (java.io.IOException abbe) {
      abbe.printStackTrace();
    }
  }

  public synchronized void doGet(HttpServletRequest asked, HttpServletResponse wake)
      throws ServletException, IOException {
    java.io.PrintWriter quenched;
    java.lang.String hiringSheet;
    quenched = (wake.getWriter());
    ranked = (asked.getParameter(synX2586String));
    induct = (java.lang.Integer.parseInt(asked.getParameter(synX2587String)));
    tushFigure = (java.lang.Integer.parseInt(asked.getParameter(synX2588String)));
    canSuite = (wrotePapers());
    hiringSheet = (conveyDetentionAnnexes());
    quenched.println(hiringSheet);
  }

  public synchronized java.lang.String conveyDetentionAnnexes() {
    java.lang.String encryption;
    java.lang.String jpeg;
    encryption = (certificateCypher());
    jpeg = (synX2589String);
    jpeg +=
        ((synX2590String
            + synX2591String
            + synX2592String
            + synX2593String
            + synX2594String
            + synX2595String
            + synX2596String
            + synX2597String
            + synX2598String
            + synX2599String
            + synX2600String
            + synX2601String
            + synX2602String
            + synX2603String
            + synX2604String
            + synX2605String
            + synX2606String
            + synX2607String
            + synX2608String
            + synX2609String));
    jpeg += ((synX2610String + ranked + induct + synX2611String));
    jpeg += ((synX2612String + synX2613String + synX2614String));
    jpeg += ((synX2615String + encryption + synX2616String + encryption + synX2617String));
    jpeg +=
        ((synX2618String
            + synX2619String
            + synX2620String
            + synX2621String
            + induct
            + synX2622String
            + synX2623String
            + ranked
            + synX2624String
            + synX2625String
            + tushFigure
            + synX2626String
            + synX2627String
            + synX2628String
            + synX2629String
            + synX2630String
            + synX2631String
            + synX2632String
            + synX2633String
            + synX2634String
            + synX2635String
            + synX2636String
            + synX2637String
            + synX2638String
            + synX2639String
            + synX2640String
            + synX2641String
            + synX2642String
            + synX2643String
            + synX2644String
            + synX2645String));
    return jpeg;
  }

  private java.lang.String alleviate = null;

  private synchronized void synx85(Rear ora, int rented) throws ServletException, IOException {

    if (ora.obtainViewerEst() != null && ora.obtainViewerEst().equals(operatorSecurity)) {
      rented++;
    }
  }
}
