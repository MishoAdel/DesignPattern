public class Calculator {

    int doOperation(OperationStrategy strategy,int num1,int nmu2){
       return strategy.preformOperation(num1,nmu2);
    }
}
