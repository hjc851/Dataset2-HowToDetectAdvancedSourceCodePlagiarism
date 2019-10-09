import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class PhillipsAuditoriumSubscription extends HttpServlet {
  private static Logger lumberjack;
  private String electronic;
  private String confronting;
  private String handset;
  private String adopterTag;
  private int invest;
  private int keisterRoutine;
  private String wrangle;
  private Stern[] backsideAssortment;

  public synchronized void doGet(HttpServletRequest invitation, HttpServletResponse reply)
      throws ServletException, IOException {
    PrintWriter tabu;
    String leasingAddendum;
    tabu = (reply.getWriter());
    wrangle = (invitation.getParameter("row"));
    invest = (Integer.parseInt(invitation.getParameter("seat")));
    keisterRoutine = (Integer.parseInt(invitation.getParameter("seatnumber")));
    backsideAssortment = (writeDatabase());
    leasingAddendum = (conveyDetentionAnnexes());
    tabu.println(leasingAddendum);
  }

  public synchronized void doPost(HttpServletRequest motion, HttpServletResponse feedback)
      throws ServletException, IOException {
    int entered;
    wrangle = (motion.getParameter("row"));
    invest = (Integer.parseInt(motion.getParameter("seat")));
    keisterRoutine = (Integer.parseInt(motion.getParameter("seatnumber")));
    adopterTag = (motion.getParameter("userid"));
    confronting = (motion.getParameter("address"));
    electronic = (motion.getParameter("email"));
    handset = (motion.getParameter("phone"));
    backsideAssortment = (writeDatabase());
    entered = (0);
    for (Stern waffen : backsideAssortment) synx130(waffen, entered);

    if (entered > 2) {
      feedback.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      backsideAssortment[keisterRoutine].rigidAdopterTag(adopterTag);
      backsideAssortment[keisterRoutine].putSpeech(confronting);
      backsideAssortment[keisterRoutine].fixDissemination(electronic);
      backsideAssortment[keisterRoutine].solidifyingCalling(handset);
      backsideAssortment[keisterRoutine].settledPeriods(PkgHouse.generateUnderwayYear());
      backsideAssortment[keisterRoutine].readyUseable(false);
      resurrectPapers(backsideAssortment);
      feedback.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String conveyDetentionAnnexes() {
    String designator;
    String firefox;
    designator = (safetyInscribe());
    firefox = ("");
    firefox +=
        (("<!DOCTYPE html>\n"
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
    firefox += (("<p class=\"option\">" + wrangle + invest + "</p>"));
    firefox +=
        (("</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>"));
    firefox += (("<p class=\"option\" data-code=\"" + designator + "\">" + designator + "</p>"));
    firefox +=
        (("</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + invest
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + wrangle
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + keisterRoutine
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
    return firefox;
  }

  public synchronized String safetyInscribe() {
    String memos[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String names[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random sample;
    String ff, acetal, betas, contractual, b, rl;
    sample = (new Random());
    ff = (memos[sample.nextInt(memos.length)]);
    acetal = (names[sample.nextInt(names.length)]);
    betas = (memos[sample.nextInt(memos.length)]);
    contractual = (names[sample.nextInt(names.length)]);
    b = (memos[sample.nextInt(memos.length)]);
    rl = (names[sample.nextInt(names.length)]);
    return (ff + acetal + betas + contractual + b + rl);
  }

  public synchronized Stern[] writeDatabase() {

    try {
      FileInputStream tenantsDocuments;
      ObjectInputStream officeholders;
      Stern[] jobs;
      tenantsDocuments =
          (new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      officeholders = (new ObjectInputStream(tenantsDocuments));
      jobs = ((Stern[]) officeholders.readObject());
      officeholders.close();
      tenantsDocuments.close();
      return jobs;
    } catch (IOException i) {
      lumberjack.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      lumberjack.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public synchronized void resurrectPapers(Stern[] elects) {

    try {
      FileOutputStream deadSubmit;
      ObjectOutputStream stunned;
      deadSubmit =
          (new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      stunned = (new ObjectOutputStream(deadSubmit));
      stunned.writeObject(elects);
      stunned.close();
      deadSubmit.close();
    } catch (IOException aba) {
      aba.printStackTrace();
    }
  }

  static {
    lumberjack = (Logger.getLogger("bensTheatre"));
  }

  private synchronized void synx130(Stern waffen, int entered)
      throws ServletException, IOException {

    if (waffen.conveyAdopterTag() != null && waffen.conveyAdopterTag().equals(adopterTag)) {
      entered++;
    }
  }
}
