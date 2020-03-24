
public class ExamManagementSystem {

    public static void main(String[] args) {
      
        Paper p1=new Paper("Java","CS103","Sir Roman","2nd","BS CS","Annual"," dept IIT room no 7 ",143,400,3,5,2020,9,30,0,false);
        
        Paper p2=new Paper("Math","CS203","Madam Rida","2nd","BS CS","Annual"," dept IIT room no 7",143,400,4,5,2020,9,30,0,false);
        
        Paper p3=new Paper("Eng","CS101","Sir Nasir","2rd","BS CS","Annual"," dept IIT room no 7",143,400,5,5,2020,9,30,0,false);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        
        System.out.println(p1.toString()+new Course("java","CS101","MCS"));
        System.out.println(p2.toString()+new Course("Math","CS102","MSC"));
        System.out.println(p3.toString()+new Course("English","CS201","MSC"));
    }
    
}
