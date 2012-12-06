package controlador;

import java.io.Reader;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConnectioFactory {
    private static final String resource = "mybatis-config.xml";
    private static SqlSessionFactory sqlMapper;
    private static  Reader reader;
    private static final Logger LOGGER = LoggerFactory.getLogger(ConnectioFactory.class);

    static {
        try {
            reader = Resources.getResourceAsReader(resource);
            sqlMapper = new SqlSessionFactoryBuilder().build(reader);
        } catch ( Exception e ) {
            LOGGER.error("## Error al generar una conexion. {}",e.getMessage());
        }

    }

    public static SqlSessionFactory getSession () {
        return sqlMapper;
    }
}
