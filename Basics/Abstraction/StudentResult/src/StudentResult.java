public class StudentResult {

    String name;

    public StudentResult(String name){

        this.name = name;

    }


    public void resultDeclaration(String subject , int marks){

        System.out.println(this.name + " " + "marks  is :" + marks + " " + "in subject" +" " +
        subject);
    }
}
