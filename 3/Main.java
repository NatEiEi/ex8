public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light bedRoomLight = new Light("Bed Room");
        Light kitchenLight = new Light("Kitchen");
        Airconditioner bedRoomAC = new Airconditioner("Bed Room");

        remoteControl.setCommand(0, new LightOnCommand(bedRoomLight), new LightOffCommand(bedRoomLight));
        remoteControl.setCommand(1, new LightOnCommand(kitchenLight), new LightOffCommand(kitchenLight));
        remoteControl.setCommand(2, new AirconditionerOnCommand(bedRoomAC), new AirconditionerOffCommand(bedRoomAC));

        System.out.println("slot 0, light Bed Room");
        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        System.out.println("--------------------------------");
        System.out.println("slot 1, light Kitchen");
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        System.out.println("--------------------------------");
        System.out.println("slot 2, AC Bed Room");
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
        System.out.println("--------------------------------");
        System.out.println("test one unavailable slot, slot 3");
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);
    }
}