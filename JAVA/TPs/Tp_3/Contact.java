package Jfram.tp_1.tp2_e2;

import java.io.Serializable;

public class Contact implements Serializable {
    private String name ;
    private String email ;

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public Contact(){
        this.name = "";
        this.email = "";
    }

    public Contact (String name , String email ){
        this.name = name ;
        this.email = email ;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
