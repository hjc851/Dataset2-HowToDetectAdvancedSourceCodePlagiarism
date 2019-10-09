import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class WarwickPlayhousesDetention extends javax.servlet.http.HttpServlet {

  public synchronized void doGet(HttpServletRequest asked, HttpServletResponse reception)
      throws ServletException, IOException {
    java.io.PrintWriter kayoed;
    java.lang.String advanceFootnote;
    kayoed = reception.getWriter();
    spat = asked.getParameter("row");
    keister = java.lang.Integer.parseInt(asked.getParameter("seat"));
    bottomCaseload = java.lang.Integer.parseInt(asked.getParameter("seatnumber"));
    canSuite = peruseDocket();
    advanceFootnote = startRegisterChapter();
    kayoed.println(advanceFootnote);
  }

  private int bottomCaseload = 0;
  private java.lang.String spat = null;
  private static java.util.logging.Logger lumberjack =
      java.util.logging.Logger.getLogger("bensTheatre");
  private java.lang.String telephony = null;
  private java.lang.String searcherIdentification = null;

  public synchronized Rear[] peruseDocket() {

    try {
      java.io.FileInputStream entriesLodge;
      java.io.ObjectInputStream adherents;
      Rear[] venues = null;
      entriesLodge =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      adherents = new java.io.ObjectInputStream(entriesLodge);
      venues = (Rear[]) adherents.readObject();
      adherents.close();
      entriesLodge.close();
      return venues;
    } catch (java.io.IOException i) {
      lumberjack.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException stan) {
      lumberjack.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public synchronized void relieveFolders(Rear[] slots) {

    try {
      java.io.FileOutputStream outgoingArchives;
      java.io.ObjectOutputStream unfashionable;
      outgoingArchives =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      unfashionable = new java.io.ObjectOutputStream(outgoingArchives);
      unfashionable.writeObject(slots);
      unfashionable.close();
      outgoingArchives.close();
    } catch (java.io.IOException abe) {
      abe.printStackTrace();
    }
  }

  private int keister = 0;

  public synchronized java.lang.String startRegisterChapter() {
    java.lang.String codification;
    java.lang.String drupal;
    codification = surveillanceLaws();
    drupal = "";
    drupal +=
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
    drupal += "<p class=\"option\">" + spat + keister + "</p>";
    drupal +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    drupal += "<p class=\"option\" data-code=\"" + codification + "\">" + codification + "</p>";
    drupal +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + keister
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + spat
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + bottomCaseload
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
    return drupal;
  }

  private Rear[] canSuite = null;
  private java.lang.String correspondence = null;
  private java.lang.String fix = null;

  public synchronized void doPost(HttpServletRequest bespeak, HttpServletResponse riposte)
      throws ServletException, IOException {
    int purchased;
    spat = bespeak.getParameter("row");
    keister = java.lang.Integer.parseInt(bespeak.getParameter("seat"));
    bottomCaseload = java.lang.Integer.parseInt(bespeak.getParameter("seatnumber"));
    searcherIdentification = bespeak.getParameter("userid");
    fix = bespeak.getParameter("address");
    correspondence = bespeak.getParameter("email");
    telephony = bespeak.getParameter("phone");
    canSuite = peruseDocket();
    purchased = 0;
    for (Rear fh : canSuite) {

      if (fh.makeUsernameDimidiate() != null
          && fh.makeUsernameDimidiate().equals(searcherIdentification)) {
        purchased++;
      }
    }

    if (purchased > 2) {
      riposte.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      canSuite[bottomCaseload].orderedPatientNerfling(searcherIdentification);
      canSuite[bottomCaseload].settledDestination(fix);
      canSuite[bottomCaseload].placedMessage(correspondence);
      canSuite[bottomCaseload].adjustPayphone(telephony);
      canSuite[bottomCaseload].fixedOpportunity(FrazierCinema.takeTopicalPeriod());
      canSuite[bottomCaseload].primedAcquirable(false);
      relieveFolders(canSuite);
      riposte.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String surveillanceLaws() {
    java.lang.String mailboxes[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String amount[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random unannounced;
    java.lang.String ff, a1, robot, bt, ri, ans;
    unannounced = new java.util.Random();
    ff = null;
    a1 = null;
    robot = null;
    bt = null;
    ri = null;
    ans = null;
    ff = mailboxes[unannounced.nextInt(mailboxes.length)];
    a1 = amount[unannounced.nextInt(amount.length)];
    robot = mailboxes[unannounced.nextInt(mailboxes.length)];
    bt = amount[unannounced.nextInt(amount.length)];
    ri = mailboxes[unannounced.nextInt(mailboxes.length)];
    ans = amount[unannounced.nextInt(amount.length)];
    return ff + a1 + robot + bt + ri + ans;
  }
}
