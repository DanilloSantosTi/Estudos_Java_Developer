package exercise03;

public class Student {

    public String name;
    public double note01;
    public double note02;
    public double note03;

    public String PassOrNoPass(){
        double result = note01 + note02 + note03;
        if (result < 60.0){
            String finalGrade = "FINAL GRADE = " + result;
            String resultGrade = "FAILED";
            double wantToPass = 60.0 - result;

            return finalGrade + "\n" + resultGrade + "\nMISSING " + wantToPass + " POINTS";
        } else {
            return "FINAL GRADE = " + result + "\nPASS";
        }
    }
}
