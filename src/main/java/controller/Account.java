package controller;



import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class Account {
    public boolean createNewAccount(String userName, String Password) {
        GetConnection con = new GetConnection();
        Connection connection = con.connectTo();
        int rs = 0;

        try {
            Statement st = connection.createStatement();

            rs = st.executeUpdate("insert into users(username,password) values('" + userName + "','" + Password + "')");
        } catch (SQLException ex) {
            System.out.println(ex);
        }

        boolean flag = false;
        if (rs == 1) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

}





























 /*   public static void simran() {
        Scanner sc=new Scanner(System.in);
        int repeat=1;
        int option;
        String userName;
        String password;
        user use = null;
        System.out.println("Enter\n 1  : login to jukebox\n 2 : create new account ");
        option = sc.nextInt();
        switch (option) {
            case 1: {
                int flag = 0;
                do {
                    System.out.println("Enter User Name");
                    userName = sc.next();
                    System.out.println("Enter the password");
                    password = sc.next();
                    Iterator<user> i = list1.iterator();
                    while (i.hasNext()) {
                        use = i.next();
                        // System.out.println(use.getUserName());
                        if (use.getUserName().equals(userName) && use.getPassword().equals(password)) {
                            System.out.println("welcome");
                            //Menu.mainMenu();
                            userid = use.getUserId();
                            flag = 1;
                        }
                    }
                    if (flag == 1) {
                        Menu.mainMenu(userid);
                    } else {
                        System.out.println("wrong creditianls");
                        //UserDetails.user();
                        repeat = 0;

                    }
                } while (repeat == 0);
                break;
            }

        }
    }
}*/
