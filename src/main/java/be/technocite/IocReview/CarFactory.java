package be.technocite.IocReview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarFactory {

    @Autowired
    private AssemblyLine assemblyLine;


    public CarFactory(AssemblyLine assemblyLine) {
        this.assemblyLine = assemblyLine;
    }

    public void startFactory(){
        assemblyLine.startAssembly();
    }
}
