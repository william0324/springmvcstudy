package org.example.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MyBatisConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
        SqlSessionFactoryBean factoryBean =  new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        //factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResource("classpath:dao/BookMapper.xml"));
        factoryBean.setTypeAliasesPackage("org.example.pojo");
        return factoryBean;
    }
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("org.example.mapper");
        return msc;
    }
}
