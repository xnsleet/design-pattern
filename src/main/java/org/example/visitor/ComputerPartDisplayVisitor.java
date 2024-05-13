package org.example.visitor;

import org.example.visitor.part.*;

/**
 * @author sleet
 * @version 2024/5/13
 */
public class ComputerPartDisplayVisitor
        implements ComputerPartVisitor {

    @Override
    public void visit(Computer computer) {
        System.out.println("display computer");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("display mouse");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("display keyboard");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("display monitor");
    }
}
