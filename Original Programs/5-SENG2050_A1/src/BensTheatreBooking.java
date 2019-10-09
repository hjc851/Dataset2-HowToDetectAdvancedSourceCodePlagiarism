import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Institution: University of Newcastle
 * Programmer:  Ben Sutter
 * Course Code: SENG2050
 * UID: 3063467
 * Assignment 1
 * BensTheatreBooking Class
 * BensTheatreBooking.java
 * Last Modified: 22/08/16
 */

@WebServlet(urlPatterns = {"/booking"})
public class BensTheatreBooking extends HttpServlet {
    private Seat[] seatArray;
    private String row;
    private int seatNumber;
    private int seat;
    private String userID;
    private String phone;
    private String address;
    private String email;

    // Logger
    private static Logger logger = Logger.getLogger("bensTheatre");

    /**
     * Handles GET requests to deliver the booking form
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        // Read in GET params
        row = request.getParameter("row");
        seat = Integer.parseInt(request.getParameter("seat"));
        seatNumber = Integer.parseInt(request.getParameter("seatnumber"));

        // Load data file
        seatArray = readFile();

        // Now we have the file sorted, look at loading the first page
        String bookingPage = getBookingPage();
        out.println(bookingPage);
    }

    /**
     * Handles POST requests to handle form submissions on server side
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Read in POST Params
        row = request.getParameter("row");
        seat = Integer.parseInt(request.getParameter("seat"));
        seatNumber = Integer.parseInt(request.getParameter("seatnumber"));
        userID = request.getParameter("userid");
        address = request.getParameter("address");
        email = request.getParameter("email");
        phone = request.getParameter("phone");

        // Load data file
        seatArray = readFile();

        // Check if the user has any other bookings
        // If more than 3, return with limit exceeded response
        int booked = 0;
        for (Seat s : seatArray) {
            if (s.getUserId() != null && s.getUserId().equals(userID)) {
                booked++;
            }
        }
        if (booked > 2) {
            response.sendRedirect("benstheatre?message=limitexceeded");
        } else {
            // Add data to seat array and save
            seatArray[seatNumber].setUserId(userID);
            seatArray[seatNumber].setAddress(address);
            seatArray[seatNumber].setEmail(email);
            seatArray[seatNumber].setPhone(phone);
            seatArray[seatNumber].setTime(BensTheatre.getCurrentTime());
            seatArray[seatNumber].setAvailable(false);

            saveFile(seatArray);

            response.sendRedirect("benstheatre?message=success");
        }
    }

    /**
     * Generates HTML for the booking form
     * @return
     */
    public String getBookingPage() {
        // First get security code
        String code = securityCode();

        String html = "";
        html += "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "  <head>\n" +
                "    <meta charset=utf-8>\n" +
                "    <title>Seat Booking</title>\n" +
                "    <!--[if IE]>\n" +
                "      <script src=\"http://html5shiv.googlecode.com/svn/trunk/html5.js\">\n" +
                "      </script>\n" +
                "    <![endif]-->\n" +
                "    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\n" +
                "  </head>\n" +
                "  <body class=\"booking\">\n" +
                "    <header>\n" +
                "      <a href=\"benstheatre\">HOME</a>\n" +
                "      <h1>Seat Booking</h1>\n" +
                "    </header>\n" +
                "    <article>\n" +
                "      <h2>Your Selection</h2>\n" +
                "      <div class=\"selected\">\n" +
                "        <p class=\"heading\">Selected Seat:</p>";
        html += "<p class=\"option\">" + row + seat + "</p>";
        html += "</div>\n" +
                "      <div class=\"security\">\n" +
                "        <p class=\"heading\">Security Code:</p>";
        html += "<p class=\"option\" data-code=\"" + code + "\">" + code + "</p>";
        html += "</div>\n" +
                "\n" +
                "      <form method=\"post\" action=\"./booking\">\n" +
                "        <input type=\"hidden\" name=\"seat\" value=\"" + seat + "\" />\n" +
                "        <input type=\"hidden\" name=\"row\" value=\"" + row + "\" />\n" +
                "        <input type=\"hidden\" name=\"seatnumber\" value=\"" + seatNumber + "\" />\n" +
                "        <input type=\"text\" name=\"userid\" placeholder=\"UserID*\" />\n" +
                "        <input type=\"text\" name=\"phone\" placeholder=\"Phone\" />\n" +
                "        <input type=\"text\" name=\"address\" placeholder=\"Address\" />\n" +
                "        <input type=\"text\" name=\"email\" placeholder=\"Email*\" />\n" +
                "        <input type=\"text\" name=\"security\" placeholder=\"Security Code*\" />\n" +
                "        <button type=\"reset\" value=\"Clear\" class=\"form-clear\">Clear</button>\n" +
                "        <button type=\"submit\" value=\"Submit\" class=\"form-submit\">Submit</button>\n" +
                "      </form>\n" +
                "    </article>\n" +
                "    <footer>\n" +
                "      <div class=\"author\">\n" +
                "        <p>&copy; Ben Sutter 2016</p>\n" +
                "        <p>c3063467</p>\n" +
                "      </div>\n" +
                "    </footer>\n" +
                "    <script src=\"js/jquery.min.js\"></script>\n" +
                "    <script src=\"js/script.js\"></script>\n" +
                "  </body>\t\n" +
                "</html>";

        return html;
    }

    /**
     * Generates a random 6 digit/letter security code
     * @return
     */
    public String securityCode(){

        String letters[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String numbers[] = {"0","1","2","3","4","5","6","7","8","9"};
        Random random = new Random();
        String r0,r1,r2,r3,r4,r5;

        r0 = letters[random.nextInt(letters.length)];
        r1 = numbers[random.nextInt(numbers.length)];
        r2 = letters[random.nextInt(letters.length)];
        r3 = numbers[random.nextInt(numbers.length)];
        r4 = letters[random.nextInt(letters.length)];
        r5 = numbers[random.nextInt(numbers.length)];

        return r0+r1+r2+r3+r4+r5;
    }

    /**
     * Loads in a file from storage
     * @return
     */
    public Seat[] readFile()
    {
        try
        {
            Seat[] seats;
            FileInputStream inFile = new FileInputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));// Read serial file.
            ObjectInputStream in = new ObjectInputStream(inFile);// input the read file.
            seats = (Seat[]) in.readObject();// allocate it to the object file already instanciated.
            in.close();//closes the input stream.
            inFile.close();//closes the file data stream.
            return seats;
        }catch(IOException i)//exception stuff
        {
            logger.info(i.toString());
            return null;
        }catch(ClassNotFoundException c)//more exception stuff
        {
            logger.info(c.toString());
            c.printStackTrace();
            return null;
        }
    }

    /**
     * Saves seat array to server storage
     * @param seats
     */
    public void saveFile(Seat[] seats) {
        try {
            FileOutputStream outFile = new FileOutputStream(getServletContext().getRealPath("/WEB-INF/bookingData.ser"));//creates a card serial file in output stream
            ObjectOutputStream out = new ObjectOutputStream(outFile);//routs an object into the output stream.
            out.writeObject(seats);// we designate our array of cards to be routed
            out.close();// closes the data paths
            outFile.close();// closes the data paths
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}