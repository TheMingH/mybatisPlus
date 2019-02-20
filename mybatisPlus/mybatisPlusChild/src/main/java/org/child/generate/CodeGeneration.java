/*package org.child.generate;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;


*//**
 * 
 * @ClassName: CodeGeneration
 * @Description: 代码生成器
 * @author huangrm
 * @date 2019/1/8
 *//*
public class CodeGeneration {
      public static void main(String[] args) {
AutoGenerator mpg = new AutoGenerator();



 GlobalConfig gc = new GlobalConfig();
 gc.setOutputDir("E://myproject/parent/child/src/main/java");
gc.setFileOverride(true);
 gc.setActiveRecord(false);// 不需要ActiveRecord特性的请改为false
 gc.setEnableCache(false);// XML 二级缓存
 gc.setBaseResultMap(true);// XML ResultMap
 gc.setBaseColumnList(false);// XML columList
 gc.setAuthor("Walle");// 作者


 // 自定义文件命名，注意 %s 会自动填充表实体属性！
 gc.setControllerName("%sController");
 gc.setServiceName("%sService");
 gc.setServiceImplName("%sServiceImpl");
 gc.setMapperName("%sMapper");
gc.setXmlName("%sMapper");
mpg.setGlobalConfig(gc);



 DataSourceConfig dsc = new DataSourceConfig();
 dsc.setDbType(DbType.MYSQL);
 dsc.setDriverName("com.mysql.jdbc.Driver");
dsc.setUsername("root");
 dsc.setPassword("123456");
 dsc.setUrl("jdbc:mysql://localhost:3306/test");
 mpg.setDataSource(dsc);



 StrategyConfig strategy = new StrategyConfig();
 strategy.setTablePrefix(new String[] { "itcast_" });// 此处可以修改为您的表前缀
 strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
 strategy.setInclude(new String[] { "u_user_role" }); // 需要生成的表


strategy.setSuperServiceClass(null);
 strategy.setSuperServiceImplClass(null);
 strategy.setSuperMapperClass(null);


 mpg.setStrategy(strategy);


PackageConfig pc = new PackageConfig();
 pc.setParent("org.child");
 pc.setController("controller");
pc.setService("service");
 pc.setServiceImpl("serviceImpl");
 pc.setMapper("mapper");
 pc.setEntity("entity");
 pc.setXml("xml");
 mpg.setPackageInfo(pc);
 mpg.execute();
}
}
*/