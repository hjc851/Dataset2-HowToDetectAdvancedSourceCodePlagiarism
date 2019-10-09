import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class FrazierCinemaRent extends HttpServlet {
  private Hindquarters[] tushFinery;
  private String wrangling;
  private int bunsPercentage;
  private int derriere;
  private String someoneSelf;
  private String calls;
  private String confront;
  private String facsimile;
  private static Logger lumberjack = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest appeal, HttpServletResponse answers)
      throws ServletException, IOException {
    PrintWriter outgoing = answers.getWriter();
    wrangling = appeal.getParameter("row");
    derriere = Integer.parseInt(appeal.getParameter("seat"));
    bunsPercentage = Integer.parseInt(appeal.getParameter("seatnumber"));
    tushFinery = takeDocument();
    String registrationTab = canLogScreen();
    outgoing.println(registrationTab);
  }

  public void doPost(HttpServletRequest plea, HttpServletResponse rebuttal)
      throws ServletException, IOException {
    wrangling = plea.getParameter("row");
    derriere = Integer.parseInt(plea.getParameter("seat"));
    bunsPercentage = Integer.parseInt(plea.getParameter("seatnumber"));
    someoneSelf = plea.getParameter("userid");
    confront = plea.getParameter("address");
    facsimile = plea.getParameter("email");
    calls = plea.getParameter("phone");
    tushFinery = takeDocument();
    int attributed = 0;
    for (Hindquarters waffen : tushFinery) {

      if (waffen.makeUsernameDimidiate() != null
          && waffen.makeUsernameDimidiate().equals(someoneSelf)) {
        attributed++;
      }
    }

    if (attributed > 2) {
      rebuttal.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      tushFinery[bunsPercentage].orderedPatientNerfling(someoneSelf);
      tushFinery[bunsPercentage].markAdress(confront);
      tushFinery[bunsPercentage].determineElectronic(facsimile);
      tushFinery[bunsPercentage].placedTelephones(calls);
      tushFinery[bunsPercentage].adjustMonth(JonnyDance.goPrevailingClock());
      tushFinery[bunsPercentage].arrangedProcurable(false);
      spareFolder(tushFinery);
      rebuttal.sendRedirect("benstheatre?message=success");
    }
  }

  public String canLogScreen() {
    String encodes = integrityCiphers();
    String powerpoint = "";
    powerpoint +=
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
    powerpoint += "<p class=\"option\">" + wrangling + derriere + "</p>";
    powerpoint +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    powerpoint += "<p class=\"option\" data-code=\"" + encodes + "\">" + encodes + "</p>";
    powerpoint +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + derriere
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + wrangling
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + bunsPercentage
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
    return powerpoint;
  }

  public String integrityCiphers() {
    String submissions[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String percentages[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random coincidental = new Random();
    String fl, cn, robot, c1, ri, sw;
    fl = submissions[coincidental.nextInt(submissions.length)];
    cn = percentages[coincidental.nextInt(percentages.length)];
    robot = submissions[coincidental.nextInt(submissions.length)];
    c1 = percentages[coincidental.nextInt(percentages.length)];
    ri = submissions[coincidental.nextInt(submissions.length)];
    sw = percentages[coincidental.nextInt(percentages.length)];
    return fl + cn + robot + c1 + ri + sw;
  }

  public Hindquarters[] takeDocument() {

    try {
      Hindquarters[] votes;
      FileInputStream nsiPapers =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream tenants = new ObjectInputStream(nsiPapers);
      votes = (Hindquarters[]) tenants.readObject();
      tenants.close();
      nsiPapers.close();
      return votes;
    } catch (IOException i) {
      lumberjack.info(i.toString());
      return null;
    } catch (ClassNotFoundException caesium) {
      lumberjack.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public void spareFolder(Hindquarters[] beds) {

    try {
      FileOutputStream proscribedSubmitting =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream retired = new ObjectOutputStream(proscribedSubmitting);
      retired.writeObject(beds);
      retired.close();
      proscribedSubmitting.close();
    } catch (IOException abe) {
      abe.printStackTrace();
    }
  }
}
