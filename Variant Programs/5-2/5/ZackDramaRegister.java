import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class ZackDramaRegister extends HttpServlet {
  private Tush[] canSuite;
  private String round;
  private int rearAmount;
  private int hindquarters;
  private String usernameDimidiate;
  private String mobiles;
  private String alleviate;
  private String courier;
  private static Logger homesteader = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest invitation, HttpServletResponse rejoinder)
      throws ServletException, IOException {
    PrintWriter kayoed = rejoinder.getWriter();
    round = invitation.getParameter("row");
    hindquarters = Integer.parseInt(invitation.getParameter("seat"));
    rearAmount = Integer.parseInt(invitation.getParameter("seatnumber"));
    canSuite = translateDocuments();
    String registerChapter = generateHiringSheet();
    kayoed.println(registerChapter);
  }

  public void doPost(HttpServletRequest demands, HttpServletResponse preparedness)
      throws ServletException, IOException {
    round = demands.getParameter("row");
    hindquarters = Integer.parseInt(demands.getParameter("seat"));
    rearAmount = Integer.parseInt(demands.getParameter("seatnumber"));
    usernameDimidiate = demands.getParameter("userid");
    alleviate = demands.getParameter("address");
    courier = demands.getParameter("email");
    mobiles = demands.getParameter("phone");
    canSuite = translateDocuments();
    int recorded = 0;
    for (Tush fh : canSuite) {

      if (fh.conveyAdopterTag() != null && fh.conveyAdopterTag().equals(usernameDimidiate)) {
        recorded++;
      }
    }

    if (recorded > 2) {
      preparedness.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      canSuite[rearAmount].dictatedCustomerCaller(usernameDimidiate);
      canSuite[rearAmount].arrangedHandle(alleviate);
      canSuite[rearAmount].primedMailing(courier);
      canSuite[rearAmount].bentDial(mobiles);
      canSuite[rearAmount].laidClip(SuppTroupe.drawStreamWeek());
      canSuite[rearAmount].situatedAvailability(false);
      resurrectPapers(canSuite);
      preparedness.sendRedirect("benstheatre?message=success");
    }
  }

  public String generateHiringSheet() {
    String encryption = surveillanceLaws();
    String htm = "";
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
    htm += "<p class=\"option\">" + round + hindquarters + "</p>";
    htm +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    htm += "<p class=\"option\" data-code=\"" + encryption + "\">" + encryption + "</p>";
    htm +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + hindquarters
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + round
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
    return htm;
  }

  public String surveillanceLaws() {
    String correspondance[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String names[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random randomization = new Random();
    String emf, a1, robot, force, manifold, r6;
    emf = correspondance[randomization.nextInt(correspondance.length)];
    a1 = names[randomization.nextInt(names.length)];
    robot = correspondance[randomization.nextInt(correspondance.length)];
    force = names[randomization.nextInt(names.length)];
    manifold = correspondance[randomization.nextInt(correspondance.length)];
    r6 = names[randomization.nextInt(names.length)];
    return emf + a1 + robot + force + manifold + r6;
  }

  public Tush[] translateDocuments() {

    try {
      Tush[] chairs;
      FileInputStream withoutRegister =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream nih = new ObjectInputStream(withoutRegister);
      chairs = (Tush[]) nih.readObject();
      nih.close();
      withoutRegister.close();
      return chairs;
    } catch (IOException i) {
      homesteader.info(i.toString());
      return null;
    } catch (ClassNotFoundException cathode) {
      homesteader.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public void resurrectPapers(Tush[] posts) {

    try {
      FileOutputStream outerSubmitted =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream unstylish = new ObjectOutputStream(outerSubmitted);
      unstylish.writeObject(posts);
      unstylish.close();
      outerSubmitted.close();
    } catch (IOException libris) {
      libris.printStackTrace();
    }
  }
}
