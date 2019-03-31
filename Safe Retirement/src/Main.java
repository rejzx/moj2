import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    //Constants
    //public static final int PILIER_1_PERCENTAGE = 18;
    //public static final int PILIER_2_PERCENTAGE = PILIER_1_PERCENTAGE - 4;
    
    public static final double AKTUALNA_DOCHODKOVA_HODNOTA = 12.6657;
    public static final double VSEOBECNY_VYMERIAVACI_ZAKLAD = 13000;
    public static final double ADH = 12.6657;
    public static final double DIVIDER = 0.3;
    public static final double YEAR = 365;
	
	
    /*
     * Kalkulacia P1 basics
     * HPOMB x ROKY x ADH = DOCHODOK
     * Hodnota  priemerneho  osobneho  mzdoveho  bodu  
     * (rocny plat(hruba mzda)  /  13,000  +  0.3  x  nemocenske dni  /  365 )
     * Odpracovane  roky  (napr. 40)
     * Aktualna  dochodkova  hodnota  12.6657€ (2019)
     * 
     */
    
    public static void main(String[] args) throws IOException {
		
    	Scanner input = new Scanner(System.in);
    	
    	String name ;
    	double salary, hospitalisedDays, retirement, workedYears;
    	
    	
    	
    	System.out.print("ENTER NAME: ");
    	name = input.nextLine();
    	
    	System.out.print("ENTER SALARY: ");
    	salary = input.nextInt();
    	
    	System.out.print("ENTER WORKED YEARS: ");
    	workedYears = input.nextInt();
    	
    	System.out.print("ENTER HOSPITALISED DAYS YEARS: ");
    	hospitalisedDays = input.nextInt();
    	
    
    	System.out.print("\n\nWelcome to SAFE RETIREMENT application. " + name.toUpperCase() + "\n");
    	
    	System.out.print("-------------------------------------------------------\n");
    	
    	double HPOMB;
    	DecimalFormat df2 = new DecimalFormat(".##");
    	
    	HPOMB = (double) ((salary / VSEOBECNY_VYMERIAVACI_ZAKLAD) + (DIVIDER * hospitalisedDays / YEAR)) ;
    	
    	retirement = (double) (HPOMB * workedYears * ADH);
    	
    	System.out.print("You are entiteled to " + df2.format(retirement) + " per month\n");
    	System.out.print("-------------------------------------------------------");
        
        input.close();
	}
}
