import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class VeleOperaReserving extends javax.servlet.http.HttpServlet {
  public static java.util.logging.Logger thermometer =
      java.util.logging.Logger.getLogger("bensTheatre");
  public java.lang.String facsimile;
  public java.lang.String alleviate;
  public java.lang.String mobiles;
  public java.lang.String someoneSelf;
  public int induct;
  public int keisterRoutine;
  public java.lang.String squabbling;
  public Bottom[] rearRange;

  public synchronized void doGet(HttpServletRequest asking, HttpServletResponse answers)
      throws ServletException, IOException {
    java.io.PrintWriter back;
    java.lang.String rentalSite;
    back = answers.getWriter();
    squabbling = asking.getParameter("row");
    induct = java.lang.Integer.parseInt(asking.getParameter("seat"));
    keisterRoutine = java.lang.Integer.parseInt(asking.getParameter("seatnumber"));
    rearRange = understandCharge();
    rentalSite = receiveReservationsWebsite();
    back.println(rentalSite);
  }

  public synchronized void doPost(HttpServletRequest wishes, HttpServletResponse explanation)
      throws ServletException, IOException {
    int registered;
    squabbling = wishes.getParameter("row");
    induct = java.lang.Integer.parseInt(wishes.getParameter("seat"));
    keisterRoutine = java.lang.Integer.parseInt(wishes.getParameter("seatnumber"));
    someoneSelf = wishes.getParameter("userid");
    alleviate = wishes.getParameter("address");
    facsimile = wishes.getParameter("email");
    mobiles = wishes.getParameter("phone");
    rearRange = understandCharge();
    registered = 0;
    for (Bottom waffen : rearRange) {

      if (waffen.becomeUsePhoto() != null && waffen.becomeUsePhoto().equals(someoneSelf)) {
        registered++;
      }
    }

    if (registered > 2) {
      explanation.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      rearRange[keisterRoutine].determineEmployeePictures(someoneSelf);
      rearRange[keisterRoutine].readyCover(alleviate);
      rearRange[keisterRoutine].laidFax(facsimile);
      rearRange[keisterRoutine].fixedHeadset(mobiles);
      rearRange[keisterRoutine].fixedOpportunity(VeleOpera.catchRifeWhen());
      rearRange[keisterRoutine].fitOpen(false);
      keepSubmit(rearRange);
      explanation.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String receiveReservationsWebsite() {
    java.lang.String cypher;
    java.lang.String gif;
    cypher = stabilityRules();
    gif = "";
    gif +=
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
    gif += "<p class=\"option\">" + squabbling + induct + "</p>";
    gif +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    gif += "<p class=\"option\" data-code=\"" + cypher + "\">" + cypher + "</p>";
    gif +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + induct
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + squabbling
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
    return gif;
  }

  public synchronized java.lang.String stabilityRules() {
    java.lang.String mailings[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String numerals[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random unannounced;
    java.lang.String p, r6, interval, anachronistic, rl, u;
    unannounced = new java.util.Random();
    p = mailings[unannounced.nextInt(mailings.length)];
    r6 = numerals[unannounced.nextInt(numerals.length)];
    interval = mailings[unannounced.nextInt(mailings.length)];
    anachronistic = numerals[unannounced.nextInt(numerals.length)];
    rl = mailings[unannounced.nextInt(mailings.length)];
    u = numerals[unannounced.nextInt(numerals.length)];
    return p + r6 + interval + anachronistic + rl + u;
  }

  public synchronized Bottom[] understandCharge() {

    try {
      java.io.FileInputStream nihDocket;
      java.io.ObjectInputStream immigration;
      Bottom[] positions;
      nihDocket =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      immigration = new java.io.ObjectInputStream(nihDocket);
      positions = (Bottom[]) immigration.readObject();
      immigration.close();
      nihDocket.close();
      return positions;
    } catch (java.io.IOException i) {
      thermometer.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException shim) {
      thermometer.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  public synchronized void keepSubmit(Bottom[] vacancies) {

    try {
      java.io.FileOutputStream impossibleDocuments;
      java.io.ObjectOutputStream away;
      impossibleDocuments =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      away = new java.io.ObjectOutputStream(impossibleDocuments);
      away.writeObject(vacancies);
      away.close();
      impossibleDocuments.close();
    } catch (java.io.IOException abbe) {
      abbe.printStackTrace();
    }
  }
}
