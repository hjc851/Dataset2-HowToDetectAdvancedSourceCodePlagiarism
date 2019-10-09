import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class WarwickPlayhousesDetention extends HttpServlet {
  private Fanny[] sternArsenal;
  private String brawl;
  private int posteriorAct;
  private int behind;
  private String learnerUser;
  private String headphone;
  private String treat;
  private String electronic;
  private static Logger surveyor = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest demands, HttpServletResponse responded)
      throws ServletException, IOException {
    PrintWriter dead = responded.getWriter();
    brawl = demands.getParameter("row");
    behind = Integer.parseInt(demands.getParameter("seat"));
    posteriorAct = Integer.parseInt(demands.getParameter("seatnumber"));
    sternArsenal = understandCharge();
    String leasingAddendum = fixRentPaper();
    dead.println(leasingAddendum);
  }

  public void doPost(HttpServletRequest calls, HttpServletResponse reaction)
      throws ServletException, IOException {
    brawl = calls.getParameter("row");
    behind = Integer.parseInt(calls.getParameter("seat"));
    posteriorAct = Integer.parseInt(calls.getParameter("seatnumber"));
    learnerUser = calls.getParameter("userid");
    treat = calls.getParameter("address");
    electronic = calls.getParameter("email");
    headphone = calls.getParameter("phone");
    sternArsenal = understandCharge();
    int planned = 0;
    for (Fanny waffen : sternArsenal) {

      if (waffen.arriveClientIdentifying() != null
          && waffen.arriveClientIdentifying().equals(learnerUser)) {
        planned++;
      }
    }

    if (planned > 2) {
      reaction.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      sternArsenal[posteriorAct].prepareWearerMap(learnerUser);
      sternArsenal[posteriorAct].prepareConfront(treat);
      sternArsenal[posteriorAct].markSend(electronic);
      sternArsenal[posteriorAct].layHeadphone(headphone);
      sternArsenal[posteriorAct].putClock(CustArtists.conveyFormerAmount());
      sternArsenal[posteriorAct].solidifyingAccessed(false);
      deliverDocument(sternArsenal);
      reaction.sendRedirect("benstheatre?message=success");
    }
  }

  public String fixRentPaper() {
    String cipher = protectingEncryption();
    String parser = "";
    parser +=
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
    parser += "<p class=\"option\">" + brawl + behind + "</p>";
    parser +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    parser += "<p class=\"option\" data-code=\"" + cipher + "\">" + cipher + "</p>";
    parser +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + behind
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + brawl
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + posteriorAct
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
    return parser;
  }

  public String protectingEncryption() {
    String submissions[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String figure[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random sampling = new Random();
    String ff, c3, variable, correspond, detector, ri;
    ff = submissions[sampling.nextInt(submissions.length)];
    c3 = figure[sampling.nextInt(figure.length)];
    variable = submissions[sampling.nextInt(submissions.length)];
    correspond = figure[sampling.nextInt(figure.length)];
    detector = submissions[sampling.nextInt(submissions.length)];
    ri = figure[sampling.nextInt(figure.length)];
    return ff + c3 + variable + correspond + detector + ri;
  }

  public Fanny[] understandCharge() {

    try {
      Fanny[] venues;
      FileInputStream nihDocket =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream entries = new ObjectInputStream(nihDocket);
      venues = (Fanny[]) entries.readObject();
      entries.close();
      nihDocket.close();
      return venues;
    } catch (IOException i) {
      surveyor.info(i.toString());
      return null;
    } catch (ClassNotFoundException nlsy) {
      surveyor.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public void deliverDocument(Fanny[] spots) {

    try {
      FileOutputStream deadSubmit =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream extinct = new ObjectOutputStream(deadSubmit);
      extinct.writeObject(spots);
      extinct.close();
      deadSubmit.close();
    } catch (IOException combatants) {
      combatants.printStackTrace();
    }
  }
}
