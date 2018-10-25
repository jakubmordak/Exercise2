package ex2;

import java.util.Scanner;

public class Employe {
    public String name;
    public String surname;

    public Employe(){}
    public Employe(String name, String surname){
        this.name=name;
        this.surname=surname;
    }
    public void getName(Scanner input){
        name=input.next();
    }
    public void getSurname(Scanner input){
        surname=input.next();
    }

    public  String getEmail(int modifier) {
        if(modifier<1)
            return surname+"."+name+"@mex.com";
        else
            return surname+"."+name+modifier+"@mex.com";
    }

}
