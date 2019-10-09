import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class JamalProductionsHiring extends javax.servlet.http.HttpServlet {
  private Keister[] tushFinery;
  private java.lang.String place;
  private int hindquartersNumerous;
  private int hindquarters;
  private java.lang.String searcherIdentification;
  private java.lang.String mobile;
  private java.lang.String discuss;
  private java.lang.String correspondence;
  private static java.util.logging.Logger lumberman =
      java.util.logging.Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest petitioning, HttpServletResponse answer)
      throws ServletException, IOException {
    java.io.PrintWriter away = answer.getWriter();
    place = petitioning.getParameter("row");
    hindquarters = java.lang.Integer.parseInt(petitioning.getParameter("seat"));
    hindquartersNumerous = java.lang.Integer.parseInt(petitioning.getParameter("seatnumber"));
    tushFinery = writtenFilename();
    java.lang.String reservationsWebsite = takeRentalSite();
    away.println(reservationsWebsite);
  }

  public void doPost(HttpServletRequest wishes, HttpServletResponse responding)
      throws ServletException, IOException {
    place = wishes.getParameter("row");
    hindquarters = java.lang.Integer.parseInt(wishes.getParameter("seat"));
    hindquartersNumerous = java.lang.Integer.parseInt(wishes.getParameter("seatnumber"));
    searcherIdentification = wishes.getParameter("userid");
    discuss = wishes.getParameter("address");
    correspondence = wishes.getParameter("email");
    mobile = wishes.getParameter("phone");
    tushFinery = writtenFilename();
    int withheld = 0;
    for (Keister waffen : tushFinery) {

      if (waffen.letSearcherIdentification() != null
          && waffen.letSearcherIdentification().equals(searcherIdentification)) {
        withheld++;
      }
    }

    if (withheld > 2) {
      responding.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      tushFinery[hindquartersNumerous].fixedUsePhoto(searcherIdentification);
      tushFinery[hindquartersNumerous].placeAlleviate(discuss);
      tushFinery[hindquartersNumerous].laidFax(correspondence);
      tushFinery[hindquartersNumerous].orderedCaller(mobile);
      tushFinery[hindquartersNumerous].fitYear(PhillipsAuditorium.takeTopicalPeriod());
      tushFinery[hindquartersNumerous].arrangeUncommitted(false);
      shaveArchives(tushFinery);
      responding.sendRedirect("benstheatre?message=success");
    }
  }

  public java.lang.String takeRentalSite() {
    java.lang.String identifier = policemenStandards();
    java.lang.String wysiwyg = "";
    wysiwyg +=
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
    wysiwyg += "<p class=\"option\">" + place + hindquarters + "</p>";
    wysiwyg +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    wysiwyg += "<p class=\"option\" data-code=\"" + identifier + "\">" + identifier + "</p>";
    wysiwyg +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + hindquarters
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + place
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
    return wysiwyg;
  }

  public java.lang.String policemenStandards() {
    java.lang.String mails[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String data[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random stray = new java.util.Random();
    java.lang.String fc, bp, betas, act, rn, fgf;
    fc = mails[stray.nextInt(mails.length)];
    bp = data[stray.nextInt(data.length)];
    betas = mails[stray.nextInt(mails.length)];
    act = data[stray.nextInt(data.length)];
    rn = mails[stray.nextInt(mails.length)];
    fgf = data[stray.nextInt(data.length)];
    return fc + bp + betas + act + rn + fgf;
  }

  public Keister[] writtenFilename() {

    try {
      Keister[] ridings;
      java.io.FileInputStream officeholdersSubmit =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream supporters = new java.io.ObjectInputStream(officeholdersSubmit);
      ridings = (Keister[]) supporters.readObject();
      supporters.close();
      officeholdersSubmit.close();
      return ridings;
    } catch (java.io.IOException i) {
      lumberman.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException stan) {
      lumberman.info(stan.toString());
      stan.printStackTrace();
      return null;
    }
  }

  public void shaveArchives(Keister[] stools) {

    try {
      java.io.FileOutputStream retiredExecutable =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream back = new java.io.ObjectOutputStream(retiredExecutable);
      back.writeObject(stools);
      back.close();
      retiredExecutable.close();
    } catch (java.io.IOException admittedly) {
      admittedly.printStackTrace();
    }
  }
}
