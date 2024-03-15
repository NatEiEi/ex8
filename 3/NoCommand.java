public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("No command is assigned to this slot");
    }   
}