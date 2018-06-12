package com.amumu.user.service;

import static org.easymock.EasyMock.createStrictMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.expectLastCall;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.amumu.user.dao.IUserDao;
import com.amumu.user.model.User;
import com.amumu.user.util.EntitiesHelper;

public class TestUserService {
    private IUserDao userDao;
    private IUserService userService;
    private User baseUser;
    
    @Before
    public void setUp() {
    	userDao = createStrictMock(IUserDao.class);
    	userService = new UserService(userDao);
    	baseUser = new User(1, "admin", "123", "管理员");
    }
    
    @Test
    public void testAdd() {
    	userDao.add(baseUser);
    	expectLastCall();
    	replay(userDao);
    	userService.add(baseUser);
    }
    
    @Test
    public void testLoadByUserName() {
    	expect(userDao.loadByUserName("admin")).andReturn(baseUser);
    	replay(userDao);
    	User user = userService.loadByUserName("admin");
    	EntitiesHelper.assertUser(user, baseUser);
    	
    }
    
    @After
    public void tearDown() {
    	verify(userDao);
    }
}
