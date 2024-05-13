package org.example.visitor.part;

import org.example.visitor.ComputerPartVisitor;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class Mouse
        implements ComputerPart {

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
