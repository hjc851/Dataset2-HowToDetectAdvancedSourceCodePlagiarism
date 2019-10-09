import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class CustArtistsVenue extends javax.servlet.http.HttpServlet {
  private Ass[] placeAlign;
  private java.lang.String place;
  private int tooshieMultiple;
  private int bum;
  private java.lang.String developerPicture;
  private java.lang.String call;
  private java.lang.String alleviate;
  private java.lang.String url;
  private static java.util.logging.Logger woodsman =
      java.util.logging.Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest plea, HttpServletResponse reacted)
      throws ServletException, IOException {
    java.io.PrintWriter outer = reacted.getWriter();
    place = plea.getParameter("row");
    bum = java.lang.Integer.parseInt(plea.getParameter("seat"));
    tooshieMultiple = java.lang.Integer.parseInt(plea.getParameter("seatnumber"));
    placeAlign = quoteData();
    java.lang.String reservingWeb = makeOverbookingText();
    outer.println(reservingWeb);
  }

  public void doPost(HttpServletRequest bespeak, HttpServletResponse rejoinder)
      throws ServletException, IOException {
    place = bespeak.getParameter("row");
    bum = java.lang.Integer.parseInt(bespeak.getParameter("seat"));
    tooshieMultiple = java.lang.Integer.parseInt(bespeak.getParameter("seatnumber"));
    developerPicture = bespeak.getParameter("userid");
    alleviate = bespeak.getParameter("address");
    url = bespeak.getParameter("email");
    call = bespeak.getParameter("phone");
    placeAlign = quoteData();
    int arranged = 0;
    for (Ass fh : placeAlign) {

      if (fh.fetchEmployeePictures() != null
          && fh.fetchEmployeePictures().equals(developerPicture)) {
        arranged++;
      }
    }

    if (arranged > 2) {
      rejoinder.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      placeAlign[tooshieMultiple].determinedViewerEst(developerPicture);
      placeAlign[tooshieMultiple].readyCover(alleviate);
      placeAlign[tooshieMultiple].dictatedEmailed(url);
      placeAlign[tooshieMultiple].placeMobiles(call);
      placeAlign[tooshieMultiple].arrangeYears(ScottyPerformances.comeLatestClip());
      placeAlign[tooshieMultiple].primedAcquirable(false);
      spareFolder(placeAlign);
      rejoinder.sendRedirect("benstheatre?message=success");
    }
  }

  public java.lang.String makeOverbookingText() {
    java.lang.String statute = guardPassword();
    java.lang.String macros = "";
    macros +=
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
    macros += "<p class=\"option\">" + place + bum + "</p>";
    macros +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    macros += "<p class=\"option\" data-code=\"" + statute + "\">" + statute + "</p>";
    macros +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + bum
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + place
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + tooshieMultiple
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
    return macros;
  }

  public java.lang.String guardPassword() {
    java.lang.String mailings[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String totals[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random wanton = new java.util.Random();
    java.lang.String emf, carboxylate, fc, adc, ip, c3;
    emf = mailings[wanton.nextInt(mailings.length)];
    carboxylate = totals[wanton.nextInt(totals.length)];
    fc = mailings[wanton.nextInt(mailings.length)];
    adc = totals[wanton.nextInt(totals.length)];
    ip = mailings[wanton.nextInt(mailings.length)];
    c3 = totals[wanton.nextInt(totals.length)];
    return emf + carboxylate + fc + adc + ip + c3;
  }

  public Ass[] quoteData() {

    try {
      Ass[] space;
      java.io.FileInputStream tenantsDocuments =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream elected = new java.io.ObjectInputStream(tenantsDocuments);
      space = (Ass[]) elected.readObject();
      elected.close();
      tenantsDocuments.close();
      return space;
    } catch (java.io.IOException i) {
      woodsman.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cesium) {
      woodsman.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  public void spareFolder(Ass[] posts) {

    try {
      java.io.FileOutputStream unstylishPaperwork =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream forbidden = new java.io.ObjectOutputStream(unstylishPaperwork);
      forbidden.writeObject(posts);
      forbidden.close();
      unstylishPaperwork.close();
    } catch (java.io.IOException abel) {
      abel.printStackTrace();
    }
  }
}
