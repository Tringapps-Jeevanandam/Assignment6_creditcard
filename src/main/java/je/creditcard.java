package je;

import java.util.*;
class CREDIT implements Cloneable{
    String cardHolderName;
    long cardNumber;
    String expDate;

    credit(String cardHolderName,long cardNumber,String expDate){
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.expDate = expDate;
    }
    boolean equals(long newCardNumber){
        return cardNumber==newCardNumber;
    }

    public Object clone()throws CloneNotSupportedException{  
        return super.clone();  
        }  

}
class CREDITCARD{
    public static void main(String[] args) throws CloneNotSupportedException {
        String cardHolderName;
        long cardNumber;
        String expDate;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Credit Card details:\nCard Holder Name: ");
        cardHolderName = sc.nextLine();
        System.out.println("Card Number:");
        cardNumber = sc.nextLong();
        System.out.println("Exp Date:");
        expDate = sc.next();

        credit cr = new credit(cardHolderName, cardNumber, expDate);
        credit cr2 = (credit)cr.clone();
        System.out.println("New card Number: ");
        long newCardNumber = sc.nextLong();
        if(cr.equals(newCardNumber)==false){
            System.out.println("Card number updated");
            cr2.cardNumber = newCardNumber;
        }
        else{
            System.out.println("Card Numbersk are same");
        }
        System.out.println("ORIGINAL CARD DETAILS: Card Holder Name: "+cr.cardHolderName+" Card Number:"+cr.cardNumber+" Exp Date: "+cr.expDate);
        System.out.println("AFTER CLONING : Card Holder Name: "+cr2.cardHolderName+" Card Number:"+cr2.cardNumber+" Exp Date: "+cr2.expDate);





    }
}
