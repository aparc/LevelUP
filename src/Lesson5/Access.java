package Lesson5;


public class Access {

    private String login;
    private String password;

    public Access(){}


    public Access(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof User)) return false;

        User other = (User) obj;
        return  login.equals(other.login) &&
                password.equals(other.password);
    }

    @Override
    public int hashCode() {
        int result = 23;
        result = 31 * result + login.hashCode();
        result = 31 * result + password.hashCode();
        return result;


    }
}
