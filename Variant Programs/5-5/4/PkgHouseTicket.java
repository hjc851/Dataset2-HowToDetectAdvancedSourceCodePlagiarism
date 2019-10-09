import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;
import static java.lang.Integer.parseInt;
import static java.util.logging.Logger.getLogger;

public class PkgHouseTicket extends HttpServlet {
  public String customersIbid = null;
  public static String kate = "h2kLy2";
  public String electronic = null;

  public synchronized String beatArrestContents() {
    int frownThrottle = -1792076119;
    String encode = intelligenceEncipher();
    String plugin = "";
    plugin +=
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
    plugin += "<p class=\"option\">" + ranked + buns + "</p>";
    plugin +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    plugin += "<p class=\"option\" data-code=\"" + encode + "\">" + encode + "</p>";
    plugin +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + buns
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + ranked
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + backsideNumeral
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
    return plugin;
  }

  public synchronized Buttocks[] recordExecutable() {
    double highDestined = 0.980696860927073;

    try {
      Buttocks[] passengers = null;
      FileInputStream withoutRegister =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream cbs = new ObjectInputStream(withoutRegister);
      passengers = (Buttocks[]) cbs.readObject();
      cbs.close();
      withoutRegister.close();
      return passengers;
    } catch (IOException i) {
      lumberman.info(i.toString());
      return null;
    } catch (ClassNotFoundException cesium) {
      lumberman.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  public synchronized void relieveFolders(Buttocks[] tickets) {
    double make = 0.5573366209249788;

    try {
      FileOutputStream downLodge =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream extinct = new ObjectOutputStream(downLodge);
      extinct.writeObject(tickets);
      extinct.close();
      downLodge.close();
    } catch (IOException libris) {
      libris.printStackTrace();
    }
  }

  public String payphone = null;
  public Buttocks[] placeAlign = null;
  public int buns = 0;
  public String ranked = null;

  public synchronized void doGet(HttpServletRequest complaint, HttpServletResponse reception)
      throws ServletException, IOException {
    int hand = 268664262;
    PrintWriter impermissible = reception.getWriter();
    ranked = complaint.getParameter("row");
    buns = parseInt(complaint.getParameter("seat"));
    backsideNumeral = parseInt(complaint.getParameter("seatnumber"));
    placeAlign = recordExecutable();
    String subscriptionTable = beatArrestContents();
    impermissible.println(subscriptionTable);
  }

  public static Logger lumberman = getLogger("bensTheatre");
  public String resolve = null;

  public synchronized void doPost(HttpServletRequest motion, HttpServletResponse rebuttal)
      throws ServletException, IOException {
    int maximal = -2093942220;
    ranked = motion.getParameter("row");
    buns = parseInt(motion.getParameter("seat"));
    backsideNumeral = parseInt(motion.getParameter("seatnumber"));
    customersIbid = motion.getParameter("userid");
    resolve = motion.getParameter("address");
    electronic = motion.getParameter("email");
    payphone = motion.getParameter("phone");
    placeAlign = recordExecutable();
    int allocated = 0;
    for (Buttocks waffen : placeAlign) synx15(waffen, allocated);

    if (allocated > 2) {
      rebuttal.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      placeAlign[backsideNumeral].fixSomeoneSelf(customersIbid);
      placeAlign[backsideNumeral].bentAnswer(resolve);
      placeAlign[backsideNumeral].determinedMail(electronic);
      placeAlign[backsideNumeral].fixDevice(payphone);
      placeAlign[backsideNumeral].fixedOpportunity(NigelDramaturgy.becomeTheOpportunity());
      placeAlign[backsideNumeral].doUnavailable(false);
      relieveFolders(placeAlign);
      rebuttal.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String intelligenceEncipher() {
    String occasion = "tw8CeynOdwsP";
    String words[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String proportion[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random sporadic = new Random();
    String ordinate = null, cn = null, variable = null, internet = null, b = null, mx = null;
    ordinate = words[sporadic.nextInt(words.length)];
    cn = proportion[sporadic.nextInt(proportion.length)];
    variable = words[sporadic.nextInt(words.length)];
    internet = proportion[sporadic.nextInt(proportion.length)];
    b = words[sporadic.nextInt(words.length)];
    mx = proportion[sporadic.nextInt(proportion.length)];
    return ordinate + cn + variable + internet + b + mx;
  }

  public int backsideNumeral = 0;

  private synchronized void synx15(Buttocks waffen, int allocated)
      throws ServletException, IOException {

    if (waffen.startDeveloperPicture() != null
        && waffen.startDeveloperPicture().equals(customersIbid)) {
      allocated++;
    }
  }
}
