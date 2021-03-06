package com.zltel.location_aware.userlife.main;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;

public class UserLifeBinJiangMainTest {

	List<String> args = new ArrayList<String>();

	@Before
	public void setUp() throws Exception {
		UserLifeBinJiangMain.BASE_PATH = "D:\\HDFS_HOME\\user\\zltel\\";
		//
		args.add("20160501");
		args.add("20160531");
		args.add(UserLifeBinJiangMain.BASE_PATH + "\\userlife\\out2\\");
		args.add(UserLifeBinJiangMain.BASE_PATH + "userlife\\testData\\cs\\");
		args.add(UserLifeBinJiangMain.BASE_PATH + "userlife\\testData\\gn\\");
		args.add("1");
		args.add("00");
		args.add("99");
		args.add("1");
		args.add("300000");
	}

	@After
	public void tearDown() throws Exception {
	}

	public final void testMain() {
		UserLifeBinJiangMain.splitCount = 50;
		UserLifeBinJiangMain.startRegion = 0;
		UserLifeBinJiangMain.endRegion = 99;
		String[] _args = new String[args.size()];
		args.toArray(_args);
		try {
			UserLifeBinJiangMain.main(_args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
