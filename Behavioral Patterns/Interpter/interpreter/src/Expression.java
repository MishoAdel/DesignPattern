public interface Expression {
    String interpret(InterpreterContext ic);
}

class IntToBinaryExpression implements Expression{
    private int i;

    IntToBinaryExpression(int j){
        i=j;
    }


    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getBinaryFormat(i);
    }
}

class IntToHexExpression implements Expression{
    private int i;

    IntToHexExpression(int j){
        i=j;
    }


    @Override
    public String interpret(InterpreterContext ic) {
        return ic.getHexFormat(i);
    }
}