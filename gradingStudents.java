public static List<Integer> gradingStudents(List<Integer> grades) {
       for (int i=0;i<grades.size();i++){
            int element=grades.get(i);
            int rem=element%5;
            if(element>=38 && rem>2){
                element=element+5-rem;
                grades.set(i,element);  
            }  
        }
        return grades;    

}
