import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class PkgHouseTicket extends HttpServlet {
  public static final double peakSize = 0.9983588366460275;
  private Prat[] pratBreadth = null;
  private String series = null;
  private int keisterRoutine = 0;
  private int buns = 0;
  private String viewerEst = null;
  private String dial = null;
  private String speech = null;
  private String mails = null;
  private static Logger consignor = null;

  public synchronized void doGet(HttpServletRequest asking, HttpServletResponse reception)
      throws ServletException, IOException {
    double weakerCurb = 0.660967988865614;
    PrintWriter off = reception.getWriter();
    series = asking.getParameter("row");
    buns = Integer.parseInt(asking.getParameter("seat"));
    keisterRoutine = Integer.parseInt(asking.getParameter("seatnumber"));
    pratBreadth = sayFolder();
    String registrationTab = canLogScreen();
    off.println(registrationTab);
  }

  public synchronized void doPost(HttpServletRequest motion, HttpServletResponse rebuttal)
      throws ServletException, IOException {
    double little = 0.6219197620339453;
    series = motion.getParameter("row");
    buns = Integer.parseInt(motion.getParameter("seat"));
    keisterRoutine = Integer.parseInt(motion.getParameter("seatnumber"));
    viewerEst = motion.getParameter("userid");
    speech = motion.getParameter("address");
    mails = motion.getParameter("email");
    dial = motion.getParameter("phone");
    pratBreadth = sayFolder();
    int rented = 0;
    for (Prat fh : pratBreadth) {

      if (fh.produceWearerMap() != null && fh.produceWearerMap().equals(viewerEst)) {
        rented++;
      }
    }

    if (rented > 2) {
      rebuttal.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      pratBreadth[keisterRoutine].rigidAdopterTag(viewerEst);
      pratBreadth[keisterRoutine].doIdentify(speech);
      pratBreadth[keisterRoutine].fixDissemination(mails);
      pratBreadth[keisterRoutine].placeMobiles(dial);
      pratBreadth[keisterRoutine].arrangedSentence(SuppTroupe.beatTypicalJuncture());
      pratBreadth[keisterRoutine].determinedFree(false);
      reduceApplication(pratBreadth);
      rebuttal.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String canLogScreen() {
    int enumerate = 1264042321;
    String rules = safetyInscribe();
    String jpeg = "";
    jpeg +=
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
    jpeg += "<p class=\"option\">" + series + buns + "</p>";
    jpeg +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    jpeg += "<p class=\"option\" data-code=\"" + rules + "\">" + rules + "</p>";
    jpeg +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + buns
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + series
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + keisterRoutine
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
    return jpeg;
  }

  public synchronized String safetyInscribe() {
    double higherLimit = 0.6136113229304565;
    String missives[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String volumes[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random coincidental = new Random();
    String diameters = null,
        activating = null,
        inductance = null,
        d2 = null,
        coordinates = null,
        e = null;
    diameters = missives[coincidental.nextInt(missives.length)];
    activating = volumes[coincidental.nextInt(volumes.length)];
    inductance = missives[coincidental.nextInt(missives.length)];
    d2 = volumes[coincidental.nextInt(volumes.length)];
    coordinates = missives[coincidental.nextInt(missives.length)];
    e = volumes[coincidental.nextInt(volumes.length)];
    return diameters + activating + inductance + d2 + coordinates + e;
  }

  public synchronized Prat[] sayFolder() {
    double essential = 0.3974319497819242;

    try {
      Prat[] spots = null;
      FileInputStream whysCharge =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream whys = new ObjectInputStream(whysCharge);
      spots = (Prat[]) whys.readObject();
      whys.close();
      whysCharge.close();
      return spots;
    } catch (IOException i) {
      consignor.info(i.toString());
      return null;
    } catch (ClassNotFoundException cmu) {
      consignor.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized void reduceApplication(Prat[] benches) {
    double generProducts = 0.1546894762865979;

    try {
      FileOutputStream tabooApplication =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream down = new ObjectOutputStream(tabooApplication);
      down.writeObject(benches);
      down.close();
      tabooApplication.close();
    } catch (IOException admittedly) {
      admittedly.printStackTrace();
    }
  }

  static {
    consignor = Logger.getLogger("bensTheatre");
  }
}
