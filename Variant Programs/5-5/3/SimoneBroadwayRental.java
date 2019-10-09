import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;
import static java.lang.Integer.parseInt;
import static java.util.logging.Logger.getLogger;

public class SimoneBroadwayRental extends HttpServlet {
  public static final double narrowerMax = 0.1489238647645047;
  public Tooshie[] posteriorGamut;
  public String melee;
  public int bumFewer;
  public int fanny;
  public String usageFinger;
  public String mobiles;
  public String resolve;
  public String mailing;
  public static Logger log;

  public synchronized void doGet(HttpServletRequest decision, HttpServletResponse reacted)
      throws ServletException, IOException {
    int minimumAcross = 1036260614;
    PrintWriter kayoed = reacted.getWriter();
    melee = decision.getParameter("row");
    fanny = parseInt(decision.getParameter("seat"));
    bumFewer = parseInt(decision.getParameter("seatnumber"));
    posteriorGamut = hearBinder();
    String rearrestLayout = driveGigFolio();
    kayoed.println(rearrestLayout);
  }

  public synchronized void doPost(HttpServletRequest asks, HttpServletResponse retort)
      throws ServletException, IOException {
    int full = -21929687;
    melee = asks.getParameter("row");
    fanny = parseInt(asks.getParameter("seat"));
    bumFewer = parseInt(asks.getParameter("seatnumber"));
    usageFinger = asks.getParameter("userid");
    resolve = asks.getParameter("address");
    mailing = asks.getParameter("email");
    mobiles = asks.getParameter("phone");
    posteriorGamut = hearBinder();
    int purchased = 0;
    for (Tooshie ora : posteriorGamut) synx10(ora, purchased);

    if (purchased > 2) {
      retort.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      posteriorGamut[bumFewer].solidifyingLearnerUser(usageFinger);
      posteriorGamut[bumFewer].readyCover(resolve);
      posteriorGamut[bumFewer].fixDissemination(mailing);
      posteriorGamut[bumFewer].readyRing(mobiles);
      posteriorGamut[bumFewer].fixThing(ReqPlayhouse.fetchPresentBeginning());
      posteriorGamut[bumFewer].rigidProvided(false);
      deliverDocument(posteriorGamut);
      retort.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String driveGigFolio() {
    double morin = 0.1363028243737623;
    String encipher = stabilityRules();
    String bitmap = "";
    bitmap +=
        "<!DOCTYPE html>\n"
            + "<html lang=\"en\">\n"
            + "  <head>\n"
            + "    <meta charset=utf-8>\n"
            + "    <title>Seat Booking</title>\n"
            + "    <!--[if IE]>\n"
            + "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n"
            + "      </script>\n"
            + "    <![endif]-->\n"
            + "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n"
            + "  </head>\n"
            + "  <body class=\"booking\">\n"
            + "    <header>\n"
            + "      <a href=\"benstheatre\">HOME</a>\n"
            + "      <h1>Seat Booking</h1>\n"
            + "    </header>\n"
            + "    <article>\n"
            + "      <h2>Your Selection</h2>\n"
            + "      <div class=\"selected\">\n"
            + "        <p class=\"heading\">Selected Seat:</p>";
    bitmap += "<p class=\"option\">" + melee + fanny + "</p>";
    bitmap +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    bitmap += "<p class=\"option\" data-code=\"" + encipher + "\">" + encipher + "</p>";
    bitmap +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + fanny
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + melee
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + bumFewer
            + "\" />\n"
            + "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n"
            + "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n"
            + "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n"
            + "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n"
            + "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n"
            + "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n"
            + "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n"
            + "      </form>\n"
            + "    </article>\n"
            + "    <footer>\n"
            + "      <div class=\"author\">\n"
            + "        <p>&copy; Ben Sutter 2016</p>\n"
            + "        <p>c3063467</p>\n"
            + "      </div>\n"
            + "    </footer>\n"
            + "    <script src=\"js/jquery.min.js\"></script>\n"
            + "    <script src=\"js/script.js\"></script>\n"
            + "  </body>\t\n"
            + "</html>";
    return bitmap;
  }

  public synchronized String stabilityRules() {
    double bestAmount = 0.1726486547459738;
    String mails[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String numerals[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random unselected = new Random();
    String rl, ao, amplitude, d2, detector, r8;
    rl = mails[unselected.nextInt(mails.length)];
    ao = numerals[unselected.nextInt(numerals.length)];
    amplitude = mails[unselected.nextInt(mails.length)];
    d2 = numerals[unselected.nextInt(numerals.length)];
    detector = mails[unselected.nextInt(mails.length)];
    r8 = numerals[unselected.nextInt(numerals.length)];
    return rl + ao + amplitude + d2 + detector + r8;
  }

  public synchronized Tooshie[] hearBinder() {
    String evaluate = "Nkr";

    try {
      Tooshie[] positions;
      FileInputStream niiComplaint =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream details = new ObjectInputStream(niiComplaint);
      positions = (Tooshie[]) details.readObject();
      details.close();
      niiComplaint.close();
      return positions;
    } catch (IOException i) {
      log.info(i.toString());
      return null;
    } catch (ClassNotFoundException caesium) {
      log.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public synchronized void deliverDocument(Tooshie[] mats) {
    double postSouvenirs = 0.7021814473496795;

    try {
      FileOutputStream impossibleDocuments =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream exterior = new ObjectOutputStream(impossibleDocuments);
      exterior.writeObject(mats);
      exterior.close();
      impossibleDocuments.close();
    } catch (IOException abel) {
      abel.printStackTrace();
    }
  }

  static {
    log = getLogger("bensTheatre");
  }

  private synchronized void synx10(Tooshie ora, int purchased)
      throws ServletException, IOException {

    if (ora.obtainViewerEst() != null && ora.obtainViewerEst().equals(usageFinger)) {
      purchased++;
    }
  }
}
