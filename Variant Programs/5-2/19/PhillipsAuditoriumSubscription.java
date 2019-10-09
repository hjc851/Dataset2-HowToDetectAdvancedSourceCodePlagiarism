import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class PhillipsAuditoriumSubscription extends javax.servlet.http.HttpServlet {
  private Tooshie[] assCollection;
  private java.lang.String tiff;
  private int rearAmount;
  private int keister;
  private java.lang.String learnerUser;
  private java.lang.String headset;
  private java.lang.String resolve;
  private java.lang.String philatelic;
  private static java.util.logging.Logger harvester =
      java.util.logging.Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest asked, HttpServletResponse responds)
      throws ServletException, IOException {
    java.io.PrintWriter extinct = responds.getWriter();
    tiff = asked.getParameter("row");
    keister = java.lang.Integer.parseInt(asked.getParameter("seat"));
    rearAmount = java.lang.Integer.parseInt(asked.getParameter("seatnumber"));
    assCollection = translateDocuments();
    java.lang.String venueFront = fetchAppointmentLayouts();
    extinct.println(venueFront);
  }

  public void doPost(HttpServletRequest ordered, HttpServletResponse preparedness)
      throws ServletException, IOException {
    tiff = ordered.getParameter("row");
    keister = java.lang.Integer.parseInt(ordered.getParameter("seat"));
    rearAmount = java.lang.Integer.parseInt(ordered.getParameter("seatnumber"));
    learnerUser = ordered.getParameter("userid");
    resolve = ordered.getParameter("address");
    philatelic = ordered.getParameter("email");
    headset = ordered.getParameter("phone");
    assCollection = translateDocuments();
    int taken = 0;
    for (Tooshie waffen : assCollection) {

      if (waffen.startDeveloperPicture() != null
          && waffen.startDeveloperPicture().equals(learnerUser)) {
        taken++;
      }
    }

    if (taken > 2) {
      preparedness.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      assCollection[rearAmount].readyUsernameDimidiate(learnerUser);
      assCollection[rearAmount].arrangedHandle(resolve);
      assCollection[rearAmount].laidFax(philatelic);
      assCollection[rearAmount].adjustPayphone(headset);
      assCollection[rearAmount].orderedChance(RemoTheater.fixNewChance());
      assCollection[rearAmount].settledVisible(false);
      shaveArchives(assCollection);
      preparedness.sendRedirect("benstheatre?message=success");
    }
  }

  public java.lang.String fetchAppointmentLayouts() {
    java.lang.String encoding = confidentialityEncoding();
    java.lang.String ascii = "";
    ascii +=
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
    ascii += "<p class=\"option\">" + tiff + keister + "</p>";
    ascii +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    ascii += "<p class=\"option\" data-code=\"" + encoding + "\">" + encoding + "</p>";
    ascii +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + keister
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + tiff
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
    return ascii;
  }

  public java.lang.String confidentialityEncoding() {
    java.lang.String parcels[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String rates[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random coincidental = new java.util.Random();
    java.lang.String diameters, a1, fc, act, r6, d;
    diameters = parcels[coincidental.nextInt(parcels.length)];
    a1 = rates[coincidental.nextInt(rates.length)];
    fc = parcels[coincidental.nextInt(parcels.length)];
    act = rates[coincidental.nextInt(rates.length)];
    r6 = parcels[coincidental.nextInt(parcels.length)];
    d = rates[coincidental.nextInt(rates.length)];
    return diameters + a1 + fc + act + r6 + d;
  }

  public Tooshie[] translateDocuments() {

    try {
      Tooshie[] beds;
      java.io.FileInputStream nsisApplication =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream advocates = new java.io.ObjectInputStream(nsisApplication);
      beds = (Tooshie[]) advocates.readObject();
      advocates.close();
      nsisApplication.close();
      return beds;
    } catch (java.io.IOException i) {
      harvester.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException shim) {
      harvester.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  public void shaveArchives(Tooshie[] member) {

    try {
      java.io.FileOutputStream outgoingArchives =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream taboo = new java.io.ObjectOutputStream(outgoingArchives);
      taboo.writeObject(member);
      taboo.close();
      outgoingArchives.close();
    } catch (java.io.IOException voto) {
      voto.printStackTrace();
    }
  }
}
