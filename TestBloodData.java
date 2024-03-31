import java.util.Objects;
import java.util.Scanner;
public class TestBloodData {
    public static void main(String[] args) {

        Scanner userInputBloodType = new Scanner(System.in);//scanner for Blood tipe
        System.out.println("What Blood Type Are You");
        System.out.println("Type A,B,AB, or O: ");
        String userBloodType = userInputBloodType.nextLine().toUpperCase();


        Scanner userInputBloodPosNeg = new Scanner(System.in);//scanner for Blood Pos or Neg
        System.out.println("Are You "+userBloodType+" Positive or "+userBloodType+" Negative");
        System.out.println("Type Negative or Positive: ");
        String userBloodPosNeg = userInputBloodPosNeg.nextLine().toLowerCase();
        //convert to enum
        BloodDataClass.BloodData userBloodTypeEn = BloodDataClass.BloodData.valueOf(userBloodType);

        //check for positive or negative blood
        if (Objects.equals(userBloodPosNeg.toLowerCase(), "negative")){
            String userBloodPosNegEn = userBloodTypeEn.getNEGATIVE();
            System.out.println("Your Blood Type: " + userBloodType + " " + userBloodPosNegEn);
        }
        else if (Objects.equals(userBloodPosNeg.toLowerCase(), "positive")){
            String userBloodPosNegEn = userBloodTypeEn.getPOSITIVE();
            System.out.println("Blood: " + userBloodType + userBloodPosNegEn);
        }

    }
}
