package org.itechnique.module.service.intf;

import java.util.List;

import org.itechnique.module.bean.ModuleItem;

public interface IModule {

    public void insert(ModuleItem moduleItem);
    
    public List<ModuleItem> queryByModuleId(String moduleId, Integer startIndex, Integer length);
    
    public List<ModuleItem> queryAll();
    
    public void update(ModuleItem moduleItem);
    
    public void remove(ModuleItem moduleItem);
    
}
