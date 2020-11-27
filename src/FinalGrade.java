import java.util.Map;
import java.util.Set;

public class FinalGrade {

    private static Map<String, Integer> originalScore;
    private static Map<String, Integer> upgradedScore;

    public static void main(String[] args) {
        originalScore = TestScores.getOriginalGrades();
        upgradedScore = TestScores.getMakeUpGrades();

        for (var student : upgradedScore.entrySet()){
            int firstGrade = originalScore.get(student.getKey());
            int secondGrade = upgradedScore.get(student.getKey());

            if( firstGrade < secondGrade){
                originalScore.put(student.getKey(), secondGrade);
            }

            System.out.println("Final Scores \n" +student.getKey() +", " +student.getValue());
        }




    }
}
