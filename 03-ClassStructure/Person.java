public class Person {
    String name;
    int weight;
    int height;
    String bmiCheck;

    public Person(String name, int weight, int height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    public Person(String name){
        this.name = name;
    }

    public void setWeightAndHeight(int weight,int height){
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI(){
        double heightInMeters = (double) this.height / 100;
        return this.weight / (heightInMeters * heightInMeters);
    } 

    void displayRecord(){
        double bmi = calculateBMI();
        if (bmi < 18.5){
            bmiCheck = "BMI jest zbyt niskie";
        }  else if (bmi > 24.9) {
            bmiCheck = "BMI jest zbyt wysokie";
        } else {
            bmiCheck = "BMI jest prawidłowe";
        }
        
        System.out.println(name + " wzrost: " + height + " cm, waga: " + weight + " kg, BMI: " +  calculateBMI() + " " + bmiCheck);
    }
}
