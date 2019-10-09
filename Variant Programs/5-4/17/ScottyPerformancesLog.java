import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class ScottyPerformancesLog extends javax.servlet.http.HttpServlet {
  public Can[] rumpRaiment;
  public java.lang.String melee;
  public int buttocksIssue;
  public int bum;
  public java.lang.String employeePictures;
  public java.lang.String telephonic;
  public java.lang.String mitigate;
  public java.lang.String dissemination;
  public static java.util.logging.Logger register =
      java.util.logging.Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest asking, HttpServletResponse responded)
      throws ServletException, IOException {
    java.io.PrintWriter outer = responded.getWriter();
    melee = asking.getParameter("row");
    bum = java.lang.Integer.parseInt(asking.getParameter("seat"));
    buttocksIssue = java.lang.Integer.parseInt(asking.getParameter("seatnumber"));
    rumpRaiment = wrotePapers();
    java.lang.String advanceFootnote = developRearrestLayout();
    outer.println(advanceFootnote);
  }

  public synchronized void doPost(HttpServletRequest complaint, HttpServletResponse responsive)
      throws ServletException, IOException {
    melee = complaint.getParameter("row");
    bum = java.lang.Integer.parseInt(complaint.getParameter("seat"));
    buttocksIssue = java.lang.Integer.parseInt(complaint.getParameter("seatnumber"));
    employeePictures = complaint.getParameter("userid");
    mitigate = complaint.getParameter("address");
    dissemination = complaint.getParameter("email");
    telephonic = complaint.getParameter("phone");
    rumpRaiment = wrotePapers();
    int taken = 0;
    for (Can ora : rumpRaiment) {

      if (ora.letSearcherIdentification() != null
          && ora.letSearcherIdentification().equals(employeePictures)) {
        taken++;
      }
    }

    if (taken > 2) {
      responsive.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      rumpRaiment[buttocksIssue].primedUsageFinger(employeePictures);
      rumpRaiment[buttocksIssue].fixFix(mitigate);
      rumpRaiment[buttocksIssue].placeFacsimile(dissemination);
      rumpRaiment[buttocksIssue].solidifyingCalling(telephonic);
      rumpRaiment[buttocksIssue].bentHour(GarethTheatrical.canExistingYears());
      rumpRaiment[buttocksIssue].adjustAddressable(false);
      resurrectPapers(rumpRaiment);
      responsive.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String developRearrestLayout() {
    java.lang.String identifier = peaceEncodes();
    java.lang.String htm = "";
    htm +=
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
    htm += "<p class=\"option\">" + melee + bum + "</p>";
    htm +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    htm += "<p class=\"option\" data-code=\"" + identifier + "\">" + identifier + "</p>";
    htm +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + bum
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + melee
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + buttocksIssue
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
    return htm;
  }

  public synchronized java.lang.String peaceEncodes() {
    java.lang.String mails[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String scores[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random weird = new java.util.Random();
    java.lang.String ordinate, carboxylate, multiplier, adc, r6, ses;
    ordinate = mails[weird.nextInt(mails.length)];
    carboxylate = scores[weird.nextInt(scores.length)];
    multiplier = mails[weird.nextInt(mails.length)];
    adc = scores[weird.nextInt(scores.length)];
    r6 = mails[weird.nextInt(mails.length)];
    ses = scores[weird.nextInt(scores.length)];
    return ordinate + carboxylate + multiplier + adc + r6 + ses;
  }

  public synchronized Can[] wrotePapers() {

    try {
      Can[] constituencies;
      java.io.FileInputStream whysCharge =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream nii = new java.io.ObjectInputStream(whysCharge);
      constituencies = (Can[]) nii.readObject();
      nii.close();
      whysCharge.close();
      return constituencies;
    } catch (java.io.IOException i) {
      register.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException shim) {
      register.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  public synchronized void resurrectPapers(Can[] elects) {

    try {
      java.io.FileOutputStream unconsciousCharge =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream forbidden = new java.io.ObjectOutputStream(unconsciousCharge);
      forbidden.writeObject(elects);
      forbidden.close();
      unconsciousCharge.close();
    } catch (java.io.IOException libris) {
      libris.printStackTrace();
    }
  }
}
