package org.itechnique.member.service;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.itechnique.member.bean.MemberBean;
import org.itechnique.member.service.intf.IMember;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class MemberService implements IMember {
    
    private static final Logger logger = LoggerFactory.getLogger(MemberService.class);

    @Autowired
    SqlSession sqlSession;
    
    @Override
    public void createMember(MemberBean member) {
        if(member != null){
            sqlSession.insert("ITECHNIQUE_MEMBER.CREATE", member);
        }
    }

    @Override
    public void modifyMember(MemberBean member) {
        if(member != null){
            sqlSession.update("ITECHNIQUE_MEMBER.UPDATE", member);
        }
    }

    @Override
    public MemberBean queryByNick(String nick) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MemberBean queryByMemberId(String memberId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void modifyLevel(String memberId, Integer level) {
        Map<String,Object> param = new HashMap<String,Object>();
        param.put("memberId", memberId);
        param.put("level", level);
        sqlSession.update("ITECHNIQUE_MEMBER.MODIFYLEVEL", param);
    }
    
}
