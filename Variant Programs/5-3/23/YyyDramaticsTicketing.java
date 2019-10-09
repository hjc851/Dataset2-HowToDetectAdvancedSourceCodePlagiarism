import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class YyyDramaticsTicketing extends javax.servlet.http.HttpServlet {
  public Posterior[] buttocksMultitude = null;
  public java.lang.String bickering = null;
  public int investFrequency = 0;
  public int invest = 0;
  public java.lang.String usernameDimidiate = null;
  public java.lang.String laptop = null;
  public java.lang.String direct = null;
  public java.lang.String mailing = null;
  public static java.util.logging.Logger surveyor = null;

  public synchronized void doGet(HttpServletRequest application, HttpServletResponse reactions)
      throws ServletException, IOException {
    java.io.PrintWriter forbidden = reactions.getWriter();
    bickering = application.getParameter("row");
    invest = java.lang.Integer.parseInt(application.getParameter("seat"));
    investFrequency = java.lang.Integer.parseInt(application.getParameter("seatnumber"));
    buttocksMultitude = interpretLodge();
    java.lang.String rentPaper = developRearrestLayout();
    forbidden.println(rentPaper);
  }

  public synchronized void doPost(HttpServletRequest asked, HttpServletResponse feedback)
      throws ServletException, IOException {
    bickering = asked.getParameter("row");
    invest = java.lang.Integer.parseInt(asked.getParameter("seat"));
    investFrequency = java.lang.Integer.parseInt(asked.getParameter("seatnumber"));
    usernameDimidiate = asked.getParameter("userid");
    direct = asked.getParameter("address");
    mailing = asked.getParameter("email");
    laptop = asked.getParameter("phone");
    buttocksMultitude = interpretLodge();
    int listed = 0;
    for (Posterior waffen : buttocksMultitude) {

      if (waffen.obtainViewerEst() != null && waffen.obtainViewerEst().equals(usernameDimidiate)) {
        listed++;
      }
    }

    if (listed > 2) {
      feedback.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      buttocksMultitude[investFrequency].settledSubscriberHandle(usernameDimidiate);
      buttocksMultitude[investFrequency].markAdress(direct);
      buttocksMultitude[investFrequency].dictatedEmailed(mailing);
      buttocksMultitude[investFrequency].orderedCaller(laptop);
      buttocksMultitude[investFrequency].fixThing(JonnyDance.receiveContemporaryMoment());
      buttocksMultitude[investFrequency].arrangeUncommitted(false);
      resurrectPapers(buttocksMultitude);
      feedback.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String developRearrestLayout() {
    java.lang.String encodes = protectionCipher();
    java.lang.String browser = "";
    browser +=
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
    browser += "<p class=\"option\">" + bickering + invest + "</p>";
    browser +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    browser += "<p class=\"option\" data-code=\"" + encodes + "\">" + encodes + "</p>";
    browser +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + invest
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + bickering
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + investFrequency
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
    return browser;
  }

  public synchronized java.lang.String protectionCipher() {
    java.lang.String memorandums[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String totals[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random selective = new java.util.Random();
    java.lang.String frequency = null, c2 = null, betas = null, d2 = null, ri = null, e = null;
    frequency = memorandums[selective.nextInt(memorandums.length)];
    c2 = totals[selective.nextInt(totals.length)];
    betas = memorandums[selective.nextInt(memorandums.length)];
    d2 = totals[selective.nextInt(totals.length)];
    ri = memorandums[selective.nextInt(memorandums.length)];
    e = totals[selective.nextInt(totals.length)];
    return frequency + c2 + betas + d2 + ri + e;
  }

  public synchronized Posterior[] interpretLodge() {

    try {
      Posterior[] elects = null;
      java.io.FileInputStream detailsSubmitted =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream adherents = new java.io.ObjectInputStream(detailsSubmitted);
      elects = (Posterior[]) adherents.readObject();
      adherents.close();
      detailsSubmitted.close();
      return elects;
    } catch (java.io.IOException i) {
      surveyor.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cmu) {
      surveyor.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized void resurrectPapers(Posterior[] slots) {

    try {
      java.io.FileOutputStream exteriorReadme =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream away = new java.io.ObjectOutputStream(exteriorReadme);
      away.writeObject(slots);
      away.close();
      exteriorReadme.close();
    } catch (java.io.IOException adult) {
      adult.printStackTrace();
    }
  }

  static {
    surveyor = java.util.logging.Logger.getLogger("bensTheatre");
  }
}
