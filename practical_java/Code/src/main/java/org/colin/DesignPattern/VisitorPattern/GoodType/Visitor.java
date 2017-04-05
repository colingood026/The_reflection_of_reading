package org.colin.DesignPattern.VisitorPattern.GoodType;

/**
 * Created by Colin on 2017/4/5.
 */
public interface Visitor {
    void visit(Member member);
    void visit(VIP vip);
}
