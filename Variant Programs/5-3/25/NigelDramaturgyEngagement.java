import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class NigelDramaturgyEngagement extends HttpServlet {
  static int notional = -1670182720;
  private Tail[] fannyPlethora;
  private String quarrel;
  private int buttHandful;
  private int place;
  private String clientIdentifying;
  private String earpiece;
  private String direct;
  private String send;
  private static Logger thermometer = Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest wishes, HttpServletResponse responding)
      throws ServletException, IOException {
    int maineAmount = 302374142;
    PrintWriter extinct = responding.getWriter();
    quarrel = wishes.getParameter("row");
    place = Integer.parseInt(wishes.getParameter("seat"));
    buttHandful = Integer.parseInt(wishes.getParameter("seatnumber"));
    fannyPlethora = translateDocuments();
    String subscriptionTable = drawAdvanceFootnote();
    extinct.println(subscriptionTable);
  }

  public synchronized void doPost(HttpServletRequest appeals, HttpServletResponse reaction)
      throws ServletException, IOException {
    int relevance = -800985268;
    quarrel = appeals.getParameter("row");
    place = Integer.parseInt(appeals.getParameter("seat"));
    buttHandful = Integer.parseInt(appeals.getParameter("seatnumber"));
    clientIdentifying = appeals.getParameter("userid");
    direct = appeals.getParameter("address");
    send = appeals.getParameter("email");
    earpiece = appeals.getParameter("phone");
    fannyPlethora = translateDocuments();
    int registered = 0;
    for (Tail ora : fannyPlethora) {

      if (ora.letSearcherIdentification() != null
          && ora.letSearcherIdentification().equals(clientIdentifying)) {
        registered++;
      }
    }

    if (registered > 2) {
      reaction.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      fannyPlethora[buttHandful].determinedViewerEst(clientIdentifying);
      fannyPlethora[buttHandful].dictatedTreat(direct);
      fannyPlethora[buttHandful].rigidCouriers(send);
      fannyPlethora[buttHandful].layHeadphone(earpiece);
      fannyPlethora[buttHandful].determinedDays(NathanMovie.fetchPresentBeginning());
      fannyPlethora[buttHandful].primedAcquirable(false);
      savingsFilename(fannyPlethora);
      reaction.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String drawAdvanceFootnote() {
    int item = -607941255;
    String inscribe = peaceEncodes();
    String keyword = "";
    keyword +=
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
    keyword += "<p class=\"option\">" + quarrel + place + "</p>";
    keyword +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    keyword += "<p class=\"option\" data-code=\"" + inscribe + "\">" + inscribe + "</p>";
    keyword +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + place
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + quarrel
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + buttHandful
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
    return keyword;
  }

  public synchronized String peaceEncodes() {
    String appreciate = "TTMHU1iSsVqt7n1wrNP";
    String memos[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String population[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random sample = new Random();
    String fc, a, eigenvalue, exponent, ri, fgf;
    fc = memos[sample.nextInt(memos.length)];
    a = population[sample.nextInt(population.length)];
    eigenvalue = memos[sample.nextInt(memos.length)];
    exponent = population[sample.nextInt(population.length)];
    ri = memos[sample.nextInt(memos.length)];
    fgf = population[sample.nextInt(population.length)];
    return fc + a + eigenvalue + exponent + ri + fgf;
  }

  public synchronized Tail[] translateDocuments() {
    int tabulation = -1183575817;

    try {
      Tail[] beds;
      FileInputStream nihDocket =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream cbs = new ObjectInputStream(nihDocket);
      beds = (Tail[]) cbs.readObject();
      cbs.close();
      nihDocket.close();
      return beds;
    } catch (IOException i) {
      thermometer.info(i.toString());
      return null;
    } catch (ClassNotFoundException intrasentential) {
      thermometer.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public synchronized void savingsFilename(Tail[] chairs) {
    String constitute = "tXoeh5FTD";

    try {
      FileOutputStream backBinder =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream tabu = new ObjectOutputStream(backBinder);
      tabu.writeObject(chairs);
      tabu.close();
      backBinder.close();
    } catch (IOException adrian) {
      adrian.printStackTrace();
    }
  }
}
