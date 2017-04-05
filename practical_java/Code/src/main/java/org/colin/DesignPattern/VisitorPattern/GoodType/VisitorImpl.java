package org.colin.DesignPattern.VisitorPattern.GoodType;

/**
 * Created by Colin on 2017/4/5.
 */
public class VisitorImpl implements Visitor{
    @Override
    public void visit(Member member) {
        member.doMember();
    }

    @Override
    public void visit(VIP vip) {
        vip.doVIP();
    }
}
