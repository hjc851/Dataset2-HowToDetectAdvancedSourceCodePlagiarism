import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class MalcolmTheatersLeasing extends javax.servlet.http.HttpServlet {
  private Can[] canSuite;
  private java.lang.String melee;
  private int buttHandful;
  private int behind;
  private java.lang.String consumerIdem;
  private java.lang.String handset;
  private java.lang.String confront;
  private java.lang.String couriers;
  private static java.util.logging.Logger consignor;

  public synchronized void doGet(HttpServletRequest suggestion, HttpServletResponse feedback)
      throws ServletException, IOException {
    java.io.PrintWriter unfashionable = feedback.getWriter();
    melee = suggestion.getParameter("row");
    behind = java.lang.Integer.parseInt(suggestion.getParameter("seat"));
    buttHandful = java.lang.Integer.parseInt(suggestion.getParameter("seatnumber"));
    canSuite = readableArchiving();
    java.lang.String reservingWeb = conveyDetentionAnnexes();
    unfashionable.println(reservingWeb);
  }

  public synchronized void doPost(HttpServletRequest appeal, HttpServletResponse responsive)
      throws ServletException, IOException {
    melee = appeal.getParameter("row");
    behind = java.lang.Integer.parseInt(appeal.getParameter("seat"));
    buttHandful = java.lang.Integer.parseInt(appeal.getParameter("seatnumber"));
    consumerIdem = appeal.getParameter("userid");
    confront = appeal.getParameter("address");
    couriers = appeal.getParameter("email");
    handset = appeal.getParameter("phone");
    canSuite = readableArchiving();
    int confined = 0;
    for (Can ora : canSuite) {

      if (ora.findLoginIdentifier() != null && ora.findLoginIdentifier().equals(consumerIdem)) {
        confined++;
      }
    }

    if (confined > 2) {
      responsive.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      canSuite[buttHandful].fitConsumerIdem(consumerIdem);
      canSuite[buttHandful].bentAnswer(confront);
      canSuite[buttHandful].situatedPostal(couriers);
      canSuite[buttHandful].prepareCalls(handset);
      canSuite[buttHandful].situatedMinutes(IainAmphitheatre.becomeTheOpportunity());
      canSuite[buttHandful].fixedViewable(false);
      safeguardArchiving(canSuite);
      responsive.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String conveyDetentionAnnexes() {
    java.lang.String designator = confidentialityEncoding();
    java.lang.String ajax = "";
    ajax +=
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
    ajax += "<p class=\"option\">" + melee + behind + "</p>";
    ajax +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    ajax += "<p class=\"option\" data-code=\"" + designator + "\">" + designator + "</p>";
    ajax +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + behind
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + melee
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + buttHandful
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
    return ajax;
  }

  public synchronized java.lang.String confidentialityEncoding() {
    java.lang.String correspondences[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String count[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random unselected = new java.util.Random();
    java.lang.String densities, activating, fc, contractual, nb, col;
    densities = correspondences[unselected.nextInt(correspondences.length)];
    activating = count[unselected.nextInt(count.length)];
    fc = correspondences[unselected.nextInt(correspondences.length)];
    contractual = count[unselected.nextInt(count.length)];
    nb = correspondences[unselected.nextInt(correspondences.length)];
    col = count[unselected.nextInt(count.length)];
    return densities + activating + fc + contractual + nb + col;
  }

  public synchronized Can[] readableArchiving() {

    try {
      Can[] elections;
      java.io.FileInputStream supportersDocumentation =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream cbs = new java.io.ObjectInputStream(supportersDocumentation);
      elections = (Can[]) cbs.readObject();
      cbs.close();
      supportersDocumentation.close();
      return elections;
    } catch (java.io.IOException i) {
      consignor.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException intrasentential) {
      consignor.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void safeguardArchiving(Can[] spaces) {

    try {
      java.io.FileOutputStream extinguishedDocument =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream down = new java.io.ObjectOutputStream(extinguishedDocument);
      down.writeObject(spaces);
      down.close();
      extinguishedDocument.close();
    } catch (java.io.IOException vet) {
      vet.printStackTrace();
    }
  }

  static {
    consignor = java.util.logging.Logger.getLogger("bensTheatre");
  }
}
