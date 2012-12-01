package controlador;

import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ConnectioFactory {
    private static final String resource = "mybatis-config.xml";
    private static SqlSessionFactory sqlMapper;
    private static Reader reader;

    static {
        try {
            reader = Resources.getResourceAsReader(resource);
            sqlMapper = new SqlSessionFactoryBuilder().build(reader);
        } catch ( Exception e ) {
            System.out.println(e);
        }

    }

    public static SqlSessionFactory getSession () {
        return sqlMapper;
    }
}
