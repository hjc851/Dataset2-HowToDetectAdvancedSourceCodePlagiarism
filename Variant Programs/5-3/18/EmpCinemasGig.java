import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class EmpCinemasGig extends javax.servlet.http.HttpServlet {

  public synchronized void doPost(HttpServletRequest ordered, HttpServletResponse wake)
      throws ServletException, IOException {
    controversy = ordered.getParameter("row");
    bottom = java.lang.Integer.parseInt(ordered.getParameter("seat"));
    hindquartersNumerous = java.lang.Integer.parseInt(ordered.getParameter("seatnumber"));
    visitorOwnership = ordered.getParameter("userid");
    rectify = ordered.getParameter("address");
    postal = ordered.getParameter("email");
    headphone = ordered.getParameter("phone");
    buttMix = translateDocuments();
    int planned = 0;
    for (Fanny fh : buttMix) {

      if (fh.fetchEmployeePictures() != null
          && fh.fetchEmployeePictures().equals(visitorOwnership)) {
        planned++;
      }
    }

    if (planned > 2) {
      wake.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      buttMix[hindquartersNumerous].layUsabilityCard(visitorOwnership);
      buttMix[hindquartersNumerous].placedDirect(rectify);
      buttMix[hindquartersNumerous].dictatedEmailed(postal);
      buttMix[hindquartersNumerous].bentDial(headphone);
      buttMix[hindquartersNumerous].layMoment(IainAmphitheatre.arriveFlowMonth());
      buttMix[hindquartersNumerous].putAccessible(false);
      reviveDocket(buttMix);
      wake.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized void doGet(HttpServletRequest asks, HttpServletResponse feedback)
      throws ServletException, IOException {
    java.io.PrintWriter impermissible = feedback.getWriter();
    controversy = asks.getParameter("row");
    bottom = java.lang.Integer.parseInt(asks.getParameter("seat"));
    hindquartersNumerous = java.lang.Integer.parseInt(asks.getParameter("seatnumber"));
    buttMix = translateDocuments();
    java.lang.String orderingPagination = drawAdvanceFootnote();
    impermissible.println(orderingPagination);
  }

  public synchronized java.lang.String policemenStandards() {
    java.lang.String memoranda[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String proportion[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random haphazard = new java.util.Random();
    java.lang.String jt, c2, d2, force, r6, s2;
    jt = memoranda[haphazard.nextInt(memoranda.length)];
    c2 = proportion[haphazard.nextInt(proportion.length)];
    d2 = memoranda[haphazard.nextInt(memoranda.length)];
    force = proportion[haphazard.nextInt(proportion.length)];
    r6 = memoranda[haphazard.nextInt(memoranda.length)];
    s2 = proportion[haphazard.nextInt(proportion.length)];
    return jt + c2 + d2 + force + r6 + s2;
  }

  public static java.util.logging.Logger voyage = java.util.logging.Logger.getLogger("bensTheatre");

  public synchronized Fanny[] translateDocuments() {

    try {
      Fanny[] stalls;
      java.io.FileInputStream nsiPapers =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream officeholders = new java.io.ObjectInputStream(nsiPapers);
      stalls = (Fanny[]) officeholders.readObject();
      officeholders.close();
      nsiPapers.close();
      return stalls;
    } catch (java.io.IOException i) {
      voyage.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException caesium) {
      voyage.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public int hindquartersNumerous;
  public java.lang.String controversy;

  public synchronized void reviveDocket(Fanny[] mats) {

    try {
      java.io.FileOutputStream proscribedSubmitting =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream off = new java.io.ObjectOutputStream(proscribedSubmitting);
      off.writeObject(mats);
      off.close();
      proscribedSubmitting.close();
    } catch (java.io.IOException exwife) {
      exwife.printStackTrace();
    }
  }

  public java.lang.String visitorOwnership;
  public Fanny[] buttMix;
  public java.lang.String rectify;
  public java.lang.String postal;
  public java.lang.String headphone;
  public int bottom;

  public synchronized java.lang.String drawAdvanceFootnote() {
    java.lang.String standards = policemenStandards();
    java.lang.String powerpoint = "";
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
    powerpoint += "<p class=\"option\">" + controversy + bottom + "</p>";
    powerpoint +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    powerpoint += "<p class=\"option\" data-code=\"" + standards + "\">" + standards + "</p>";
    powerpoint +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + bottom
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + controversy
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
            + "</html>";
    return powerpoint;
  }
}
