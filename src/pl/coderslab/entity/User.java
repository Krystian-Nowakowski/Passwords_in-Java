package pl.coderslab.entity;

public class User {

    private int id;
    private String userName;
    private String email;
    private String password;

    public void setId(int id){this.id = id;}
    int getId(){return id;}

    public void setUserName(String userName){this.userName = userName;}
    String getUserName(){return userName;}

    public void setEmail(String email){this.email = email;}
    String getEmail(){return email;}

    public void setPassword(String password){this.password = password;}
    String getPassword(){return password;}


    @Override
    public String toString(){
        return "User{ " + "id = " + id + ", Username = " + userName + ", e-mail = " + email + ", Password = " + password + " }";
    }
}
