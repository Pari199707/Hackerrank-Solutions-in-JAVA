public static String dayOfProgrammer(int year) {
     if(year<1918){
        return julianCal(year);
    }
    else if(year == 1918){
        return "26.09.1918";
    }
    else {
        return gregorianCal(year);
    }
}
    

public static String julianCal(int year){
    if(year%4==0)
        return "12.09." + year;
        
    return "13.09." + year;
}

public static String gregorianCal(int year){
    if(year%4==0 && year%100!=0){
            //simple leap year
            return "12.09." + year;}
        
        else if(year%4==0 && year%100==0){
          if(year%400==0){
            //century + leap year
            return "12.09." + year; 
        }
        else{
            //century but not leap year
            return "13.09." + year;  
        }
    }
        
   //no leap year
   return "13.09." + year;
}
