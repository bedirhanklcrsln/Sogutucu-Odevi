package nesne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PostgreSQLSurucu implements IVeritabaniRepository {
   
    static String url="jdbc:postgresql://localhost:5432/nesneodevi";
    static Connection conn=null;
    public static Kullanicilar user1= new Kullanicilar(null,null);
    
    static void  baglan()
     {
    	
    	 try
    	 {
			conn=DriverManager.getConnection(url,"postgres","1234");
			System.out.println("Baðlantý gerçekleþti");
    	 } 
    	 
    	 catch (SQLException e) 
    	 {
    		 System.out.println("Baðlantý baþarýsýz");
			e.printStackTrace();
    	 }
		 	
    }
    
    

    public static boolean adDogrula(String kullaniciAd, String sifre)
    {
        String loginSql = "SELECT *  FROM \"kullanici\" WHERE \"kullanici_adi\"='"+ kullaniciAd+"' AND kullanici_parola= '"+ sifre+"'";


            try {
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(loginSql);

                if (resultSet.next())
                {
                	System.out.println("Giriþ baþarýlý.");
                	user1= new Kullanicilar(kullaniciAd,sifre);
                    return true;
                }
                else {
                    System.out.println("Hatalý giriþ.");
                    return false;
                }
            } catch (SQLException exception) {
                exception.printStackTrace();
            }


        
        return false;
    }

	

}
