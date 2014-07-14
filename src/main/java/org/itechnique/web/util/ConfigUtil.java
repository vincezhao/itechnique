package org.itechnique.web.util;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ConfigUtil {
    
    private static Properties prop;
    
    static {
        load();
    }
    
    private static void load(){
        prop = new Properties();
        Resource resource = new ClassPathResource("classpath:conf/mongo.properties");
        try {
            if(resource.getFile() != null){
                prop.load(resource.getInputStream());
            }
        } catch (IOException e) {
            //
        }
    }
    
    public static Properties getProperties(){
        if(prop == null){
            load();
        }
        return prop;
    }
}
