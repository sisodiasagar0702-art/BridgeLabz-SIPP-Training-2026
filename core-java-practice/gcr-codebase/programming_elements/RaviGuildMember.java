public class RaviGuildMember {
        public static void main(String[] args) {
        String name = "Ravi";
        int age = 25;
        String rank = "Novice";
        double salary = 50000.0;
        float membershipFee = 150.75f;
        double annualBonus = salary * 0.12;
        int annualBonusInt = (int) annualBonus; //int annualBonusInt = (int) annualBonus;  means that 
        // we are converting the double value of annualBonus to an integer. This is done by 
        // casting, which essentially truncates the decimal part and keeps only the whole
        //  number portion of the value. So, if annualBonus is 6000.0, after casting it to int, 
        // annualBonusInt will be 6000. If annualBonus were 5999.99, after casting it to int,
        //  annualBonusInt would be 5999.
        System.out.println("Welcome to the Coding Guild, " + name + "!");
        System.out.println("Age: " + age);
        System.out.println("Rank: " + rank);
        System.out.println("Sakary: $" + salary);
        System.out.println("Membership Fee: $" + membershipFee);
        System.out.println("Annual Bonus: $" + annualBonusInt);

        }
    
}

