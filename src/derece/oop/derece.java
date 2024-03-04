package derece.oop;

public class derece {
    public static void main(String[] args) {
        String [] name = {"Kadir","Gökhan","Hakan","Suzan","Pınar","Mehmet","Ali","Emel","Fırat","James","Jale","Ersin", "Deniz","Gözde","Anıl","Burak"};
        int [] duration = {341,273,278,329,445,402,388,270,243,334,412,393,299,343,317,265};

        DereceTest myderece = new DereceTest(name,duration);
        myderece.processconclusion();
    }
}
