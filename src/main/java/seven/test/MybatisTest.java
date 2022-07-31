package seven.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import seven.dao.Order;
import seven.dao.User;
import seven.mapper.IOrderMapper;
import seven.mapper.IUserMapper;

import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    @Test
    public void testFindAll() throws Exception {
        // 加载核心配置文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        // 获取SqlSessionFactory工厂对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        // 获取SqlSession会话对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 执行sql
        /*IOrderMapper mapper = sqlSession.getMapper(IOrderMapper.class);
        List<Order> allWithUser = mapper.findAllWithUser();
        // List<User> byUsername = mapper.findByUsername("seven%");
        for (Order order : allWithUser) {
            System.out.println(order);
        }*/
        /*User user = mapper.findByIdAndUsername(1, "seven");
        System.out.println(user);*/
        /*System.out.println(mapper.findUserById(1).getUsername());*/
        /*List<User> list = mapper.findAllResultMap();
        for (User user : list) {
            System.out.println(user);
        }*/
        IUserMapper mapper = sqlSession.getMapper(IUserMapper.class);
        mapper.findAllWithRole().forEach(user-> System.out.println(user));
        //sqlSession.getMapper(IOrderMapper.class).findAllWithUser2().forEach(order -> System.out.println(order));
        //sqlSession.getMapper(IUserMapper.class).findAllWithOrder2().forEach(user -> System.out.println(user));
        //sqlSession.close();
        //sqlSession.clearCache();
        //sqlSessionFactory.openSession().getMapper(IUserMapper.class).findAllWithOrder2().forEach(user -> System.out.println(user));
        //mapper.findAllWithOrder().forEach(user -> System.out.println(user));

         //释放资源
        sqlSession.close();

    }
}
