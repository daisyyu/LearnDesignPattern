package behavioral.interpreter.improved;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.util.Map;

class Minus implements Expression {
    Expression leftOperand;
    Expression rightOperand;

    public Minus(Expression left, Expression right) {
        leftOperand = left;
        rightOperand = right;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        if (leftOperand == null && rightOperand == null) {
            throw new InvalidParameterException(
                    "- operation can not be applied to expression that both right and left are empty");
        }
        if (leftOperand == null) {
            leftOperand = new Number(0);
        }
        return leftOperand.interpret(variables) - rightOperand.interpret(variables);
    }
}
