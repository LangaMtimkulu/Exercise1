/*
 * Name: Kathlene Titus
 * Date: June 29th
 */

package guiIntro;

//imports needed
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


//new class initialization
public class ReturnMain{

	public static void main(String[] args) {
		
		//creating new array
		ArrayList<ReturnHandler> returnInfo = new ArrayList<ReturnHandler>();
		
		// creating the frame
		JFrame frame1 = new JFrame("Coding Exercise 1");
		//closing frame
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setting frame size
		frame1.setSize(600, 200);
		
		//creating new panel
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		//adding TAN label that accepts 9 chars
		JLabel tan = new JLabel("TAN: ");
		JTextField tanText = new JTextField(9);
		
		//adding NOT label that accepts 20 chars
		JLabel not = new JLabel("NOT: ");
		JTextField notText = new JTextField(20);
		
		//adding CITY label that accepts 15 chars
		JLabel city = new JLabel("City: ");
		JTextField cityText = new JTextField(15);
		
		//adding province label that accepts 15 chars
		JLabel province = new JLabel("Province: ");
		JTextField provinceText = new JTextField(2);
		
		//adding PI label that accepts 6 chars
		JLabel pi = new JLabel("PI: ");
		JTextField piText = new JTextField(6);
		
		//adding RI label that accepts 6 chars
		JLabel ri= new JLabel("RI: ");
		JTextField riText = new JTextField(6);
		
		
		//adding to panel
		panel1.add(tan);
		panel1.add(tanText);

        panel1.add(not);
        panel1.add(notText);
        
        panel2.add(city);
        panel2.add(cityText);
	
        panel2.add(province);
        panel2.add(provinceText);
        
        panel3.add(pi);
        panel3.add(piText);
        
        panel3.add(ri);
        panel3.add(riText);
        
		//adding components to frame
		frame1.getContentPane().add(BorderLayout.NORTH, panel1);
		frame1.getContentPane().add(BorderLayout.WEST,panel2);
		frame1.getContentPane().add(BorderLayout.EAST,panel3);
	
		
		//adding submit button
		JButton submit = new JButton("SUBMIT");
		submit.setActionCommand("SUBMIT");
		//submit.addActionListener(returnHandler);
		JPanel panel4 = new JPanel();
		submit.setPreferredSize(new Dimension(100, 25));
		submit.setBackground(Color.RED);
		submit.setOpaque(true);
		panel4.add(submit);
		frame1.getContentPane().add(BorderLayout.SOUTH,panel4);

		//making frame visible
		frame1.setVisible(true);
		
		//submit button action
		submit.addActionListener(new ActionListener() {
			
		//actions that take place once the submit button is pressed
	
            @Override
            public void actionPerformed(ActionEvent e) {
            	
            	//do validation
            	String tanValue = tanText.getText();
                String notValue = notText.getText();
                String cityValue = cityText.getText();
                String provinceValue = provinceText.getText();
                String piValue = piText.getText();
                String riValue = riText.getText();
                
                String emptyFields = "true";
                String isNum = "true";
                
                //check if fields are empty
            	if (tanValue.length() == 0 || notValue.length() == 0 || cityValue.length() == 0 || provinceValue.length() == 0 || piValue.length() == 0 || riValue.length() == 0) {
            	    emptyFields = "false";
            	    System.out.println("Cannot accept an empty field! Return rejected!");
            	    }
            	
            	//check if pi and ri are negative values
            	if (!piValue.isBlank() || !riValue.isBlank()) {
            	double d1 = Double.parseDouble(piValue);
            	double d2 = Double.parseDouble(riValue);
            	
            	if (d1 < 0 || d2 < 0) {
            		isNum = "false";
            		System.out.println("Cannot accept a negative amount! Return rejected!");
            	     }
            	}
            	if ((isNum == "true") && (emptyFields == "true")){
            	
                ReturnHandler returnHandler = new ReturnHandler(tanValue, notValue, cityValue, provinceValue, piValue, riValue);

            	returnInfo.add(returnHandler);
            	
           	    System.out.println(returnHandler.toString());  
            	}
            	
           	    //printing all elements in arraylist to see if everything is getting stored correctly
           	    //System.out.println("***************************");  
           	    /*for(int i=0; i < returnInfo.size(); i++){
           	    	System.out.println(returnInfo.get(i) );
           	    	} */          	     
            }
        });    
	}
}

