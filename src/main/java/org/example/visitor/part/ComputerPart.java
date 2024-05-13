package org.example.visitor.part;

import org.example.visitor.ComputerPartVisitor;

/**
 * @author sleet
 * @version 2024/5/13
 */
public interface ComputerPart {

    void accept(ComputerPartVisitor computerPartVisitor);
}
