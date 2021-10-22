package connector;

import java.sql.*;
import java.util.ArrayList;

//Connector laver forbindelse til database så alt data der er skrevet ind i indskrivningsfeltet bliver sendt videre
//til databasen.
public class JDBC {
    public void connectionTest(String emailFromForm) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emaildatabase","Kurt","x");
            PreparedStatement psts = conn.prepareStatement("insert into customer(email) values(?)");
            psts.setString(1,emailFromForm);
            psts.execute();

        }catch(SQLException e){
            System.out.println("Cannot connect to database");
            e.printStackTrace();
        }
    }
    public ArrayList<String> getList() {
        ArrayList<String> result = new ArrayList<>();
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emaildatabase","Kurt","x");
            PreparedStatement statement = conn.prepareStatement("select * from customer");
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                result.add(rs.getString("email"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return result;
    }
}

