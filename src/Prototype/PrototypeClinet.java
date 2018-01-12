package Prototype;

public class PrototypeClinet {

    public static void main(String[] args) throws CloneNotSupportedException{
        MachineImage linuxVM = new MachineImage("Linux", "Symantec");
        MachineImage windowsVM = new MachineImage("Windows", "MaAfee");

        MachineImage webServer = linuxVM.clone();
        webServer.install(" + WebServer S/W");

        MachineImage webAppServer = webServer.clone();
        webAppServer.install(" + App Server S/W");

        MachineImage testMachine = windowsVM.clone();

        System.out.println("Web Server Configuration: ");
        webAppServer.printSW();
        System.out.println("App Server Configuration: ");
        webAppServer.printSW();
        System.out.println("Test Machine Configuration: ");
        testMachine.printSW();
    }
}
