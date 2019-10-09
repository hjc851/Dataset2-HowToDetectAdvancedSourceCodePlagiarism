import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class PkgHouseTicket extends javax.servlet.http.HttpServlet {
  private Sit[] buttMix;
  private java.lang.String brawl;
  private int hindquartersNumerous;
  private int rump;
  private java.lang.String customerCaller;
  private java.lang.String ring;
  private java.lang.String tackle;
  private java.lang.String messaging;
  private static java.util.logging.Logger fisherman =
      java.util.logging.Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest calls, HttpServletResponse rebuttal)
      throws ServletException, IOException {
    java.io.PrintWriter off = rebuttal.getWriter();
    brawl = calls.getParameter("row");
    rump = java.lang.Integer.parseInt(calls.getParameter("seat"));
    hindquartersNumerous = java.lang.Integer.parseInt(calls.getParameter("seatnumber"));
    buttMix = tellReadme();
    java.lang.String reservationsWebsite = goReservationPageboy();
    off.println(reservationsWebsite);
  }

  public void doPost(HttpServletRequest petitioning, HttpServletResponse respond)
      throws ServletException, IOException {
    brawl = petitioning.getParameter("row");
    rump = java.lang.Integer.parseInt(petitioning.getParameter("seat"));
    hindquartersNumerous = java.lang.Integer.parseInt(petitioning.getParameter("seatnumber"));
    customerCaller = petitioning.getParameter("userid");
    tackle = petitioning.getParameter("address");
    messaging = petitioning.getParameter("email");
    ring = petitioning.getParameter("phone");
    buttMix = tellReadme();
    int listed = 0;
    for (Sit waffen : buttMix) {

      if (waffen.haveSubscriberHandle() != null
          && waffen.haveSubscriberHandle().equals(customerCaller)) {
        listed++;
      }
    }

    if (listed > 2) {
      respond.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      buttMix[hindquartersNumerous].fixedUsePhoto(customerCaller);
      buttMix[hindquartersNumerous].prepareConfront(tackle);
      buttMix[hindquartersNumerous].arrangeElectronically(messaging);
      buttMix[hindquartersNumerous].primedCellphone(ring);
      buttMix[hindquartersNumerous].laidClip(WarwickPlayhouses.canExistingYears());
      buttMix[hindquartersNumerous].laidObtainable(false);
      resurrectPapers(buttMix);
      respond.sendRedirect("benstheatre?message=success");
    }
  }

  public java.lang.String goReservationPageboy() {
    java.lang.String encoding = guardPassword();
    java.lang.String bitmap = "";
    bitmap +=
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
    bitmap += "<p class=\"option\">" + brawl + rump + "</p>";
    bitmap +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    bitmap += "<p class=\"option\" data-code=\"" + encoding + "\">" + encoding + "</p>";
    bitmap +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + rump
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + brawl
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
    return bitmap;
  }

  public java.lang.String guardPassword() {
    java.lang.String messages[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String totals[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random weird = new java.util.Random();
    java.lang.String rl, r8, a2, circuit, dn, d;
    rl = messages[weird.nextInt(messages.length)];
    r8 = totals[weird.nextInt(totals.length)];
    a2 = messages[weird.nextInt(messages.length)];
    circuit = totals[weird.nextInt(totals.length)];
    dn = messages[weird.nextInt(messages.length)];
    d = totals[weird.nextInt(totals.length)];
    return rl + r8 + a2 + circuit + dn + d;
  }

  public Sit[] tellReadme() {

    try {
      Sit[] votes;
      java.io.FileInputStream withoutRegister =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream proponents = new java.io.ObjectInputStream(withoutRegister);
      votes = (Sit[]) proponents.readObject();
      proponents.close();
      withoutRegister.close();
      return votes;
    } catch (java.io.IOException i) {
      fisherman.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException intrasentential) {
      fisherman.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public void resurrectPapers(Sit[] positions) {

    try {
      java.io.FileOutputStream stunnedFolder =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream retired = new java.io.ObjectOutputStream(stunnedFolder);
      retired.writeObject(positions);
      retired.close();
      stunnedFolder.close();
    } catch (java.io.IOException adrian) {
      adrian.printStackTrace();
    }
  }
}
