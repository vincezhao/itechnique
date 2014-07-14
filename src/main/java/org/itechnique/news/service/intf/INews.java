package org.itechnique.news.service.intf;

import java.util.List;

import org.itechnique.news.bean.NewsBean;

/**
 * 
 * 功能描述： 新闻业务类接口(增查改删)
 * @author 作者 zhaowen@itechnique.com
 * @created 2014-5-1 下午5:21:49
 * @version 1.0.0
 * @date 2014-5-1 下午5:21:49
 */
public interface INews {
    /**
     * 功能描述：新建一条新闻
     * 输入参数：<按照参数定义顺序> 
     * @param 参数说明
     * 返回值:  类型 <说明> 
     * @return 返回值
     */
    public void createNews(NewsBean newsBean);
    /**
     * 功能描述：根据关键字获取新闻
     * 输入参数：<按照参数定义顺序> 
     * @param 参数说明
     * 返回值:  类型 <说明> 
     * @return 返回值
     */
    public List<NewsBean> getNewsByKey(String key);
    /**
     * 功能描述：根据主键修改新闻,并返回修改后的新闻
     * 输入参数：<按照参数定义顺序> 
     * @param 参数说明
     * 返回值:  类型 <说明> 
     * @return 返回值
     */
    public NewsBean modifyNewsById(NewsBean newsBean);
    /**
     * 功能描述：根据主键删除对应的新闻
     * 输入参数：<按照参数定义顺序> 
     * @param 参数说明
     * 返回值:  类型 <说明> 
     * @return 返回值
     */
    public void deleteNewsById(String newsID);
}
