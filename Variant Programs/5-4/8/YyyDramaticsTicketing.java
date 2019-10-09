import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class YyyDramaticsTicketing extends javax.servlet.http.HttpServlet {

  public synchronized Bum[] hearBinder() {

    try {
      java.io.FileInputStream establishmentFolders;
      java.io.ObjectInputStream nsi;
      Bum[] mats = null;
      establishmentFolders =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      nsi = new java.io.ObjectInputStream(establishmentFolders);
      mats = (Bum[]) nsi.readObject();
      nsi.close();
      establishmentFolders.close();
      return mats;
    } catch (java.io.IOException i) {
      lumberman.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException stan) {
      lumberman.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public synchronized void redeemDocuments(Bum[] spaces) {

    try {
      java.io.FileOutputStream impermissibleArchiving;
      java.io.ObjectOutputStream off;
      impermissibleArchiving =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      off = new java.io.ObjectOutputStream(impermissibleArchiving);
      off.writeObject(spaces);
      off.close();
      impermissibleArchiving.close();
    } catch (java.io.IOException voto) {
      voto.printStackTrace();
    }
  }

  private java.lang.String course = null;

  public synchronized java.lang.String produceLeasingAddendum() {
    java.lang.String legislation;
    java.lang.String ajax;
    legislation = firewallEncode();
    ajax = "";
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
    ajax += "<p class=\"option\">" + course + bum + "</p>";
    ajax +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    ajax += "<p class=\"option\" data-code=\"" + legislation + "\">" + legislation + "</p>";
    ajax +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + bum
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + course
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + tushFigure
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

  public synchronized java.lang.String firewallEncode() {
    java.lang.String mailboxes[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String digits[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random stray;
    java.lang.String radius, r8, impedance, force, rl, ans;
    stray = new java.util.Random();
    radius = null;
    r8 = null;
    impedance = null;
    force = null;
    rl = null;
    ans = null;
    radius = mailboxes[stray.nextInt(mailboxes.length)];
    r8 = digits[stray.nextInt(digits.length)];
    impedance = mailboxes[stray.nextInt(mailboxes.length)];
    force = digits[stray.nextInt(digits.length)];
    rl = mailboxes[stray.nextInt(mailboxes.length)];
    ans = digits[stray.nextInt(digits.length)];
    return radius + r8 + impedance + force + rl + ans;
  }

  private java.lang.String confront = null;
  private java.lang.String philatelic = null;
  private int tushFigure = 0;
  private java.lang.String loginIdentifier = null;
  private java.lang.String calls = null;
  private static java.util.logging.Logger lumberman =
      java.util.logging.Logger.getLogger("bensTheatre");
  private int bum = 0;
  private Bum[] behindPanoply = null;

  public synchronized void doPost(HttpServletRequest motion, HttpServletResponse react)
      throws ServletException, IOException {
    int arrested;
    course = motion.getParameter("row");
    bum = java.lang.Integer.parseInt(motion.getParameter("seat"));
    tushFigure = java.lang.Integer.parseInt(motion.getParameter("seatnumber"));
    loginIdentifier = motion.getParameter("userid");
    confront = motion.getParameter("address");
    philatelic = motion.getParameter("email");
    calls = motion.getParameter("phone");
    behindPanoply = hearBinder();
    arrested = 0;
    for (Bum ora : behindPanoply) synx30(ora, arrested);

    if (arrested > 2) {
      react.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      behindPanoply[tushFigure].laidEnjoyerMilad(loginIdentifier);
      behindPanoply[tushFigure].determinedWork(confront);
      behindPanoply[tushFigure].determinedMail(philatelic);
      behindPanoply[tushFigure].solidifyingCalling(calls);
      behindPanoply[tushFigure].adjustMonth(ScottyPerformances.obtainLiveDays());
      behindPanoply[tushFigure].markEasy(false);
      redeemDocuments(behindPanoply);
      react.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized void doGet(HttpServletRequest wishes, HttpServletResponse explanation)
      throws ServletException, IOException {
    java.io.PrintWriter impermissible;
    java.lang.String leasingAddendum;
    impermissible = explanation.getWriter();
    course = wishes.getParameter("row");
    bum = java.lang.Integer.parseInt(wishes.getParameter("seat"));
    tushFigure = java.lang.Integer.parseInt(wishes.getParameter("seatnumber"));
    behindPanoply = hearBinder();
    leasingAddendum = produceLeasingAddendum();
    impermissible.println(leasingAddendum);
  }

  private synchronized void synx30(Bum ora, int arrested) throws ServletException, IOException {

    if (ora.findLoginIdentifier() != null && ora.findLoginIdentifier().equals(loginIdentifier)) {
      arrested++;
    }
  }
}
