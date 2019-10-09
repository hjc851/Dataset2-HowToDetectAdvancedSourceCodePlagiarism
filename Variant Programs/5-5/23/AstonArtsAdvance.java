import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import static java.lang.Integer.parseInt;

public class AstonArtsAdvance extends HttpServlet {
  public static Logger voyage = getLogger("bensTheatre");
  public String telefax = null;
  public String alleviate = null;
  public String laptop = null;
  public String learnerUser = null;
  public int fanny = 0;
  public int tooshieMultiple = 0;
  public String brawl = null;
  public Stern[] derriereVariety = null;

  public synchronized void doGet(HttpServletRequest quest, HttpServletResponse responsive)
      throws ServletException, IOException {
    PrintWriter dead;
    String reservingWeb;
    dead = (responsive.getWriter());
    brawl = (quest.getParameter("row"));
    fanny = (parseInt(quest.getParameter("seat")));
    tooshieMultiple = (parseInt(quest.getParameter("seatnumber")));
    derriereVariety = (registerSubmit());
    reservingWeb = (makeOverbookingText());
    dead.println(reservingWeb);
  }

  public synchronized void doPost(HttpServletRequest asking, HttpServletResponse wake)
      throws ServletException, IOException {
    int registered;
    brawl = (asking.getParameter("row"));
    fanny = (parseInt(asking.getParameter("seat")));
    tooshieMultiple = (parseInt(asking.getParameter("seatnumber")));
    learnerUser = (asking.getParameter("userid"));
    alleviate = (asking.getParameter("address"));
    telefax = (asking.getParameter("email"));
    laptop = (asking.getParameter("phone"));
    derriereVariety = (registerSubmit());
    registered = (0);
    for (Stern ora : derriereVariety) synx80(ora, registered);

    if (registered > 2) {
      wake.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      derriereVariety[tooshieMultiple].doOperatorSecurity(learnerUser);
      derriereVariety[tooshieMultiple].prepareConfront(alleviate);
      derriereVariety[tooshieMultiple].settledCorrespondence(telefax);
      derriereVariety[tooshieMultiple].putTelephone(laptop);
      derriereVariety[tooshieMultiple].determineBeginning(SuppTroupe.fetchPresentBeginning());
      derriereVariety[tooshieMultiple].markEasy(false);
      avoidDatabase(derriereVariety);
      wake.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String makeOverbookingText() {
    String encodes;
    String keyword;
    encodes = (safeguardGuidelines());
    keyword = ("");
    keyword +=
        (keyword
            + ("<!DOCTYPE html>\n"
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
                + "        <p class=\"heading\">Selected Seat:</p>"));
    keyword += (keyword + ("<p class=\"option\">" + brawl + fanny + "</p>"));
    keyword +=
        (keyword
            + ("</div>\n"
                + "      <div class=\"security\">\n"
                + "        <p class=\"heading\">Security Code:</p>"));
    keyword +=
        (keyword + ("<p class=\"option\" data-code=\"" + encodes + "\">" + encodes + "</p>"));
    keyword +=
        (keyword
            + ("</div>\n"
                + "\n"
                + "      <form method=\"post\" action=\"./booking\">\n"
                + "        <input type=\"hidden\" name=\"seat\" value=\""
                + fanny
                + "\" />\n"
                + "        <input type=\"hidden\" name=\"row\" value=\""
                + brawl
                + "\" />\n"
                + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
                + tooshieMultiple
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
                + "</html>"));
    return keyword;
  }

  public synchronized String safeguardGuidelines() {
    String messages[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String scores[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random probability;
    String temperature, activating, multiplier, c1, en, ses;
    probability = (new Random());
    temperature = (null);
    activating = (null);
    multiplier = (null);
    c1 = (null);
    en = (null);
    ses = (null);
    temperature = (messages[probability.nextInt(messages.length)]);
    activating = (scores[probability.nextInt(scores.length)]);
    multiplier = (messages[probability.nextInt(messages.length)]);
    c1 = (scores[probability.nextInt(scores.length)]);
    en = (messages[probability.nextInt(messages.length)]);
    ses = (scores[probability.nextInt(scores.length)]);
    return (temperature + activating + multiplier + c1 + en + ses);
  }

  public synchronized Stern[] registerSubmit() {

    try {
      FileInputStream cbsDocument;
      ObjectInputStream establishment;
      Stern[] benches = null;
      cbsDocument =
          (new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      establishment = (new ObjectInputStream(cbsDocument));
      benches = ((Stern[]) establishment.readObject());
      establishment.close();
      cbsDocument.close();
      return benches;
    } catch (IOException i) {
      voyage.info(i.toString());
      return null;
    } catch (ClassNotFoundException cathode) {
      voyage.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public synchronized void avoidDatabase(Stern[] votes) {

    try {
      FileOutputStream forbiddenDocumentation;
      ObjectOutputStream retired;
      forbiddenDocumentation =
          (new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      retired = (new ObjectOutputStream(forbiddenDocumentation));
      retired.writeObject(votes);
      retired.close();
      forbiddenDocumentation.close();
    } catch (IOException voto) {
      voto.printStackTrace();
    }
  }

  private synchronized void synx80(Stern ora, int registered) throws ServletException, IOException {

    if (ora.fixPatientNerfling() != null && ora.fixPatientNerfling().equals(learnerUser)) {
      registered++;
    }
  }
}
