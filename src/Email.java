/**
 * Created by cameronoakley on 10/8/15.
 */
public class Email {
    public String subject;
    public String destination;
    public String body;
    public int timestamp;

    public Email(){
        System.out.println("Creating Email");
        subject = "No Subject";
        body = "";
        destination = "";
        timestamp = 0;
    }

    public Email(String subject, String body, String destination, int timestamp){
        this.subject = subject;
        this.destination = destination;
        this.body = body;
        this.timestamp = timestamp;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getSubject (){
        return subject;
    }

    public void setDestination (String destination){
        this.destination = destination;
    }

    public String getDestination(){
        return destination;
    }

    public void setBody(String body){
        this.body = body;
    }

    public String getBody(){
        return body;
    }

    public void setTimestamp(int timestamp){
        this.timestamp = timestamp;
    }

    public int getTimestamp(){
        return timestamp;
    }

    public static boolean isValidSubject(String subject) {
        return subject.length() !=0;
    }
}
