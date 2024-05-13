package org.example.visitor.part;

import org.example.visitor.ComputerPartVisitor;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class Computer
        implements ComputerPart {

    private ComputerPart[] parts;

    public Computer(){
        parts = new ComputerPart[]{new Mouse(), new Monitor(), new Keyboard()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (ComputerPart part : parts) {
            part.accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
