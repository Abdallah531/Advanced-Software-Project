package uuu;

public class signin {
String usrName;
String pass;
boolean conditions=false;
    public signin(String usrName, String pass) {

        if(!SinUp.dataBase.check(usrName)) {
            conditions=true;


        } else {
            conditions=false;
            System.out.println("error in sigin UserName or password is wrong ");
        }


    }

    public boolean isConditions() {
        return conditions;
    }

    public void setConditions(boolean conditions) {
        this.conditions = conditions;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
