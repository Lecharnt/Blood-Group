public class Patient {
    int ID_number;//includes an ID number, age, and BloodData
    int age;
    BloodDataClass.BloodData bloodData;
    String Type;
    public void setDefault(){//default constructor that sets the ID number to 0, the age to 0, and the BloodData values to the default BloodData values (O and +).
        ID_number=0;
        age=0;
        bloodData = BloodDataClass.BloodData.DefaultBloodData();
        Type = bloodData.DefaultBloodType();
    }

    // constructor that provides values for each field. Also provide get methods for each field. Save the file as Patient.java.
    public void setPatient(int ID_number, int age, BloodDataClass.BloodData bloodData,String type){
        this.ID_number = ID_number;
        this.age = age;
        this.bloodData = bloodData;
        this.Type =type;
    }
    public int getID_number(){//gets the ID number
        return ID_number;
    }
    public int getAge(){//gets the age
        return age;
    }
    public BloodDataClass.BloodData getBloodData(){//gets the Blood data
        return bloodData;
    }
    public String getType(){//gets the type of blood -+
        return Type;
    }
}
