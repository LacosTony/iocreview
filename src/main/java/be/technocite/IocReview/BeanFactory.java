package be.technocite.IocReview;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;
import java.util.GregorianCalendar;

@Configuration
public class BeanFactory {

    @Bean
    public CarFactory carFactory(){
        return new CarFactory(assemblyLine());
    }

    @Bean
    public AssemblyLine assemblyLine(){
        AssemblyLine assemblyLine = new AssemblyLine();
        assemblyLine.setRobotSpeed(24);
        assemblyLine.setStartDate(new GregorianCalendar(2014,Calendar.FEBRUARY,11,10,00,00).getTime());
        return assemblyLine;
    }
}
