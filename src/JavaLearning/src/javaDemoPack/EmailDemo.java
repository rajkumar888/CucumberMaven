package javaDemoPack;


import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailDemo {

public static void main(String[] args) throws EmailException {
Email email = new SimpleEmail();
email.setHostName("smtp.gmail.com");
email.setSmtpPort(465);
email.setAuthenticator(new DefaultAuthenticator("rajkumar888@gmail.com", "Soma@raju67"));
email.setSSLOnConnect(true);
email.setFrom("rajkumar888@gmail.com");
email.setSubject("TestMail");
email.setMsg("This is a test mail ...hello  by using java and commons emails feature:-)");
email.addTo("seleniumtest5555@gmail.com");
email.addCc("sspsudhanshu@gmail.com");
email.send();
System.out.println("email sent plz  check your email ");
}

}
