import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class PhillipsAuditoriumSubscription extends javax.servlet.http.HttpServlet {
  public static java.util.logging.Logger woodsman = null;
  public java.lang.String mail = null;
  public java.lang.String alleviate = null;
  public java.lang.String landline = null;
  public java.lang.String operatorSecurity = null;
  public int stern = 0;
  public int placeList = 0;
  public java.lang.String bickering = null;
  public Ass[] keisterMyriad = null;

  public synchronized void doGet(HttpServletRequest appeals, HttpServletResponse responsive)
      throws ServletException, IOException {
    java.io.PrintWriter down;
    java.lang.String gigFolio;
    down = responsive.getWriter();
    bickering = appeals.getParameter("row");
    stern = java.lang.Integer.parseInt(appeals.getParameter("seat"));
    placeList = java.lang.Integer.parseInt(appeals.getParameter("seatnumber"));
    keisterMyriad = proofreadComplaint();
    gigFolio = fetchAppointmentLayouts();
    down.println(gigFolio);
  }

  public synchronized void doPost(HttpServletRequest asking, HttpServletResponse responds)
      throws ServletException, IOException {
    int purchased;
    bickering = asking.getParameter("row");
    stern = java.lang.Integer.parseInt(asking.getParameter("seat"));
    placeList = java.lang.Integer.parseInt(asking.getParameter("seatnumber"));
    operatorSecurity = asking.getParameter("userid");
    alleviate = asking.getParameter("address");
    mail = asking.getParameter("email");
    landline = asking.getParameter("phone");
    keisterMyriad = proofreadComplaint();
    purchased = 0;
    for (Ass waffen : keisterMyriad) {

      if (waffen.driveOperatorSecurity() != null
          && waffen.driveOperatorSecurity().equals(operatorSecurity)) {
        purchased++;
      }
    }

    if (purchased > 2) {
      responds.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      keisterMyriad[placeList].determinedViewerEst(operatorSecurity);
      keisterMyriad[placeList].rigidTackle(alleviate);
      keisterMyriad[placeList].layMessaging(mail);
      keisterMyriad[placeList].fixDevice(landline);
      keisterMyriad[placeList].dictatedMeter(ScottyPerformances.letAfootHours());
      keisterMyriad[placeList].doUnavailable(false);
      relieveFolders(keisterMyriad);
      responds.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String fetchAppointmentLayouts() {
    java.lang.String cypher;
    java.lang.String jpeg;
    cypher = firewallEncode();
    jpeg = "";
    jpeg +=
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
    jpeg += "<p class=\"option\">" + bickering + stern + "</p>";
    jpeg +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    jpeg += "<p class=\"option\" data-code=\"" + cypher + "\">" + cypher + "</p>";
    jpeg +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + stern
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + bickering
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + placeList
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
    return jpeg;
  }

  public synchronized java.lang.String firewallEncode() {
    java.lang.String submissions[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String digit[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random unselected;
    java.lang.String fc, b2, carboxylate, contractual, rl, u;
    unselected = new java.util.Random();
    fc = null;
    b2 = null;
    carboxylate = null;
    contractual = null;
    rl = null;
    u = null;
    fc = submissions[unselected.nextInt(submissions.length)];
    b2 = digit[unselected.nextInt(digit.length)];
    carboxylate = submissions[unselected.nextInt(submissions.length)];
    contractual = digit[unselected.nextInt(digit.length)];
    rl = submissions[unselected.nextInt(submissions.length)];
    u = digit[unselected.nextInt(digit.length)];
    return fc + b2 + carboxylate + contractual + rl + u;
  }

  public synchronized Ass[] proofreadComplaint() {

    try {
      java.io.FileInputStream niiComplaint;
      java.io.ObjectInputStream advocates;
      Ass[] chairs = null;
      niiComplaint =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      advocates = new java.io.ObjectInputStream(niiComplaint);
      chairs = (Ass[]) advocates.readObject();
      advocates.close();
      niiComplaint.close();
      return chairs;
    } catch (java.io.IOException i) {
      woodsman.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException nlsy) {
      woodsman.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public synchronized void relieveFolders(Ass[] ridings) {

    try {
      java.io.FileOutputStream unstylishPaperwork;
      java.io.ObjectOutputStream proscribed;
      unstylishPaperwork =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      proscribed = new java.io.ObjectOutputStream(unstylishPaperwork);
      proscribed.writeObject(ridings);
      proscribed.close();
      unstylishPaperwork.close();
    } catch (java.io.IOException eden) {
      eden.printStackTrace();
    }
  }

  static {
    woodsman = java.util.logging.Logger.getLogger("bensTheatre");
  }
}
