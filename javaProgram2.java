import java.time.chrono.ThaiBuddhistChronology;

public class javaProgram2 {
    int id,number;
    String name;
    public javaProgram2(int id,int number,String name){
            this.id = id;
            this.number = number;
            this.name =  name;
    }
    public static void main(String rag[]){
        int id = 1;
        int number = 121;
        String name = "sachin";
      javaProgram2 obj = new javaProgram2(id,number,name);
      
    }    
}
