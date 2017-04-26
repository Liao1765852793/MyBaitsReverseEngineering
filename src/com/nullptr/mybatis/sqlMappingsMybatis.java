package com.nullptr.mybatis;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.codegen.ibatis2.sqlmap.SqlMapGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class sqlMappingsMybatis {

	public void createPJMapper() throws Exception {
		List<String> list = new ArrayList<String>();

		boolean overWrite = true;

		// 指定逆向的配置文件
		File configFile = new File("generatorConfig.xml");

		ConfigurationParser cp = new ConfigurationParser(list);

		Configuration config = cp.parseConfiguration(configFile);

		DefaultShellCallback callback = new DefaultShellCallback(overWrite);

		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, list);
		myBatisGenerator.generate(null);

	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		sqlMappingsMybatis sql = new sqlMappingsMybatis();
		sql.createPJMapper();

	}

}
