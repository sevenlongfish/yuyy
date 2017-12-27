package site.yuyy.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

/**
 * mybatis基础配置类
 * @author Administrator
 * @since 2017/12/26
 *
 */
@Configuration
@EnableTransactionManagement
public class MybatisConfig implements TransactionManagementConfigurer {

	@Autowired
	private DataSource datasource;
	
	@Bean(name="SqlSessionFactory")
	public SqlSessionFactory SqlSessionFactoryBean() {
//		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		return null;
	}
	
	@Override
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		// TODO Auto-generated method stub
		return null;
	}

}
