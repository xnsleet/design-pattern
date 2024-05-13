package org.example.visitor;

import org.example.visitor.part.Computer;
import org.example.visitor.part.Keyboard;
import org.example.visitor.part.Monitor;
import org.example.visitor.part.Mouse;

/**
 * @author sleet
 * @version 2024/5/13
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
