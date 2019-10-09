import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class HansenComedyOrdering extends HttpServlet {
  private Buttocks[] buttMix;
  private String wrangle;
  private int posteriorAct;
  private int induct;
  private String loginIdentifier;
  private String earphone;
  private String resolve;
  private String courier;
  private static Logger woodcutter = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest ordered, HttpServletResponse responsive)
      throws ServletException, IOException {
    PrintWriter outer = responsive.getWriter();
    wrangle = ordered.getParameter("row");
    induct = Integer.parseInt(ordered.getParameter("seat"));
    posteriorAct = Integer.parseInt(ordered.getParameter("seatnumber"));
    buttMix = recordExecutable();
    String reservationsWebsite = takeRentalSite();
    outer.println(reservationsWebsite);
  }

  public void doPost(HttpServletRequest motion, HttpServletResponse explanation)
      throws ServletException, IOException {
    wrangle = motion.getParameter("row");
    induct = Integer.parseInt(motion.getParameter("seat"));
    posteriorAct = Integer.parseInt(motion.getParameter("seatnumber"));
    loginIdentifier = motion.getParameter("userid");
    resolve = motion.getParameter("address");
    courier = motion.getParameter("email");
    earphone = motion.getParameter("phone");
    buttMix = recordExecutable();
    int reported = 0;
    for (Buttocks ora : buttMix) {

      if (ora.fetchEmployeePictures() != null
          && ora.fetchEmployeePictures().equals(loginIdentifier)) {
        reported++;
      }
    }

    if (reported > 2) {
      explanation.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      buttMix[posteriorAct].markSearcherIdentification(loginIdentifier);
      buttMix[posteriorAct].markAdress(resolve);
      buttMix[posteriorAct].determineElectronic(courier);
      buttMix[posteriorAct].doLaptop(earphone);
      buttMix[posteriorAct].fitYear(JamalProductions.comeLatestClip());
      buttMix[posteriorAct].orderedGetable(false);
      preventBinder(buttMix);
      explanation.sendRedirect("benstheatre?message=success");
    }
  }

  public String takeRentalSite() {
    String cypher = integrityCiphers();
    String pdf = "";
    pdf +=
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
    pdf += "<p class=\"option\">" + wrangle + induct + "</p>";
    pdf +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    pdf += "<p class=\"option\" data-code=\"" + cypher + "\">" + cypher + "</p>";
    pdf +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + induct
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + wrangle
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
    return pdf;
  }

  public String integrityCiphers() {
    String written[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String population[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random unselected = new Random();
    String tc, acetal, impedance, c1, fgf, r6;
    tc = written[unselected.nextInt(written.length)];
    acetal = population[unselected.nextInt(population.length)];
    impedance = written[unselected.nextInt(written.length)];
    c1 = population[unselected.nextInt(population.length)];
    fgf = written[unselected.nextInt(written.length)];
    r6 = population[unselected.nextInt(population.length)];
    return tc + acetal + impedance + c1 + fgf + r6;
  }

  public Buttocks[] recordExecutable() {

    try {
      Buttocks[] stalls;
      FileInputStream cbsDocument =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream nih = new ObjectInputStream(cbsDocument);
      stalls = (Buttocks[]) nih.readObject();
      nih.close();
      cbsDocument.close();
      return stalls;
    } catch (IOException i) {
      woodcutter.info(i.toString());
      return null;
    } catch (ClassNotFoundException stan) {
      woodcutter.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public void preventBinder(Buttocks[] spaces) {

    try {
      FileOutputStream prohibitedPapers =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream unconscious = new ObjectOutputStream(prohibitedPapers);
      unconscious.writeObject(spaces);
      unconscious.close();
      prohibitedPapers.close();
    } catch (IOException con) {
      con.printStackTrace();
    }
  }
}
