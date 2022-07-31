package seven.mapper;

import seven.dao.Order;

import java.util.List;

public interface IOrderMapper {

    public List<Order> findAllWithUser();

    public List<Order> findAllWithUser2();

    public List<Order> findByUid(Integer uid);
}

