package com.sb.basic.seleniumtesting;

public class SwitchCaseBasics {

	public static void main(String[] args) {
        int dayNumber = 7;
        
        switch(dayNumber) {
        
        case 1:
        	System.out.println("Day 1 is Monday");
            break;
        case 2:
        	System.out.println("Day 2 is Tuesday");
        	break;
        case 3:
        	System.out.println("Day 3 is Wednesday");
            break;
        case 4:
        	System.out.println("Day 4 is Thursday");
        	break;
        case 5:
        	System.out.println("Day 5 is Friday");
            break;
        case 6:
        	System.out.println("Day 6 is Saturday");
        	break;
        case 7:
        	System.out.println("Day 7 is Sunday");
        	break;
        default:
        	System.out.println("Day Number is invalid");
        }
		 
	}

}
