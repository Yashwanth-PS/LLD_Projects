import controller.PenController;
import service.PenService;
import service.PenServiceImpl;

// Main executable code
public class Pen {
    public static void main(String[] args) {
        // Initialize services and controller
        PenService penService = new PenServiceImpl();
        PenController penController = new PenController(penService);

        // Start handling user actions
        penController.handleUserActions();
    }
}