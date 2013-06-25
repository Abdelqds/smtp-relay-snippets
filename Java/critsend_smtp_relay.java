import java.io.*;
import java.net.InetAddress;
import java.util.Properties;
import java.util.Date;

import javax.mail.*;

import javax.mail.internet.*;

import com.sun.mail.smtp.*;


public class Distribution {

    public static void main(String args[]) throws Exception {
        Properties props = System.getProperties();
        props.put("mail.smtps.host","smtp.critsend.com");
        props.put("mail.smtps.auth","true");
        Session session = Session.getInstance(props, null);
        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress("your_email@example.com"));;
        msg.setRecipients(Message.RecipientType.TO,
        InternetAddress.parse("Recipient_address@example.com", false));

        msg.setSubject("Your subject here "+System.currentTimeMillis());
        msg.setText("Your content here");
        msg.setHeader("X-Mailer", "Header");

        msg.setSentDate(new Date());

        SMTPTransport t =
            (SMTPTransport)session.getTransport("smtps");
        t.connect("smtp.critsend.com", "YourCritSendUsername", "YourCritSendPassword");
        t.sendMessage(msg, msg.getAllRecipients());
        System.out.println("Response: " + t.getLastServerResponse());
        t.close();
    }
}