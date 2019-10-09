import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class EmpCinemasGig extends HttpServlet {
  private Posterior[] assCollection;
  private String penalty;
  private int tushFigure;
  private int buns;
  private String addictPeg;
  private String sound;
  private String fix;
  private String mail;
  private static Logger woodcutter = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest asked, HttpServletResponse reaction)
      throws ServletException, IOException {
    PrintWriter off = reaction.getWriter();
    penalty = asked.getParameter("row");
    buns = Integer.parseInt(asked.getParameter("seat"));
    tushFigure = Integer.parseInt(asked.getParameter("seatnumber"));
    assCollection = readerInitiate();
    String subscriptionTable = takeRentalSite();
    off.println(subscriptionTable);
  }

  public void doPost(HttpServletRequest ask, HttpServletResponse answer)
      throws ServletException, IOException {
    penalty = ask.getParameter("row");
    buns = Integer.parseInt(ask.getParameter("seat"));
    tushFigure = Integer.parseInt(ask.getParameter("seatnumber"));
    addictPeg = ask.getParameter("userid");
    fix = ask.getParameter("address");
    mail = ask.getParameter("email");
    sound = ask.getParameter("phone");
    assCollection = readerInitiate();
    int allotted = 0;
    for (Posterior fh : assCollection) {

      if (fh.driveOperatorSecurity() != null && fh.driveOperatorSecurity().equals(addictPeg)) {
        allotted++;
      }
    }

    if (allotted > 2) {
      answer.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      assCollection[tushFigure].placedCustomersIbid(addictPeg);
      assCollection[tushFigure].readyCover(fix);
      assCollection[tushFigure].laidFax(mail);
      assCollection[tushFigure].markMobile(sound);
      assCollection[tushFigure].layMoment(SthTeatro.arriveFlowMonth());
      assCollection[tushFigure].bentGettable(false);
      preserveLodge(assCollection);
      answer.sendRedirect("benstheatre?message=success");
    }
  }

  public String takeRentalSite() {
    String encode = firewallEncode();
    String macros = "";
    macros +=
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
    macros += "<p class=\"option\">" + penalty + buns + "</p>";
    macros +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    macros += "<p class=\"option\" data-code=\"" + encode + "\">" + encode + "</p>";
    macros +=
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
            + tushFigure
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
    return macros;
  }

  public String firewallEncode() {
    String words[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String count[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random sampling = new Random();
    String fc, r6, deviation, correspond, ip, col;
    fc = words[sampling.nextInt(words.length)];
    r6 = count[sampling.nextInt(count.length)];
    deviation = words[sampling.nextInt(words.length)];
    correspond = count[sampling.nextInt(count.length)];
    ip = words[sampling.nextInt(words.length)];
    col = count[sampling.nextInt(count.length)];
    return fc + r6 + deviation + correspond + ip + col;
  }

  public Posterior[] readerInitiate() {

    try {
      Posterior[] stalls;
      FileInputStream whysCharge =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream advocates = new ObjectInputStream(whysCharge);
      stalls = (Posterior[]) advocates.readObject();
      advocates.close();
      whysCharge.close();
      return stalls;
    } catch (IOException i) {
      woodcutter.info(i.toString());
      return null;
    } catch (ClassNotFoundException caesium) {
      woodcutter.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public void preserveLodge(Posterior[] beds) {

    try {
      FileOutputStream tabuInitiate =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream outer = new ObjectOutputStream(tabuInitiate);
      outer.writeObject(beds);
      outer.close();
      tabuInitiate.close();
    } catch (IOException abbe) {
      abbe.printStackTrace();
    }
  }
}
