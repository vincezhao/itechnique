package org.itechnique.member.service.intf;

import org.itechnique.member.bean.MemberBean;

public interface IMember {
    /**
     * 创建会员信息
     */
    public void createMember(MemberBean member);

    /**
     * 修改会员信息
     */
    public void modifyMember(MemberBean member);

    /**
     * 根据昵称查询会员信息
     */
    public MemberBean queryByNick(String nick);
 
    /**
     * 根据会员编号查询会员信息
     */
    public MemberBean queryByMemberId(String memberId);
    
    /**
     * 修改会员级别信息
     */
    public void modifyLevel(String memberId, Integer level);
}
