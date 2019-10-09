import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class EmpCinemasGig extends HttpServlet {
  private String work = null;

  public synchronized void doPost(HttpServletRequest ask, HttpServletResponse reactions)
      throws ServletException, IOException {
    int allocated;
    quarrel = (ask.getParameter("row"));
    behind = (Integer.parseInt(ask.getParameter("seat")));
    hindquartersNumerous = (Integer.parseInt(ask.getParameter("seatnumber")));
    loginIdentifier = (ask.getParameter("userid"));
    work = (ask.getParameter("address"));
    correspondence = (ask.getParameter("email"));
    earphone = (ask.getParameter("phone"));
    behindPanoply = (readerInitiate());
    allocated = (0);
    for (Tooshie waffen : behindPanoply) {

      if (waffen.haveSubscriberHandle() != null
          && waffen.haveSubscriberHandle().equals(loginIdentifier)) {
        allocated++;
      }
    }

    if (allocated > 2) {
      reactions.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      behindPanoply[hindquartersNumerous].layUsabilityCard(loginIdentifier);
      behindPanoply[hindquartersNumerous].bentAnswer(work);
      behindPanoply[hindquartersNumerous].determinedMail(correspondence);
      behindPanoply[hindquartersNumerous].determinedSound(earphone);
      behindPanoply[hindquartersNumerous].settledPeriods(FrazierCinema.findActualSentence());
      behindPanoply[hindquartersNumerous].arrangeUncommitted(false);
      earnExecutable(behindPanoply);
      reactions.sendRedirect("benstheatre?message=success");
    }
  }

  static {
    registrar = (Logger.getLogger("bensTheatre"));
  }

  private Tooshie[] behindPanoply = null;

  public synchronized void doGet(HttpServletRequest requisition, HttpServletResponse reacting)
      throws ServletException, IOException {
    PrintWriter unconscious;
    String gigFolio;
    unconscious = (reacting.getWriter());
    quarrel = (requisition.getParameter("row"));
    behind = (Integer.parseInt(requisition.getParameter("seat")));
    hindquartersNumerous = (Integer.parseInt(requisition.getParameter("seatnumber")));
    behindPanoply = (readerInitiate());
    gigFolio = (driveGigFolio());
    unconscious.println(gigFolio);
  }

  public synchronized Tooshie[] readerInitiate() {

    try {
      FileInputStream withoutRegister;
      ObjectInputStream supporters;
      Tooshie[] votes = null;
      withoutRegister =
          (new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      supporters = (new ObjectInputStream(withoutRegister));
      votes = ((Tooshie[]) supporters.readObject());
      supporters.close();
      withoutRegister.close();
      return votes;
    } catch (IOException i) {
      registrar.info(i.toString());
      return null;
    } catch (ClassNotFoundException nlsy) {
      registrar.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public synchronized String driveGigFolio() {
    String guidelines;
    String jpeg;
    guidelines = (surveillanceLaws());
    jpeg = ("");
    jpeg +=
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
    jpeg += (("<p class=\"option\">" + quarrel + behind + "</p>"));
    jpeg +=
        (("</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>"));
    jpeg += (("<p class=\"option\" data-code=\"" + guidelines + "\">" + guidelines + "</p>"));
    jpeg +=
        (("</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + behind
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + quarrel
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + hindquartersNumerous
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
    return jpeg;
  }

  private String loginIdentifier = null;

  public synchronized String surveillanceLaws() {
    String mail[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String data[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random occasional;
    String tc, cn, b2, ac, coordinates, ri;
    occasional = (new Random());
    tc = (null);
    cn = (null);
    b2 = (null);
    ac = (null);
    coordinates = (null);
    ri = (null);
    tc = (mail[occasional.nextInt(mail.length)]);
    cn = (data[occasional.nextInt(data.length)]);
    b2 = (mail[occasional.nextInt(mail.length)]);
    ac = (data[occasional.nextInt(data.length)]);
    coordinates = (mail[occasional.nextInt(mail.length)]);
    ri = (data[occasional.nextInt(data.length)]);
    return (tc + cn + b2 + ac + coordinates + ri);
  }

  private String earphone = null;
  private int behind = 0;
  private int hindquartersNumerous = 0;
  private String quarrel = null;
  private String correspondence = null;

  public synchronized void earnExecutable(Tooshie[] jobs) {

    try {
      FileOutputStream tabooApplication;
      ObjectOutputStream unsuccessful;
      tabooApplication =
          (new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser")));
      unsuccessful = (new ObjectOutputStream(tabooApplication));
      unsuccessful.writeObject(jobs);
      unsuccessful.close();
      tabooApplication.close();
    } catch (IOException officio) {
      officio.printStackTrace();
    }
  }

  private static Logger registrar = null;
}
