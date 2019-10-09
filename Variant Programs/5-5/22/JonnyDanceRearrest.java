import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import static java.lang.Integer.parseInt;

public class JonnyDanceRearrest extends javax.servlet.http.HttpServlet {
  private static final String synX2413String = "/WEB-INF/bookingData.ser";
  private static final String synX2412String = "wPilmmrbJsJ8VTMob";
  private static final String synX2411String = "/WEB-INF/bookingData.ser";
  private static final int synX2410int = 1297754294;
  private static final String synX2409String = "9";
  private static final String synX2408String = "8";
  private static final String synX2407String = "7";
  private static final String synX2406String = "6";
  private static final String synX2405String = "5";
  private static final String synX2404String = "4";
  private static final String synX2403String = "3";
  private static final String synX2402String = "2";
  private static final String synX2401String = "1";
  private static final String synX2400String = "0";
  private static final String synX2399String = "Z";
  private static final String synX2398String = "Y";
  private static final String synX2397String = "X";
  private static final String synX2396String = "W";
  private static final String synX2395String = "V";
  private static final String synX2394String = "U";
  private static final String synX2393String = "T";
  private static final String synX2392String = "S";
  private static final String synX2391String = "R";
  private static final String synX2390String = "Q";
  private static final String synX2389String = "P";
  private static final String synX2388String = "O";
  private static final String synX2387String = "N";
  private static final String synX2386String = "M";
  private static final String synX2385String = "L";
  private static final String synX2384String = "K";
  private static final String synX2383String = "J";
  private static final String synX2382String = "I";
  private static final String synX2381String = "H";
  private static final String synX2380String = "G";
  private static final String synX2379String = "F";
  private static final String synX2378String = "E";
  private static final String synX2377String = "D";
  private static final String synX2376String = "C";
  private static final String synX2375String = "B";
  private static final String synX2374String = "A";
  private static final int synX2373int = 1898477236;
  private static final String synX2372String = "</html>";
  private static final String synX2371String = "  </body>\t\n";
  private static final String synX2370String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX2369String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX2368String = "    </footer>\n";
  private static final String synX2367String = "      </div>\n";
  private static final String synX2366String = "        <p>c3063467</p>\n";
  private static final String synX2365String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX2364String = "      <div class=\"author\">\n";
  private static final String synX2363String = "    <footer>\n";
  private static final String synX2362String = "    </article>\n";
  private static final String synX2361String = "      </form>\n";
  private static final String synX2360String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX2359String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX2358String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX2357String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX2356String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX2355String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX2354String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX2353String = "\" />\n";
  private static final String synX2352String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX2351String = "\" />\n";
  private static final String synX2350String =
      "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX2349String = "\" />\n";
  private static final String synX2348String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX2347String =
      "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX2346String = "\n";
  private static final String synX2345String = "</div>\n";
  private static final String synX2344String = "</p>";
  private static final String synX2343String = "\">";
  private static final String synX2342String = "<p class=\"option\" data-code=\"";
  private static final String synX2341String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX2340String = "      <div class=\"security\">\n";
  private static final String synX2339String = "</div>\n";
  private static final String synX2338String = "</p>";
  private static final String synX2337String = "<p class=\"option\">";
  private static final String synX2336String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX2335String = "      <div class=\"selected\">\n";
  private static final String synX2334String = "      <h2>Your Selection</h2>\n";
  private static final String synX2333String = "    <article>\n";
  private static final String synX2332String = "    </header>\n";
  private static final String synX2331String = "      <h1>Seat Booking</h1>\n";
  private static final String synX2330String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX2329String = "    <header>\n";
  private static final String synX2328String = "  <body class=\"booking\">\n";
  private static final String synX2327String = "  </head>\n";
  private static final String synX2326String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX2325String = "    <![endif]-->\n";
  private static final String synX2324String = "      </script>\n";
  private static final String synX2323String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX2322String = "    <!--[if IE]>\n";
  private static final String synX2321String = "    <title>Seat Booking</title>\n";
  private static final String synX2320String = "    <meta charset=utf-8>\n";
  private static final String synX2319String = "  <head>\n";
  private static final String synX2318String = "<html lang=\"en\">\n";
  private static final String synX2317String = "<!DOCTYPE html>\n";
  private static final String synX2316String = "";
  private static final double synX2315double = 0.9819982611385206;
  private static final String synX2314String = "benstheatre?message=success";
  private static final boolean synX2313boolean = false;
  private static final String synX2312String = "benstheatre?message=limitexceeded";
  private static final int synX2311int = 2;
  private static final int synX2310int = 0;
  private static final String synX2309String = "phone";
  private static final String synX2308String = "email";
  private static final String synX2307String = "address";
  private static final String synX2306String = "userid";
  private static final String synX2305String = "seatnumber";
  private static final String synX2304String = "seat";
  private static final String synX2303String = "row";
  private static final double synX2302double = 0.6149830275351438;
  private static final String synX2301String = "seatnumber";
  private static final String synX2300String = "seat";
  private static final String synX2299String = "row";
  private static final int synX2298int = -1453613674;
  public static String peakSize = "XRPjiIDLetQwv4";
  private Butt[] rearRange = null;
  private java.lang.String ranking = null;
  private int rumpCount = 0;
  private int prat = 0;
  private java.lang.String clientIdentifying = null;
  private java.lang.String ring = null;
  private java.lang.String resolve = null;
  private java.lang.String facsimile = null;
  private static java.util.logging.Logger woodworker = getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest appeals, HttpServletResponse reacting)
      throws ServletException, IOException {
    int pawn = synX2298int;
    java.io.PrintWriter unstylish = reacting.getWriter();
    ranking = appeals.getParameter(synX2299String);
    prat = parseInt(appeals.getParameter(synX2300String));
    rumpCount = parseInt(appeals.getParameter(synX2301String));
    rearRange = understandCharge();
    java.lang.String reservationPageboy = drawAdvanceFootnote();
    unstylish.println(reservationPageboy);
  }

  public synchronized void doPost(HttpServletRequest petition, HttpServletResponse retort)
      throws ServletException, IOException {
    double tonality = synX2302double;
    ranking = petition.getParameter(synX2303String);
    prat = parseInt(petition.getParameter(synX2304String));
    rumpCount = parseInt(petition.getParameter(synX2305String));
    clientIdentifying = petition.getParameter(synX2306String);
    resolve = petition.getParameter(synX2307String);
    facsimile = petition.getParameter(synX2308String);
    ring = petition.getParameter(synX2309String);
    rearRange = understandCharge();
    int logged = synX2310int;
    for (Butt waffen : rearRange) synx75(waffen, logged);

    if (logged > synX2311int) {
      retort.sendRedirect(synX2312String);
    } else {
      rearRange[rumpCount].readyUsernameDimidiate(clientIdentifying);
      rearRange[rumpCount].orderedRectify(resolve);
      rearRange[rumpCount].putNetmail(facsimile);
      rearRange[rumpCount].laidCall(ring);
      rearRange[rumpCount].fitYear(CustArtists.arriveFlowMonth());
      rearRange[rumpCount].settledVisible(synX2313boolean);
      keepSubmit(rearRange);
      retort.sendRedirect(synX2314String);
    }
  }

  public synchronized java.lang.String drawAdvanceFootnote() {
    double ceiling = synX2315double;
    java.lang.String encodes = secureLaw();
    java.lang.String xhtml = synX2316String;
    xhtml +=
        synX2317String
            + synX2318String
            + synX2319String
            + synX2320String
            + synX2321String
            + synX2322String
            + synX2323String
            + synX2324String
            + synX2325String
            + synX2326String
            + synX2327String
            + synX2328String
            + synX2329String
            + synX2330String
            + synX2331String
            + synX2332String
            + synX2333String
            + synX2334String
            + synX2335String
            + synX2336String;
    xhtml += synX2337String + ranking + prat + synX2338String;
    xhtml += synX2339String + synX2340String + synX2341String;
    xhtml += synX2342String + encodes + synX2343String + encodes + synX2344String;
    xhtml +=
        synX2345String
            + synX2346String
            + synX2347String
            + synX2348String
            + prat
            + synX2349String
            + synX2350String
            + ranking
            + synX2351String
            + synX2352String
            + rumpCount
            + synX2353String
            + synX2354String
            + synX2355String
            + synX2356String
            + synX2357String
            + synX2358String
            + synX2359String
            + synX2360String
            + synX2361String
            + synX2362String
            + synX2363String
            + synX2364String
            + synX2365String
            + synX2366String
            + synX2367String
            + synX2368String
            + synX2369String
            + synX2370String
            + synX2371String
            + synX2372String;
    return xhtml;
  }

  public synchronized java.lang.String secureLaw() {
    int heightConfine = synX2373int;
    java.lang.String mail[] = {
      synX2374String,
      synX2375String,
      synX2376String,
      synX2377String,
      synX2378String,
      synX2379String,
      synX2380String,
      synX2381String,
      synX2382String,
      synX2383String,
      synX2384String,
      synX2385String,
      synX2386String,
      synX2387String,
      synX2388String,
      synX2389String,
      synX2390String,
      synX2391String,
      synX2392String,
      synX2393String,
      synX2394String,
      synX2395String,
      synX2396String,
      synX2397String,
      synX2398String,
      synX2399String
    };
    java.lang.String totals[] = {
      synX2400String,
      synX2401String,
      synX2402String,
      synX2403String,
      synX2404String,
      synX2405String,
      synX2406String,
      synX2407String,
      synX2408String,
      synX2409String
    };
    java.util.Random wanton = new java.util.Random();
    java.lang.String temperature = null,
        ap = null,
        eigenvalue = null,
        bt = null,
        en = null,
        r6 = null;
    temperature = mail[wanton.nextInt(mail.length)];
    ap = totals[wanton.nextInt(totals.length)];
    eigenvalue = mail[wanton.nextInt(mail.length)];
    bt = totals[wanton.nextInt(totals.length)];
    en = mail[wanton.nextInt(mail.length)];
    r6 = totals[wanton.nextInt(totals.length)];
    return temperature + ap + eigenvalue + bt + en + r6;
  }

  public synchronized Butt[] understandCharge() {
    int briEquipment = synX2410int;

    try {
      Butt[] elects = null;
      java.io.FileInputStream tenantsDocuments =
          new java.io.FileInputStream(getServletContext().getRealPath(synX2411String));
      java.io.ObjectInputStream elected = new java.io.ObjectInputStream(tenantsDocuments);
      elects = (Butt[]) elected.readObject();
      elected.close();
      tenantsDocuments.close();
      return elects;
    } catch (java.io.IOException i) {
      woodworker.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException stan) {
      woodworker.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public synchronized void keepSubmit(Butt[] mats) {
    String reducedLeaping = synX2412String;

    try {
      java.io.FileOutputStream kayoedDocket =
          new java.io.FileOutputStream(getServletContext().getRealPath(synX2413String));
      java.io.ObjectOutputStream taboo = new java.io.ObjectOutputStream(kayoedDocket);
      taboo.writeObject(mats);
      taboo.close();
      kayoedDocket.close();
    } catch (java.io.IOException admittedly) {
      admittedly.printStackTrace();
    }
  }

  private synchronized void synx75(Butt waffen, int logged) throws ServletException, IOException {

    if (waffen.fetchEmployeePictures() != null
        && waffen.fetchEmployeePictures().equals(clientIdentifying)) {
      logged++;
    }
  }
}
