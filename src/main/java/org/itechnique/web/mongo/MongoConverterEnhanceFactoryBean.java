package org.itechnique.web.mongo;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.convert.MongoTypeMapper;

/**
 * 功能描述：去_class类
 * @author 作者 zhaowen@itechnique.com
 * @created 2014-5-10 上午8:13:05
 * @version 1.0.0
 * @date 2014-5-10 上午8:13:05
 */
public class MongoConverterEnhanceFactoryBean implements FactoryBean<MappingMongoConverter> {
    
    private MappingMongoConverter mongoConverter;

    /**
     * @param mongoConverter the mongoConverter to set
     */
    public void setMongoConverter(MappingMongoConverter mongoConverter) {
        this.mongoConverter = mongoConverter;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MappingMongoConverter getObject() throws Exception {
        MongoTypeMapper typeMapper = new DefaultMongoTypeMapper(null);
        mongoConverter.setTypeMapper(typeMapper);
        return mongoConverter;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<?> getObjectType() {
        return MappingMongoConverter.class;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
    
    
}
