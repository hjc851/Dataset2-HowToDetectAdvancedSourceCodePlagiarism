import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class SimoneBroadwayRental extends HttpServlet {
  private Hindquarters[] pratBreadth;
  private String bickering;
  private int assSeveral;
  private int keister;
  private String visitorOwnership;
  private String voice;
  private String solve;
  private String correspondence;
  private static Logger forestry = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest motion, HttpServletResponse reception)
      throws ServletException, IOException {
    PrintWriter extinct = reception.getWriter();
    bickering = motion.getParameter("row");
    keister = Integer.parseInt(motion.getParameter("seat"));
    assSeveral = Integer.parseInt(motion.getParameter("seatnumber"));
    pratBreadth = perusedArchives();
    String recordingSummary = beatArrestContents();
    extinct.println(recordingSummary);
  }

  public void doPost(HttpServletRequest petitioning, HttpServletResponse answer)
      throws ServletException, IOException {
    bickering = petitioning.getParameter("row");
    keister = Integer.parseInt(petitioning.getParameter("seat"));
    assSeveral = Integer.parseInt(petitioning.getParameter("seatnumber"));
    visitorOwnership = petitioning.getParameter("userid");
    solve = petitioning.getParameter("address");
    correspondence = petitioning.getParameter("email");
    voice = petitioning.getParameter("phone");
    pratBreadth = perusedArchives();
    int accounted = 0;
    for (Hindquarters waffen : pratBreadth) {

      if (waffen.developAddictPeg() != null && waffen.developAddictPeg().equals(visitorOwnership)) {
        accounted++;
      }
    }

    if (accounted > 2) {
      answer.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      pratBreadth[assSeveral].putExploiterQuod(visitorOwnership);
      pratBreadth[assSeveral].primedAccost(solve);
      pratBreadth[assSeveral].putNetmail(correspondence);
      pratBreadth[assSeveral].determineTelephonic(voice);
      pratBreadth[assSeveral].fixedOpportunity(AstonArts.bringOngoingMeter());
      pratBreadth[assSeveral].putAccessible(false);
      conserveRegister(pratBreadth);
      answer.sendRedirect("benstheatre?message=success");
    }
  }

  public String beatArrestContents() {
    String cypher = integrityCiphers();
    String ajax = "";
    ajax +=
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
    ajax += "<p class=\"option\">" + bickering + keister + "</p>";
    ajax +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    ajax += "<p class=\"option\" data-code=\"" + cypher + "\">" + cypher + "</p>";
    ajax +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + keister
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + bickering
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + assSeveral
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
    return ajax;
  }

  public String integrityCiphers() {
    String parcels[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String amount[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random wanton = new Random();
    String momenta, tnf, acetal, exponent, en, s2;
    momenta = parcels[wanton.nextInt(parcels.length)];
    tnf = amount[wanton.nextInt(amount.length)];
    acetal = parcels[wanton.nextInt(parcels.length)];
    exponent = amount[wanton.nextInt(amount.length)];
    en = parcels[wanton.nextInt(parcels.length)];
    s2 = amount[wanton.nextInt(amount.length)];
    return momenta + tnf + acetal + exponent + en + s2;
  }

  public Hindquarters[] perusedArchives() {

    try {
      Hindquarters[] venues;
      FileInputStream nsiPapers =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream establishment = new ObjectInputStream(nsiPapers);
      venues = (Hindquarters[]) establishment.readObject();
      establishment.close();
      nsiPapers.close();
      return venues;
    } catch (IOException i) {
      forestry.info(i.toString());
      return null;
    } catch (ClassNotFoundException caesium) {
      forestry.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public void conserveRegister(Hindquarters[] votes) {

    try {
      FileOutputStream retiredExecutable =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream off = new ObjectOutputStream(retiredExecutable);
      off.writeObject(votes);
      off.close();
      retiredExecutable.close();
    } catch (IOException abbe) {
      abbe.printStackTrace();
    }
  }
}
