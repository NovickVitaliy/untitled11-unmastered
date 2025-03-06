public enum ImbStatus{
    Normal("Norm"),
    Warning("Warning!"),
    Fat("Fat"),
    Deficit("Deficit");

    private String status;

    ImbStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return this.status;
    }
}