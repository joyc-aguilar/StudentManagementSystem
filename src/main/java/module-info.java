module org.example.studentmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql; // Add this line!

    opens org.example.studentmanagementsystem to javafx.fxml;
    opens org.example.studentmanagementsystem.controller to javafx.fxml;
    exports org.example.studentmanagementsystem;
}