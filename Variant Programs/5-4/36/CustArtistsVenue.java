import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class CustArtistsVenue extends javax.servlet.http.HttpServlet {
  private static java.util.logging.Logger harvester = null;
  private java.lang.String send = null;
  private java.lang.String tackle = null;
  private java.lang.String telephones = null;
  private java.lang.String someoneSelf = null;
  private int prat = 0;
  private int canQuantity = 0;
  private java.lang.String round = null;
  static String universal = "jCxzLoBCV";
  private Rear[] assCollection = null;

  public synchronized void doGet(HttpServletRequest wishes, HttpServletResponse answers)
      throws ServletException, IOException {
    String pivotal;
    java.io.PrintWriter taboo;
    java.lang.String reservingWeb;
    pivotal = "wIB0Uv16W";
    taboo = answers.getWriter();
    round = wishes.getParameter("row");
    prat = java.lang.Integer.parseInt(wishes.getParameter("seat"));
    canQuantity = java.lang.Integer.parseInt(wishes.getParameter("seatnumber"));
    assCollection = reciteSubmitting();
    reservingWeb = letRegistrationTab();
    taboo.println(reservingWeb);
  }

  public synchronized void doPost(HttpServletRequest calls, HttpServletResponse responding)
      throws ServletException, IOException {
    int levelRestricting;
    int planned;
    levelRestricting = -1144174418;
    round = calls.getParameter("row");
    prat = java.lang.Integer.parseInt(calls.getParameter("seat"));
    canQuantity = java.lang.Integer.parseInt(calls.getParameter("seatnumber"));
    someoneSelf = calls.getParameter("userid");
    tackle = calls.getParameter("address");
    send = calls.getParameter("email");
    telephones = calls.getParameter("phone");
    assCollection = reciteSubmitting();
    planned = 0;
    for (Rear ora : assCollection) {

      if (ora.generateConsumerIdem() != null && ora.generateConsumerIdem().equals(someoneSelf)) {
        planned++;
      }
    }

    if (planned > 2) {
      responding.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      assCollection[canQuantity].situatedDeveloperPicture(someoneSelf);
      assCollection[canQuantity].determineConfronting(tackle);
      assCollection[canQuantity].readyMails(send);
      assCollection[canQuantity].orderedCaller(telephones);
      assCollection[canQuantity].orderedChance(CustArtists.makeIncumbentDay());
      assCollection[canQuantity].fixedViewable(false);
      helpData(assCollection);
      responding.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String letRegistrationTab() {
    int elevationDemarcation;
    java.lang.String statute;
    java.lang.String plugin;
    elevationDemarcation = -1160171945;
    statute = certificateCypher();
    plugin = "";
    plugin +=
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
    plugin += "<p class=\"option\">" + round + prat + "</p>";
    plugin +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    plugin += "<p class=\"option\" data-code=\"" + statute + "\">" + statute + "</p>";
    plugin +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + prat
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + round
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + canQuantity
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
    return plugin;
  }

  public synchronized java.lang.String certificateCypher() {
    double minimumAcross;
    java.lang.String circulars[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String quantity[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random unannounced;
    java.lang.String tc, a, interval, correspond, c1, mx;
    minimumAcross = 0.6972282235629227;
    unannounced = new java.util.Random();
    tc = null;
    a = null;
    interval = null;
    correspond = null;
    c1 = null;
    mx = null;
    tc = circulars[unannounced.nextInt(circulars.length)];
    a = quantity[unannounced.nextInt(quantity.length)];
    interval = circulars[unannounced.nextInt(circulars.length)];
    correspond = quantity[unannounced.nextInt(quantity.length)];
    c1 = circulars[unannounced.nextInt(circulars.length)];
    mx = quantity[unannounced.nextInt(quantity.length)];
    return tc + a + interval + correspond + c1 + mx;
  }

  public synchronized Rear[] reciteSubmitting() {
    int best;
    best = -535197749;

    try {
      java.io.FileInputStream nsiPapers;
      java.io.ObjectInputStream nii;
      Rear[] posts = null;
      nsiPapers =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      nii = new java.io.ObjectInputStream(nsiPapers);
      posts = (Rear[]) nii.readObject();
      nii.close();
      nsiPapers.close();
      return posts;
    } catch (java.io.IOException i) {
      harvester.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cmu) {
      harvester.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized void helpData(Rear[] pillion) {
    String across;
    across = "czZalKU3o";

    try {
      java.io.FileOutputStream backBinder;
      java.io.ObjectOutputStream exterior;
      backBinder =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      exterior = new java.io.ObjectOutputStream(backBinder);
      exterior.writeObject(pillion);
      exterior.close();
      backBinder.close();
    } catch (java.io.IOException late) {
      late.printStackTrace();
    }
  }

  static {
    harvester = java.util.logging.Logger.getLogger("bensTheatre");
  }
}
