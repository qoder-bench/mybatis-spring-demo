package org.mvnsearch.mybatis.demo.repo;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration()
public class MyBatisConfiguration {

    @Bean
    public MapperFactoryBean<LegoSetMapper> legoSetMapper(SqlSessionFactory sqlSessionFactory) {
        MapperFactoryBean<LegoSetMapper> factoryBean = new MapperFactoryBean<>(LegoSetMapper.class);
        factoryBean.setSqlSessionFactory(sqlSessionFactory);
        return factoryBean;
    }
}
