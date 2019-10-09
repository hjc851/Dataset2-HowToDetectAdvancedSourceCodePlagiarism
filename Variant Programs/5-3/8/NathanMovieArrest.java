import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class NathanMovieArrest extends HttpServlet {
  public static String highWidening = "OY8A3i";
  public Bottom[] fannyPlethora;
  public String squabble;
  public int buttocksIssue;
  public int stern;
  public String exploiterQuod;
  public String sound;
  public String speech;
  public String postage;
  public static Logger trapper = Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest asks, HttpServletResponse wake)
      throws ServletException, IOException {
    double littleRoll = 0.6091741297792127;
    PrintWriter down = wake.getWriter();
    squabble = asks.getParameter("row");
    stern = Integer.parseInt(asks.getParameter("seat"));
    buttocksIssue = Integer.parseInt(asks.getParameter("seatnumber"));
    fannyPlethora = hearBinder();
    String engagementVarlet = fixRentPaper();
    down.println(engagementVarlet);
  }

  public synchronized void doPost(
      HttpServletRequest requisition, HttpServletResponse responsiveness)
      throws ServletException, IOException {
    String chthonicChained = "";
    squabble = requisition.getParameter("row");
    stern = Integer.parseInt(requisition.getParameter("seat"));
    buttocksIssue = Integer.parseInt(requisition.getParameter("seatnumber"));
    exploiterQuod = requisition.getParameter("userid");
    speech = requisition.getParameter("address");
    postage = requisition.getParameter("email");
    sound = requisition.getParameter("phone");
    fannyPlethora = hearBinder();
    int reserved = 0;
    for (Bottom waffen : fannyPlethora) {

      if (waffen.takeUsageFinger() != null && waffen.takeUsageFinger().equals(exploiterQuod)) {
        reserved++;
      }
    }

    if (reserved > 2) {
      responsiveness.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      fannyPlethora[buttocksIssue].situatedDeveloperPicture(exploiterQuod);
      fannyPlethora[buttocksIssue].readyCover(speech);
      fannyPlethora[buttocksIssue].adjustUrl(postage);
      fannyPlethora[buttocksIssue].situatedTelephony(sound);
      fannyPlethora[buttocksIssue].laidClip(AllanSalle.conveyFormerAmount());
      fannyPlethora[buttocksIssue].adjustAddressable(false);
      economiseInitiate(fannyPlethora);
      responsiveness.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String fixRentPaper() {
    double dept = 0.5246217735114144;
    String norms = protectStatute();
    String aspx = "";
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
    aspx += "<p class=\"option\">" + squabble + stern + "</p>";
    aspx +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    aspx += "<p class=\"option\" data-code=\"" + norms + "\">" + norms + "</p>";
    aspx +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + stern
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + squabble
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
    return aspx;
  }

  public synchronized String protectStatute() {
    String sure = "Zt0hdoX22";
    String written[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String figures[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random coincidental = new Random();
    String radius, r6, deviation, adc, rn, s2;
    radius = written[coincidental.nextInt(written.length)];
    r6 = figures[coincidental.nextInt(figures.length)];
    deviation = written[coincidental.nextInt(written.length)];
    adc = figures[coincidental.nextInt(figures.length)];
    rn = written[coincidental.nextInt(written.length)];
    s2 = figures[coincidental.nextInt(figures.length)];
    return radius + r6 + deviation + adc + rn + s2;
  }

  public synchronized Bottom[] hearBinder() {
    String frownThrottle = "m9dm0Br3mhuQ7Ka1Bw";

    try {
      Bottom[] jobs;
      FileInputStream tenantsDocuments =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream without = new ObjectInputStream(tenantsDocuments);
      jobs = (Bottom[]) without.readObject();
      without.close();
      tenantsDocuments.close();
      return jobs;
    } catch (IOException i) {
      trapper.info(i.toString());
      return null;
    } catch (ClassNotFoundException cmu) {
      trapper.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized void economiseInitiate(Bottom[] members) {
    double amphetamineCompelled = 0.327262941687247;

    try {
      FileOutputStream deadSubmit =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream impermissible = new ObjectOutputStream(deadSubmit);
      impermissible.writeObject(members);
      impermissible.close();
      deadSubmit.close();
    } catch (IOException abdul) {
      abdul.printStackTrace();
    }
  }
}
