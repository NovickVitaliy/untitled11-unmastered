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

    public ImbStatus result() {
        ImbStatus result = null;
        if (imb >= 18.5 && imb < 25) {
            result = ImbStatus.Normal;
        }
        if (imb >= 25 && imb < 30) {
            result = ImbStatus.Warning;
        }
        if (imb >= 30) {
            result = ImbStatus.Fat;
        }
        if (imb < 18.5) {
            result = ImbStatus.Deficit;
        }
        return result;
    }
}