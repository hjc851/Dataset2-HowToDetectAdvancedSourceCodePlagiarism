import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class SuppTroupeOverbooking extends javax.servlet.http.HttpServlet {
  static String upperSkank = "GrHCLrbH5";
  public Behind[] derriereVariety;
  public java.lang.String dispute;
  public int bumFewer;
  public int tush;
  public java.lang.String usabilityCard;
  public java.lang.String sound;
  public java.lang.String speech;
  public java.lang.String messaging;
  public static java.util.logging.Logger rancher =
      java.util.logging.Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest asks, HttpServletResponse reception)
      throws ServletException, IOException {
    double ceilingSlot = 0.7931067593312626;
    java.io.PrintWriter dead = reception.getWriter();
    dispute = asks.getParameter("row");
    tush = java.lang.Integer.parseInt(asks.getParameter("seat"));
    bumFewer = java.lang.Integer.parseInt(asks.getParameter("seatnumber"));
    derriereVariety = readableArchiving();
    java.lang.String subscriptionTable = drawAdvanceFootnote();
    dead.println(subscriptionTable);
  }

  public synchronized void doPost(HttpServletRequest plea, HttpServletResponse reacting)
      throws ServletException, IOException {
    String topmostMinimum = "DePBe47Hgya6Q";
    dispute = plea.getParameter("row");
    tush = java.lang.Integer.parseInt(plea.getParameter("seat"));
    bumFewer = java.lang.Integer.parseInt(plea.getParameter("seatnumber"));
    usabilityCard = plea.getParameter("userid");
    speech = plea.getParameter("address");
    messaging = plea.getParameter("email");
    sound = plea.getParameter("phone");
    derriereVariety = readableArchiving();
    int rented = 0;
    for (Behind waffen : derriereVariety) {

      if (waffen.haveSubscriberHandle() != null
          && waffen.haveSubscriberHandle().equals(usabilityCard)) {
        rented++;
      }
    }

    if (rented > 2) {
      reacting.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      derriereVariety[bumFewer].primedUsageFinger(usabilityCard);
      derriereVariety[bumFewer].determinedWork(speech);
      derriereVariety[bumFewer].dictatedEmailed(messaging);
      derriereVariety[bumFewer].laidCall(sound);
      derriereVariety[bumFewer].orderedChance(NathanMovie.bringOngoingMeter());
      derriereVariety[bumFewer].dictatedPurchasable(false);
      economizeSubmitted(derriereVariety);
      reacting.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String drawAdvanceFootnote() {
    int pettyDemarcation = -163899819;
    java.lang.String rules = insecureCodex();
    java.lang.String powerpoint = "";
    powerpoint +=
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
    powerpoint += "<p class=\"option\">" + dispute + tush + "</p>";
    powerpoint +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    powerpoint += "<p class=\"option\" data-code=\"" + rules + "\">" + rules + "</p>";
    powerpoint +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + tush
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + dispute
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
    return powerpoint;
  }

  public synchronized java.lang.String insecureCodex() {
    double prices = 0.5720038816281796;
    java.lang.String memorandums[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String rates[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random randomization = new java.util.Random();
    java.lang.String jt, bp, variable, exponent, geometry, mx;
    jt = memorandums[randomization.nextInt(memorandums.length)];
    bp = rates[randomization.nextInt(rates.length)];
    variable = memorandums[randomization.nextInt(memorandums.length)];
    exponent = rates[randomization.nextInt(rates.length)];
    geometry = memorandums[randomization.nextInt(memorandums.length)];
    mx = rates[randomization.nextInt(rates.length)];
    return jt + bp + variable + exponent + geometry + mx;
  }

  public synchronized Behind[] readableArchiving() {
    double fatty = 0.6602755815003052;

    try {
      Behind[] vacancies;
      java.io.FileInputStream niiComplaint =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream nsi = new java.io.ObjectInputStream(niiComplaint);
      vacancies = (Behind[]) nsi.readObject();
      nsi.close();
      niiComplaint.close();
      return vacancies;
    } catch (java.io.IOException i) {
      rancher.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException intrasentential) {
      rancher.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void economizeSubmitted(Behind[] stools) {
    String appoint = "eG1jpD";

    try {
      java.io.FileOutputStream tabuInitiate =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream extinguished = new java.io.ObjectOutputStream(tabuInitiate);
      extinguished.writeObject(stools);
      extinguished.close();
      tabuInitiate.close();
    } catch (java.io.IOException afterwards) {
      afterwards.printStackTrace();
    }
  }
}
