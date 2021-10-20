package web.browser;
import javax.swing.*;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.web.WebView;
import javafx.scene.Scene;
import javafx.application.Platform;
public class WebBrowser extends JFrame implements Runnable{
    private JFXPanel panel;
    public void run() {
        setTitle("Search");
        setBounds(0, 0, 1950, 1050);
        setVisible(true);
        
        panel = new JFXPanel();
        add(panel);
        
        Platform.runLater(() -> {
        
        WebView view = new WebView();
        view.getEngine().load("http://www.google.com");
        panel.setScene(new Scene(view));
    });
}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new WebBrowser());
    }
    
}

//Finished
