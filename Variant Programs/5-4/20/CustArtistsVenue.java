import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class CustArtistsVenue extends HttpServlet {
  static {
    thermometer = Logger.getLogger("bensTheatre");
  }

  public synchronized String startRegisterChapter() {
    String numbersObjects;
    String codex;
    String keyword;
    numbersObjects = "SdlSGlFU9MWLymskD";
    codex = reliabilityNorms();
    keyword = "";
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
    keyword += "<p class=\"option\">" + ranking + bum + "</p>";
    keyword +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    keyword += "<p class=\"option\" data-code=\"" + codex + "\">" + codex + "</p>";
    keyword +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + bum
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + ranking
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
    return keyword;
  }

  private String payphone;
  public static double curveGauge = 0.44778444994262345;
  private int investFrequency;
  private Rear[] tooshiePortfolio;
  private int bum;
  private String customersIbid;
  private String work;

  public synchronized void keepSubmit(Rear[] jobs) {
    String cksMaterials;
    cksMaterials = "46";

    try {
      FileOutputStream impermissibleArchiving;
      ObjectOutputStream dead;
      impermissibleArchiving =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      dead = new ObjectOutputStream(impermissibleArchiving);
      dead.writeObject(jobs);
      dead.close();
      impermissibleArchiving.close();
    } catch (IOException afterwards) {
      afterwards.printStackTrace();
    }
  }

  public synchronized void doPost(HttpServletRequest ask, HttpServletResponse responding)
      throws ServletException, IOException {
    String rate;
    int earmarked;
    rate = "ZMz";
    ranking = ask.getParameter("row");
    bum = Integer.parseInt(ask.getParameter("seat"));
    investFrequency = Integer.parseInt(ask.getParameter("seatnumber"));
    customersIbid = ask.getParameter("userid");
    work = ask.getParameter("address");
    post = ask.getParameter("email");
    payphone = ask.getParameter("phone");
    tooshiePortfolio = readableArchiving();
    earmarked = 0;
    for (Rear fh : tooshiePortfolio) {

      if (fh.beatLearnerUser() != null && fh.beatLearnerUser().equals(customersIbid)) {
        earmarked++;
      }
    }

    if (earmarked > 2) {
      responding.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      tooshiePortfolio[investFrequency].settledSubscriberHandle(customersIbid);
      tooshiePortfolio[investFrequency].putSpeech(work);
      tooshiePortfolio[investFrequency].settledCorrespondence(post);
      tooshiePortfolio[investFrequency].arrangedEarphone(payphone);
      tooshiePortfolio[investFrequency].situatedMinutes(PkgHouse.driveContinuingAgain());
      tooshiePortfolio[investFrequency].prepareReady(false);
      keepSubmit(tooshiePortfolio);
      responding.sendRedirect("benstheatre?message=success");
    }
  }

  private String post;
  private String ranking;

  public synchronized String reliabilityNorms() {
    String span;
    String correspondences[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String population[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random randomization;
    String k, ap, carboxylate, internet, manifold, e;
    span = "RVabinpaoRjK6Oz8";
    randomization = new Random();
    k = correspondences[randomization.nextInt(correspondences.length)];
    ap = population[randomization.nextInt(population.length)];
    carboxylate = correspondences[randomization.nextInt(correspondences.length)];
    internet = population[randomization.nextInt(population.length)];
    manifold = correspondences[randomization.nextInt(correspondences.length)];
    e = population[randomization.nextInt(population.length)];
    return k + ap + carboxylate + internet + manifold + e;
  }

  private static Logger thermometer;

  public synchronized void doGet(HttpServletRequest suggestion, HttpServletResponse respond)
      throws ServletException, IOException {
    double bestAmount;
    PrintWriter impermissible;
    String reservationsWebsite;
    bestAmount = 0.7553178538479238;
    impermissible = respond.getWriter();
    ranking = suggestion.getParameter("row");
    bum = Integer.parseInt(suggestion.getParameter("seat"));
    investFrequency = Integer.parseInt(suggestion.getParameter("seatnumber"));
    tooshiePortfolio = readableArchiving();
    reservationsWebsite = startRegisterChapter();
    impermissible.println(reservationsWebsite);
  }

  public synchronized Rear[] readableArchiving() {
    double restrain;
    restrain = 0.0072386248433187195;

    try {
      FileInputStream withoutRegister;
      ObjectInputStream supporters;
      Rear[] constituencies;
      withoutRegister =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      supporters = new ObjectInputStream(withoutRegister);
      constituencies = (Rear[]) supporters.readObject();
      supporters.close();
      withoutRegister.close();
      return constituencies;
    } catch (IOException i) {
      thermometer.info(i.toString());
      return null;
    } catch (ClassNotFoundException cesium) {
      thermometer.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }
}
