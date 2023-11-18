package week7_objects;

public class ITECCourseManager {
    public static void main(String[] args) {
        ITECCourse maintenanceCourse = new ITECCourse("Microcomputer Systems Maintenance", 1310, 20);

        // Add some students. TODO check that we have not exceeded the max number for the class
        maintenanceCourse.addStudent("Suban");
        maintenanceCourse.addStudent("Clara");
        maintenanceCourse.addStudent("Hana");

        maintenanceCourse.removeStudent("Suban");
        maintenanceCourse.removeStudent("Martha");

        maintenanceCourse.writeCourseInfo();

        ITECCourse datacomCourse = new ITECCourse("Data Communication", 1425, 30);

        //Add come Students
        datacomCourse.addStudent("ED");
        datacomCourse.addStudent("Lara");
        datacomCourse.addStudent("Dave");

        datacomCourse.writeCourseInfo();

        ITECCourse softwareDevelopmentProject = new ITECCourse("Software Development Project", 2903, 24 );
        softwareDevelopmentProject.addStudent("Gus"); ;
        softwareDevelopmentProject.addStudent("Harry");
        softwareDevelopmentProject.addStudent("Izzy");
        softwareDevelopmentProject.addStudent("Jake");

        int totalEnrolled = softwareDevelopmentProject.getNumberOfStudents();
        System.out.println("The " + softwareDevelopmentProject.getName() +  " class has " + totalEnrolled + " students");
        System.out.println("ITEC " + softwareDevelopmentProject.getCode() + " " + softwareDevelopmentProject.getName());

        softwareDevelopmentProject.setMaxStudents(-30);
        softwareDevelopmentProject.writeCourseInfo();

        ITECCourse smallCourse = new ITECCourse("Make up course", 1234, 3);
        smallCourse.addStudent("Kirby");
        smallCourse.addStudent("Liam");
        smallCourse.addStudent("Miriam");
        smallCourse.removeStudent("Kirby");
        smallCourse.addStudent("Nita");

        smallCourse.writeCourseInfo();
    }
}
