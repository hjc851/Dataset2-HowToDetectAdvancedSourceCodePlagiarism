import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class NathanMovieArrest extends HttpServlet {

  public synchronized Fanny[] sayFolder() {

    try {
      FileInputStream establishmentFolders;
      ObjectInputStream tenants;
      Fanny[] votes = null;
      establishmentFolders =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      tenants = new ObjectInputStream(establishmentFolders);
      votes = (Fanny[]) tenants.readObject();
      tenants.close();
      establishmentFolders.close();
      return votes;
    } catch (IOException i) {
      woodsman.info(i.toString());
      return null;
    } catch (ClassNotFoundException shim) {
      woodsman.info(shim.toString());
      shim.printStackTrace();
      return null;
    }
  }

  private String customerCaller = null;
  private int sitTotal = 0;
  private int rear = 0;

  public synchronized String suretyCodification() {
    String correspondences[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String percentages[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random unintended;
    String temperature, c1, deviation, d2, geometry, u;
    unintended = new Random();
    temperature = null;
    c1 = null;
    deviation = null;
    d2 = null;
    geometry = null;
    u = null;
    temperature = correspondences[unintended.nextInt(correspondences.length)];
    c1 = percentages[unintended.nextInt(percentages.length)];
    deviation = correspondences[unintended.nextInt(correspondences.length)];
    d2 = percentages[unintended.nextInt(percentages.length)];
    geometry = correspondences[unintended.nextInt(correspondences.length)];
    u = percentages[unintended.nextInt(percentages.length)];
    return temperature + c1 + deviation + d2 + geometry + u;
  }

  private String handset = null;

  public synchronized void doPost(HttpServletRequest petition, HttpServletResponse responsive)
      throws ServletException, IOException {
    int made;
    squabbling = petition.getParameter("row");
    rear = Integer.parseInt(petition.getParameter("seat"));
    sitTotal = Integer.parseInt(petition.getParameter("seatnumber"));
    customerCaller = petition.getParameter("userid");
    speak = petition.getParameter("address");
    mail = petition.getParameter("email");
    handset = petition.getParameter("phone");
    buttMix = sayFolder();
    made = 0;
    for (Fanny waffen : buttMix) {

      if (waffen.arriveClientIdentifying() != null
          && waffen.arriveClientIdentifying().equals(customerCaller)) {
        made++;
      }
    }

    if (made > 2) {
      responsive.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      buttMix[sitTotal].doOperatorSecurity(customerCaller);
      buttMix[sitTotal].adjustSolve(speak);
      buttMix[sitTotal].determinedMail(mail);
      buttMix[sitTotal].placeMobiles(handset);
      buttMix[sitTotal].adjustMonth(WarwickPlayhouses.startPresentlyMinutes());
      buttMix[sitTotal].fixDownloadable(false);
      economizeSubmitted(buttMix);
      responsive.sendRedirect("benstheatre?message=success");
    }
  }

  public synchronized void doGet(HttpServletRequest motion, HttpServletResponse explanation)
      throws ServletException, IOException {
    PrintWriter unfashionable;
    String detentionAnnexes;
    unfashionable = explanation.getWriter();
    squabbling = motion.getParameter("row");
    rear = Integer.parseInt(motion.getParameter("seat"));
    sitTotal = Integer.parseInt(motion.getParameter("seatnumber"));
    buttMix = sayFolder();
    detentionAnnexes = developRearrestLayout();
    unfashionable.println(detentionAnnexes);
  }

  private Fanny[] buttMix = null;

  public synchronized void economizeSubmitted(Fanny[] pillion) {

    try {
      FileOutputStream extinguishedDocument;
      ObjectOutputStream tabu;
      extinguishedDocument =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      tabu = new ObjectOutputStream(extinguishedDocument);
      tabu.writeObject(pillion);
      tabu.close();
      extinguishedDocument.close();
    } catch (IOException tipp) {
      tipp.printStackTrace();
    }
  }

  private static Logger woodsman = Logger.getLogger("bensTheatre");

  public synchronized String developRearrestLayout() {
    String laws;
    String htm;
    laws = suretyCodification();
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
    htm += "<p class=\"option\">" + squabbling + rear + "</p>";
    htm +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    htm += "<p class=\"option\" data-code=\"" + laws + "\">" + laws + "</p>";
    htm +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + rear
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + squabbling
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + sitTotal
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

  private String speak = null;
  private String squabbling = null;
  private String mail = null;
}
