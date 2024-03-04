package derece.oop;

public class DereceTest {
    private String[] name;
    private  int[] duration;


    public DereceTest(String[] name, int[] duration) {
        this.name = name;
        this.duration = duration;
    }

    public String[] getName() {
        return name;
    }

    public int[] getDuration() {
        return duration;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public void setDuration(int[] duration) {
        this.duration = duration;
    }

    public void processconclusion(){
        System.out.println("First: " + getName1()  + " "+ getFirst() + "'");
        System.out.println("Second: " + getName2() + " " + getSecond() + "'");
        System.out.println("Third: "  + getName3() + " " + getThird() + "'");
        lettergrade();


    }


    public int getFirst() {
        int  number1 = duration[0];
        for (int i =0; i< duration.length; i++){
            if (number1 > duration[i]){
                number1 = duration[i];
            }
        }
        return number1;
    }

    public int getSecond() {
        int frist = getFirst();
        int number2 = duration[0];
        for (int i=0; i < duration.length;i++){
            if (number2 > duration[i] && duration[i] > frist) {
                number2 = duration[i];
            }
        }
        return number2;
    }


    public int getThird() {
        int second = getSecond();
        int number3 = duration[0];
        for(int i =0; i < duration.length; i++){
            if (number3 > duration[i] && duration[i] > second ){

            }
        }
        return number3;
    }

    public void lettergrade() {
        int[] letter = new int[3];
        for (int time : duration) {
            if (time >= 200 && time <= 299) {
                letter[0]++;
            } else if (time >= 300 && time <= 399) {
                letter[1]++;
            } else {
                letter [2]++;
            }
        }

        System.out.println("A-> " + letter[0]);
        System.out.println("B-> "+ letter[1]);
        System.out.println("C-> " + letter[2]);
    }

    public String getName1(){
        int a = getFirst();
        int number5 = 0;
        for (int i = 0; i <duration .length; i++) {
            if (duration[i] == a)
                number5 = i;
        }
        return name[number5];
    }
    public String getName2(){
        int b = getSecond();
        int number6 = 0;
        for (int i = 1; i < duration.length; i++) {
            if (duration[i] == b)
                number6 = i;
        }
        return name[number6];
    }
    public String getName3(){
        int c = getThird();
        int number7 = 0;
        for (int i = 1; i < duration.length; i++) {
            if (duration[i] == c)
                number7 = i;
        }
        return name[number7];
    }

}
