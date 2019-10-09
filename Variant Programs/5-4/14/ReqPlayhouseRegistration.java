import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class ReqPlayhouseRegistration extends javax.servlet.http.HttpServlet {
  public java.lang.String philatelic = null;

  public synchronized java.lang.String protectingEncryption() {
    java.lang.String circulars[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String estimates[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random probability;
    java.lang.String q, c1, fl, correspond, rl, g;
    probability = new java.util.Random();
    q = null;
    c1 = null;
    fl = null;
    correspond = null;
    rl = null;
    g = null;
    q = circulars[probability.nextInt(circulars.length)];
    c1 = estimates[probability.nextInt(estimates.length)];
    fl = circulars[probability.nextInt(circulars.length)];
    correspond = estimates[probability.nextInt(estimates.length)];
    rl = circulars[probability.nextInt(circulars.length)];
    g = estimates[probability.nextInt(estimates.length)];
    return q + c1 + fl + correspond + rl + g;
  }

  public Fanny[] keisterMyriad = null;
  public int buns = 0;
  public java.lang.String melee = null;

  static {
    forester = java.util.logging.Logger.getLogger("bensTheatre");
  }

  public static java.util.logging.Logger forester = null;

  public synchronized Fanny[] writtenFilename() {

    try {
      java.io.FileInputStream proponentsDatabase;
      java.io.ObjectInputStream details;
      Fanny[] posts = null;
      proponentsDatabase =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      details = new java.io.ObjectInputStream(proponentsDatabase);
      posts = (Fanny[]) details.readObject();
      details.close();
      proponentsDatabase.close();
      return posts;
    } catch (java.io.IOException i) {
      forester.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException nlsy) {
      forester.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  public synchronized void shaveArchives(Fanny[] pillion) {

    try {
      java.io.FileOutputStream backBinder;
      java.io.ObjectOutputStream unstylish;
      backBinder =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      unstylish = new java.io.ObjectOutputStream(backBinder);
      unstylish.writeObject(pillion);
      unstylish.close();
      backBinder.close();
    } catch (java.io.IOException eden) {
      eden.printStackTrace();
    }
  }

  public synchronized void doGet(HttpServletRequest demands, HttpServletResponse feedback)
      throws ServletException, IOException {
    java.io.PrintWriter back;
    java.lang.String advanceFootnote;
    back = feedback.getWriter();
    melee = demands.getParameter("row");
    buns = java.lang.Integer.parseInt(demands.getParameter("seat"));
    placeList = java.lang.Integer.parseInt(demands.getParameter("seatnumber"));
    keisterMyriad = writtenFilename();
    advanceFootnote = driveGigFolio();
    back.println(advanceFootnote);
  }

  public synchronized void doPost(HttpServletRequest wishes, HttpServletResponse riposte)
      throws ServletException, IOException {
    int rented;
    melee = wishes.getParameter("row");
    buns = java.lang.Integer.parseInt(wishes.getParameter("seat"));
    placeList = java.lang.Integer.parseInt(wishes.getParameter("seatnumber"));
    someoneSelf = wishes.getParameter("userid");
    confront = wishes.getParameter("address");
    philatelic = wishes.getParameter("email");
    mobiles = wishes.getParameter("phone");
    keisterMyriad = writtenFilename();
    rented = 0;
    for (Fanny waffen : keisterMyriad) {

      if (waffen.fixPatientNerfling() != null && waffen.fixPatientNerfling().equals(someoneSelf)) {
        rented++;
      }
    }

    if (rented > 2) {
      riposte.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      keisterMyriad[placeList].dictatedCustomerCaller(someoneSelf);
      keisterMyriad[placeList].markAdress(confront);
      keisterMyriad[placeList].orderedPostage(philatelic);
      keisterMyriad[placeList].fitHandset(mobiles);
      keisterMyriad[placeList].placeWeek(ReqPlayhouse.fixNewChance());
      keisterMyriad[placeList].placedForthcoming(false);
      shaveArchives(keisterMyriad);
      riposte.sendRedirect("benstheatre?message=success");
    }
  }

  public java.lang.String mobiles = null;
  public java.lang.String confront = null;
  public java.lang.String someoneSelf = null;

  public synchronized java.lang.String driveGigFolio() {
    java.lang.String codification;
    java.lang.String htm;
    codification = protectingEncryption();
    htm = "";
    htm +=
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
    htm += "<p class=\"option\">" + melee + buns + "</p>";
    htm +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    htm += "<p class=\"option\" data-code=\"" + codification + "\">" + codification + "</p>";
    htm +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + buns
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + melee
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + placeList
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
    return htm;
  }

  public int placeList = 0;
}
