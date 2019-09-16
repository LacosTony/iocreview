package be.technocite.IocReview;


import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class AssemblyLine {

    private int robotSpeed;
    private Date startDate;


    public AssemblyLine(){

    }

    public void startAssembly(){
        System.out.println("tchoutchou");
    }

    public void setRobotSpeed(int robotSpeed) {
        this.robotSpeed = robotSpeed;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
