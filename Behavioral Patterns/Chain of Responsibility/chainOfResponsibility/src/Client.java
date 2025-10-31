import java.util.Scanner;

public class Client {
    private DispenseChain dispenseChain;

    public Client(){
        this.dispenseChain = new Dispense50();
        DispenseChain dispense20 = new Dispense20();
        DispenseChain dispense10 = new Dispense10();

        this.dispenseChain.setNextChain(dispense20);
        dispense20.setNextChain(dispense10);
    }

    public static void main(String[] args) {
        Client atm = new Client();

        while(true){
            int amount =0;

            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();

            if(amount % 10 !=0){
                System.out.println("Amount should be in multiple of 10s");
            }else {
                atm.dispenseChain.dispenseCurrency(new Currency(amount));
            }

        }

    }
}

