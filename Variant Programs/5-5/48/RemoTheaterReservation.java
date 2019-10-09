import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

public class RemoTheaterReservation extends javax.servlet.http.HttpServlet {
  private static final String synX5650String = "benstheatre?message=success";
  private static final boolean synX5649boolean = false;
  private static final String synX5648String = "benstheatre?message=limitexceeded";
  private static final int synX5647int = 2;
  private static final int synX5646int = 0;
  private static final String synX5645String = "phone";
  private static final String synX5644String = "email";
  private static final String synX5643String = "address";
  private static final String synX5642String = "userid";
  private static final String synX5641String = "seatnumber";
  private static final String synX5640String = "seat";
  private static final String synX5639String = "row";
  private static final double synX5638double = 0.1304984220141404;
  private static final String synX5637String = "9";
  private static final String synX5636String = "8";
  private static final String synX5635String = "7";
  private static final String synX5634String = "6";
  private static final String synX5633String = "5";
  private static final String synX5632String = "4";
  private static final String synX5631String = "3";
  private static final String synX5630String = "2";
  private static final String synX5629String = "1";
  private static final String synX5628String = "0";
  private static final String synX5627String = "Z";
  private static final String synX5626String = "Y";
  private static final String synX5625String = "X";
  private static final String synX5624String = "W";
  private static final String synX5623String = "V";
  private static final String synX5622String = "U";
  private static final String synX5621String = "T";
  private static final String synX5620String = "S";
  private static final String synX5619String = "R";
  private static final String synX5618String = "Q";
  private static final String synX5617String = "P";
  private static final String synX5616String = "O";
  private static final String synX5615String = "N";
  private static final String synX5614String = "M";
  private static final String synX5613String = "L";
  private static final String synX5612String = "K";
  private static final String synX5611String = "J";
  private static final String synX5610String = "I";
  private static final String synX5609String = "H";
  private static final String synX5608String = "G";
  private static final String synX5607String = "F";
  private static final String synX5606String = "E";
  private static final String synX5605String = "D";
  private static final String synX5604String = "C";
  private static final String synX5603String = "B";
  private static final String synX5602String = "A";
  private static final int synX5601int = -514669244;
  private static final String synX5600String = "seatnumber";
  private static final String synX5599String = "seat";
  private static final String synX5598String = "row";
  private static final String synX5597String = "dDdwsVhMV";
  private static final String synX5596String = "/WEB-INF/bookingData.ser";
  private static final String synX5595String = "cNjyzZcQ2dnOXuz";
  private static final String synX5594String = "</html>";
  private static final String synX5593String = "  </body>\t\n";
  private static final String synX5592String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX5591String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX5590String = "    </footer>\n";
  private static final String synX5589String = "      </div>\n";
  private static final String synX5588String = "        <p>c3063467</p>\n";
  private static final String synX5587String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX5586String = "      <div class=\"author\">\n";
  private static final String synX5585String = "    <footer>\n";
  private static final String synX5584String = "    </article>\n";
  private static final String synX5583String = "      </form>\n";
  private static final String synX5582String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX5581String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX5580String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX5579String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX5578String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX5577String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX5576String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX5575String = "\" />\n";
  private static final String synX5574String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX5573String = "\" />\n";
  private static final String synX5572String =
      "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX5571String = "\" />\n";
  private static final String synX5570String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX5569String =
      "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX5568String = "\n";
  private static final String synX5567String = "</div>\n";
  private static final String synX5566String = "</p>";
  private static final String synX5565String = "\">";
  private static final String synX5564String = "<p class=\"option\" data-code=\"";
  private static final String synX5563String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX5562String = "      <div class=\"security\">\n";
  private static final String synX5561String = "</div>\n";
  private static final String synX5560String = "</p>";
  private static final String synX5559String = "<p class=\"option\">";
  private static final String synX5558String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX5557String = "      <div class=\"selected\">\n";
  private static final String synX5556String = "      <h2>Your Selection</h2>\n";
  private static final String synX5555String = "    <article>\n";
  private static final String synX5554String = "    </header>\n";
  private static final String synX5553String = "      <h1>Seat Booking</h1>\n";
  private static final String synX5552String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX5551String = "    <header>\n";
  private static final String synX5550String = "  <body class=\"booking\">\n";
  private static final String synX5549String = "  </head>\n";
  private static final String synX5548String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX5547String = "    <![endif]-->\n";
  private static final String synX5546String = "      </script>\n";
  private static final String synX5545String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX5544String = "    <!--[if IE]>\n";
  private static final String synX5543String = "    <title>Seat Booking</title>\n";
  private static final String synX5542String = "    <meta charset=utf-8>\n";
  private static final String synX5541String = "  <head>\n";
  private static final String synX5540String = "<html lang=\"en\">\n";
  private static final String synX5539String = "<!DOCTYPE html>\n";
  private static final String synX5538String = "";
  private static final double synX5537double = 0.5130526170920887;
  private static final String synX5536String = "/WEB-INF/bookingData.ser";
  private static final double synX5535double = 0.2014647883748668;
  private java.lang.String cellphone;

  static {
    register = java.util.logging.Logger.getLogger("bensTheatre");
  }

  private int rear;

  public synchronized Buttocks[] sayFolder() {
    double nbrNecessities = synX5535double;

    try {
      Buttocks[] ridings;
      java.io.FileInputStream nsiPapers =
          new java.io.FileInputStream(getServletContext().getRealPath(synX5536String));
      java.io.ObjectInputStream nsi = new java.io.ObjectInputStream(nsiPapers);
      ridings = (Buttocks[]) nsi.readObject();
      nsi.close();
      nsiPapers.close();
      return ridings;
    } catch (java.io.IOException i) {
      register.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException nlsy) {
      register.info(nlsy.toString());
      nlsy.printStackTrace();
      return null;
    }
  }

  private java.lang.String wrangle;
  private int tushFigure;
  private static java.util.logging.Logger register;

  public synchronized java.lang.String becomeVenueFront() {
    double johannes = synX5537double;
    java.lang.String identifier = protectingEncryption();
    java.lang.String wysiwyg = synX5538String;
    wysiwyg +=
        wysiwyg
            + synX5539String
            + synX5540String
            + synX5541String
            + synX5542String
            + synX5543String
            + synX5544String
            + synX5545String
            + synX5546String
            + synX5547String
            + synX5548String
            + synX5549String
            + synX5550String
            + synX5551String
            + synX5552String
            + synX5553String
            + synX5554String
            + synX5555String
            + synX5556String
            + synX5557String
            + synX5558String;
    wysiwyg += wysiwyg + synX5559String + wrangle + rear + synX5560String;
    wysiwyg += wysiwyg + synX5561String + synX5562String + synX5563String;
    wysiwyg += wysiwyg + synX5564String + identifier + synX5565String + identifier + synX5566String;
    wysiwyg +=
        wysiwyg
            + synX5567String
            + synX5568String
            + synX5569String
            + synX5570String
            + rear
            + synX5571String
            + synX5572String
            + wrangle
            + synX5573String
            + synX5574String
            + tushFigure
            + synX5575String
            + synX5576String
            + synX5577String
            + synX5578String
            + synX5579String
            + synX5580String
            + synX5581String
            + synX5582String
            + synX5583String
            + synX5584String
            + synX5585String
            + synX5586String
            + synX5587String
            + synX5588String
            + synX5589String
            + synX5590String
            + synX5591String
            + synX5592String
            + synX5593String
            + synX5594String;
    return wysiwyg;
  }

  private java.lang.String url;
  private java.lang.String employeePictures;

  public synchronized void deliverDocument(Buttocks[] votes) {
    String maximum = synX5595String;

    try {
      java.io.FileOutputStream kayoedDocket =
          new java.io.FileOutputStream(getServletContext().getRealPath(synX5596String));
      java.io.ObjectOutputStream exterior = new java.io.ObjectOutputStream(kayoedDocket);
      exterior.writeObject(votes);
      exterior.close();
      kayoedDocket.close();
    } catch (java.io.IOException afterwards) {
      afterwards.printStackTrace();
    }
  }

  private java.lang.String identify;

  public synchronized void doGet(HttpServletRequest application, HttpServletResponse responded)
      throws ServletException, IOException {
    String universal = synX5597String;
    java.io.PrintWriter unconscious = responded.getWriter();
    wrangle = application.getParameter(synX5598String);
    rear = java.lang.Integer.parseInt(application.getParameter(synX5599String));
    tushFigure = java.lang.Integer.parseInt(application.getParameter(synX5600String));
    sitRegalia = sayFolder();
    java.lang.String rentPaper = becomeVenueFront();
    unconscious.println(rentPaper);
  }

  static final String modicum = "6CdVA";

  public synchronized java.lang.String protectingEncryption() {
    int primal = synX5601int;
    java.lang.String correspondence[] = {
      synX5602String,
      synX5603String,
      synX5604String,
      synX5605String,
      synX5606String,
      synX5607String,
      synX5608String,
      synX5609String,
      synX5610String,
      synX5611String,
      synX5612String,
      synX5613String,
      synX5614String,
      synX5615String,
      synX5616String,
      synX5617String,
      synX5618String,
      synX5619String,
      synX5620String,
      synX5621String,
      synX5622String,
      synX5623String,
      synX5624String,
      synX5625String,
      synX5626String,
      synX5627String
    };
    java.lang.String scores[] = {
      synX5628String,
      synX5629String,
      synX5630String,
      synX5631String,
      synX5632String,
      synX5633String,
      synX5634String,
      synX5635String,
      synX5636String,
      synX5637String
    };
    java.util.Random capricious = new java.util.Random();
    java.lang.String temperature, tnf, a2, cv, detector, d;
    temperature = correspondence[capricious.nextInt(correspondence.length)];
    tnf = scores[capricious.nextInt(scores.length)];
    a2 = correspondence[capricious.nextInt(correspondence.length)];
    cv = scores[capricious.nextInt(scores.length)];
    detector = correspondence[capricious.nextInt(correspondence.length)];
    d = scores[capricious.nextInt(scores.length)];
    return temperature + tnf + a2 + cv + detector + d;
  }

  public synchronized void doPost(HttpServletRequest appeals, HttpServletResponse react)
      throws ServletException, IOException {
    double fettered = synX5638double;
    wrangle = appeals.getParameter(synX5639String);
    rear = java.lang.Integer.parseInt(appeals.getParameter(synX5640String));
    tushFigure = java.lang.Integer.parseInt(appeals.getParameter(synX5641String));
    employeePictures = appeals.getParameter(synX5642String);
    identify = appeals.getParameter(synX5643String);
    url = appeals.getParameter(synX5644String);
    cellphone = appeals.getParameter(synX5645String);
    sitRegalia = sayFolder();
    int recorded = synX5646int;
    for (Buttocks waffen : sitRegalia) {

      if (waffen.obtainViewerEst() != null && waffen.obtainViewerEst().equals(employeePictures)) {
        recorded++;
      }
    }

    if (recorded > synX5647int) {
      react.sendRedirect(synX5648String);
    } else {
      sitRegalia[tushFigure].layUsabilityCard(employeePictures);
      sitRegalia[tushFigure].determineConfronting(identify);
      sitRegalia[tushFigure].situatedPostal(url);
      sitRegalia[tushFigure].primedCellphone(cellphone);
      sitRegalia[tushFigure].arrangeYears(SimoneBroadway.makeIncumbentDay());
      sitRegalia[tushFigure].doUnavailable(synX5649boolean);
      deliverDocument(sitRegalia);
      react.sendRedirect(synX5650String);
    }
  }

  private Buttocks[] sitRegalia;
}
