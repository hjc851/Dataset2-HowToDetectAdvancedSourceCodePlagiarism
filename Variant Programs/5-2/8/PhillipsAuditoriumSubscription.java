import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class PhillipsAuditoriumSubscription extends javax.servlet.http.HttpServlet {
  private Buttocks[] bumSelection;
  private java.lang.String succession;
  private int fannyCome;
  private int tail;
  private java.lang.String usePhoto;
  private java.lang.String device;
  private java.lang.String treat;
  private java.lang.String courier;
  private static java.util.logging.Logger chainsaw =
      java.util.logging.Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest ask, HttpServletResponse feedback)
      throws ServletException, IOException {
    java.io.PrintWriter exterior = feedback.getWriter();
    succession = ask.getParameter("row");
    tail = java.lang.Integer.parseInt(ask.getParameter("seat"));
    fannyCome = java.lang.Integer.parseInt(ask.getParameter("seatnumber"));
    bumSelection = reciteSubmitting();
    java.lang.String orderingPagination = developRearrestLayout();
    exterior.println(orderingPagination);
  }

  public void doPost(HttpServletRequest ordered, HttpServletResponse preparedness)
      throws ServletException, IOException {
    succession = ordered.getParameter("row");
    tail = java.lang.Integer.parseInt(ordered.getParameter("seat"));
    fannyCome = java.lang.Integer.parseInt(ordered.getParameter("seatnumber"));
    usePhoto = ordered.getParameter("userid");
    treat = ordered.getParameter("address");
    courier = ordered.getParameter("email");
    device = ordered.getParameter("phone");
    bumSelection = reciteSubmitting();
    int recorded = 0;
    for (Buttocks fh : bumSelection) {

      if (fh.takeUsageFinger() != null && fh.takeUsageFinger().equals(usePhoto)) {
        recorded++;
      }
    }

    if (recorded > 2) {
      preparedness.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      bumSelection[fannyCome].fitConsumerIdem(usePhoto);
      bumSelection[fannyCome].orderedRectify(treat);
      bumSelection[fannyCome].solidifyingPhilatelic(courier);
      bumSelection[fannyCome].arrangeSwitchboard(device);
      bumSelection[fannyCome].situatedMinutes(AllanSalle.sustainThisThing());
      bumSelection[fannyCome].solidifyingAccessed(false);
      economiseInitiate(bumSelection);
      preparedness.sendRedirect("benstheatre?message=success");
    }
  }

  public java.lang.String developRearrestLayout() {
    java.lang.String cypher = insecurityGuideline();
    java.lang.String filename = "";
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
    filename += "<p class=\"option\">" + succession + tail + "</p>";
    filename +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    filename += "<p class=\"option\" data-code=\"" + cypher + "\">" + cypher + "</p>";
    filename +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + tail
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + succession
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + fannyCome
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

  public java.lang.String insecurityGuideline() {
    java.lang.String mails[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    java.lang.String population[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    java.util.Random unselected = new java.util.Random();
    java.lang.String rl, ao, amplitude, d2, detector, r8;
    rl = mails[unselected.nextInt(mails.length)];
    ao = population[unselected.nextInt(population.length)];
    amplitude = mails[unselected.nextInt(mails.length)];
    d2 = population[unselected.nextInt(population.length)];
    detector = mails[unselected.nextInt(mails.length)];
    r8 = population[unselected.nextInt(population.length)];
    return rl + ao + amplitude + d2 + detector + r8;
  }

  public Buttocks[] reciteSubmitting() {

    try {
      Buttocks[] constituencies;
      java.io.FileInputStream incumbentsSubmitting =
          new java.io.FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectInputStream nii = new java.io.ObjectInputStream(incumbentsSubmitting);
      constituencies = (Buttocks[]) nii.readObject();
      nii.close();
      incumbentsSubmitting.close();
      return constituencies;
    } catch (java.io.IOException i) {
      chainsaw.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException caesium) {
      chainsaw.info(caesium.toString());
      caesium.printStackTrace();
      return null;
    }
  }

  public void economiseInitiate(Buttocks[] stalls) {

    try {
      java.io.FileOutputStream stunnedFolder =
          new java.io.FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      java.io.ObjectOutputStream taboo = new java.io.ObjectOutputStream(stunnedFolder);
      taboo.writeObject(stalls);
      taboo.close();
      stunnedFolder.close();
    } catch (java.io.IOException tipp) {
      tipp.printStackTrace();
    }
  }
}
