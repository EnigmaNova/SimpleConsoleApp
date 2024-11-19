import java.util.Scanner;

public class UnitConvertor {
    private final Scanner scan;

    public UnitConvertor(){
        this.scan = new Scanner(System.in);
    }

    public void convertLenght(){
        LenghtConvertor length = new LenghtConvertor(scan);
        length.convert();
    }

    public void convertMass(){
        MassConvertor mass = new MassConvertor(scan);
        mass.convert();
    }

    public void convertTemp(){
        TemperatureConvertor temp = new TemperatureConvertor(scan);
        temp.convert();
    }
}
