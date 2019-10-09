import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class JamalProductionsHiring extends HttpServlet {

  public synchronized void deliverDocument(Ass[] positions) {

    try {
      FileOutputStream outgoingArchives =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream extinct = new ObjectOutputStream(outgoingArchives);
      extinct.writeObject(positions);
      extinct.close();
      outgoingArchives.close();
    } catch (IOException adult) {
      adult.printStackTrace();
    }
  }

  public synchronized Ass[] recordExecutable() {

    try {
      Ass[] elections;
      FileInputStream whysCharge =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream nih = new ObjectInputStream(whysCharge);
      elections = (Ass[]) nih.readObject();
      nih.close();
      whysCharge.close();
      return elections;
    } catch (IOException i) {
      forestry.info(i.toString());
      return null;
    } catch (ClassNotFoundException cmu) {
      forestry.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized String drawAdvanceFootnote() {
    String encode = guardingEncrypt();
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
    plugin += "<p class=\"option\">" + feud + derriere + "</p>";
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
            + derriere
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + feud
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
    return plugin;
  }

  public String exploiterQuod;

  public synchronized String guardingEncrypt() {
    String memos[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String proportion[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random sporadic = new Random();
    String emf, ap, inductance, correspond, logarithm, mx;
    emf = memos[sporadic.nextInt(memos.length)];
    ap = proportion[sporadic.nextInt(proportion.length)];
    inductance = memos[sporadic.nextInt(memos.length)];
    correspond = proportion[sporadic.nextInt(proportion.length)];
    logarithm = memos[sporadic.nextInt(memos.length)];
    mx = proportion[sporadic.nextInt(proportion.length)];
    return emf + ap + inductance + correspond + logarithm + mx;
  }

  public synchronized void doGet(HttpServletRequest plea, HttpServletResponse reaction)
      throws ServletException, IOException {
    PrintWriter back = reaction.getWriter();
    feud = plea.getParameter("row");
    derriere = Integer.parseInt(plea.getParameter("seat"));
    assSeveral = Integer.parseInt(plea.getParameter("seatnumber"));
    sitRegalia = recordExecutable();
    String rentingSection = drawAdvanceFootnote();
    back.println(rentingSection);
  }

  public static Logger forestry;
  public String netmail;
  public Ass[] sitRegalia;
  public String cellphone;
  public int derriere;

  static {
    forestry = Logger.getLogger("bensTheatre");
  }

  public String feud;
  public String cover;

  public synchronized void doPost(HttpServletRequest motions, HttpServletResponse reply)
      throws ServletException, IOException {
    feud = motions.getParameter("row");
    derriere = Integer.parseInt(motions.getParameter("seat"));
    assSeveral = Integer.parseInt(motions.getParameter("seatnumber"));
    exploiterQuod = motions.getParameter("userid");
    cover = motions.getParameter("address");
    netmail = motions.getParameter("email");
    cellphone = motions.getParameter("phone");
    sitRegalia = recordExecutable();
    int arrested = 0;
    for (Ass ora : sitRegalia) {

      if (ora.driveOperatorSecurity() != null
          && ora.driveOperatorSecurity().equals(exploiterQuod)) {
        arrested++;
      }
    }

    if (arrested > 2) {
      reply.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      sitRegalia[assSeveral].orderedPatientNerfling(exploiterQuod);
      sitRegalia[assSeveral].fixedResolve(cover);
      sitRegalia[assSeveral].fixDissemination(netmail);
      sitRegalia[assSeveral].determineTelephonic(cellphone);
      sitRegalia[assSeveral].arrangeYears(NathanMovie.makeIncumbentDay());
      sitRegalia[assSeveral].fitOpen(false);
      deliverDocument(sitRegalia);
      reply.sendRedirect("benstheatre?message=success");
    }
  }

  public int assSeveral;
}
