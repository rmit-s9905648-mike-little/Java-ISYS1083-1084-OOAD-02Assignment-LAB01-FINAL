package task1.refactored;

public class TestStudentEnrol
{

    public static void main(String[] args)
    {
        StudentEnrol se = new StudentEnrol();
        //
        se.addCore("P1");
        se.addCore("P8");
        se.addCore("OS");
        se.addCore("DC");
        se.addCore("WP");

        // "C++", "PHP", "Web3D", "ICT", "AI"
        se.addElective("PHP");
        se.addElective("Java");
        se.addElective("AI");
        se.addElective("C++");

        se.removeCore("P1");
        se.removeCore("P8");
        se.removeCore("OS");
        se.removeCore("DC");
        se.removeCore("WP");

        se.addCore("P1");
        se.addCore("P8");
        se.addCore("OS");
        se.addCore("DC");
        se.addCore("WP");

        se.removeElective("PHP");
        se.removeElective("Java");
        se.removeElective("AI");
        se.removeElective("C++");

        //se.display();
    }

}// close public class TestStudentEnrol
