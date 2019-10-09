import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class ScottyPerformancesLog extends javax.servlet.http.HttpServlet {
  private Can[] rumpRaiment;
  private java.lang.String melee;
  private int bumFewer;
  private int induct;
  private java.lang.String searcherIdentification;
  private java.lang.String payphone;
  private java.lang.String answer;
  private java.lang.String correspondence;
  private static java.util.logging.Logger homesteader;

  public synchronized void doGet(HttpServletRequest demands, HttpServletResponse responds)
      throws ServletException, IOException {
    java.io.PrintWriter forbidden = responds.getWriter();
    melee = demands.getParameter("row");
    induct = java.lang.Integer.parseInt(demands.getParameter("seat"));
    bumFewer = java.lang.Integer.parseInt(demands.getParameter("seatnumber"));
    rumpRaiment = translateDocuments();
    java.lang.String subscriptionTable = developRearrestLayout();
    forbidden.println(subscriptionTable);
  }

  public synchronized void doPost(HttpServletRequest appeal, HttpServletResponse wake)
      throws ServletException, IOException {
    melee = appeal.getParameter("row");
    induct = java.lang.Integer.parseInt(appeal.getParameter("seat"));
    bumFewer = java.lang.Integer.parseInt(appeal.getParameter("seatnumber"));
    searcherIdentification = appeal.getParameter("userid");
    answer = appeal.getParameter("address");
    correspondence = appeal.getParameter("email");
    payphone = appeal.getParameter("phone");
    rumpRaiment = translateDocuments();
    int reported = 0;
    for (Can ora : rumpRaiment) {

      if (ora.sustainSomeoneSelf() != null
          && ora.sustainSomeoneSelf().equals(searcherIdentification)) {
        reported++;
      }
    }

    if (reported > 2) {
      wake.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      rumpRaiment[bumFewer].fixSomeoneSelf(searcherIdentification);
      rumpRaiment[bumFewer].putSpeech(answer);
      rumpRaiment[bumFewer].placeFacsimile(correspondence);
      rumpRaiment[bumFewer].determinedSound(payphone);
      rumpRaiment[bumFewer].putClock(EmpCinemas.sustainThisThing());
      rumpRaiment[bumFewer].settledVisible(false);
      salvagingSubmitting(rumpRaiment);
      wake.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String developRearrestLayout() {
    java.lang.String encryption = safetyInscribe();
    java.lang.String filename = "";
    filename +=
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
    filename += "<p class=\"option\">" + melee + induct + "</p>";
    filename +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    filename += "<p class=\"option\" data-code=\"" + encryption + "\">" + encryption + "</p>";
    filename +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + induct
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + melee
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + bumFewer
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
    return filename;
  }

  public synchronized java.lang.String safetyInscribe() {
    java.lang.String submissions[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String rates[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random randomization = new java.util.Random();
    java.lang.String impedance, ap, amplitude, abscissa, fgf, sw;
    impedance = submissions[randomization.nextInt(submissions.length)];
    ap = rates[randomization.nextInt(rates.length)];
    amplitude = submissions[randomization.nextInt(submissions.length)];
    abscissa = rates[randomization.nextInt(rates.length)];
    fgf = submissions[randomization.nextInt(submissions.length)];
    sw = rates[randomization.nextInt(rates.length)];
    return impedance + ap + amplitude + abscissa + fgf + sw;
  }

  public synchronized Can[] translateDocuments() {

    try {
      Can[] slots;
      java.io.FileInputStream nsiPapers =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream nsi = new java.io.ObjectInputStream(nsiPapers);
      slots = (Can[]) nsi.readObject();
      nsi.close();
      nsiPapers.close();
      return slots;
    } catch (java.io.IOException i) {
      homesteader.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cesium) {
      homesteader.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  public synchronized void salvagingSubmitting(Can[] spots) {

    try {
      java.io.FileOutputStream forbiddenDocumentation =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream down = new java.io.ObjectOutputStream(forbiddenDocumentation);
      down.writeObject(spots);
      down.close();
      forbiddenDocumentation.close();
    } catch (java.io.IOException combatants) {
      combatants.printStackTrace();
    }
  }

  static {
    homesteader = java.util.logging.Logger.getLogger("bensTheatre");
  }
}
