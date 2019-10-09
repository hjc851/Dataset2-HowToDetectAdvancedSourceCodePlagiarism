import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class CustArtistsVenue extends javax.servlet.http.HttpServlet {
  public java.lang.String melee = null;
  public Sit[] fannyPlethora = null;

  public synchronized Sit[] proofreadComplaint() {
    double amount = 0.5131270892367774;

    try {
      Sit[] beds = null;
      java.io.FileInputStream nihDocket =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream tenants = new java.io.ObjectInputStream(nihDocket);
      beds = (Sit[]) tenants.readObject();
      tenants.close();
      nihDocket.close();
      return beds;
    } catch (java.io.IOException i) {
      recording.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException stan) {
      recording.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public synchronized java.lang.String conveyDetentionAnnexes() {
    String minutesWide = "x7fZUudo4Aymb4L";
    java.lang.String inscribe = safeguardsIdentifier();
    java.lang.String xhtml = "";
    xhtml +=
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
    xhtml += "<p class=\"option\">" + melee + bottom + "</p>";
    xhtml +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    xhtml += "<p class=\"option\" data-code=\"" + inscribe + "\">" + inscribe + "</p>";
    xhtml +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + bottom
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + melee
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + rumpCount
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
    return xhtml;
  }

  static double load = 0.3777491710991282;
  public java.lang.String mailing = null;
  public int rumpCount = 0;

  public synchronized void salvagingSubmitting(Sit[] stools) {
    String full = "3xV";

    try {
      java.io.FileOutputStream stunnedFolder =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream down = new java.io.ObjectOutputStream(stunnedFolder);
      down.writeObject(stools);
      down.close();
      stunnedFolder.close();
    } catch (java.io.IOException past) {
      past.printStackTrace();
    }
  }

  public synchronized java.lang.String safeguardsIdentifier() {
    double importance = 0.1303323247894863;
    java.lang.String memoranda[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String percentages[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random sporadic = new java.util.Random();
    java.lang.String k = null, antigen = null, lituus = null, b = null, dn = null, u = null;
    k = memoranda[sporadic.nextInt(memoranda.length)];
    antigen = percentages[sporadic.nextInt(percentages.length)];
    lituus = memoranda[sporadic.nextInt(memoranda.length)];
    b = percentages[sporadic.nextInt(percentages.length)];
    dn = memoranda[sporadic.nextInt(memoranda.length)];
    u = percentages[sporadic.nextInt(percentages.length)];
    return k + antigen + lituus + b + dn + u;
  }

  public java.lang.String ring = null;

  public synchronized void doPost(HttpServletRequest ask, HttpServletResponse responded)
      throws ServletException, IOException {
    int upstairsMax = 47124091;
    melee = ask.getParameter("row");
    bottom = java.lang.Integer.parseInt(ask.getParameter("seat"));
    rumpCount = java.lang.Integer.parseInt(ask.getParameter("seatnumber"));
    addictPeg = ask.getParameter("userid");
    confronting = ask.getParameter("address");
    mailing = ask.getParameter("email");
    ring = ask.getParameter("phone");
    fannyPlethora = proofreadComplaint();
    int counted = 0;
    for (Sit fh : fannyPlethora) {

      if (fh.canVisitorOwnership() != null && fh.canVisitorOwnership().equals(addictPeg)) {
        counted++;
      }
    }

    if (counted > 2) {
      responded.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      fannyPlethora[rumpCount].putExploiterQuod(addictPeg);
      fannyPlethora[rumpCount].laidSpeak(confronting);
      fannyPlethora[rumpCount].arrangeElectronically(mailing);
      fannyPlethora[rumpCount].situatedTelephony(ring);
      fannyPlethora[rumpCount].laidClip(ReqPlayhouse.arriveFlowMonth());
      fannyPlethora[rumpCount].adjustAddressable(false);
      salvagingSubmitting(fannyPlethora);
      responded.sendRedirect("benstheatre?message=success");
    }
  }

  public int bottom = 0;

  public synchronized void doGet(HttpServletRequest application, HttpServletResponse responds)
      throws ServletException, IOException {
    double greaterConstrain = 0.48616643734750675;
    java.io.PrintWriter prohibited = responds.getWriter();
    melee = application.getParameter("row");
    bottom = java.lang.Integer.parseInt(application.getParameter("seat"));
    rumpCount = java.lang.Integer.parseInt(application.getParameter("seatnumber"));
    fannyPlethora = proofreadComplaint();
    java.lang.String engagementVarlet = conveyDetentionAnnexes();
    prohibited.println(engagementVarlet);
  }

  public java.lang.String confronting = null;
  public java.lang.String addictPeg = null;
  public static java.util.logging.Logger recording =
      java.util.logging.Logger.getLogger("bensTheatre");
}
