package ExceptionalHandeling;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionCloseDemo {


    public static void main(String[] args)  {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try{
            int a=100 , b = 0 , c ;
            c = a/b;
            System.out.println(c);
        }
        catch (Exception e ){

            System.out.println("bdsk");
        }
        finally {
            try {
                con.close();

            }
            catch (Exception e){
                System.out.println(e);
                System.out.println("Connection close");
            }
            try {
                ps.close();

            }
            catch (Exception e){
                System.out.println(e);
                System.out.println("Prepared Statment close");
            }
            try{
                rs.close();

            }
            catch (Exception e){
                System.out.println(e);
                System.out.println("Resultset close");
            }
            System.out.println("chal gaya");

        }
    }
}
