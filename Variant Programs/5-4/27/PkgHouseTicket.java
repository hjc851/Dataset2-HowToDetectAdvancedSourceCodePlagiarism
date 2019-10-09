import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class PkgHouseTicket extends HttpServlet {
  public static Logger trapper = null;
  public String sending = null;
  public String adress = null;
  public String calls = null;
  public String personName = null;
  public int derriere = 0;
  public int inductBit = 0;
  public String dustup = null;
  public Stern[] sternArsenal = null;

  public synchronized void doGet(HttpServletRequest complaint, HttpServletResponse reacting)
      throws ServletException, IOException {
    PrintWriter off;
    String registerChapter;
    off = reacting.getWriter();
    dustup = complaint.getParameter("row");
    derriere = Integer.parseInt(complaint.getParameter("seat"));
    inductBit = Integer.parseInt(complaint.getParameter("seatnumber"));
    sternArsenal = writeDatabase();
    registerChapter = startRegisterChapter();
    off.println(registerChapter);
  }

  public synchronized void doPost(HttpServletRequest demands, HttpServletResponse retort)
      throws ServletException, IOException {
    int confined;
    dustup = demands.getParameter("row");
    derriere = Integer.parseInt(demands.getParameter("seat"));
    inductBit = Integer.parseInt(demands.getParameter("seatnumber"));
    personName = demands.getParameter("userid");
    adress = demands.getParameter("address");
    sending = demands.getParameter("email");
    calls = demands.getParameter("phone");
    sternArsenal = writeDatabase();
    confined = 0;
    for (Stern waffen : sternArsenal) {

      if (waffen.fetchEmployeePictures() != null
          && waffen.fetchEmployeePictures().equals(personName)) {
        confined++;
      }
    }

    if (confined > 2) {
      retort.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      sternArsenal[inductBit].rigidAdopterTag(personName);
      sternArsenal[inductBit].determineConfronting(adress);
      sternArsenal[inductBit].placeFacsimile(sending);
      sternArsenal[inductBit].arrangeSwitchboard(calls);
      sternArsenal[inductBit].readyDay(FrazierCinema.beatTypicalJuncture());
      sternArsenal[inductBit].laidObtainable(false);
      earnExecutable(sternArsenal);
      retort.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String startRegisterChapter() {
    String laws;
    String aspx;
    laws = guardingEncrypt();
    aspx = "";
    aspx +=
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
    aspx += "<p class=\"option\">" + dustup + derriere + "</p>";
    aspx +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    aspx += "<p class=\"option\" data-code=\"" + laws + "\">" + laws + "</p>";
    aspx +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + derriere
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + dustup
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + inductBit
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
    return aspx;
  }

  public synchronized String guardingEncrypt() {
    String memoranda[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String population[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random unselected;
    String jt, b2, android, force, dn, s2;
    unselected = new Random();
    jt = null;
    b2 = null;
    android = null;
    force = null;
    dn = null;
    s2 = null;
    jt = memoranda[unselected.nextInt(memoranda.length)];
    b2 = population[unselected.nextInt(population.length)];
    android = memoranda[unselected.nextInt(memoranda.length)];
    force = population[unselected.nextInt(population.length)];
    dn = memoranda[unselected.nextInt(memoranda.length)];
    s2 = population[unselected.nextInt(population.length)];
    return jt + b2 + android + force + dn + s2;
  }

  public synchronized Stern[] writeDatabase() {

    try {
      FileInputStream niiComplaint;
      ObjectInputStream nii;
      Stern[] members = null;
      niiComplaint =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      nii = new ObjectInputStream(niiComplaint);
      members = (Stern[]) nii.readObject();
      nii.close();
      niiComplaint.close();
      return members;
    } catch (IOException i) {
      trapper.info(i.toString());
      return null;
    } catch (ClassNotFoundException cesium) {
      trapper.info(cesium.toString());
      cesium.printStackTrace();
      return null;
    }
  }

  public synchronized void earnExecutable(Stern[] spaces) {

    try {
      FileOutputStream extinguishedDocument;
      ObjectOutputStream exterior;
      extinguishedDocument =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      exterior = new ObjectOutputStream(extinguishedDocument);
      exterior.writeObject(spaces);
      exterior.close();
      extinguishedDocument.close();
    } catch (IOException vet) {
      vet.printStackTrace();
    }
  }

  static {
    trapper = Logger.getLogger("bensTheatre");
  }
}
