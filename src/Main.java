import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

public class Main {

    public static void main(String[] args)  throws Exception{


        Properties properties = new Properties();
        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("jdbc.properties");
        properties.load(inputStream);
        DataSource dataSource = BasicDataSourceFactory.createDataSource(properties);
        System.out.println(dataSource);
        /* BasicDataSource dataSource = null;
        //1、创建数据源实例
        dataSource = new BasicDataSource();

        //2、为数据库实例自定必须的属性
        dataSource.setUsername("root");
        dataSource.setPassword("");
        dataSource.setUrl("jdbc:mysql:///peixun");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
         //3、指定数据源的一些可选的属性
         //1)指定数据库连接池中初始化连接数的个数
        dataSource.setInitialSize(5);
        // 2)指定最大的连接数:同一时刻可以向数据库申请的连接数
        dataSource.setMaxActive(50);
        //3)指定最小空闲连接数：在数据库连接池中保存的最少的连接的数量
        dataSource.setMinIdle(5);
        //等待数据库连接池分配连接的最长时间，单位为毫秒
        dataSource.setMaxWait(6*1000);
        System.out.println(dataSource.getConnection());
        System.out.println(dataSource.getConnection().getClass());*/
    }
}
