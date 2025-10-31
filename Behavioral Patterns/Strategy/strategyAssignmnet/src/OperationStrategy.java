public interface OperationStrategy {
    int preformOperation(int num1, int num2);
}

class Addition implements OperationStrategy{

    @Override
    public int preformOperation(int num1, int num2) {
        return num1+num2;
    }
}

class Subtraction implements OperationStrategy{

    @Override
    public int preformOperation(int num1, int num2) {
        return num1-num2;
    }
}

class Multiplication implements OperationStrategy{

    @Override
    public int preformOperation(int num1, int num2) {
        return num1*num2;
    }
}
