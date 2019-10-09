import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;
import static java.lang.Integer.parseInt;
import static java.util.logging.Logger.getLogger;

public class PhillipsAuditoriumSubscription extends javax.servlet.http.HttpServlet {
  private static final String synX4041String = "bensTheatre";
  private static final String synX4040String = "/WEB-INF/bookingData.ser";
  private static final double synX4039double = 0.09768843159530183;
  private static final String synX4038String = "/WEB-INF/bookingData.ser";
  private static final double synX4037double = 0.9661460204852957;
  private static final String synX4036String = "9";
  private static final String synX4035String = "8";
  private static final String synX4034String = "7";
  private static final String synX4033String = "6";
  private static final String synX4032String = "5";
  private static final String synX4031String = "4";
  private static final String synX4030String = "3";
  private static final String synX4029String = "2";
  private static final String synX4028String = "1";
  private static final String synX4027String = "0";
  private static final String synX4026String = "Z";
  private static final String synX4025String = "Y";
  private static final String synX4024String = "X";
  private static final String synX4023String = "W";
  private static final String synX4022String = "V";
  private static final String synX4021String = "U";
  private static final String synX4020String = "T";
  private static final String synX4019String = "S";
  private static final String synX4018String = "R";
  private static final String synX4017String = "Q";
  private static final String synX4016String = "P";
  private static final String synX4015String = "O";
  private static final String synX4014String = "N";
  private static final String synX4013String = "M";
  private static final String synX4012String = "L";
  private static final String synX4011String = "K";
  private static final String synX4010String = "J";
  private static final String synX4009String = "I";
  private static final String synX4008String = "H";
  private static final String synX4007String = "G";
  private static final String synX4006String = "F";
  private static final String synX4005String = "E";
  private static final String synX4004String = "D";
  private static final String synX4003String = "C";
  private static final String synX4002String = "B";
  private static final String synX4001String = "A";
  private static final double synX4000double = 0.7375878071388792;
  private static final String synX3999String = "</html>";
  private static final String synX3998String = "  </body>\t\n";
  private static final String synX3997String = "    <script src=\"js/script.js\"></script>\n";
  private static final String synX3996String = "    <script src=\"js/jquery.min.js\"></script>\n";
  private static final String synX3995String = "    </footer>\n";
  private static final String synX3994String = "      </div>\n";
  private static final String synX3993String = "        <p>c3063467</p>\n";
  private static final String synX3992String = "        <p>&copy; Ben Sutter 2016</p>\n";
  private static final String synX3991String = "      <div class=\"author\">\n";
  private static final String synX3990String = "    <footer>\n";
  private static final String synX3989String = "    </article>\n";
  private static final String synX3988String = "      </form>\n";
  private static final String synX3987String =
      "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n";
  private static final String synX3986String =
      "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n";
  private static final String synX3985String =
      "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n";
  private static final String synX3984String =
      "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n";
  private static final String synX3983String =
      "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n";
  private static final String synX3982String =
      "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n";
  private static final String synX3981String =
      "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n";
  private static final String synX3980String = "\" />\n";
  private static final String synX3979String =
      "        <input type=\"hidden\" name=\"seatnumber\" value=\"";
  private static final String synX3978String = "\" />\n";
  private static final String synX3977String =
      "        <input type=\"hidden\" name=\"row\" value=\"";
  private static final String synX3976String = "\" />\n";
  private static final String synX3975String =
      "        <input type=\"hidden\" name=\"seat\" value=\"";
  private static final String synX3974String =
      "      <form method=\"post\" action=\"./booking\">\n";
  private static final String synX3973String = "\n";
  private static final String synX3972String = "</div>\n";
  private static final String synX3971String = "</p>";
  private static final String synX3970String = "\">";
  private static final String synX3969String = "<p class=\"option\" data-code=\"";
  private static final String synX3968String = "        <p class=\"heading\">Security Code:</p>";
  private static final String synX3967String = "      <div class=\"security\">\n";
  private static final String synX3966String = "</div>\n";
  private static final String synX3965String = "</p>";
  private static final String synX3964String = "<p class=\"option\">";
  private static final String synX3963String = "        <p class=\"heading\">Selected Seat:</p>";
  private static final String synX3962String = "      <div class=\"selected\">\n";
  private static final String synX3961String = "      <h2>Your Selection</h2>\n";
  private static final String synX3960String = "    <article>\n";
  private static final String synX3959String = "    </header>\n";
  private static final String synX3958String = "      <h1>Seat Booking</h1>\n";
  private static final String synX3957String = "      <a href=\"benstheatre\">HOME</a>\n";
  private static final String synX3956String = "    <header>\n";
  private static final String synX3955String = "  <body class=\"booking\">\n";
  private static final String synX3954String = "  </head>\n";
  private static final String synX3953String =
      "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n";
  private static final String synX3952String = "    <![endif]-->\n";
  private static final String synX3951String = "      </script>\n";
  private static final String synX3950String =
      "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n";
  private static final String synX3949String = "    <!--[if IE]>\n";
  private static final String synX3948String = "    <title>Seat Booking</title>\n";
  private static final String synX3947String = "    <meta charset=utf-8>\n";
  private static final String synX3946String = "  <head>\n";
  private static final String synX3945String = "<html lang=\"en\">\n";
  private static final String synX3944String = "<!DOCTYPE html>\n";
  private static final String synX3943String = "";
  private static final int synX3942int = -828028905;
  private static final String synX3941String = "benstheatre?message=success";
  private static final boolean synX3940boolean = false;
  private static final String synX3939String = "benstheatre?message=limitexceeded";
  private static final int synX3938int = 2;
  private static final int synX3937int = 0;
  private static final String synX3936String = "phone";
  private static final String synX3935String = "email";
  private static final String synX3934String = "address";
  private static final String synX3933String = "userid";
  private static final String synX3932String = "seatnumber";
  private static final String synX3931String = "seat";
  private static final String synX3930String = "row";
  private static final int synX3929int = -1142383570;
  private static final String synX3928String = "seatnumber";
  private static final String synX3927String = "seat";
  private static final String synX3926String = "row";
  private static final double synX3925double = 0.04382311208081702;
  static final int throttle = 888640500;
  private Behind[] bottomSpectrum;
  private java.lang.String ranked;
  private int bottomCaseload;
  private int rear;
  private java.lang.String usabilityCard;
  private java.lang.String headset;
  private java.lang.String resolve;
  private java.lang.String postal;
  private static java.util.logging.Logger timber;

  public synchronized void doGet(HttpServletRequest ask, HttpServletResponse responsiveness)
      throws ServletException, IOException {
    double fukien = synX3925double;
    java.io.PrintWriter extinct = responsiveness.getWriter();
    ranked = (ask.getParameter(synX3926String));
    rear = (parseInt(ask.getParameter(synX3927String)));
    bottomCaseload = (parseInt(ask.getParameter(synX3928String)));
    bottomSpectrum = (sayFolder());
    java.lang.String overbookingText = becomeVenueFront();
    extinct.println(overbookingText);
  }

  public synchronized void doPost(HttpServletRequest proposal, HttpServletResponse answers)
      throws ServletException, IOException {
    int maximize = synX3929int;
    ranked = (proposal.getParameter(synX3930String));
    rear = (parseInt(proposal.getParameter(synX3931String)));
    bottomCaseload = (parseInt(proposal.getParameter(synX3932String)));
    usabilityCard = (proposal.getParameter(synX3933String));
    resolve = (proposal.getParameter(synX3934String));
    postal = (proposal.getParameter(synX3935String));
    headset = (proposal.getParameter(synX3936String));
    bottomSpectrum = (sayFolder());
    int accounted = synX3937int;
    for (Behind waffen : bottomSpectrum) {

      if (waffen.letSearcherIdentification() != null
          && waffen.letSearcherIdentification().equals(usabilityCard)) {
        accounted++;
      }
    }

    if (accounted > synX3938int) {
      answers.sendRedirect(synX3939String);
    } else {
      bottomSpectrum[bottomCaseload].placedCustomersIbid(usabilityCard);
      bottomSpectrum[bottomCaseload].laidSpeak(resolve);
      bottomSpectrum[bottomCaseload].bentCourier(postal);
      bottomSpectrum[bottomCaseload].settledLandline(headset);
      bottomSpectrum[bottomCaseload].solidifyingJuncture(JonnyDance.developPreviousHour());
      bottomSpectrum[bottomCaseload].settledVisible(synX3940boolean);
      resurrectPapers(bottomSpectrum);
      answers.sendRedirect(synX3941String);
    }
  }

  public synchronized java.lang.String becomeVenueFront() {
    int namDetail = synX3942int;
    java.lang.String encryption = certificateCypher();
    java.lang.String htm = synX3943String;
    htm +=
        (htm
            + (synX3944String
                + synX3945String
                + synX3946String
                + synX3947String
                + synX3948String
                + synX3949String
                + synX3950String
                + synX3951String
                + synX3952String
                + synX3953String
                + synX3954String
                + synX3955String
                + synX3956String
                + synX3957String
                + synX3958String
                + synX3959String
                + synX3960String
                + synX3961String
                + synX3962String
                + synX3963String));
    htm += (htm + (synX3964String + ranked + rear + synX3965String));
    htm += (htm + (synX3966String + synX3967String + synX3968String));
    htm += (htm + (synX3969String + encryption + synX3970String + encryption + synX3971String));
    htm +=
        (htm
            + (synX3972String
                + synX3973String
                + synX3974String
                + synX3975String
                + rear
                + synX3976String
                + synX3977String
                + ranked
                + synX3978String
                + synX3979String
                + bottomCaseload
                + synX3980String
                + synX3981String
                + synX3982String
                + synX3983String
                + synX3984String
                + synX3985String
                + synX3986String
                + synX3987String
                + synX3988String
                + synX3989String
                + synX3990String
                + synX3991String
                + synX3992String
                + synX3993String
                + synX3994String
                + synX3995String
                + synX3996String
                + synX3997String
                + synX3998String
                + synX3999String));
    return htm;
  }

  public synchronized java.lang.String certificateCypher() {
    double beacon = synX4000double;
    java.lang.String written[] = {
      synX4001String,
      synX4002String,
      synX4003String,
      synX4004String,
      synX4005String,
      synX4006String,
      synX4007String,
      synX4008String,
      synX4009String,
      synX4010String,
      synX4011String,
      synX4012String,
      synX4013String,
      synX4014String,
      synX4015String,
      synX4016String,
      synX4017String,
      synX4018String,
      synX4019String,
      synX4020String,
      synX4021String,
      synX4022String,
      synX4023String,
      synX4024String,
      synX4025String,
      synX4026String
    };
    java.lang.String numerals[] = {
      synX4027String,
      synX4028String,
      synX4029String,
      synX4030String,
      synX4031String,
      synX4032String,
      synX4033String,
      synX4034String,
      synX4035String,
      synX4036String
    };
    java.util.Random probability = new java.util.Random();
    java.lang.String rl, r6, d2, cv, eq, d;
    rl = (written[probability.nextInt(written.length)]);
    r6 = (numerals[probability.nextInt(numerals.length)]);
    d2 = (written[probability.nextInt(written.length)]);
    cv = (numerals[probability.nextInt(numerals.length)]);
    eq = (written[probability.nextInt(written.length)]);
    d = (numerals[probability.nextInt(numerals.length)]);
    return (rl + r6 + d2 + cv + eq + d);
  }

  public synchronized Behind[] sayFolder() {
    double badge = synX4037double;

    try {
      Behind[] stalls;
      java.io.FileInputStream whysCharge =
          new java.io.FileInputStream(getServletContext().getRealPath(synX4038String));
      java.io.ObjectInputStream nii = new java.io.ObjectInputStream(whysCharge);
      stalls = ((Behind[]) nii.readObject());
      nii.close();
      whysCharge.close();
      return stalls;
    } catch (java.io.IOException i) {
      timber.info(i.toString());
      return null;
    } catch (java.lang.ClassNotFoundException cathode) {
      timber.info(cathode.toString());
      cathode.printStackTrace();
      return null;
    }
  }

  public synchronized void resurrectPapers(Behind[] slots) {
    double minuteBreadth = synX4039double;

    try {
      java.io.FileOutputStream prohibitedPapers =
          new java.io.FileOutputStream(getServletContext().getRealPath(synX4040String));
      java.io.ObjectOutputStream taboo = new java.io.ObjectOutputStream(prohibitedPapers);
      taboo.writeObject(slots);
      taboo.close();
      prohibitedPapers.close();
    } catch (java.io.IOException past) {
      past.printStackTrace();
    }
  }

  static {
    timber = (getLogger(synX4041String));
  }
}
