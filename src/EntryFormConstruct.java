import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EntryFormConstruct{
    public JButton display;
    public TextField name, year_of_study;
    public TextArea details;
    public JLabel nameLabel, yosLabel;
    public JFrame entryForm;
    public JPanel formPanel;
    
    public EntryFormConstruct(){
        entryForm = new JFrame();
        entryForm.getContentPane();
        entryForm.setTitle("Student details");
        entryForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        entryForm.setSize(470,300);        
                
        name = new TextField(20);
        nameLabel = new JLabel("Name");
        year_of_study = new TextField(20);        
        yosLabel = new JLabel("year of study");        
        details = new TextArea(2, 30);
        details.setSize(100,50);
        
        display = new JButton("Display");        
        display.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){                
               String var_name = name.getText();
               String var_yos = year_of_study.getText();
               String var_details = (var_name + " \n" + var_yos);
               details.setText(var_details);
            }
        });

        formPanel = new JPanel();
        formPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        formPanel.add(nameLabel);
        formPanel.add(name);
        formPanel.add(yosLabel);
        formPanel.add(year_of_study);
        formPanel.add(display);
        formPanel.add(details);
        
        entryForm.add(formPanel, BorderLayout.CENTER);
        entryForm.setVisible(true);        
    }

}