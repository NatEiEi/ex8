public class AirconditionerOnCommand implements Command {
    Airconditioner airconditioner;

    public AirconditionerOnCommand(Airconditioner airconditioner) {
        this.airconditioner = airconditioner;
    }

    @Override
    public void execute() {
        airconditioner.on();
        airconditioner.setTemp(25);
    }
}