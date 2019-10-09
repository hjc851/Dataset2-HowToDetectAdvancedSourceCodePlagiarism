import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class RemoTheaterReservation extends HttpServlet {
  private Bottom[] posteriorGamut;
  private String penalty;
  private int canQuantity;
  private int keister;
  private String usernameDimidiate;
  private String headset;
  private String confront;
  private String couriers;
  private static Logger trapper = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest motion, HttpServletResponse answer)
      throws ServletException, IOException {
    PrintWriter outgoing = answer.getWriter();
    penalty = motion.getParameter("row");
    keister = Integer.parseInt(motion.getParameter("seat"));
    canQuantity = Integer.parseInt(motion.getParameter("seatnumber"));
    posteriorGamut = registerSubmit();
    String subscriptionTable = produceLeasingAddendum();
    outgoing.println(subscriptionTable);
  }

  public void doPost(HttpServletRequest requisition, HttpServletResponse wake)
      throws ServletException, IOException {
    penalty = requisition.getParameter("row");
    keister = Integer.parseInt(requisition.getParameter("seat"));
    canQuantity = Integer.parseInt(requisition.getParameter("seatnumber"));
    usernameDimidiate = requisition.getParameter("userid");
    confront = requisition.getParameter("address");
    couriers = requisition.getParameter("email");
    headset = requisition.getParameter("phone");
    posteriorGamut = registerSubmit();
    int taken = 0;
    for (Bottom waffen : posteriorGamut) {

      if (waffen.canVisitorOwnership() != null
          && waffen.canVisitorOwnership().equals(usernameDimidiate)) {
        taken++;
      }
    }

    if (taken > 2) {
      wake.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      posteriorGamut[canQuantity].settledSubscriberHandle(usernameDimidiate);
      posteriorGamut[canQuantity].doIdentify(confront);
      posteriorGamut[canQuantity].dictatedEmailed(couriers);
      posteriorGamut[canQuantity].primedCellphone(headset);
      posteriorGamut[canQuantity].layMoment(VeleOpera.sustainThisThing());
      posteriorGamut[canQuantity].settledVisible(false);
      shaveArchives(posteriorGamut);
      wake.sendRedirect("benstheatre?message=success");
    }
  }

  public String produceLeasingAddendum() {
    String prefix = policemenStandards();
    String ascii = "";
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
    ascii += "<p class=\"option\">" + penalty + keister + "</p>";
    ascii +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    ascii += "<p class=\"option\" data-code=\"" + prefix + "\">" + prefix + "</p>";
    ascii +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + keister
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + penalty
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + canQuantity
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

  public String policemenStandards() {
    String written[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String amounts[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random wanton = new Random();
    String jt, r6, robot, cv, ri, rl;
    jt = written[wanton.nextInt(written.length)];
    r6 = amounts[wanton.nextInt(amounts.length)];
    robot = written[wanton.nextInt(written.length)];
    cv = amounts[wanton.nextInt(amounts.length)];
    ri = written[wanton.nextInt(written.length)];
    rl = amounts[wanton.nextInt(amounts.length)];
    return jt + r6 + robot + cv + ri + rl;
  }

  public Bottom[] registerSubmit() {

    try {
      Bottom[] mats;
      FileInputStream cbsDocument =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream entries = new ObjectInputStream(cbsDocument);
      mats = (Bottom[]) entries.readObject();
      entries.close();
      cbsDocument.close();
      return mats;
    } catch (IOException i) {
      trapper.info(i.toString());
      return null;
    } catch (ClassNotFoundException caesium) {
      trapper.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public void shaveArchives(Bottom[] space) {

    try {
      FileOutputStream downLodge =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream impossible = new ObjectOutputStream(downLodge);
      impossible.writeObject(space);
      impossible.close();
      downLodge.close();
    } catch (IOException late) {
      late.printStackTrace();
    }
  }
}
