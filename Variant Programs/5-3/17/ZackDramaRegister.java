import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class ZackDramaRegister extends HttpServlet {
  private static Logger chainsaw;
  private String telefax;
  private String fix;
  private String cellphone;
  private String visitorOwnership;
  private int rump;
  private int behindTurn;
  private String bickering;
  static String tokenish = "ddINPRb";
  private Fanny[] pratBreadth;

  public synchronized void doGet(HttpServletRequest wishes, HttpServletResponse reacted)
      throws ServletException, IOException {
    String minnOuter;
    PrintWriter unfashionable;
    String ticketingWebpage;
    minnOuter = "qUBe";
    unfashionable = reacted.getWriter();
    bickering = wishes.getParameter("row");
    rump = Integer.parseInt(wishes.getParameter("seat"));
    behindTurn = Integer.parseInt(wishes.getParameter("seatnumber"));
    pratBreadth = rereadSubmitted();
    ticketingWebpage = fetchAppointmentLayouts();
    unfashionable.println(ticketingWebpage);
  }

  public synchronized void doPost(HttpServletRequest asking, HttpServletResponse respond)
      throws ServletException, IOException {
    double rolled;
    int arranged;
    rolled = 0.6540134094851084;
    bickering = asking.getParameter("row");
    rump = Integer.parseInt(asking.getParameter("seat"));
    behindTurn = Integer.parseInt(asking.getParameter("seatnumber"));
    visitorOwnership = asking.getParameter("userid");
    fix = asking.getParameter("address");
    telefax = asking.getParameter("email");
    cellphone = asking.getParameter("phone");
    pratBreadth = rereadSubmitted();
    arranged = 0;
    for (Fanny ora : pratBreadth) {

      if (ora.beatLearnerUser() != null && ora.beatLearnerUser().equals(visitorOwnership)) {
        arranged++;
      }
    }

    if (arranged > 2) {
      respond.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      pratBreadth[behindTurn].placePersonName(visitorOwnership);
      pratBreadth[behindTurn].rigidTackle(fix);
      pratBreadth[behindTurn].arrangedInbox(telefax);
      pratBreadth[behindTurn].readyRing(cellphone);
      pratBreadth[behindTurn].fitYear(HansenComedy.takeTopicalPeriod());
      pratBreadth[behindTurn].putAccessible(false);
      avertPaperwork(pratBreadth);
      respond.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized String fetchAppointmentLayouts() {
    int numeration;
    String laws;
    String plugin;
    numeration = -231412929;
    laws = safetyInscribe();
    plugin = "";
    plugin +=
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
    plugin += "<p class=\"option\">" + bickering + rump + "</p>";
    plugin +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    plugin += "<p class=\"option\" data-code=\"" + laws + "\">" + laws + "</p>";
    plugin +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + rump
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + bickering
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + behindTurn
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
    return plugin;
  }

  public synchronized String safetyInscribe() {
    double levelRestricting;
    String correspondences[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String volume[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random arbitrary;
    String k, ap, a2, d2, c1, g;
    levelRestricting = 0.4122667657604393;
    arbitrary = new Random();
    k = correspondences[arbitrary.nextInt(correspondences.length)];
    ap = volume[arbitrary.nextInt(volume.length)];
    a2 = correspondences[arbitrary.nextInt(correspondences.length)];
    d2 = volume[arbitrary.nextInt(volume.length)];
    c1 = correspondences[arbitrary.nextInt(correspondences.length)];
    g = volume[arbitrary.nextInt(volume.length)];
    return k + ap + a2 + d2 + c1 + g;
  }

  public synchronized Fanny[] rereadSubmitted() {
    double thickness;
    thickness = 0.330793864027799;

    try {
      FileInputStream proponentsDatabase;
      ObjectInputStream establishment;
      Fanny[] passengers;
      proponentsDatabase =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      establishment = new ObjectInputStream(proponentsDatabase);
      passengers = (Fanny[]) establishment.readObject();
      establishment.close();
      proponentsDatabase.close();
      return passengers;
    } catch (IOException i) {
      chainsaw.info(i.toString());
      return null;
    } catch (ClassNotFoundException caesium) {
      chainsaw.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public synchronized void avertPaperwork(Fanny[] venues) {
    double amphetamineCompelled;
    amphetamineCompelled = 0.8263662535343512;

    try {
      FileOutputStream unstylishPaperwork;
      ObjectOutputStream retired;
      unstylishPaperwork =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      retired = new ObjectOutputStream(unstylishPaperwork);
      retired.writeObject(venues);
      retired.close();
      unstylishPaperwork.close();
    } catch (IOException voto) {
      voto.printStackTrace();
    }
  }

  static {
    chainsaw = Logger.getLogger("bensTheatre");
  }
}
