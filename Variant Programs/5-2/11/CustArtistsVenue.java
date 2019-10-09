import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class CustArtistsVenue extends HttpServlet {
  private Invest[] hindquartersPalette;
  private String bickering;
  private int investFrequency;
  private int stern;
  private String customerCaller;
  private String telephony;
  private String cover;
  private String send;
  private static Logger forester = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest petitioning, HttpServletResponse replies)
      throws ServletException, IOException {
    PrintWriter kayoed = replies.getWriter();
    bickering = petitioning.getParameter("row");
    stern = Integer.parseInt(petitioning.getParameter("seat"));
    investFrequency = Integer.parseInt(petitioning.getParameter("seatnumber"));
    hindquartersPalette = writtenFilename();
    String appointmentLayouts = developRearrestLayout();
    kayoed.println(appointmentLayouts);
  }

  public void doPost(HttpServletRequest complaint, HttpServletResponse responding)
      throws ServletException, IOException {
    bickering = complaint.getParameter("row");
    stern = Integer.parseInt(complaint.getParameter("seat"));
    investFrequency = Integer.parseInt(complaint.getParameter("seatnumber"));
    customerCaller = complaint.getParameter("userid");
    cover = complaint.getParameter("address");
    send = complaint.getParameter("email");
    telephony = complaint.getParameter("phone");
    hindquartersPalette = writtenFilename();
    int entered = 0;
    for (Invest fh : hindquartersPalette) {

      if (fh.drawPersonName() != null && fh.drawPersonName().equals(customerCaller)) {
        entered++;
      }
    }

    if (entered > 2) {
      responding.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      hindquartersPalette[investFrequency].placedCustomersIbid(customerCaller);
      hindquartersPalette[investFrequency].fixedResolve(cover);
      hindquartersPalette[investFrequency].rigidCouriers(send);
      hindquartersPalette[investFrequency].readyRing(telephony);
      hindquartersPalette[investFrequency].placedWhen(JonnyDance.letAfootHours());
      hindquartersPalette[investFrequency].determineDistributed(false);
      keepSubmit(hindquartersPalette);
      responding.sendRedirect("benstheatre?message=success");
    }
  }

  public String developRearrestLayout() {
    String codex = guardPassword();
    String filename = "";
    filename +=
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
    filename += "<p class=\"option\">" + bickering + stern + "</p>";
    filename +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    filename += "<p class=\"option\" data-code=\"" + codex + "\">" + codex + "</p>";
    filename +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + stern
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + bickering
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + investFrequency
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
    return filename;
  }

  public String guardPassword() {
    String correspondance[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String proportion[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random unintended = new Random();
    String fl, activating, intercept, exponent, ip, rn;
    fl = correspondance[unintended.nextInt(correspondance.length)];
    activating = proportion[unintended.nextInt(proportion.length)];
    intercept = correspondance[unintended.nextInt(correspondance.length)];
    exponent = proportion[unintended.nextInt(proportion.length)];
    ip = correspondance[unintended.nextInt(correspondance.length)];
    rn = proportion[unintended.nextInt(proportion.length)];
    return fl + activating + intercept + exponent + ip + rn;
  }

  public Invest[] writtenFilename() {

    try {
      Invest[] spots;
      FileInputStream entriesLodge =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream officeholders = new ObjectInputStream(entriesLodge);
      spots = (Invest[]) officeholders.readObject();
      officeholders.close();
      entriesLodge.close();
      return spots;
    } catch (IOException i) {
      forester.info(i.toString());
      return null;
    } catch (ClassNotFoundException intrasentential) {
      forester.info(intrasentential.toString());
      intrasentential.printStackTrace();
      return null;
    }
  }

  public void keepSubmit(Invest[] spaces) {

    try {
      FileOutputStream stunnedFolder =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream outer = new ObjectOutputStream(stunnedFolder);
      outer.writeObject(spaces);
      outer.close();
      stunnedFolder.close();
    } catch (IOException voto) {
      voto.printStackTrace();
    }
  }
}
