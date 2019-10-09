import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class ZackDramaRegister extends javax.servlet.http.HttpServlet {
  private Behind[] tooshiePortfolio = null;
  private java.lang.String ranking = null;
  private int backsideNumeral = 0;
  private int prat = 0;
  private java.lang.String usernameDimidiate = null;
  private java.lang.String device = null;
  private java.lang.String tackle = null;
  private java.lang.String courier = null;
  private static java.util.logging.Logger woodworker =
      java.util.logging.Logger.getLogger("bensTheatre");

  public synchronized void doGet(HttpServletRequest complaint, HttpServletResponse react)
      throws ServletException, IOException {
    java.io.PrintWriter retired = react.getWriter();
    ranking = complaint.getParameter("row");
    prat = java.lang.Integer.parseInt(complaint.getParameter("seat"));
    backsideNumeral = java.lang.Integer.parseInt(complaint.getParameter("seatnumber"));
    tooshiePortfolio = wrotePapers();
    java.lang.String rentPaper = goReservationPageboy();
    retired.println(rentPaper);
  }

  public synchronized void doPost(HttpServletRequest ordered, HttpServletResponse replies)
      throws ServletException, IOException {
    ranking = ordered.getParameter("row");
    prat = java.lang.Integer.parseInt(ordered.getParameter("seat"));
    backsideNumeral = java.lang.Integer.parseInt(ordered.getParameter("seatnumber"));
    usernameDimidiate = ordered.getParameter("userid");
    tackle = ordered.getParameter("address");
    courier = ordered.getParameter("email");
    device = ordered.getParameter("phone");
    tooshiePortfolio = wrotePapers();
    int rented = 0;
    for (Behind fh : tooshiePortfolio) {

      if (fh.produceWearerMap() != null && fh.produceWearerMap().equals(usernameDimidiate)) {
        rented++;
      }
    }

    if (rented > 2) {
      replies.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      tooshiePortfolio[backsideNumeral].rigidAdopterTag(usernameDimidiate);
      tooshiePortfolio[backsideNumeral].fixFix(tackle);
      tooshiePortfolio[backsideNumeral].rigidCouriers(courier);
      tooshiePortfolio[backsideNumeral].dictatedEarpiece(device);
      tooshiePortfolio[backsideNumeral].rigidAmount(HansenComedy.haveCirculatingPeriods());
      tooshiePortfolio[backsideNumeral].putAccessible(false);
      preventBinder(tooshiePortfolio);
      replies.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized java.lang.String goReservationPageboy() {
    java.lang.String guideline = peaceEncodes();
    java.lang.String firefox = "";
    firefox +=
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
    firefox += "<p class=\"option\">" + ranking + prat + "</p>";
    firefox +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    firefox += "<p class=\"option\" data-code=\"" + guideline + "\">" + guideline + "</p>";
    firefox +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + prat
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + ranking
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + backsideNumeral
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
    return firefox;
  }

  public synchronized java.lang.String peaceEncodes() {
    java.lang.String epistles[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String figures[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random haphazardly = new java.util.Random();
    java.lang.String frequency = null,
        antigen = null,
        amplitude = null,
        anachronistic = null,
        fgf = null,
        c3 = null;
    frequency = epistles[haphazardly.nextInt(epistles.length)];
    antigen = figures[haphazardly.nextInt(figures.length)];
    amplitude = epistles[haphazardly.nextInt(epistles.length)];
    anachronistic = figures[haphazardly.nextInt(figures.length)];
    fgf = epistles[haphazardly.nextInt(epistles.length)];
    c3 = figures[haphazardly.nextInt(figures.length)];
    return frequency + antigen + amplitude + anachronistic + fgf + c3;
  }

  public synchronized Behind[] wrotePapers() {

    try {
      Behind[] ridings = null;
      java.io.FileInputStream nihDocket =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream nih = new java.io.ObjectInputStream(nihDocket);
      ridings = (Behind[]) nih.readObject();
      nih.close();
      nihDocket.close();
      return ridings;
    } catch (java.io.IOException i) {
      woodworker.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cmu) {
      woodworker.info(cmu.toString());
      cmu.printStackTrace();
      return null;
    }
  }

  public synchronized void preventBinder(Behind[] slots) {

    try {
      java.io.FileOutputStream exteriorReadme =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream down = new java.io.ObjectOutputStream(exteriorReadme);
      down.writeObject(slots);
      down.close();
      exteriorReadme.close();
    } catch (java.io.IOException adult) {
      adult.printStackTrace();
    }
  }
}
