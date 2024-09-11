public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
        if (email != null && email.endsWith("@yahoo.com")) {
            this.email = email;
        } else {
            System.out.println("Invalid email. Only Yahoo emails are allowed.");
        }
    }
    public void setUserName(String userName) {
        if (userName != null && userName.length() > 6) {
            this.userName = userName;
        } else {
            System.out.println("Invalid username. It cannot be empty and must be longer than 6 characters.");
        }
    }
    public void setPassword(String password) {
        if (password != null && password.length() > 6 && (userName == null || !password.contains(userName))) {
            this.password = password;
        } else {
            System.out.println("Invalid password. It cannot be empty, must be longer than 6 characters, and cannot contain the username.");
        }
    }
    public void displayRegistrationInfo() {
        System.out.println("Email: " + email);
        System.out.println("Username: " + userName);
        System.out.println("Password: " + password);
    }

    public static void main(String[] args) {
        Registration Registration=new Registration();
        Registration.setEmail("user@yahoo.com");
        Registration.setUserName("user123");
        Registration.setPassword("Secure pass");
        Registration.displayRegistrationInfo();




    }

}
