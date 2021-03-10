package db;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
//Test
/**
 * 连接数据库获得连接
 *
 *
 * @author Zeyang Sun
 */
public class DBConnect{
    private  String DATABASEDRIVER;
    private  String DBURL;
    private  String USER;
    private  String PASSWORD;

    Connection con=null;

    /**
     * 启动jdbc驱动
     * @author Zeyang Sun
     */
    public DBConnect() throws IOException {

        InputStream inputStream = DBConnect.class.getClassLoader().getResourceAsStream("sql.properties");
        Properties properties = new Properties();
        properties.load(inputStream);
        DATABASEDRIVER=properties.getProperty("DATABASEDRIVER");
        DBURL=properties.getProperty("DBURL");
        USER=properties.getProperty("USER");
        PASSWORD=properties.getProperty("PASSWORD");


        try {
            Class.forName(DATABASEDRIVER);
            this.con= (Connection) DriverManager.getConnection(DBURL, USER,PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 获得连接connection
     * @return connection
     * @author Zeyang Sun
     */
    public Connection getConnection(){
        return this.con;
    }

    /**
     * 关闭连接
     * @author Zeyang Sun
     */
    public void close(){
        try {
            this.con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
