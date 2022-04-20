

import java.util.Scanner;
public class WaterBilling {
    public void run(){
        Scanner s = new Scanner(System.in);
        System.out.println("enter last month Meter reading :");
        double am_1 = s.nextDouble();
        System.out.println("enter this month Meter reading :");
        double am_2 = s.nextDouble();
        double user_am = am_2 - am_1;
        System.out.println("Amount of days: ");
        double d=s.nextDouble();
        System.out.println("enter the size of the water connection :");
        double size = s.nextDouble();
        double basicCharge;
        System.out.println(" ");
        System.out.println("Start Date:"+  "\t"+"End Date:" );
        System.out.println("Previous meter rading :" + am_1+"\t" + "Current meter reading:" + am_2 );
        System.out.println("no of days in period:" + d);
        System.out.println("Water used:" +user_am +"kl");
        System.out.println("__________________________________________________________________________________________________________________");
        System.out.println("Consumption in kilolitres");
        System.out.println("from:" +"\t "+"\t" + "To:" +"\t"+"\t" +"\t"+"Volume used:"+ "\t" +"Cumulative(in kl)"+ "\t"+ "Tarrif(excl VAT)" + "\t" +"Cost");
        System.out.println(" ");
        double r1 = (d/30.41666667) *6;
        double r2 = (d/30.41666667) *10.5;
        double r3 =(d/30.41666667) *20;
        double r4 = (d/30.41666667) *35;
        double r5 = (d/30.41666667) *50;
        double tarr_r1 =21.19;
        double tarr_r2 =34.43;
        double tarr_r3 =52.39;
        double tarr_r4 =52.39;
        double tarr_r5 =300.00;
        double val = 0;
        double val2 = 0;
        double val_1 = 0;
        double val_2= 0;
        double val_3=0;
        double val_4=0;
        double val_5=0;
        double val_r1 = 0;
        double val_r2= 0;
        double val_r3=0;
        double val_r4=0;
        double val_r5=0;
        if (user_am > r1){
            
            val = user_am - r1;
            val2 = r1 * tarr_r1;
            val_r1=r1;
        }
        else{
            val2 = user_am*tarr_r1;
        }
         if((val > 0 )&& val <=(r2-r1)){
             val2 = val2 + (val*tarr_r2);
             val_r2 = val;
            }
         else{
             val_r2 = r2-r1;
             val_1= val - (r2-r1);
             val2 = val2 + ((r2-r1)*tarr_r2);
             if((val_1 > 0 )&& val_1 <=(r3-r2)){
             val_r3 = val_1;
             val2 = val2 + (val_1*tarr_r3); 
            } 
             else{
             val_r3=r3-r2;
             val_2= val_1 - (r3-r2);
             val2 = val2 + ((r3-r2)*tarr_r3);
             if((val_2 > 0 )&& val_2 <=(r4-r3)){
             val_r4 = val_2;
             val2 = val2 + (val_2*tarr_r4); 
            }
             else{
             val_r4 = r4-r3;
             val_3= val_2 - (r4-r3);
             val2 = val2 + ((r4-r3)*tarr_r4);
             if((val_3 > 0 )&& val_3 <=(r5-r4)){
             val_r5=val_3;
             val2 = val2 + (val_3*tarr_r5); 
            }
             else{
             val_r5 = r5-r4;
             val_4= val_3 - (r5-r4);
             val2 = val2 + ((r4-r3)*tarr_r5);
             if(val_4> (r5-r4)){
                 val2 = val2 + (val_4);
             }
             }
             }
                 
             }
         }
         if (size == 15){
         	basicCharge = 56;
         }
         else{
         	basicCharge = 100;
         }
   
         /*System.out.println(val_r1);
         System.out.println(val_r2);
         System.out.println(val_r3);
         System.out.println(val_r4);
         System.out.println(val_r5);*/
        double sum = val_r1;
        double sum2 = sum +val_r2;
        double sum3 = sum2+val_r3;
        double sum4 = sum3 +val_r4;
        double sum5 =sum4+ val_r5;
        System.out.println(String.format("%.2f", val2));
        System.out.println("0.0000" +"\t" +"\t"+String.format("%.4f",r1) +"\t"+"\t" +"\t"+ String.format("%.4f",val_r1)+"\t" +"\t" +String.format("%.4f",sum)+"\t"+"\t"+"\tR" +tarr_r1+"\t"+"\t"+"\t"+String.format("R%.2f",(val_r1*tarr_r1)));
        System.out.println(String.format("%.4f",r1) +"\t" +"\t"+String.format("%.4f",r2)+"\t"+"\t" +"\t" + String.format("%.4f",val_r2)+"\t" +"\t"+ String.format("%.4f",sum2)+"\t"+"\t"+"\tR"+tarr_r2+"\t"+"\t"+"\t"+String.format("R%.2f",(val_r2*tarr_r2)));
        System.out.println(String.format("%.4f",r2)+ "\t" +"\t"+String.format("%.4f",r3)+"\t"+"\t" +"\t"+String.format("%.4f",val_r3)+"\t"+"\t" + String.format("%.4f",sum3)+"\t"+"\t"+"\tR"+tarr_r3+"\t"+"\t"+"\t"+String.format("R%.2f",(val_r3*tarr_r3)));
        System.out.println(String.format("%.4f",r3)+ "\t" +"\t"+String.format("%.4f",r4)+"\t"+"\t" +"\t"+String.format("%.4f",val_r4)+"\t" +"\t"+ String.format("%.4f",sum4)+"\t"+"\t"+"\tR"+tarr_r4+"\t"+"\t"+"\t"+String.format("R%.2f",(val_r4*tarr_r4)));
        System.out.println(String.format("%.4f",r4)+ "\t" +"\t"+String.format("%.4f",r5)+"\t"+"\t" +"\t"+String.format("%.4f", val_r5)+"\t"+"\t" + String.format("%.4f",sum5)+"\t"+"\t"+"\tR"+tarr_r5+"\t"+"\t"+"\t"+String.format("R%.2f",(val_r5*tarr_r5)));
        System.out.println("__________________________________________________________________________________________________________________");
        System.out.println("\t \t \t \t \t \t \t \t \t \t \t subtotal: \t" +String.format("R%.2f", (val2)));
        System.out.println("\t \t \t \t \t \t \t \t \t \t \t \t ================");
        System.out.println(String.format("Fixed basic charge: %d mm connection", (int) (size)) +" \t \t \t \t \t \t \t \t \t" +String.format("R%.2f", (basicCharge)));
        System.out.println("\t \t \t \t \t \t \t \t \t \t \t VAT: \t\t" +String.format("R%.2f", ((val2+basicCharge) *0.14)));
        System.out.println("\t \t \t \t \t \t \t \t \t \t \t \t _________________");
        System.out.println("\t \t \t \t \t \t \t \t \t \t \t subtotal: \t" + String.format("R%.2f",((val2+basicCharge) +((val2+basicCharge) *0.14))));
        System.out.println("\t \t \t \t \t \t \t \t \t \t \t \t ================");
    }
     public static void main(String[] args){
         WaterBilling ob = new WaterBilling();
         ob.run();
    }
    
}
