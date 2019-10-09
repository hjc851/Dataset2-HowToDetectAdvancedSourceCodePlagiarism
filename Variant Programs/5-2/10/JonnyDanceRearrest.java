import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class JonnyDanceRearrest extends HttpServlet {
  private Fanny[] keisterMyriad;
  private String wrangle;
  private int tailMany;
  private int prat;
  private String searcherIdentification;
  private String headphone;
  private String tackle;
  private String send;
  private static Logger consignor = Logger.getLogger("bensTheatre");

  public void doGet(HttpServletRequest wishes, HttpServletResponse responsive)
      throws ServletException, IOException {
    PrintWriter impossible = responsive.getWriter();
    wrangle = wishes.getParameter("row");
    prat = Integer.parseInt(wishes.getParameter("seat"));
    tailMany = Integer.parseInt(wishes.getParameter("seatnumber"));
    keisterMyriad = readerInitiate();
    String hiringSheet = arriveOrderingPagination();
    impossible.println(hiringSheet);
  }

  public void doPost(HttpServletRequest quest, HttpServletResponse feedback)
      throws ServletException, IOException {
    wrangle = quest.getParameter("row");
    prat = Integer.parseInt(quest.getParameter("seat"));
    tailMany = Integer.parseInt(quest.getParameter("seatnumber"));
    searcherIdentification = quest.getParameter("userid");
    tackle = quest.getParameter("address");
    send = quest.getParameter("email");
    headphone = quest.getParameter("phone");
    keisterMyriad = readerInitiate();
    int engaged = 0;
    for (Fanny waffen : keisterMyriad) {

      if (waffen.makeUsernameDimidiate() != null
          && waffen.makeUsernameDimidiate().equals(searcherIdentification)) {
        engaged++;
      }
    }

    if (engaged > 2) {
      feedback.sendRedirect("benstheatre?message=limitexceeded");
    } else {
      keisterMyriad[tailMany].situatedDeveloperPicture(searcherIdentification);
      keisterMyriad[tailMany].placeAlleviate(tackle);
      keisterMyriad[tailMany].prepareAddress(send);
      keisterMyriad[tailMany].placedTelephones(headphone);
      keisterMyriad[tailMany].readyDay(NathanMovie.findActualSentence());
      keisterMyriad[tailMany].placeDisposable(false);
      earnExecutable(keisterMyriad);
      feedback.sendRedirect("benstheatre?message=success");
    }
  }

  public String arriveOrderingPagination() {
    String law = guardPassword();
    String meta = "";
    meta +=
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
    meta += "<p class=\"option\">" + wrangle + prat + "</p>";
    meta +=
        "</div>\n"
            + "      <div class=\"security\">\n"
            + "        <p class=\"heading\">Security Code:</p>";
    meta += "<p class=\"option\" data-code=\"" + law + "\">" + law + "</p>";
    meta +=
        "</div>\n"
            + "\n"
            + "      <form method=\"post\" action=\"./booking\">\n"
            + "        <input type=\"hidden\" name=\"seat\" value=\""
            + prat
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"row\" value=\""
            + wrangle
            + "\" />\n"
            + "        <input type=\"hidden\" name=\"seatnumber\" value=\""
            + tailMany
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
    return meta;
  }

  public String guardPassword() {
    String mail[] = {
      "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S",
      "T", "U", "V", "W", "X", "Y", "Z"
    };
    String digits[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Random probability = new Random();
    String jt, activating, coefficient, fgf, c1, s2;
    jt = mail[probability.nextInt(mail.length)];
    activating = digits[probability.nextInt(digits.length)];
    coefficient = mail[probability.nextInt(mail.length)];
    fgf = digits[probability.nextInt(digits.length)];
    c1 = mail[probability.nextInt(mail.length)];
    s2 = digits[probability.nextInt(digits.length)];
    return jt + activating + coefficient + fgf + c1 + s2;
  }

  public Fanny[] readerInitiate() {

    try {
      Fanny[] members;
      FileInputStream entriesLodge =
          new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectInputStream adherents = new ObjectInputStream(entriesLodge);
      members = (Fanny[]) adherents.readObject();
      adherents.close();
      entriesLodge.close();
      return members;
    } catch (IOException i) {
      consignor.info(i.toString());
      return null;
    } catch (ClassNotFoundException cathode) {
      consignor.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public void earnExecutable(Fanny[] slots) {

    try {
      FileOutputStream unstylishPaperwork =
          new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));
      ObjectOutputStream proscribed = new ObjectOutputStream(unstylishPaperwork);
      proscribed.writeObject(slots);
      proscribed.close();
      unstylishPaperwork.close();
    } catch (IOException aba) {
      aba.printStackTrace();
    }
  }
}
