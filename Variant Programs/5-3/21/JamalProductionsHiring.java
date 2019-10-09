import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class JamalProductionsHiring extends javax.servlet.http.HttpServlet {
  private java.lang.String identify;

  public synchronized void doPost(HttpServletRequest asking, HttpServletResponse responding)
      throws ServletException, IOException {
    double bottomCompelled;
    int logged;
    bottomCompelled = 0.6766488779713669;
    tiff = asking.getParameter("row");
    butt = java.lang.Integer.parseInt(asking.getParameter("seat"));
    keisterRoutine = java.lang.Integer.parseInt(asking.getParameter("seatnumber"));
    searcherIdentification = asking.getParameter("userid");
    identify = asking.getParameter("address");
    postage = asking.getParameter("email");
    voice = asking.getParameter("phone");
    rearRange = understandCharge();
    logged = 0;
    for (Tooshie fh : rearRange) {

      if (fh.becomeUsePhoto() != null && fh.becomeUsePhoto().equals(searcherIdentification)) {
        logged++;
      }
    }

    if (logged > 2) {
      responding.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      rearRange[keisterRoutine].determinedViewerEst(searcherIdentification);
      rearRange[keisterRoutine].layDeal(identify);
      rearRange[keisterRoutine].determinedMail(postage);
      rearRange[keisterRoutine].fitHandset(voice);
      rearRange[keisterRoutine].situatedMinutes(PhillipsAuditorium.fetchPresentBeginning());
      rearRange[keisterRoutine].dictatedPurchasable(false);
      avoidDatabase(rearRange);
      responding.sendRedirect("benstheatre?message=success");
    }
  }

  private int keisterRoutine;

  public synchronized java.lang.String findTicketHomepage() {
    int maximumBreadth;
    java.lang.String rules;
    java.lang.String keyword;
    maximumBreadth = -658952771;
    rules = integrityCiphers();
    keyword = "";
    keyword +=
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
    keyword += "<p class=\"option\">" + tiff + butt + "</p>";
    keyword +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    keyword += "<p class=\"option\" data-code=\"" + rules + "\">" + rules + "</p>";
    keyword +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + butt
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + tiff
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
    return keyword;
  }

  private static java.util.logging.Logger surveyor;
  static final String speedRestrain = "9gyHsguiHQKw";
  private java.lang.String tiff;
  private java.lang.String searcherIdentification;
  private java.lang.String postage;

  static {
    surveyor = java.util.logging.Logger.getLogger("bensTheatre");
  }

  public synchronized java.lang.String integrityCiphers() {
    int northRestriction;
    java.lang.String notices[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String levels[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random inadvertent;
    java.lang.String p, antigen, fl, fgf, logarithm, c3;
    northRestriction = -1012879933;
    inadvertent = new java.util.Random();
    p = notices[inadvertent.nextInt(notices.length)];
    antigen = levels[inadvertent.nextInt(levels.length)];
    fl = notices[inadvertent.nextInt(notices.length)];
    fgf = levels[inadvertent.nextInt(levels.length)];
    logarithm = notices[inadvertent.nextInt(notices.length)];
    c3 = levels[inadvertent.nextInt(levels.length)];
    return p + antigen + fl + fgf + logarithm + c3;
  }

  private int butt;

  public synchronized Tooshie[] understandCharge() {
    double tell;
    tell = 0.389021721453758;

    try {
      java.io.FileInputStream detailsSubmitted;
      java.io.ObjectInputStream elected;
      Tooshie[] spots;
      detailsSubmitted =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      elected = new java.io.ObjectInputStream(detailsSubmitted);
      spots = (Tooshie[]) elected.readObject();
      elected.close();
      detailsSubmitted.close();
      return spots;
    } catch (java.io.IOException i) {
      surveyor.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException caesium) {
      surveyor.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public synchronized void avoidDatabase(Tooshie[] venues) {
    double name;
    name = 0.8407820027625506;

    try {
      java.io.FileOutputStream impermissibleArchiving;
      java.io.ObjectOutputStream quenched;
      impermissibleArchiving =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      quenched = new java.io.ObjectOutputStream(impermissibleArchiving);
      quenched.writeObject(venues);
      quenched.close();
      impermissibleArchiving.close();
    } catch (java.io.IOException abbe) {
      abbe.printStackTrace();
    }
  }

  private Tooshie[] rearRange;
  private java.lang.String voice;

  public synchronized void doGet(HttpServletRequest plea, HttpServletResponse retort)
      throws ServletException, IOException {
    String juniorRestriction;
    java.io.PrintWriter dead;
    java.lang.String engagementVarlet;
    juniorRestriction = "OkpYaui9";
    dead = retort.getWriter();
    tiff = plea.getParameter("row");
    butt = java.lang.Integer.parseInt(plea.getParameter("seat"));
    keisterRoutine = java.lang.Integer.parseInt(plea.getParameter("seatnumber"));
    rearRange = understandCharge();
    engagementVarlet = findTicketHomepage();
    dead.println(engagementVarlet);
  }
}
