package seven.mapper;

import org.apache.ibatis.annotations.Param;
import seven.dao.User;

import java.util.List;

public interface IUserMapper {
    public User findUserById(int id);

    public List<User> findAllResultMap();

    public User findByIdAndUsername(@Param("id")int id, @Param("username")String username);

    public List<User> findByUsername(String username);

    public void saveUser();

    public List<User> findAllWithOrder();

    public List<User> findAllWithRole();

    public List<User> findAllWithOrder2();
}
