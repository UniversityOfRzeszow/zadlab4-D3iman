package pl.edu.ur.polab4;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 4, 5
        
        Student student = new Student("Jan", "Nowak", 79474, "ISWD", 5);
        Student student1 = new Student("Jan", "Nowak", 79474, "ISWD");
        Student student2 = new Student("Jan", "Nowak", 79474);
        Student student3 = new Student("Jan", "Nowak");
        
        student.pokazDane();
        student1.pokazDane();
        student1.rok_studiow = 1000000;
        student2.pokazDane();
        student3.pokazDane();
    }
    
}
