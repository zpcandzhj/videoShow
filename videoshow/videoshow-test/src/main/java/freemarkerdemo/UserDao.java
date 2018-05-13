package freemarkerdemo;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public List<User> queryUserList() {
        List<User> result = new ArrayList<User>();
        // 模拟数据库的查询
        for (int i = 1; i <= 10; i++) {
            User user = new User();
            user.setUsername("username_" + i);
            user.setPassword("password_" + i);
            user.setAge(i);
            result.add(user);
        }
        return result;
    }

}
