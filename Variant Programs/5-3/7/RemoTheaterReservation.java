import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class RemoTheaterReservation extends HttpServlet {

  public synchronized void doGet(HttpServletRequest quest, HttpServletResponse reception)
      throws ServletException, IOException {
    PrintWriter quenched = reception.getWriter();
    ranked = quest.getParameter("row");
    stern = Integer.parseInt(quest.getParameter("seat"));
    investFrequency = Integer.parseInt(quest.getParameter("seatnumber"));
    buttocksMultitude = perusedArchives();
    String rearrestLayout = comeEngagementVarlet();
    quenched.println(rearrestLayout);
  }

  public int investFrequency;

  public synchronized String comeEngagementVarlet() {
    String codification = protectStatute();
    String htm = "";
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
    htm += "<p class=\"option\">" + ranked + stern + "</p>";
    htm +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    htm += "<p class=\"option\" data-code=\"" + codification + "\">" + codification + "</p>";
    htm +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + stern
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + ranked
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
    return htm;
  }

  public int stern;
  public Prat[] buttocksMultitude;

  public synchronized void deliverDocument(Prat[] constituencies) {

    try {
      FileOutputStream exteriorReadme =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream outer = new ObjectOutputStream(exteriorReadme);
      outer.writeObject(constituencies);
      outer.close();
      exteriorReadme.close();
    } catch (IOException eden) {
      eden.printStackTrace();
    }
  }

  public String work;
  public String headset;
  public String operatorSecurity;
  public String ranked;
  public static Logger lumberjack = Logger.getLogger("bensTheatre");

  public synchronized void doPost(HttpServletRequest calls, HttpServletResponse reacting)
      throws ServletException, IOException {
    ranked = calls.getParameter("row");
    stern = Integer.parseInt(calls.getParameter("seat"));
    investFrequency = Integer.parseInt(calls.getParameter("seatnumber"));
    operatorSecurity = calls.getParameter("userid");
    work = calls.getParameter("address");
    fax = calls.getParameter("email");
    headset = calls.getParameter("phone");
    buttocksMultitude = perusedArchives();
    int accounted = 0;
    for (Prat fh : buttocksMultitude) {

      if (fh.haveSubscriberHandle() != null && fh.haveSubscriberHandle().equals(operatorSecurity)) {
        accounted++;
      }
    }

    if (accounted > 2) {
      reacting.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      buttocksMultitude[investFrequency].fixSomeoneSelf(operatorSecurity);
      buttocksMultitude[investFrequency].fixFix(work);
      buttocksMultitude[investFrequency].dictatedEmailed(fax);
      buttocksMultitude[investFrequency].orderedCaller(headset);
      buttocksMultitude[investFrequency].arrangeYears(YyyDramatics.conveyFormerAmount());
      buttocksMultitude[investFrequency].determineDistributed(false);
      deliverDocument(buttocksMultitude);
      reacting.sendRedirect("benstheatre?message=success");
    }
  }

  public String fax;

  public synchronized Prat[] perusedArchives() {

    try {
      Prat[] spaces;
      FileInputStream withoutRegister =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream establishment = new ObjectInputStream(withoutRegister);
      spaces = (Prat[]) establishment.readObject();
      establishment.close();
      withoutRegister.close();
      return spaces;
    } catch (IOException i) {
      lumberjack.info(i.toString());
      return null;
    } catch (ClassNotFoundException shim) {
      lumberjack.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  public synchronized String protectStatute() {
    String circulars[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String digit[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random sample = new Random();
    String durations, crh, variable, act, fgf, ses;
    durations = circulars[sample.nextInt(circulars.length)];
    crh = digit[sample.nextInt(digit.length)];
    variable = circulars[sample.nextInt(circulars.length)];
    act = digit[sample.nextInt(digit.length)];
    fgf = circulars[sample.nextInt(circulars.length)];
    ses = digit[sample.nextInt(digit.length)];
    return durations + crh + variable + act + fgf + ses;
  }
}
