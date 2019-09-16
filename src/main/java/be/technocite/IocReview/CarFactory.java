package be.technocite.IocReview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class CarFactory {


    private AssemblyLine assemblyLine;


    public CarFactory(AssemblyLine assemblyLine) {
        this.assemblyLine = assemblyLine;
    }

    public void startFactory(){
        assemblyLine.startAssembly();
    }
}
