package com.company.mapper;

import com.company.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{
    @Override
    public int addUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(int id) {
        return 0;
    }

    //我们的所有操作都使用SqlSession来执行，在原来，现在都使用SqlSessionTemplate；
    private SqlSessionTemplate sqlSession;


    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectUser() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
