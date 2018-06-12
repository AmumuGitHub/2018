package com.amumu.user.dao;

import java.io.IOException;
import java.sql.SQLException;

import org.dbunit.DatabaseUnitException;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.amumu.user.model.User;
import com.amumu.user.util.AbstractDbUtilTestCase;
import com.amumu.user.util.EntitiesHelper;

public class TestUserDao extends AbstractDbUtilTestCase{

	private IUserDao userDao;
	
	@Before
	public void setUp() throws DataSetException, SQLException, IOException {
		userDao = new UserDao();
		backupOneTable("t_user");
	}
	
	@Test
	public void TestLoad() throws DatabaseUnitException, SQLException, IOException{
		IDataSet ds = createDataSet("t_user");
		DatabaseOperation.CLEAN_INSERT.execute(dbutilCon, ds);
		User user = userDao.loadByUserName("admin");
		EntitiesHelper.assertUser(user);
	}
	
	@Test
	public void TestAdd() throws DatabaseUnitException, SQLException, IOException{
		IDataSet ds = createDataSet("t_user");
		DatabaseOperation.TRUNCATE_TABLE.execute(dbutilCon, ds); 	
		User user1 = new User(1,"admin","123456","管理员");
		userDao.add(user1);
		Assert.assertTrue(user1.getId()>0);
		User user2 = userDao.loadByUserName("admin");
		EntitiesHelper.assertUser(user1, user2);
	}
	
	@After 
	public void tearDown() throws SQLException, IOException, DatabaseUnitException {
		resumeTable();
	}
	
}
