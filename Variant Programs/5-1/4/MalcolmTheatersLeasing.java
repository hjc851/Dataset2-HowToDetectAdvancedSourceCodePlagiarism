import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class MalcolmTheatersLeasing extends HttpServlet {
  private Posterior[] assCollection;
  private String dustup;
  private int tushFigure;
  private int bottom;
  private String someoneSelf;
  private String mobiles;
  private String treat;
  private String emailed;
  private static Logger trapper = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest quest, HttpServletResponse explanation)
      throws ServletException, IOException {
    PrintWriter stunned = explanation.getWriter();
    dustup = quest.getParameter("row");
    bottom = Integer.parseInt(quest.getParameter("seat"));
    tushFigure = Integer.parseInt(quest.getParameter("seatnumber"));
    assCollection = wrotePapers();
    String arrestContents = beatArrestContents();
    stunned.println(arrestContents);
  }

  public void doPost(HttpServletRequest requisition, HttpServletResponse responsive)
      throws ServletException, IOException {
    dustup = requisition.getParameter("row");
    bottom = Integer.parseInt(requisition.getParameter("seat"));
    tushFigure = Integer.parseInt(requisition.getParameter("seatnumber"));
    someoneSelf = requisition.getParameter("userid");
    treat = requisition.getParameter("address");
    emailed = requisition.getParameter("email");
    mobiles = requisition.getParameter("phone");
    assCollection = wrotePapers();
    int attributed = 0;
    for (Posterior ora : assCollection) {

      if (ora.letSearcherIdentification() != null
          && ora.letSearcherIdentification().equals(someoneSelf)) {
        attributed++;
      }
    }

    if (attributed > 2) {
      responsive.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      assCollection[tushFigure].laidEnjoyerMilad(someoneSelf);
      assCollection[tushFigure].determinedWork(treat);
      assCollection[tushFigure].bentCourier(emailed);
      assCollection[tushFigure].settledLandline(mobiles);
      assCollection[tushFigure].markHours(YyyDramatics.sustainThisThing());
      assCollection[tushFigure].arrangeUncommitted(false);
      keepSubmit(assCollection);
      responsive.sendRedirect("benstheatre?message=success");
    }
  }

  public String beatArrestContents() {
    String laws = firewallEncode();
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
    plugin += "<p class=\"option\">" + dustup + bottom + "</p>";
    plugin +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    plugin += "<p class=\"option\" data-code=\"" + laws + "\">" + laws + "</p>";
    plugin +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + bottom
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + dustup
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + tushFigure
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

  public String firewallEncode() {
    String correspondance[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String proportions[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random weird = new Random();
    String fl, r8, eigenvalue, cf, eq, cp;
    fl = correspondance[weird.nextInt(correspondance.length)];
    r8 = proportions[weird.nextInt(proportions.length)];
    eigenvalue = correspondance[weird.nextInt(correspondance.length)];
    cf = proportions[weird.nextInt(proportions.length)];
    eq = correspondance[weird.nextInt(correspondance.length)];
    cp = proportions[weird.nextInt(proportions.length)];
    return fl + r8 + eigenvalue + cf + eq + cp;
  }

  public Posterior[] wrotePapers() {

    try {
      Posterior[] member;
      FileInputStream niiComplaint =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream supporters = new ObjectInputStream(niiComplaint);
      member = (Posterior[]) supporters.readObject();
      supporters.close();
      niiComplaint.close();
      return member;
    } catch (IOException i) {
      trapper.info(i.toString());
      return null;
    } catch (ClassNotFoundException caesium) {
      trapper.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public void keepSubmit(Posterior[] elections) {

    try {
      FileOutputStream extinctComplaint =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream outer = new ObjectOutputStream(extinctComplaint);
      outer.writeObject(elections);
      outer.close();
      extinctComplaint.close();
    } catch (IOException libris) {
      libris.printStackTrace();
    }
  }
}
