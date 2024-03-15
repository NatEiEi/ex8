public class AirconditionerOffCommand implements Command {
    Airconditioner airconditioner;

    public AirconditionerOffCommand(Airconditioner airconditioner) {
        this.airconditioner = airconditioner;
    }

    @Override
    public void execute() {
        airconditioner.off();
    }
}