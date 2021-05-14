import javax.swing.*;
import java.awt.*;

public class ColorblindConverterGUI {
    public static void main(String args[]) {
        //Creating the frame
        JFrame frame = new JFrame("Colorblind Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 270);

        //Creating the colorblind options menu
        JLabel BlindnessTypeLabel = new JLabel("Type of Colorblindness");
        BlindnessTypeLabel.setBounds(10, 10, 150, 35);
        JButton OptDueter = new JButton("Dueteranopia");
        OptDueter.setBounds(10, 40, 150, 30);
        
        JButton OptProtan = new JButton("Protanopia");
        OptProtan.setBounds(165, 40, 150, 30);

        JButton OptTritan = new JButton("Tritanopia");
        OptTritan.setBounds(320, 40, 150, 30);


        //Creating the intensity slider
        JLabel SliderLabel = new JLabel("Intensity");
        SliderLabel.setBounds(10, 80, 500, 35);
        JSlider IntensitySlider = new JSlider();
        IntensitySlider.setBounds(10, 110, 460, 35);

        //Creating the three bottom options
        JButton applyButton = new JButton("Apply");
        applyButton.setBounds(10, 170, 150, 30);
        JButton saveButton = new JButton("Save");
        saveButton.setBounds(165, 170, 150, 30);
        JButton loadButton = new JButton("Load");
        loadButton.setBounds(320, 170, 150, 30);

        //Putting it in the frame
        frame.setLayout(null);

        frame.getContentPane().add(BlindnessTypeLabel);
        frame.getContentPane().add(OptDueter);
        frame.getContentPane().add(OptProtan);
        frame.getContentPane().add(OptTritan);

        frame.getContentPane().add(SliderLabel);
        frame.getContentPane().add(IntensitySlider);

        frame.getContentPane().add(applyButton);
        frame.getContentPane().add(saveButton);
        frame.getContentPane().add(loadButton);

        frame.setVisible(true);
    }
}
