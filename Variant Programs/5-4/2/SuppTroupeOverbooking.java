import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class SuppTroupeOverbooking extends javax.servlet.http.HttpServlet {
  public Invest[] bunsNumber = null;

  public synchronized java.lang.String safeguardGuidelines() {
    java.lang.String words[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String volume[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random weird = new java.util.Random();
    java.lang.String ordinate = null, r6 = null, a2 = null, ap = null, geometry = null, e = null;
    ordinate = words[weird.nextInt(words.length)];
    r6 = volume[weird.nextInt(volume.length)];
    a2 = words[weird.nextInt(words.length)];
    ap = volume[weird.nextInt(volume.length)];
    geometry = words[weird.nextInt(words.length)];
    e = volume[weird.nextInt(volume.length)];
    return ordinate + r6 + a2 + ap + geometry + e;
  }

  public int sternProportion = 0;
  public int induct = 0;
  public java.lang.String deal = null;

  public synchronized java.lang.String findTicketHomepage() {
    java.lang.String standards = safeguardGuidelines();
    java.lang.String parser = "";
    parser +=
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
    parser += "<p class=\"option\">" + wrangling + induct + "</p>";
    parser +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    parser += "<p class=\"option\" data-code=\"" + standards + "\">" + standards + "</p>";
    parser +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + induct
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + wrangling
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + sternProportion
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
    return parser;
  }

  public synchronized void doPost(HttpServletRequest requisition, HttpServletResponse preparedness)
      throws ServletException, IOException {
    wrangling = requisition.getParameter("row");
    induct = java.lang.Integer.parseInt(requisition.getParameter("seat"));
    sternProportion = java.lang.Integer.parseInt(requisition.getParameter("seatnumber"));
    someoneSelf = requisition.getParameter("userid");
    deal = requisition.getParameter("address");
    send = requisition.getParameter("email");
    mobiles = requisition.getParameter("phone");
    bunsNumber = tellReadme();
    int reported = 0;
    for (Invest waffen : bunsNumber) synx10(waffen, reported);

    if (reported > 2) {
      preparedness.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      bunsNumber[sternProportion].adjustClientIdentifying(someoneSelf);
      bunsNumber[sternProportion].bentAnswer(deal);
      bunsNumber[sternProportion].settledCorrespondence(send);
      bunsNumber[sternProportion].situatedTelephony(mobiles);
      bunsNumber[sternProportion].fitYear(SuppTroupe.sustainThisThing());
      bunsNumber[sternProportion].determineDistributed(false);
      keepSubmit(bunsNumber);
      preparedness.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized void doGet(HttpServletRequest ordered, HttpServletResponse explanation)
      throws ServletException, IOException {
    java.io.PrintWriter dead = explanation.getWriter();
    wrangling = ordered.getParameter("row");
    induct = java.lang.Integer.parseInt(ordered.getParameter("seat"));
    sternProportion = java.lang.Integer.parseInt(ordered.getParameter("seatnumber"));
    bunsNumber = tellReadme();
    java.lang.String rentPaper = findTicketHomepage();
    dead.println(rentPaper);
  }

  public java.lang.String send = null;

  static {
    homesteader = java.util.logging.Logger.getLogger("bensTheatre");
  }

  public synchronized Invest[] tellReadme() {

    try {
      Invest[] jobs = null;
      java.io.FileInputStream electedFilename =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream nii = new java.io.ObjectInputStream(electedFilename);
      jobs = (Invest[]) nii.readObject();
      nii.close();
      electedFilename.close();
      return jobs;
    } catch (java.io.IOException i) {
      homesteader.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException stan) {
      homesteader.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public java.lang.String mobiles = null;
  public static java.util.logging.Logger homesteader = null;
  public java.lang.String someoneSelf = null;
  public java.lang.String wrangling = null;

  public synchronized void keepSubmit(Invest[] member) {

    try {
      java.io.FileOutputStream unfashionableFilename =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream unfashionable =
          new java.io.ObjectOutputStream(unfashionableFilename);
      unfashionable.writeObject(member);
      unfashionable.close();
      unfashionableFilename.close();
    } catch (java.io.IOException con) {
      con.printStackTrace();
    }
  }

  private synchronized void synx10(Invest waffen, int reported)
      throws ServletException, IOException {

    if (waffen.goExploiterQuod() != null && waffen.goExploiterQuod().equals(someoneSelf)) {
      reported++;
    }
  }
}
