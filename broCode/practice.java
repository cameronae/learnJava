package broCode;
public class practice {
    public static void main(String[] args) {
        
    String email = "cameron.reiff@gmail.com";

    String username = email.substring(0, email.lastIndexOf("@"));
    String kindofEmail = email.substring(email.lastIndexOf("@") + 1,email.lastIndexOf("."));
    System.out.println(email + ' ' + username + ' ' + kindofEmail);
    System.out.println(email.substring(0,1));
    }
}
