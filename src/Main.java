public class Main {
    public static void main(String[] args) {
        HumanImb humanIMB = new HumanImb(80,1.52);
        System.out.println(humanIMB.result());
    }
}

class HumanImb {
    private double weight;
    private double height;
    private double imb;

    public HumanImb(double weight, double height) {
        this.weight = weight;
        this.height = height;
        imb = weight / (height * height);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        imb = weight / (height * height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        imb = weight / (height * height);
    }
    
    public double getImb() {
        return imb;
    }

    public String result() {
        String result = "";
        if (imb >= 18.5 && imb < 25) {
            result = "Norm";
        }
        if (imb >= 25 && imb < 30) {
            result = "Warning! ";
        }
        if (imb >= 30) {
            result = "Fat";
        }
        if (imb < 18.5) {
            result = "Deficit";
        }
        return result;
    }
}