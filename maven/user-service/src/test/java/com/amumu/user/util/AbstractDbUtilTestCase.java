package com.amumu.user.util;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.database.QueryDataSet;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class AbstractDbUtilTestCase {
	public static IDatabaseConnection dbutilCon;
	
	private File tempFile;
	
	@BeforeClass
	public static void init() throws DatabaseUnitException, Exception{
		dbutilCon = new DatabaseConnection(DBUtil.getConnection());
	}
	
	protected IDataSet createDataSet(String tname) throws DataSetException, IOException {
		File file = new File(AbstractDbUtilTestCase.class.getResource("/").getPath()+tname+".xml");
		InputStream is=new FileInputStream(file);
		return new FlatXmlDataSet(is);
	}
	
	protected void backupAllTable() throws SQLException, DataSetException, IOException {
		IDataSet ds = dbutilCon.createDataSet();
		writeBackupFile(ds);
	}

	private void writeBackupFile(IDataSet ds) throws DataSetException, IOException {
		tempFile = File.createTempFile("back", "xml");
		FlatXmlDataSet.write(ds, new FileWriter(tempFile));
	}
	
	
	protected void backupCustomTable(String[] tname) throws SQLException, DataSetException, IOException {
	    QueryDataSet qds = new QueryDataSet(dbutilCon);
	    for(String str: tname) {
	    	qds.addTable(str);
	    }
		writeBackupFile(qds);
	}
	
	protected void backupOneTable(String tname) throws SQLException, DataSetException, IOException {
		backupCustomTable(new String[] {tname});
	}
	
	protected void resumeTable() throws SQLException, IOException, DatabaseUnitException {
		IDataSet ds = new FlatXmlDataSet(tempFile);
		DatabaseOperation.CLEAN_INSERT.execute(dbutilCon, ds);
	}
	
	@AfterClass
	public static void destory(){
		try {
			if(dbutilCon!=null)  dbutilCon.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
