package user;

public class User {
    private String username, password;

    User(String user,String password){
        this.username = user;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    //Skriv koden som gör att testet i uppgift 3 blir godkänt och spara parametrarna i
    // två attribut: userName, password. För alla kommande uppgifter gör likadant
    // Red – Green – Refactor
    //
    //Skriv test som hämtar attributet userName
    //
    //Skriv test som hämtar attributet passWord
    //
    //Skriv ett test som ändrar userName
    //
}
