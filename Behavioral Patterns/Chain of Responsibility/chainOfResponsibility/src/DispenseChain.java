public interface DispenseChain {
    void setNextChain(DispenseChain nextChain);
    void dispenseCurrency(Currency currency);
}

class Dispense50  implements  DispenseChain{
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispenseCurrency(Currency currency) {
        if(currency.getAmount() >=50){
            int num = currency.getAmount()/50;
            int rem = currency.getAmount() % 50;
            System.out.println("Despensing "+num +" of 50$");
            if(rem != 0){
                this.nextChain.dispenseCurrency(new Currency(rem));
            }
        }else {
            this.nextChain.dispenseCurrency(currency);
        }
    }
}

class Dispense20  implements  DispenseChain{
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispenseCurrency(Currency currency) {
        if(currency.getAmount() >=20){
            int num = currency.getAmount()/20;
            int rem = currency.getAmount() % 20;
            System.out.println("Despensing "+num +" of 20$");
            if(rem != 0){
                this.nextChain.dispenseCurrency(new Currency(rem));
            }
        }else {
            this.nextChain.dispenseCurrency(currency);
        }
    }
}

class Dispense10  implements  DispenseChain{
    private DispenseChain nextChain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void dispenseCurrency(Currency currency) {
        if(currency.getAmount() >=10){
            int num = currency.getAmount()/10;
            int rem = currency.getAmount() % 10;
            System.out.println("Despensing "+num +" of 10$");
            if(rem != 0){
                this.nextChain.dispenseCurrency(new Currency(rem));
            }
        }else {
            this.nextChain.dispenseCurrency(currency);
        }
    }
}

