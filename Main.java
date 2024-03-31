import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {// three Patient objects. Use all default values for one Patient object
        Patient Patient= new Patient();
        Patient.setDefault();//sets the Patient to Default
        Patient.setPatient(Patient.getID_number(), Patient.getAge(),Patient.getBloodData(),Patient.getType());//creates the patient
        System.out.println("Age: "+Patient.getAge()+ "\nID: "+Patient.getID_number()+ "\nBlood: "+ Patient.getBloodData()+"\nBlood Type: "+ Patient.getType());

        if (Patient.getBloodData() == BloodDataClass.BloodData.O && "+".equals(Patient.getBloodData().getPOSITIVE())) {//finds the rareity of your blood
            System.out.println("35 Percent of the population has your blood type");
        }
        else if (Patient.getBloodData() == BloodDataClass.BloodData.O && "-".equals(Patient.getBloodData().getNEGATIVE())) {
            System.out.println("13 Percent of the population has your blood type");
        }
        else if (Patient.getBloodData() == BloodDataClass.BloodData.A && "+".equals(Patient.getBloodData().getPOSITIVE())) {
            System.out.println("30 Percent of the population has your blood type");
        }
        else if (Patient.getBloodData() == BloodDataClass.BloodData.A && "-".equals(Patient.getBloodData().getNEGATIVE())) {
            System.out.println("8 Percent of the population has your blood type");
        }
        else if (Patient.getBloodData() == BloodDataClass.BloodData.B && "+".equals(Patient.getBloodData().getPOSITIVE())) {
            System.out.println("8 Percent of the population has your blood type");
        }
        else if (Patient.getBloodData() == BloodDataClass.BloodData.B && "-".equals(Patient.getBloodData().getNEGATIVE())) {
            System.out.println("2 Percent of the population has your blood type");
        }
        else if (Patient.getBloodData() == BloodDataClass.BloodData.AB && "+".equals(Patient.getBloodData().getPOSITIVE())) {
            System.out.println("2 Percent of the population has your blood type");
        }
        else if (Patient.getBloodData() == BloodDataClass.BloodData.AB && "-".equals(Patient.getBloodData().getNEGATIVE())) {
            System.out.println("1 Percent of the population has your blood type");
        }


        Patient.setDefault();
        //prompt the user for values for the second Patient object,
        Scanner IDnum = new Scanner(System.in);
        System.out.println("\n\nWhat is Your ID: ");//asks for your id
        int IDnumInput;//tests if your entering a valid number
        try {
            IDnumInput = IDnum.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You did not enter a valid number");
            return;
        }//tests if your ID is 8 digits long
        if (IDnumInput > 10000000 && IDnumInput < 1000000000){
            System.out.println("Your ID has to be 8 digits long");
            return;
        }

        Scanner Agenum = new Scanner(System.in);//asks how old you are
        System.out.println("How Old are You: ");
        int AgenumInput;
        try {//tests if it is a valid number
             AgenumInput = Agenum.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You did not enter a valid number");
            return;
        }
        if (AgenumInput >120){// test if the person is putting a fake age
            System.out.println("You inputted an age older then 120 which is imposable");
            return;
        }

        Scanner userTwoInputBloodTypeName = new Scanner(System.in);//asks the user for their blood type
        System.out.println("What Blood Type Are You");
        System.out.println("Type A,B,AB, or O: ");
        String userTwoBloodTypeName = userTwoInputBloodTypeName.nextLine().toUpperCase();

        BloodDataClass.BloodData bloodTypeTesting = null;
        try {//finds if the user inputs something that is not a b o or ab
            bloodTypeTesting = BloodDataClass.BloodData.valueOf(userTwoBloodTypeName);
        } catch (IllegalArgumentException e) {
            System.out.println("You entered a blood type other then A, B, AB, or O.");
            return;
        }
        BloodDataClass.BloodData userBloodTypeNameEn = BloodDataClass.BloodData.valueOf(userTwoBloodTypeName);//sets the blood type name

        Scanner userTwoInputBloodPosNeg = new Scanner(System.in);//asks whether their blood is negative or positive
        System.out.println("Are You "+userTwoBloodTypeName+" Positive or "+userTwoBloodTypeName+" Negative");
        System.out.println("Type Negative or Positive: ");
        String userBloodPosNeg = userTwoInputBloodPosNeg.nextLine().toLowerCase();
        if (Objects.equals(userBloodPosNeg.toLowerCase(), "negative")){//if it is negative, it sets it to negative
            String userBloodPosNegEn = userBloodTypeNameEn.getNEGATIVE();
            Patient.setPatient(IDnumInput,AgenumInput,userBloodTypeNameEn,userBloodPosNegEn);
            System.out.println("Age: "+Patient.getAge()+ "\nID: "+Patient.getID_number()+ "\nBlood: "+ Patient.getBloodData()+ Patient.getType());
        }
        else if (Objects.equals(userBloodPosNeg.toLowerCase(), "positive")){
            String userBloodPosNegEn = userBloodTypeNameEn.getPOSITIVE();//if it is positive, it sets it to positive
            Patient.setPatient(IDnumInput,AgenumInput,userBloodTypeNameEn,userBloodPosNegEn);
            System.out.println("Age: "+Patient.getAge()+ "\nID: "+Patient.getID_number()+ "\nBlood: "+ Patient.getBloodData()+ Patient.getType());
        }
        else {//tests it the user implements anything that's not negative or positive
            System.out.println("You entered something other then Negative or Positive.");
            return;
        }
        if (Patient.getBloodData() == BloodDataClass.BloodData.O && "+".equals(Patient.getBloodData().getPOSITIVE())) {//finds the rareity of your blood
            System.out.println("35 Percent of the population has your blood type");
        }
        else if (Patient.getBloodData() == BloodDataClass.BloodData.O && "-".equals(Patient.getBloodData().getNEGATIVE())) {
            System.out.println("13 Percent of the population has your blood type");
        }
        else if (Patient.getBloodData() == BloodDataClass.BloodData.A && "+".equals(Patient.getBloodData().getPOSITIVE())) {
            System.out.println("30 Percent of the population has your blood type");
        }
        else if (Patient.getBloodData() == BloodDataClass.BloodData.A && "-".equals(Patient.getBloodData().getNEGATIVE())) {
            System.out.println("8 Percent of the population has your blood type");
        }
        else if (Patient.getBloodData() == BloodDataClass.BloodData.B && "+".equals(Patient.getBloodData().getPOSITIVE())) {
            System.out.println("8 Percent of the population has your blood type");
        }
        else if (Patient.getBloodData() == BloodDataClass.BloodData.B && "-".equals(Patient.getBloodData().getNEGATIVE())) {
            System.out.println("2 Percent of the population has your blood type");
        }
        else if (Patient.getBloodData() == BloodDataClass.BloodData.AB && "+".equals(Patient.getBloodData().getPOSITIVE())) {
            System.out.println("2 Percent of the population has your blood type");
        }
        else if (Patient.getBloodData() == BloodDataClass.BloodData.AB && "-".equals(Patient.getBloodData().getNEGATIVE())) {
            System.out.println("1 Percent of the population has your blood type");
        }




        //and for the third object, prompt the user for Patient data but use default values for that Patient’s BloodData
        Patient.setDefault();
        Scanner IDnum2 = new Scanner(System.in);
        System.out.println("\n\nWhat is Your ID: ");//asks the user for their ID
        int IDnumInput2;
        try {//if they input an invalid number, it catches it
            IDnumInput2 = IDnum2.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You did not enter a valid number");
            return;
        }//if the number is too large or small, it also stops it
        if (IDnumInput2 > 100000000){
            System.out.println("Your ID has to be 8 digits long");
            return;
        }

        Scanner Agenum2 = new Scanner(System.in);
        System.out.println("How Old are You: ");//asks how old you are
        int AgenumInput2;

        try {
            AgenumInput2 = Agenum2.nextInt();
        } catch (InputMismatchException e) {//tests if you dont put a number
            System.out.println("You did not enter a valid number");
            return;
        }
        if (AgenumInput2 >120){//tests if the number is too large
            System.out.println("You inputted an age too large");
            return;
        }
        Scanner userTwoInputBloodTypeName2 = new Scanner(System.in);//asks about your blood type
        System.out.println("What Blood Type Are You");
        System.out.println("Type A,B,AB, or O: ");
        String userTwoBloodTypeName2 = userTwoInputBloodTypeName2.nextLine().toUpperCase();
        try {
            bloodTypeTesting = BloodDataClass.BloodData.valueOf(userTwoBloodTypeName2);
        } catch (IllegalArgumentException e) {//finds if you put an invalid number
            System.out.println("You entered a number other then A, B, AB, or O.");
            return;
        }

        Scanner userTwoInputBloodPosNeg2 = new Scanner(System.in);//finds weather or not the user puts Negative or positive and adds it to the Patient
        System.out.println("Are You "+userTwoBloodTypeName2+" Positive or "+userTwoBloodTypeName2+" Negative");
        System.out.println("Type Negative or Positive: ");
        String userBloodPosNeg2 = userTwoInputBloodPosNeg2.nextLine().toLowerCase();
        if (Objects.equals(userBloodPosNeg2.toLowerCase(), "negative")){
            Patient.setPatient(IDnumInput2,AgenumInput2,Patient.getBloodData(),Patient.getType());
            System.out.println("Age: "+Patient.getAge()+ "\nID: "+Patient.getID_number()+ "\nBlood: "+ Patient.getBloodData()+ Patient.getType());
        }
        else if (Objects.equals(userBloodPosNeg2.toLowerCase(), "positive")){
            Patient.setPatient(IDnumInput2,AgenumInput2,Patient.getBloodData(),Patient.getType());
            System.out.println("Age: "+Patient.getAge()+ "\nID: "+Patient.getID_number()+ "\nBlood: "+ Patient.getBloodData()+ Patient.getType());
        }
        else {//if the user puts something invalid, it stops it
            System.out.println("You entered something other then Negative or Positive.");
            return;
        }
        if (Patient.getBloodData() == BloodDataClass.BloodData.O && "+".equals(Patient.getBloodData().getPOSITIVE())) {//finds the rareity of your blood
            System.out.println("35 Percent of the population has your blood type");
        }
        else if (Patient.getBloodData() == BloodDataClass.BloodData.O && "-".equals(Patient.getBloodData().getNEGATIVE())) {
            System.out.println("13 Percent of the population has your blood type");
        }
        else if (Patient.getBloodData() == BloodDataClass.BloodData.A && "+".equals(Patient.getBloodData().getPOSITIVE())) {
            System.out.println("30 Percent of the population has your blood type");
        }
        else if (Patient.getBloodData() == BloodDataClass.BloodData.A && "-".equals(Patient.getBloodData().getNEGATIVE())) {
            System.out.println("8 Percent of the population has your blood type");
        }
        else if (Patient.getBloodData() == BloodDataClass.BloodData.B && "+".equals(Patient.getBloodData().getPOSITIVE())) {
            System.out.println("8 Percent of the population has your blood type");
        }
        else if (Patient.getBloodData() == BloodDataClass.BloodData.B && "-".equals(Patient.getBloodData().getNEGATIVE())) {
            System.out.println("2 Percent of the population has your blood type");
        }
        else if (Patient.getBloodData() == BloodDataClass.BloodData.AB && "+".equals(Patient.getBloodData().getPOSITIVE())) {
            System.out.println("2 Percent of the population has your blood type");
        }
        else if (Patient.getBloodData() == BloodDataClass.BloodData.AB && "-".equals(Patient.getBloodData().getNEGATIVE())) {
            System.out.println("1 Percent of the population has your blood type");
        }
    }
}
