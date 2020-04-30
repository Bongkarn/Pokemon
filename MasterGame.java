

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MasterGame extends JFrame{
    
    JButton startButton,quitButton;
    Icon logo;
    Container c = getContentPane();
    JTextArea statusArea;
    Trainer trainer;

    public MasterGame(){

        super("POKEMON GAME");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(860, 650);
        setVisible(true);
    }

    public void startGame(){
        
        c.setBounds(100, 100, 850, 550);
        JLabel pokemonIcon;
        JPanel panel;
        panel = new JPanel();
        panel.setLayout(null);
        startButton = new JButton("START");
        startButton.setBounds(200, 400, 90, 25);
        quitButton = new JButton("QUIT");
        quitButton.setBounds(600, 400, 90, 25);

        logo = new ImageIcon(getClass().getResource("Start.png"));
        pokemonIcon = new JLabel("");

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.remove(pokemonIcon);
                panel.remove(startButton);
                panel.remove(quitButton);
                c.remove(pokemonIcon);
                c.remove(panel);
                selectPokemon();
            }
        });

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
            }
        });

        pokemonIcon.setIcon(logo);
	    pokemonIcon.setBounds(0,0,860,600);

        panel.add(startButton);
        panel.add(quitButton);
        panel.add(pokemonIcon);
        c.add(panel);
        setVisible(true);
    }
    public void selectPokemon(){
        JPanel panel;
        JLabel selectPokemon;
        Icon poliwag;
        JButton poliwagButton;
        JButton eatButton,toyButton;
        JComboBox foodBox,toyBox;
        String foodNames[],toyNames[];

        trainer = new Trainer();
        trainer.pokemons.add(new Poliwag());

        foodNames = new String[] {
            "Berry",     
            "Vitamin", 
            "Roast Beef",   
        };
        toyNames = new String[] {
            "Ball",     
            "Shopping", 
            "Hair Cut",   
        };


        panel = new JPanel();
        panel.setLayout(null);


        selectPokemon = new JLabel("My Pokemon");
        selectPokemon.setFont(new Font("Tahoma", Font.PLAIN, 40));
        selectPokemon.setBounds(300, 40, 300, 40);

        poliwag = new ImageIcon(getClass().getResource("poliwag.png"));
        poliwagButton = new JButton(poliwag);
        poliwagButton.setBounds(325, 100, 200, 200);

        statusArea = new JTextArea("",425,227);
        statusArea.setBounds(200, 350, 250, 250);

        foodBox = new JComboBox<Object>(foodNames);
        foodBox.setBounds(580, 350, 183, 20);
        toyBox = new JComboBox<Object>(toyNames);
        toyBox.setBounds(580, 450, 183, 20);
        
        eatButton = new JButton("EAT");
        eatButton.setBounds(580, 400, 89, 23);
            
        toyButton = new JButton("GIVE");
        toyButton.setBounds(580, 500, 89, 23);

        
        quitButton = new JButton("QUIT");
        quitButton.setBounds(580, 550, 90, 25);
        
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                dispose();
            }
        });

        
        eatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (foodBox.getSelectedIndex()) {
                    case 0 :
                        trainer.eatBerry(0);
                        break;
                    case 1 :
                        trainer.eatVitamin(0);
                        break;
                    case 2 :
                        trainer.eatRoastBeef(0);
                        break;
                }
                statusArea.setText(trainer.showStatus(trainer.pokemons,0));
            }
        });

        toyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
	            switch (toyBox.getSelectedIndex()) {
	                case 0 :
	                    trainer.giveBall(0);
	                    break;
	                case 1 :
		                trainer.giveShoppingl(0);
		                break;
	                case 2 :
		                trainer.giveHaircut(0);
		            break;
                }
            statusArea.setText(trainer.showStatus(trainer.pokemons,0));
            }
        });
        

        poliwagButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                statusArea.setText(trainer.showStatus(trainer.pokemons,0));
            }
        });


        panel.add(quitButton);
        panel.add(statusArea);
        panel.add(selectPokemon);
        panel.add(foodBox);
        panel.add(toyBox);
        panel.add(poliwagButton);
        panel.add(eatButton);
        panel.add(toyButton);
        c.add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(860, 650);
        setVisible(true);
    }

}