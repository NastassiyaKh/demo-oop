package by.itacademy.anastasiaholodok.javabasics.oop;

public class Student extends User{
    protected Integer grant;

    public Integer getIncome(){
        if (grant != null){
            return grant;
        } else {
            return 0;
        }
    }

    public Integer getGrant() {
        return grant;
    }

    public void setGrant(Integer grant) {
        this.grant = grant;
    }
}