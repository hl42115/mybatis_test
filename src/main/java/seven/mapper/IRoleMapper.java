package seven.mapper;

import seven.dao.Order;
import seven.dao.Role;

import java.util.List;

public interface IRoleMapper {

    public List<Role> findById(Integer uid);
}

