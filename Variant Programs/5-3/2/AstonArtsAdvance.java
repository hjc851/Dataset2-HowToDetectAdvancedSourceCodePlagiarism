import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class AstonArtsAdvance extends javax.servlet.http.HttpServlet {
  private static java.util.logging.Logger woodcutter = null;
  private java.lang.String url = null;
  private java.lang.String answer = null;
  private java.lang.String ring = null;
  private java.lang.String learnerUser = null;
  private int tooshie = 0;
  private int assSeveral = 0;
  private java.lang.String course = null;
  public static final int weakerTrammel = -698126068;
  private Invest[] buttMix = null;

  public synchronized void doGet(HttpServletRequest proposal, HttpServletResponse responded)
      throws ServletException, IOException {
    String outer;
    java.io.PrintWriter extinguished;
    java.lang.String reservingWeb;
    outer = "2x";
    extinguished = responded.getWriter();
    course = proposal.getParameter("row");
    tooshie = java.lang.Integer.parseInt(proposal.getParameter("seat"));
    assSeveral = java.lang.Integer.parseInt(proposal.getParameter("seatnumber"));
    buttMix = perusedArchives();
    reservingWeb = drawAdvanceFootnote();
    extinguished.println(reservingWeb);
  }

  public synchronized void doPost(HttpServletRequest asked, HttpServletResponse responsive)
      throws ServletException, IOException {
    String enumeration;
    int confined;
    enumeration = "82m3IAZWtx";
    course = asked.getParameter("row");
    tooshie = java.lang.Integer.parseInt(asked.getParameter("seat"));
    assSeveral = java.lang.Integer.parseInt(asked.getParameter("seatnumber"));
    learnerUser = asked.getParameter("userid");
    answer = asked.getParameter("address");
    url = asked.getParameter("email");
    ring = asked.getParameter("phone");
    buttMix = perusedArchives();
    confined = 0;
    for (Invest waffen : buttMix) {

      if (waffen.goExploiterQuod() != null && waffen.goExploiterQuod().equals(learnerUser)) {
        confined++;
      }
    }

    if (confined > 2) {
      responsive.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      buttMix[assSeveral].adjustClientIdentifying(learnerUser);
      buttMix[assSeveral].markAdress(answer);
      buttMix[assSeveral].determinedMail(url);
      buttMix[assSeveral].markMobile(ring);
      buttMix[assSeveral].markHours(AllanSalle.comeLatestClip());
      buttMix[assSeveral].laidObtainable(false);
      economiseInitiate(buttMix);
      responsive.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String drawAdvanceFootnote() {
    int cardinal;
    java.lang.String encode;
    java.lang.String ajax;
    cardinal = 1624731846;
    encode = guardingEncrypt();
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
    ajax += "<p class=\"option\">" + course + tooshie + "</p>";
    ajax +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    ajax += "<p class=\"option\" data-code=\"" + encode + "\">" + encode + "</p>";
    ajax +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + tooshie
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + course
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
    return ajax;
  }

  public synchronized java.lang.String guardingEncrypt() {
    double amphetamineConfine;
    java.lang.String mailings[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String proportion[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random randomization;
    java.lang.String impedance, tnf, frequencies, exponent, r6, cp;
    amphetamineConfine = 0.004013632188466398;
    randomization = new java.util.Random();
    impedance = null;
    tnf = null;
    frequencies = null;
    exponent = null;
    r6 = null;
    cp = null;
    impedance = mailings[randomization.nextInt(mailings.length)];
    tnf = proportion[randomization.nextInt(proportion.length)];
    frequencies = mailings[randomization.nextInt(mailings.length)];
    exponent = proportion[randomization.nextInt(proportion.length)];
    r6 = mailings[randomization.nextInt(mailings.length)];
    cp = proportion[randomization.nextInt(proportion.length)];
    return impedance + tnf + frequencies + exponent + r6 + cp;
  }

  public synchronized Invest[] perusedArchives() {
    double cost;
    cost = 0.8548516075507974;

    try {
      java.io.FileInputStream officeholdersSubmit;
      java.io.ObjectInputStream nii;
      Invest[] space = null;
      officeholdersSubmit =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      nii = new java.io.ObjectInputStream(officeholdersSubmit);
      space = (Invest[]) nii.readObject();
      nii.close();
      officeholdersSubmit.close();
      return space;
    } catch (java.io.IOException i) {
      woodcutter.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException stan) {
      woodcutter.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public synchronized void economiseInitiate(Invest[] spots) {
    double widening;
    widening = 0.4194957642222633;

    try {
      java.io.FileOutputStream extinctComplaint;
      java.io.ObjectOutputStream extinct;
      extinctComplaint =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      extinct = new java.io.ObjectOutputStream(extinctComplaint);
      extinct.writeObject(spots);
      extinct.close();
      extinctComplaint.close();
    } catch (java.io.IOException eden) {
      eden.printStackTrace();
    }
  }

  static {
    woodcutter = java.util.logging.Logger.getLogger("bensTheatre");
  }
}
