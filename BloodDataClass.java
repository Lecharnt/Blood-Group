//Create a class named BloodData
public class BloodDataClass {

    public enum BloodData {//includes String fields that hold a blood type
        // (the four blood types are O, A, B, and AB)
        O("+", "-"),
        A("+", "-"),
        B("+", "-"),
        AB("+", "-");
        private final String POSITIVE;//Fields for both positive and negative
        private final String NEGATIVE;

        BloodData(String POSITIVE, String NEGATIVE) {//initialize positive and negative for all blood
            this.POSITIVE = POSITIVE;
            this.NEGATIVE = NEGATIVE;
        }
        public String getPOSITIVE() {//getter for POSITIVE
            return POSITIVE;
        }
        public String getNEGATIVE() {//getter for NEGATIVE
            return NEGATIVE;
        }
        public String DefaultBloodType(){// default blood type
            return POSITIVE;
        }
        public static BloodData DefaultBloodData(){// default blood Data
            return BloodData.O;
        }
    }
}