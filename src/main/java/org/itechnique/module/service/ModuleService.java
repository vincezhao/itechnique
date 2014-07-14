package org.itechnique.module.service;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.itechnique.module.bean.ModuleItem;
import org.itechnique.module.service.intf.IModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ModuleService implements IModule {
    
    private static final Logger logger = LoggerFactory.getLogger(ModuleService.class);
    
//    private ApplicationContext context = new ClassPathXmlApplicationContext("conf/spring/spring-mongo.xml");
    
//    private MongoTemplate mongoTemplate = context.getBean(MongoTemplate.class);

    @Autowired
    MongoTemplate mongoTemplate;
    
    @Override
    public void insert(ModuleItem moduleItem) {
        if(moduleItem != null){
            mongoTemplate.save(moduleItem);
        }
    }

    @Override
    public List<ModuleItem> queryByModuleId(String moduleId, Integer startIndex, Integer length) {
        if(StringUtils.isBlank(moduleId)){
            logger.error("moduleId is null");
            return null;
        }
        Query query = new Query(Criteria.where("moduleId").is(moduleId));
        query.skip(startIndex);
        query.limit(length);
        return mongoTemplate.find(query, ModuleItem.class);
    }
    
    

    @Override
    public void update(ModuleItem moduleItem) {
        if(moduleItem == null){
            logger.error("moduleItem is null");
            return;
        }
        Query query = new Query(Criteria.where("_id").is(moduleItem.getId()));
        Update update = Update.update("description", moduleItem.getDescription())
                .set("url", moduleItem.getUrl())
                .set("image", moduleItem.getImage())
                .set("modifyTime", new Date());
        mongoTemplate.updateMulti(query, update, ModuleItem.class);
    }

    @Override
    public void remove(ModuleItem moduleItem) {
        if(moduleItem == null){
            logger.error("moduleItem is null");
            return;
        }
        mongoTemplate.remove(moduleItem);
    }

    @Override
    public List<ModuleItem> queryAll() {
        return mongoTemplate.findAll(ModuleItem.class);
    }

/*    public static void main(String[] args) {
        ModuleItem item = new ModuleItem();
        item.setId(10000001);
        item.setModuleName("行业动态");
        item.setModuleId(2);
        item.setDescription("爱技术网很快就要上线啦，小伙伴们是不是很期待呀");
        item.setUrl("#");
        item.setImage("../images/hyaq.jpg");
        
        ModuleService service = new ModuleService();
        service.insert(item);
    }*/
}
