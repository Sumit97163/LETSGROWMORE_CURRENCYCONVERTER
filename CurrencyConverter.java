import java.util.*;
// import java.awt.*;
import java.text.DecimalFormat;

public class CurrencyConverter {
    public static void main(String[] args){
        double amount;
        double rupee, dollar, pound, euro, yen, ringgit;
        int choice;
        DecimalFormat f = new DecimalFormat("##.##");

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Following are the choice:");
        System.out.println("Enter 1:Rupee");
        System.out.println("Enter 2: Dollar");
        System.out.println("Enter 3: Pound");
        System.out.println("Enter 4: Euro");
        System.out.println("Enter 5 :Yen");
        System.out.println("Enter 6: Ringgit");

        System.out.println("\nchoose from above options:");
        choice = sc.nextInt();

        System.out.println("Enter amount you want to convert?:");
        amount = sc.nextFloat();


        switch(choice) {
            case 1:
                dollar = amount/70;
                System.out.println(amount + "Rupee = " + f.format(dollar)+"Dollar");

                pound = amount/88;
                System.out.println(amount + "Rupee = " + f.format(pound)+"Pound");

                euro=amount/80;
                System.out.println(amount + "Rupee = " + f.format(euro)+"Euro");

                yen = amount/0.63;
                System.out.println(amount + "Rupee = " + f.format(yen)+"Yen");

                ringgit = amount/16;
                System.out.println(amount + "Rupee = " + f.format(ringgit)+"ringgit");
                break;
        
            case 2:
            rupee = amount*70;
                System.out.println(amount + "Dollar = " + f.format(rupee)+"Rupee");

                pound = amount*0.78;
                System.out.println(amount + "Dollar = " + f.format(pound)+"Pound");

                euro=amount*0.87;
                System.out.println(amount + "Dollar = " + f.format(euro)+"Euro");

                yen = amount*111.087;
                System.out.println(amount + "Dollar = " + f.format(yen)+"Yen");

                ringgit = amount*4.17;
                System.out.println(amount + "Rupee = " + f.format(ringgit)+"ringgit");
                break;

            case 3:
            rupee = amount*88;
                System.out.println(amount + "Pound = " + f.format(rupee)+"Rupees");

                dollar = amount*1.26;
                System.out.println(amount + "Pound = " + f.format(dollar)+"Dollar");

                euro=amount*1.10;
                System.out.println(amount + "Pound = " + f.format(euro)+"Euro");

                yen = amount*140.93;
                System.out.println(amount + "Pound = " + f.format(yen)+"Yen");

                ringgit = amount*5.29;
                System.out.println(amount + "Pound = " + f.format(ringgit)+"ringgit");
                break;

            case 4:
            rupee=amount*80;
            
                System.out.println(amount + "euro = " + f.format(rupee)+"Rupees");

                dollar = amount*1.14;
                System.out.println(amount + "euro = " + f.format(dollar)+"Dollar");

                pound=amount*0.90;
                System.out.println(amount + "euro = " + f.format(pound)+"Pound");

                yen = amount*127.32;
                System.out.println(amount + "euro = " + f.format(yen)+"Yen");

                ringgit = amount*4.78;
                System.out.println(amount + "euro = " + f.format(ringgit)+"ringgit");
                break;

            case 5:
            rupee = amount*0.63;
                System.out.println(amount + "yen = " + f.format(rupee)+"Rupees");

                dollar = amount*0.008;
                System.out.println(amount + "yen = " + f.format(dollar)+"Dollar");

                pound=amount*0.007;
                System.out.println(amount + "yen = " + f.format(pound)+"Pound");

                euro = amount*0.007;
                System.out.println(amount + "yen = " + f.format(euro)+"Euro");

                ringgit = amount*0.037;
                System.out.println(amount + "yen = " + f.format(ringgit)+"ringgit");
                break;

            case 6:
            rupee = amount*16.8;
                System.out.println(amount + "ringgit = " + f.format(rupee)+"Rupees");

                dollar = amount*0.239;
                System.out.println(amount + "ringgit = " + f.format(dollar)+"dollar");

                pound=amount*0.188;
                System.out.println(amount + "ringgit = " + f.format(pound)+"Pound");

                euro = amount*209;
                System.out.println(amount + "Rupee = " + f.format(euro)+"Euro");

                yen = amount*26.63;
                System.out.println(amount + "ringgit = " + f.format(yen)+"Yen");
                break;



            default:
            System.out.println("Invalid Input");
                
        }
    }

}
    