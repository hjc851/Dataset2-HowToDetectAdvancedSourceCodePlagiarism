import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class AllanSalleAppointment extends javax.servlet.http.HttpServlet {
  private static java.util.logging.Logger woodsman = null;
  private java.lang.String emailed = null;
  private java.lang.String work = null;
  private java.lang.String telephonic = null;
  private java.lang.String wearerMap = null;
  private int stern = 0;
  private int assSeveral = 0;
  private java.lang.String controversy = null;
  static int depressLimitation = 959728767;
  private Rear[] tooshiePortfolio = null;

  public synchronized void doGet(HttpServletRequest proposal, HttpServletResponse wake)
      throws ServletException, IOException {
    double postSouvenirs;
    java.io.PrintWriter outgoing;
    java.lang.String venueFront;
    postSouvenirs = 0.5448592948357718;
    outgoing = wake.getWriter();
    controversy = proposal.getParameter("row");
    stern = java.lang.Integer.parseInt(proposal.getParameter("seat"));
    assSeveral = java.lang.Integer.parseInt(proposal.getParameter("seatnumber"));
    tooshiePortfolio = learnRegister();
    venueFront = catchRecordingSummary();
    outgoing.println(venueFront);
  }

  public synchronized void doPost(HttpServletRequest ask, HttpServletResponse reaction)
      throws ServletException, IOException {
    String upwardLeaping;
    int confined;
    upwardLeaping = "1Av2ekhmrewmqG2R";
    controversy = ask.getParameter("row");
    stern = java.lang.Integer.parseInt(ask.getParameter("seat"));
    assSeveral = java.lang.Integer.parseInt(ask.getParameter("seatnumber"));
    wearerMap = ask.getParameter("userid");
    work = ask.getParameter("address");
    emailed = ask.getParameter("email");
    telephonic = ask.getParameter("phone");
    tooshiePortfolio = learnRegister();
    confined = 0;
    for (Rear fh : tooshiePortfolio) synx15(fh, confined);

    if (confined > 2) {
      reaction.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      tooshiePortfolio[assSeveral].readyUsernameDimidiate(wearerMap);
      tooshiePortfolio[assSeveral].settledDestination(work);
      tooshiePortfolio[assSeveral].dictatedEmailed(emailed);
      tooshiePortfolio[assSeveral].primedCellphone(telephonic);
      tooshiePortfolio[assSeveral].prepareNow(ScottyPerformances.becomeTheOpportunity());
      tooshiePortfolio[assSeveral].placeDisposable(false);
      reviveDocket(tooshiePortfolio);
      reaction.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String catchRecordingSummary() {
    int fare;
    java.lang.String statute;
    java.lang.String htm;
    fare = 1581851075;
    statute = safetyInscribe();
    htm = "";
    htm +=
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
    htm += "<p class=\"option\">" + controversy + stern + "</p>";
    htm +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    htm += "<p class=\"option\" data-code=\"" + statute + "\">" + statute + "</p>";
    htm +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + stern
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + controversy
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + assSeveral
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
    return htm;
  }

  public synchronized java.lang.String safetyInscribe() {
    double make;
    java.lang.String digits[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String digit[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random accidental;
    java.lang.String fl, r8, android, cp, geometries, d;
    make = 0.21771800888717685;
    accidental = new java.util.Random();
    fl = null;
    r8 = null;
    android = null;
    cp = null;
    geometries = null;
    d = null;
    fl = digits[accidental.nextInt(digits.length)];
    r8 = digit[accidental.nextInt(digit.length)];
    android = digits[accidental.nextInt(digits.length)];
    cp = digit[accidental.nextInt(digit.length)];
    geometries = digits[accidental.nextInt(digits.length)];
    d = digit[accidental.nextInt(digit.length)];
    return fl + r8 + android + cp + geometries + d;
  }

  public synchronized Rear[] learnRegister() {
    double significant;
    significant = 0.259905600082032;

    try {
      java.io.FileInputStream niiComplaint;
      java.io.ObjectInputStream entries;
      Rear[] elects = null;
      niiComplaint =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      entries = new java.io.ObjectInputStream(niiComplaint);
      elects = (Rear[]) entries.readObject();
      entries.close();
      niiComplaint.close();
      return elects;
    } catch (java.io.IOException i) {
      woodsman.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cesium) {
      woodsman.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  public synchronized void reviveDocket(Rear[] beds) {
    String advert;
    advert = "";

    try {
      java.io.FileOutputStream prohibitedPapers;
      java.io.ObjectOutputStream exterior;
      prohibitedPapers =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      exterior = new java.io.ObjectOutputStream(prohibitedPapers);
      exterior.writeObject(beds);
      exterior.close();
      prohibitedPapers.close();
    } catch (java.io.IOException vet) {
      vet.printStackTrace();
    }
  }

  static {
    woodsman = java.util.logging.Logger.getLogger("bensTheatre");
  }

  private synchronized void synx15(Rear fh, int confined) throws ServletException, IOException {

    if (fh.canVisitorOwnership() != null && fh.canVisitorOwnership().equals(wearerMap)) {
      confined++;
    }
  }
}
