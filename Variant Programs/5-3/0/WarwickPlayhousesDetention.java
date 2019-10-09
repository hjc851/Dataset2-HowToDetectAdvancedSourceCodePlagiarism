import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class WarwickPlayhousesDetention extends javax.servlet.http.HttpServlet {
  public static java.util.logging.Logger woodcutter =
      java.util.logging.Logger.getLogger("bensTheatre");
  public java.lang.String courier;
  public java.lang.String destination;
  public java.lang.String switchboard;
  public java.lang.String exploiterQuod;
  public int behind;
  public int hindquartersNumerous;
  public java.lang.String pack;
  public static final double limitThickness = 0.3387696535357536;
  public Sit[] inductMultiple;

  public synchronized void doGet(HttpServletRequest quest, HttpServletResponse answer)
      throws ServletException, IOException {
    double narrowerRestrain;
    java.io.PrintWriter impermissible;
    java.lang.String reservationsWebsite;
    narrowerRestrain = 0.5338441969838903;
    impermissible = answer.getWriter();
    pack = quest.getParameter("row");
    behind = java.lang.Integer.parseInt(quest.getParameter("seat"));
    hindquartersNumerous = java.lang.Integer.parseInt(quest.getParameter("seatnumber"));
    inductMultiple = sayFolder();
    reservationsWebsite = bringTicketingWebpage();
    impermissible.println(reservationsWebsite);
  }

  public synchronized void doPost(HttpServletRequest wishes, HttpServletResponse rejoinder)
      throws ServletException, IOException {
    int bundle;
    int withheld;
    bundle = 934457803;
    pack = wishes.getParameter("row");
    behind = java.lang.Integer.parseInt(wishes.getParameter("seat"));
    hindquartersNumerous = java.lang.Integer.parseInt(wishes.getParameter("seatnumber"));
    exploiterQuod = wishes.getParameter("userid");
    destination = wishes.getParameter("address");
    courier = wishes.getParameter("email");
    switchboard = wishes.getParameter("phone");
    inductMultiple = sayFolder();
    withheld = 0;
    for (Sit ora : inductMultiple) {

      if (ora.produceWearerMap() != null && ora.produceWearerMap().equals(exploiterQuod)) {
        withheld++;
      }
    }

    if (withheld > 2) {
      rejoinder.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      inductMultiple[hindquartersNumerous].placePersonName(exploiterQuod);
      inductMultiple[hindquartersNumerous].adjustSolve(destination);
      inductMultiple[hindquartersNumerous].determineElectronic(courier);
      inductMultiple[hindquartersNumerous].rigidVoice(switchboard);
      inductMultiple[hindquartersNumerous].fixThing(YyyDramatics.sustainThisThing());
      inductMultiple[hindquartersNumerous].orderedGetable(false);
      deliverDocument(inductMultiple);
      rejoinder.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String bringTicketingWebpage() {
    String chthonianConfine;
    java.lang.String ciphers;
    java.lang.String aspx;
    chthonianConfine = "X9fv2tml";
    ciphers = safeguardsIdentifier();
    aspx = "";
    aspx +=
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
    aspx += "<p class=\"option\">" + pack + behind + "</p>";
    aspx +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    aspx += "<p class=\"option\" data-code=\"" + ciphers + "\">" + ciphers + "</p>";
    aspx +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + behind
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + pack
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + hindquartersNumerous
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
    return aspx;
  }

  public synchronized java.lang.String safeguardsIdentifier() {
    int deptSpan;
    java.lang.String correspondences[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String populations[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random stochastic;
    java.lang.String momenta, carboxylate, android, ac, nb, col;
    deptSpan = -982203381;
    stochastic = new java.util.Random();
    momenta = correspondences[stochastic.nextInt(correspondences.length)];
    carboxylate = populations[stochastic.nextInt(populations.length)];
    android = correspondences[stochastic.nextInt(correspondences.length)];
    ac = populations[stochastic.nextInt(populations.length)];
    nb = correspondences[stochastic.nextInt(correspondences.length)];
    col = populations[stochastic.nextInt(populations.length)];
    return momenta + carboxylate + android + ac + nb + col;
  }

  public synchronized Sit[] sayFolder() {
    double littleRoll;
    littleRoll = 0.2112353749298962;

    try {
      java.io.FileInputStream supportersDocumentation;
      java.io.ObjectInputStream establishment;
      Sit[] spots;
      supportersDocumentation =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      establishment = new java.io.ObjectInputStream(supportersDocumentation);
      spots = (Sit[]) establishment.readObject();
      establishment.close();
      supportersDocumentation.close();
      return spots;
    } catch (java.io.IOException i) {
      woodcutter.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cmu) {
      woodcutter.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized void deliverDocument(Sit[] posts) {
    double compelled;
    compelled = 0.7680212410425595;

    try {
      java.io.FileOutputStream offData;
      java.io.ObjectOutputStream stunned;
      offData =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      stunned = new java.io.ObjectOutputStream(offData);
      stunned.writeObject(posts);
      stunned.close();
      offData.close();
    } catch (java.io.IOException abbe) {
      abbe.printStackTrace();
    }
  }
}
