package uuu;
import java.util.Map;

public class SinUp {
    String usrName;
    static DataBase dataBase=new DataBase();
    String pass;
    Account account;

    public SinUp(String usrName, String pass) {
        boolean flag=true;
        for (Map.Entry<String, String> me : dataBase.users.entrySet()) {
            if (me.getKey() == usrName) {
                System.out.println("error to the user this account already exist" +
                        "");
                flag=false;
                break;
            }



        }
        if(flag==true){
            this.usrName = usrName;
            this.pass = pass;
             account = new UserAccount(usrName, pass);

            dataBase.users.put(usrName, pass);

        }

    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
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
