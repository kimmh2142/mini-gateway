package toy.project.minigateway.dao;

import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
import toy.project.minigateway.model.UserGetModel;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class UserDao {

    private final SqlSessionTemplate sqlSessionTemplate;

    public List<UserGetModel> getUsers() {
        return sqlSessionTemplate.selectList("UserMapper.getUsers");
    }
}
