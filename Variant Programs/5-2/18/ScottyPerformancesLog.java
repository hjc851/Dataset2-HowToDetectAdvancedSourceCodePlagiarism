import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class ScottyPerformancesLog extends javax.servlet.http.HttpServlet {
  private Posterior[] investRaft;
  private java.lang.String ranked;
  private int rearAmount;
  private int buns;
  private java.lang.String operatorSecurity;
  private java.lang.String mobile;
  private java.lang.String destination;
  private java.lang.String post;
  private static java.util.logging.Logger consignor =
      java.util.logging.Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest appeal, HttpServletResponse reply)
      throws ServletException, IOException {
    java.io.PrintWriter prohibited = reply.getWriter();
    ranked = appeal.getParameter("row");
    buns = java.lang.Integer.parseInt(appeal.getParameter("seat"));
    rearAmount = java.lang.Integer.parseInt(appeal.getParameter("seatnumber"));
    investRaft = tellReadme();
    java.lang.String venueFront = letRegistrationTab();
    prohibited.println(venueFront);
  }

  public void doPost(HttpServletRequest wishes, HttpServletResponse responsive)
      throws ServletException, IOException {
    ranked = wishes.getParameter("row");
    buns = java.lang.Integer.parseInt(wishes.getParameter("seat"));
    rearAmount = java.lang.Integer.parseInt(wishes.getParameter("seatnumber"));
    operatorSecurity = wishes.getParameter("userid");
    destination = wishes.getParameter("address");
    post = wishes.getParameter("email");
    mobile = wishes.getParameter("phone");
    investRaft = tellReadme();
    int made = 0;
    for (Posterior ora : investRaft) {

      if (ora.goExploiterQuod() != null && ora.goExploiterQuod().equals(operatorSecurity)) {
        made++;
      }
    }

    if (made > 2) {
      responsive.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      investRaft[rearAmount].orderedPatientNerfling(operatorSecurity);
      investRaft[rearAmount].markAdress(destination);
      investRaft[rearAmount].dictatedEmailed(post);
      investRaft[rearAmount].markMobile(mobile);
      investRaft[rearAmount].arrangedSentence(IainAmphitheatre.catchRifeWhen());
      investRaft[rearAmount].settledVisible(false);
      helpData(investRaft);
      responsive.sendRedirect("benstheatre?message=success");
    }
  }

  public java.lang.String letRegistrationTab() {
    java.lang.String standards = firewallEncode();
    java.lang.String metadata = "";
    metadata +=
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
    metadata += "<p class=\"option\">" + ranked + buns + "</p>";
    metadata +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    metadata += "<p class=\"option\" data-code=\"" + standards + "\">" + standards + "</p>";
    metadata +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + buns
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + ranked
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + rearAmount
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
    return metadata;
  }

  public java.lang.String firewallEncode() {
    java.lang.String cards[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String rates[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random coincidental = new java.util.Random();
    java.lang.String momenta, cc, betas, fgf, r6, u;
    momenta = cards[coincidental.nextInt(cards.length)];
    cc = rates[coincidental.nextInt(rates.length)];
    betas = cards[coincidental.nextInt(cards.length)];
    fgf = rates[coincidental.nextInt(rates.length)];
    r6 = cards[coincidental.nextInt(cards.length)];
    u = rates[coincidental.nextInt(rates.length)];
    return momenta + cc + betas + fgf + r6 + u;
  }

  public Posterior[] tellReadme() {

    try {
      Posterior[] votes;
      java.io.FileInputStream nsiPapers =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream proponents = new java.io.ObjectInputStream(nsiPapers);
      votes = (Posterior[]) proponents.readObject();
      proponents.close();
      nsiPapers.close();
      return votes;
    } catch (java.io.IOException i) {
      consignor.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cesium) {
      consignor.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  public void helpData(Posterior[] member) {

    try {
      java.io.FileOutputStream prohibitedPapers =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream back = new java.io.ObjectOutputStream(prohibitedPapers);
      back.writeObject(member);
      back.close();
      prohibitedPapers.close();
    } catch (java.io.IOException officio) {
      officio.printStackTrace();
    }
  }
}
