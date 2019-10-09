import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class AstonArtsAdvance extends HttpServlet {
  public static Logger register = null;
  public String sending = null;
  public String handle = null;
  public String earphone = null;
  public String operatorSecurity = null;
  public int buns = 0;
  public int canQuantity = 0;
  public String penalty = null;
  public static final int secondaryTrussed = -499321472;
  public Stern[] rearRange = null;

  public synchronized void doGet(HttpServletRequest ask, HttpServletResponse feedback)
      throws ServletException, IOException {
    double cite;
    PrintWriter unstylish;
    String ticketingWebpage;
    cite = 0.5289830876044709;
    unstylish = feedback.getWriter();
    penalty = ask.getParameter("row");
    buns = Integer.parseInt(ask.getParameter("seat"));
    canQuantity = Integer.parseInt(ask.getParameter("seatnumber"));
    rearRange = peruseDocket();
    ticketingWebpage = canLogScreen();
    unstylish.println(ticketingWebpage);
  }

  public synchronized void doPost(HttpServletRequest quest, HttpServletResponse answer)
      throws ServletException, IOException {
    double enumerate;
    int attributed;
    enumerate = 0.16746845634868668;
    penalty = quest.getParameter("row");
    buns = Integer.parseInt(quest.getParameter("seat"));
    canQuantity = Integer.parseInt(quest.getParameter("seatnumber"));
    operatorSecurity = quest.getParameter("userid");
    handle = quest.getParameter("address");
    sending = quest.getParameter("email");
    earphone = quest.getParameter("phone");
    rearRange = peruseDocket();
    attributed = 0;
    for (Stern fh : rearRange) {

      if (fh.developAddictPeg() != null && fh.developAddictPeg().equals(operatorSecurity)) {
        attributed++;
      }
    }

    if (attributed > 2) {
      answer.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      rearRange[canQuantity].situatedDeveloperPicture(operatorSecurity);
      rearRange[canQuantity].doIdentify(handle);
      rearRange[canQuantity].fitTelefax(sending);
      rearRange[canQuantity].situatedTelephony(earphone);
      rearRange[canQuantity].settledPeriods(VeleOpera.letAfootHours());
      rearRange[canQuantity].laidObtainable(false);
      avertPaperwork(rearRange);
      answer.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String canLogScreen() {
    double span;
    String law;
    String metadata;
    span = 0.5542846884829762;
    law = insecurityGuideline();
    metadata = "";
    metadata +=
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
    metadata += "<p class=\"option\">" + penalty + buns + "</p>";
    metadata +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    metadata += "<p class=\"option\" data-code=\"" + law + "\">" + law + "</p>";
    metadata +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + buns
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + penalty
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + canQuantity
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
    return metadata;
  }

  public synchronized String insecurityGuideline() {
    double key;
    String mail[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String volumes[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random probability;
    String ff, cc, impedance, c1, logarithm, sw;
    key = 0.717374914044847;
    probability = new Random();
    ff = null;
    cc = null;
    impedance = null;
    c1 = null;
    logarithm = null;
    sw = null;
    ff = mail[probability.nextInt(mail.length)];
    cc = volumes[probability.nextInt(volumes.length)];
    impedance = mail[probability.nextInt(mail.length)];
    c1 = volumes[probability.nextInt(volumes.length)];
    logarithm = mail[probability.nextInt(mail.length)];
    sw = volumes[probability.nextInt(volumes.length)];
    return ff + cc + impedance + c1 + logarithm + sw;
  }

  public synchronized Stern[] peruseDocket() {
    String curb;
    curb = "DOzMeE";

    try {
      FileInputStream whysCharge;
      ObjectInputStream immigration;
      Stern[] spaces = null;
      whysCharge = new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      immigration = new ObjectInputStream(whysCharge);
      spaces = (Stern[]) immigration.readObject();
      immigration.close();
      whysCharge.close();
      return spaces;
    } catch (IOException i) {
      register.info(i.toString());
      return null;
    } catch (ClassNotFoundException intrasentential) {
      register.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void avertPaperwork(Stern[] ridings) {
    String important;
    important = "FPNckgr";

    try {
      FileOutputStream backBinder;
      ObjectOutputStream off;
      backBinder =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      off = new ObjectOutputStream(backBinder);
      off.writeObject(ridings);
      off.close();
      backBinder.close();
    } catch (IOException abe) {
      abe.printStackTrace();
    }
  }

  static {
    register = Logger.getLogger("bensTheatre");
  }
}
